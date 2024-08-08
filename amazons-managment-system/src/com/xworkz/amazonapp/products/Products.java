package com.xworkz.amazonapp.products;

public class Products {
    public String products;
    public String productName;
    public String productInfo;
    public double productPrice;
    public String productRating;

    public void productsDetails(){
        System.out.println("Product Name is " +this.productName);
        System.out.println("Product Information is "+this.productInfo);
        System.out.println("Price of the product is " +this.productPrice);
        System.out.println("Ratings for products is "+this.productRating);
    }

}
