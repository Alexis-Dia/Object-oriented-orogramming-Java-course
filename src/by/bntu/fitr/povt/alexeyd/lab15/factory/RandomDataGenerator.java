package by.bntu.fitr.povt.alexeyd.lab15.factory;

import by.bntu.fitr.povt.alexeyd.lab15.logic.ShopAssistance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class RandomDataGenerator implements DataGenerator {

    private static final int MAX_WEIGHT = 1000;
    private static final int MIN_WEIGHT = 1;
    private static final int MAX_ID = 3000000;
    private static final int MIN_ID = 1000000;
    private static final int MIN_NUMBER_OF_PRODUCTS = 1;
    private static final int MAX_NUMBER_OF_PRODUCT = 5;
    private static final double MIN_PRICE = 0.1;
    private static final Double PRICE_PERCENT = 25.0;
    private static final int LETTER_A = 97;
    private static final int LETTER_Z = 122;
    private static final int TARGET_STRING_LENGTH = 10;
    private static final double HALF = 0.5;
    private int numberOfProducts = new Random().nextInt(MAX_NUMBER_OF_PRODUCT) + MIN_NUMBER_OF_PRODUCTS;

    public List read() {
        String rowData = EMPTY_STRING;
        rowData = initializeProduct(rowData);
        rowData = removeLastComma(rowData);
        String[][] rowArr = ShopAssistance.prepareData(rowData);
        List products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

    private String initializeProduct(String rowData) {
        for (int i = 0; i <= numberOfProducts - 1; i++) {
            int id = new Random().nextInt(MAX_ID) + MIN_ID;
            double price = new Random().nextDouble()*PRICE_PERCENT + MIN_PRICE;
            boolean helpChildren = Math.random() < HALF;
            boolean organic = Math.random() < HALF;
            String weigth = String.valueOf(new Random().nextInt(MAX_WEIGHT) + MIN_WEIGHT);
            String sort = generateRandomString();
            String flour = generateRandomString();
            String color = Colour.randomColour().getColour();
            String shape = Shape.randomShape().getShape();
            rowData +=
                BRACET_LEFT_STRING + NEW_LINE_SYMBOL +
                    "helpChildren:" + helpChildren + NEW_LINE_SYMBOL +
                    "weight:" + weigth + NEW_LINE_SYMBOL +
                    "price:" + price + NEW_LINE_SYMBOL +
                    "organic:" + organic + NEW_LINE_SYMBOL +
                    "sort:" + sort + NEW_LINE_SYMBOL +
                    "flour:" + flour + NEW_LINE_SYMBOL +
                    "color:" + color + NEW_LINE_SYMBOL +
                    "shape:" + shape + NEW_LINE_SYMBOL +
                    "id:" + id + NEW_LINE_SYMBOL +
                    BRACET_RIGHT_STRING + COMMA + NEW_LINE_SYMBOL;
        }
        return rowData;
    }

    public String removeLastComma(String str) {
        if (str != null && str.length() > 0) {
            int lastIndexOf = str.lastIndexOf(COMMA);
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(lastIndexOf);
            String resultString = sb.toString();
            return resultString;
        }
        return str;
    }

    private String generateRandomString() {
        int leftLimit = LETTER_A;
        int rightLimit = LETTER_Z;
        int targetStringLength = TARGET_STRING_LENGTH;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        generatedString = generatedString.substring(0, 1).toUpperCase() + generatedString.substring(1);
        return generatedString;
    }

    private enum Shape {
        CIRCLE("Circle"),
        SQUARE("Square"),
        ELLIPSE("Ellipse");

        private String shape;

        private static final List<Shape> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        Shape(String shape) {
            this.shape = shape;
        }

        private String getShape() {
            return shape;
        }

        private static Shape randomShape() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    private enum Colour {
        GRAY("Gray"),
        BROWN("Brown"),
        BLACK("Black");

        private String colour;

        private static final List<Colour> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        Colour(String shape) {
            this.colour = shape;
        }

        private String getColour() {
            return colour;
        }

        private static Colour randomColour() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
}
