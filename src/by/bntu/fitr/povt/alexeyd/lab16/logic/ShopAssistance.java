package by.bntu.fitr.povt.alexeyd.lab16.logic;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class ShopAssistance {

    private static final int MAX_NUMBER_OF_FIELDS = 10;
    private static final String COLON = ":";
    private static final int FIELD_NAME_NUMBER = 0;
    private static final int VALUE_NUMBER = 1;
    private static final int DEFAULT_WEIGHT = 0;
    private static final double DEFAULT_PRICE = 0.0;
    private static final boolean DEFAULT_ORGANIC = false;
    private static final boolean DEFAULT_HELP_CHILDREN = false;
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

    public static double calculateAvgPrice(List<Product> list) {
        double total = 0.0;
        for (Product ob: list) {
            total += ob.getPrice();
        }

        return total / list.size();
    }

    public static double calculateAvgWeight(List<Product> list) {
        double weight = 0.0;

        for (Product ob: list) {
            weight += ob.getWeight();
        }

        return  weight;
    }

    public static boolean getPrize(List<Product> list) {
        for (Product ob: list) {
            if (ob.isHelpChildren()) {
                return true;
            }
        }

        return false;
    }

    public static List<Product> findByPrice(List<Product> list, double min, double max) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            double price = ob.getPrice();
            if (price >= min && price <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List<Product> findByWeight(List<Product> list, int min, int max) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            int weight = ob.getWeight();
            if (weight >= min && weight <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List<Product> findById(List<Product> list, int value) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            int id = ob.getId();
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

    public static List<Product> parseProduct(String [][]rowData) {
        List<Product> products = new ArrayList();
        for (int i = 0; i <rowData.length ; i++) {
            boolean helpChildren = DEFAULT_HELP_CHILDREN;
            int weight = DEFAULT_WEIGHT;
            double price = DEFAULT_PRICE;
            boolean organic = DEFAULT_ORGANIC;
            int id = DEFAULT_ID;
            String sort = DEFAULT_SORT;
            String flour = DEFAULT_FLOUR;
            String color = DEFAULT_COLOR;
            String shape = DEFAULT_SHAPE;
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
                    }
                }
            }
            products.add(new Bread(helpChildren, weight, price, organic, sort, flour, color, shape, id));
        }
        return products;
    }

    public static String [] removeNullElement(String args[]) {
        args = Arrays.stream(args)
            .filter(s -> (s != "\n" && s.length() > 0))
            .toArray(String[]::new);
        return args;
    }

}
