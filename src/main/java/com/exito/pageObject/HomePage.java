package com.exito.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Data
public class HomePage extends PageObject {
    private final By btnPubli= By.xpath("//div[@id='wps-overlay-close-button']");
    private final By btnMenu= By.xpath("//div[@class='exito-category-menu-3-x-button']/button[starts-with(@class,'vtex-button')]");
    private final By btn1categoria= By.xpath("//p[@id='undefined-nivel2-Tecnología']");
    private final By lnk2categoria= By.xpath("//*[@id='Categorías-nivel3-Computadores portátiles']");


}
