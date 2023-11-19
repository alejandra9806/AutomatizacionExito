package com.exito.steps;

import com.exito.pageObject.ProductosPage;
import lombok.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class ProductoSteps {
    public static String txtProducto;
    @Page
    ProductosPage productosPage;

    @Step("Agregar producto al carro")
    public void agregarPro(){
        txtProducto = productosPage.getDriver().findElement(productosPage.getNomProd()).getText();
        System.out.println("Antes: "+txtProducto);
        productosPage.getDriver().findElement(productosPage.getBtnAgregar()).click();
    }

}
