package com.exito.steps;

import com.exito.models.ProductModel;
import com.exito.pageObject.ProductosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class ProductoSteps {
    //public static String txtProducto; --Como lo maneje inicialmente con una variable publica
    @Page
    ProductosPage productosPage;
    @Step("Agregar producto al carro")
    public void agregarPro(){
        ProductModel.setNameProduct(productosPage.getDriver().findElement(productosPage.getNomProd()).getText());
        //txtProducto = productosPage.getDriver().findElement(productosPage.getNomProd()).getText(); --Como lo maneje inicialmente con una variable publica
        productosPage.getDriver().findElement(productosPage.getBtnAgregar()).click();
    }

}
