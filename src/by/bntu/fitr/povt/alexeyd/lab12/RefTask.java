package by.bntu.fitr.povt.alexeyd.lab12;

public class RefTask {
    public static void main(String[] args) {
        Integer value1 = 1;
        System.out.println(value1);
        value1 = RefTask.changeInt(value1);
        System.out.println(value1);

        String value2 = new String("Java");
        System.out.println(value2);
        value2 = changeStr(value2);
        System.out.println(value2);
    }

    private static Integer changeInt(Integer that) {
        that = that + 1;
        return that;
    }

    private static String changeStr(String that) {
        that = that + " is great!";
        return that;
    }
}
