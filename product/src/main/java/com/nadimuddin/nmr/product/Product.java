package com.nadimuddin.nmr.product;

/**
 * Created by Nadimuddin on 02/06/22.
 */
public class Product {
    public String loadProducts() {
        return "Products loaded" + " & " + new ProductRating().loadRatings();
    }
}
