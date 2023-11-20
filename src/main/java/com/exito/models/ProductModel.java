package com.exito.models;

public class ProductModel {
    private static String nameProduct;
    public static String getNameProduct() {
        return nameProduct;
    }

    public static void setNameProduct(String nameProduct) {
        ProductModel.nameProduct = nameProduct;
    }
}
