package com.exito.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class ProductosPage extends PageObject {

    private final By nomProd= By.xpath("//span[contains(text(),'Computador Portatil HP Pavilion Intel Core i5 1135G7 RAM 8 GB 512 GB SSD 15eg0501la')]");
    private final By btnAgregar= By.xpath("//*[@id='gallery-layout-container']/div[1]/section/a/article/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button");
    //private String txtProducto;
}
