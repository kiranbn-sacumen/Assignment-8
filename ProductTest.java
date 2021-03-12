package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getQty() {
        Product p = new Product("fan",2,1000,2000);
        assertEquals(2,p.getQty());
    }
}