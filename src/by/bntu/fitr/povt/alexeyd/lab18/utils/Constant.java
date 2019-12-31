package by.bntu.fitr.povt.alexeyd.lab18.utils;

public class Constant {

    public static final String SRC_RESOURCES_INPUT_AUTOSERIALIZABLE_BINARY_PATH = "src/resources/serializedOutputProducts.xjf";

    public static final String SRC_RESOURCES_INPUT_TEXT_PATH = "src/resources/inputProduct.txt";
    public static final String SRC_RESOURCES_INPUT_BINARY_PATH = "src/resources/inputProduct.xjf";
    public static final String SRC_RESOURCES_OUTPUT_TEXT_PATH = "src/resources/outputProduct.txt";
    public static final String SRC_RESOURCES_OUTPUT_BINARY_PATH = "src/resources/outputProduct.xjf";
    public static final String SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH = "src/resources/serializedOutputProducts.bin";

    public static final String CONSOLE = "console";
    public static final String TEXT = "text";
    public static final String BINARY = "binary";
    public static final String RANDOM = "random";
    public static final String BINARY_SERIALIZABLE = "binarySerializable";
    public static final String CUSTOM_BINARY_SERIALIZABLE = "customBinarySerializable";

    public static final String UTF_8 = "UTF-8";
    public static final String EMPTY_STRING = "";
    public static final String BRACET_LEFT_STRING = "{";
    public static final String BRACET_RIGHT_STRING = "}";
    public static final String COMMA = ",";
    public static final String NEW_LINE_SYMBOL = "\n";
    public static final String CARRITAGR_RETURN_SYMBOL = "\r";

    public enum Resources {
        SRC_RESOURCES_INPUT_TEXT_PATH("src/resources/inputProduct.txt"),
        SRC_RESOURCES_INPUT_BINARY_PATH("src/resources/inputProduct.xjf"),
        SRC_RESOURCES_OUTPUT_TEXT_PATH("src/resources/outputProduct.txt"),
        SRC_RESOURCES_OUTPUT_BINARY_PATH("src/resources/outputProduct.xjf"),
        SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH("src/resources/serializedOutputProducts.bin");

        private String path;

        Resources(String shape) {
            this.path = shape;
        }

        public String getPath() {
            return path;
        }
    }

    public enum InputName {
        CONSOLE("console"),
        TEXT("text"),
        BINARY("binary"),
        RANDOM("random"),
        BINARY_SERIALIZABLE("binarySerializable"),
        CUSTOM_BINARY_SERIALIZABLE("customBinarySerializable");

        private String name;

        InputName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum OutputName {
        CONSOLE("console"),
        TEXT("text"),
        BINARY("binary"),
        BINARY_SERIALIZABLE("binarySerializable"),
        CUSTOM_BINARY_SERIALIZABLE("customBinarySerializable");

        private String name;

        OutputName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
