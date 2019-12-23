package by.bntu.fitr.povt.alexeyd.lab15.logic;

public enum SubGroup {
    FRUIT(0),
    VEGETABLE(1),
    MEAT(2),
    GROAT(3),
    ALCOHOL(4),
    SWEETS(5),
    WATER(6),
    BREAD(7),
    MILK(8);

    private final int groupCode;

    private SubGroup(int groupCode) {
        this.groupCode = groupCode;
    }

    public int getGroupCode() {
        return groupCode;
    }
}
