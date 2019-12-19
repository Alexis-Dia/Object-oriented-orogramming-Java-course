package by.bntu.fitr.povt.alexeyd.lab12.model.logic;

import by.bntu.fitr.povt.alexeyd.lab12.model.entity.*;
import by.bntu.fitr.povt.alexeyd.lab12.util.SubGroup;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopAssistanceTest {

    private Bucket bucket = new Bucket("POIT30701117");
    private ShopAssistance shopAssistance = new ShopAssistance();

    @Before
    public void setUp() {

        bucket.addProduct(new Bread(true, 500, 1.2, true, "Borodinskiy",
            "Chilli", "Brown", "Square", 1276234), SubGroup.BREAD.getGroupCode());
        bucket.addProduct(new Orange(false, 110, 0.7, 11, 0.1,
            true, "Rosso", "Elipse", 73483438), SubGroup.FRUIT.getGroupCode());
        bucket.addProduct(new Milk(false, 450, 2.1, 500, 3.2, 7.7,
            false, true, 32635623), SubGroup.MILK.getGroupCode());
        bucket.addProduct(new Milk(false, 450, 2.3, 500, 5.2, 9.7,
            false, true, 32635624), SubGroup.MILK.getGroupCode());
    }

    @Test
    public void calculateAvgPrice() {
        double result = shopAssistance.calculateAvgPrice(bucket);
        assertEquals(1.575, result, 0.001);
    }

    @Test
    public void calculateAvgWeight() {
        double result = shopAssistance.calculateAvgWeight(bucket);
        assertEquals(1510.0, result, 0);
    }

    @Test
    public void getPrize() {
        Product product = bucket.getContainer()[SubGroup.FRUIT.getGroupCode()][0];
        assertTrue(CoreMatchers.is(product.isHelpChildren()).matches(true));
    }
}
