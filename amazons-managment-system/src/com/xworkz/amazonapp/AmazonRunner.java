package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.products.Products;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Products products = new Products();
        products.productName="Laptop";
        products.productInfo="512GB storage 8GB RAM";
        products.productPrice=50789;
        products.productRating="4.5 star";

        Amazon amazon = new Amazon(products);
        products.productsDetails();
        System.out.println("Main ended");
}

}
