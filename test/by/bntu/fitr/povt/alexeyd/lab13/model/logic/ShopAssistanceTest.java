package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Orange;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopAssistanceTest {

    public static final double MIN_PRICE = 0.9;
    public static final double MAX_PRICE = 1.1;
    public static final int MIN_WEIGHT = 100;
    public static final int MAX_WEIGHT = 300;
    public static final int PID = 32635625;
    private List<Product> products;
    ShopAssistance shopAssistance = new ShopAssistance();

    @Before
    public void setUp() throws Exception {
        products = new ArrayList();

        products.add(new Bread(true, 500, 1.0, true, "Borodinskiy",
                "Chilli", "Brown", "Square", 1276234));
        products.add(new Orange(false, 110, 0.7, 11, 0.1,
                true, "Rosso", "Elipse", 73483438));
        products.add(new Milk(false, 450, 2.3, 500, 3.2, 7.7,
                false, true, 32635625));
    }

    @Test
    public void calculateAvgPrice() {
        double result = shopAssistance.calculateAvgPrice(products);
        assertEquals(1.333, result, 0.001);
    }

    @Test
    public void calculateAvgWeight() {
        double result = shopAssistance.calculateAvgWeight(products);
        assertEquals(1060.0, result, 0);
    }

    @Test
    public void getPrize() {
        Product product = products.get(0);
        assertTrue(CoreMatchers.is(product.isHelpChildren()).matches(true));
    }

    @Test
    public void findByPrice() {
        List<Product> list = shopAssistance.findByPrice(products, MIN_PRICE, MAX_PRICE);
        for (Product product: list) {
            assertTrue(product.getPrice() >= MIN_PRICE && product.getPrice() <= MAX_PRICE);
        }
    }

    @Test
    public void findByWeight() {
        List<Product> list = shopAssistance.findByWeight(products, MIN_WEIGHT, MAX_WEIGHT);
        for (Product product: list) {
            assertTrue(product.getWeight() >= MIN_WEIGHT && product.getWeight() <= MAX_WEIGHT);
        }
    }

    @Test
    public void findById() {
        List<Product> list = shopAssistance.findById(products, PID);
        for (Product product: list) {
            assertTrue(product.getId() == PID);
        }
    }

}