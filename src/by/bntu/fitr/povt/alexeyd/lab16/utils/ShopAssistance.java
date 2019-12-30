package by.bntu.fitr.povt.alexeyd.lab16.utils;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab16.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab16.entity.Orange;
import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.Bucket;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.MilkBucket;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.bread.ComparatorBySortAndFlavor;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.milk.ComparatorByFatAndCarbons;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.orange.ComparatorByShapeAndDiameter;

import java.util.*;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class ShopAssistance {

    public static final String COMPARE_BY_FAT_AND_CARBONS = "CompareByFatAndCarbons";
    public static final String COMPARE_BY_SORT_AND_FLAVOR = "CompareBySortAndFlavor";
    public static final String COMPARE_BY_SHAPE_AND_DIAMETER = "CompareByShapeAndDiameter";

    private static final int MAX_NUMBER_OF_FIELDS = 10;
    private static final int DEFAULT_VOLUME = 0;
    private static final String COLON = ":";
    private static final int FIELD_NAME_NUMBER = 0;
    private static final int VALUE_NUMBER = 1;
    private static final int DEFAULT_WEIGHT = 0;
    private static final double DEFAULT_PRICE = 0.0;
    private static final double DEFAULT_FAT = 0.0;
    private static final double DEFAULT_VITAMIN_C = 0.0;
    private static final double DEFAULT_DIAMETER = 0.0;
    private static final double DEFAULT_CARBONS = 0.0;
    private static final boolean DEFAULT_ORGANIC = false;
    private static final boolean DEFAULT_HELP_CHILDREN = false;
    private static final boolean DEFAULT_PROCESSED = true;
    private static final int DEFAULT_ID = 0;
    private static final String DEFAULT_SORT = null;
    private static final String DEFAULT_FLOUR = null;
    private static final String DEFAULT_COLOR = null;
    private static final String DEFAULT_SHAPE = null;
    private static final String HELP_CHILDREN = "helpChildren";
    private static final String WEIGHT = "weight";
    private static final String PRICE = "price";
    private static final String ORGANIC = "organic";
    private static final String ID = "id";
    private static final String SORT = "sort";
    private static final String FLOUR = "flour";
    private static final String COLOR = "color";
    private static final String SHAPE = "shape";
    private static final String VOLUME = "volume";
    private static final String FAT = "fat";
    private static final String CARBONS = "carbons";
    private static final String PROCESSED = "processed";
    private static final String VITAMIN_C = "vitaminC";
    private static final String FORM = "form";
    private static final String DEFAULT_FORM = "Form isn't exists";
    private static final String DIAMETER = "diameter";
    private static final Map<String, Comparator> STRATEGIES_MAP;

    static {
        STRATEGIES_MAP = new HashMap<>();
        STRATEGIES_MAP.put(COMPARE_BY_FAT_AND_CARBONS, new ComparatorByFatAndCarbons());
        STRATEGIES_MAP.put(COMPARE_BY_SORT_AND_FLAVOR, new ComparatorBySortAndFlavor());
        STRATEGIES_MAP.put(COMPARE_BY_SHAPE_AND_DIAMETER, new ComparatorByShapeAndDiameter());
    }

    public static double calculateAvgPrice(List list) {
        double total = 0.0;
        for (Object ob: list) {
            total += ((Product) ob).getPrice();
        }

        return total / list.size();
    }

    public static double calculateAvgWeight(List list) {
        double weight = 0.0;

        for (Object ob: list) {
            weight += ((Product) ob).getWeight();
        }

        return  weight;
    }

    public static boolean getPrize(List list) {
        for (Object ob: list) {
            if (((Product) ob).isHelpChildren()) {
                return true;
            }
        }

        return false;
    }

    public static List findByPrice(List list, double min, double max) {
        List result = new ArrayList();
        for (Object ob: list) {
            double price = ((Product) ob).getPrice();
            if (price >= min && price <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List findByWeight(List list, int min, int max) {
        List result = new ArrayList();
        for (Object ob: list) {
            int weight = ((Product) ob).getWeight();
            if (weight >= min && weight <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List findById(List list, int value) {
        List result = new ArrayList();
        for (Object ob: list) {
            int id = ((Product) ob).getId();
            if (id == value) {
                result.add(ob);
            }
        }

        return result;
    }

    public static String[][] prepareData(String data) {
        String strNew = data.replace(BRACET_LEFT_STRING, EMPTY_STRING);
        strNew = strNew.replace(BRACET_RIGHT_STRING, EMPTY_STRING);
        strNew = strNew.replace(CARRITAGR_RETURN_SYMBOL, EMPTY_STRING);
        strNew = strNew.replace(NEW_LINE_SYMBOL + NEW_LINE_SYMBOL, NEW_LINE_SYMBOL);
        String[] parts = strNew.split(COMMA);
        String[][] arr = new String[parts.length][MAX_NUMBER_OF_FIELDS];
        for (int i = 0; i <parts.length ; i++) {
            String[] line  = parts[i].split(NEW_LINE_SYMBOL);
            for (int j = 0; j <line.length ; j++) {
                if (!line[j].equals(EMPTY_STRING)) {
                    if (j>0 && !line[i].equals(EMPTY_STRING)) {
                        arr[i][j-1] = line[j];
                    } else {
                        arr[i][j] = line[j];
                    }
                }
            }
        }
        return arr;
    }

    public static List parseProduct(String [][]rowData) {
        List products = new ArrayList();
        for (int i = 0; i <rowData.length ; i++) {
            boolean helpChildren = DEFAULT_HELP_CHILDREN;
            boolean organic = DEFAULT_ORGANIC;
            boolean processed = DEFAULT_PROCESSED;
            int weight = DEFAULT_WEIGHT;
            double price = DEFAULT_PRICE;
            double fat = DEFAULT_FAT;
            double carbons = DEFAULT_CARBONS;
            double diameter = DEFAULT_DIAMETER;
            double vitaminC = DEFAULT_VITAMIN_C;
            int volume = DEFAULT_VOLUME;
            int id = DEFAULT_ID;
            String sort = DEFAULT_SORT;
            String flour = DEFAULT_FLOUR;
            String color = DEFAULT_COLOR;
            String shape = DEFAULT_SHAPE;
            String form = DEFAULT_FORM;
            for (int j = 0; j <rowData[i].length ; j++) {
                String data = rowData[i][j];
                if (data != null) {
                    String fieldName = data.split(COLON)[FIELD_NAME_NUMBER];
                    if (fieldName.equals(HELP_CHILDREN)) {
                        helpChildren = Boolean.parseBoolean(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(WEIGHT)) {
                        weight = Integer.parseInt(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(PRICE)) {
                        price = Double.parseDouble(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(ORGANIC)) {
                        organic = Boolean.parseBoolean(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(ID)) {
                        id = Integer.parseInt(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(SORT)) {
                        sort = rowData[i][j].split(COLON)[VALUE_NUMBER];
                    } else if (fieldName.equals(FLOUR)) {
                        flour = rowData[i][j].split(COLON)[VALUE_NUMBER];
                    } else if (fieldName.equals(COLOR)) {
                        color = rowData[i][j].split(COLON)[VALUE_NUMBER];
                    } else if (fieldName.equals(SHAPE)) {
                        shape = rowData[i][j].split(COLON)[VALUE_NUMBER];
                    } else if (fieldName.equals(VOLUME)) {
                        volume = Integer.parseInt(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(FAT)) {
                        fat = Double.parseDouble(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(CARBONS)) {
                        carbons = Double.parseDouble(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(PROCESSED)) {
                        processed = Boolean.parseBoolean(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(DIAMETER)) {
                        diameter = Double.parseDouble(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(VITAMIN_C)) {
                        vitaminC = Double.parseDouble(rowData[i][j].split(COLON)[VALUE_NUMBER]);
                    } else if (fieldName.equals(FORM)) {
                        form = rowData[i][j].split(COLON)[VALUE_NUMBER];
                    }
                }
            }
            if (shape != DEFAULT_SHAPE) {
                products.add(new Bread(helpChildren, weight, price, organic, sort, flour, color, shape, id));
            } else if (fat != DEFAULT_FAT) {
                products.add(new Milk(helpChildren, weight, price, volume, fat, carbons, processed, organic, id));
            } else if (diameter != DEFAULT_DIAMETER) {
                products.add(new Orange(helpChildren, weight, price, diameter, vitaminC, organic, sort, form, id));
            }
        }
        return products;
    }

    public static String [] removeNullElement(String args[]) {
        args = Arrays.stream(args)
            .filter(s -> (s != "\n" && s.length() > 0))
            .toArray(String[]::new);
        return args;
    }

    public static List getExampleOfProductList() {
        List list = new ArrayList();
        list.add(new Milk(false, 450, 0.3, 500, 1.2, 7.7,
            false, true, 32635625));
        list.add(new Milk(false, 450, 1.2, 500, 0.2, 0.7,
            false, true, 32635624));
        list.add(new Milk(false, 450, 1.1, 500, 2.1, 0.1,
            false, true, 32635621));
        return list;
    }


    public static Bucket getExampleOfBucket(String nameOfComparator) {
        Bucket bucket = new MilkBucket();
        bucket.addProduct(new Milk(false, 450, 0.3, 500, 1.2, 7.7,
            false, true, 32635625));
        bucket.addProduct(new Milk(false, 450, 1.2, 500, 0.2, 0.7,
            false, true, 32635624));
        bucket.addProduct(new Milk(false, 450, 1.1, 500, 2.1, 0.1,
            false, true, 32635621));
        bucket.setComparator(STRATEGIES_MAP.get(nameOfComparator));
        bucket.performSorting();
        return bucket;
    }

}
