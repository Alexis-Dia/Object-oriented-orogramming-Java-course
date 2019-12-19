package by.bntu.fitr.povt.alexeyd.lab11.model.logic;

import by.bntu.fitr.povt.alexeyd.lab11.model.entity.*;
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

        bucket.addProduct(new Bread(true, 500, 1.0, true, "Borodinskiy",
            "Chilli", "Brown", "Square", 1012234));
        bucket.addProduct(new Orange(false, 110, 5.0, 11, 0.1,
            true, "Rosso", "Elipse", 201243));
        bucket.addProduct(new Milk(false, 450, 3.0, 500, 3.2, 7.7,
            false, true, 45134343));
    }

    @Test
    public void calculateAvgPrice() {
        double result = shopAssistance.calculateAvgPrice(bucket);
        assertEquals(3, result, 0.001);
    }

    @Test
    public void calculateAvgWeight() {
        double result = shopAssistance.calculateAvgWeight(bucket);
        assertEquals(1060.0, result, 0);
    }

    @Test
    public void getPrize() {
        Product product = bucket.getContainer()[0];
        assertTrue(CoreMatchers.is(product.isHelpChildren()).matches(true));
    }
}
