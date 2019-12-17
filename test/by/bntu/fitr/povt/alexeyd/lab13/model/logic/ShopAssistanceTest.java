package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Orange;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopAssistanceTest {

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
    }

    @Test
    public void getPrize() {
    }

    @Test
    public void findByPrice() {
    }

    @Test
    public void findByWeight() {
    }

    @Test
    public void findById() {
    }

}