package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.products.Products;

public class Amazon {
    Products products;
    public Amazon(Products products) {
        System.out.println("Amazon Constructor is invoked");
        System.out.println("Number of Parameters :1");
        System.out.println("Type of parameters:Product type");
        this.products = products;

        public void openProducts() {
            System.out.println("Product details");
            if (products != null)
                this.products.productsDetails();
            else System.out.println("No products found");
            System.out.println("end of amazon details");
}
    }
}
