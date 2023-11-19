package com.exito.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
@Data
public class CarroComprasPage extends PageObject {
    private final By lnkCarro=By.xpath("//a[@class='exito-header-3-x-minicartLink']");
    private final By txtCorreo= By.xpath("//input[@placeholder='correo@email.com']");
    private final By btnCorreo= By.xpath("//button[@class='exito-checkout-io-0-x-preLoginActiveButton']");
    private final By nomProd= By.xpath("//span[contains(text(),'Computador Portatil HP Pavilion Intel Core i5 1135G7')]");
}