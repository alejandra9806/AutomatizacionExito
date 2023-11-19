package com.exito.steps;

import com.exito.pageObject.HomePage;
import com.exito.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import static com.exito.utils.Esperas.espera1;

public class HomeSteps {
    @Page
    HomePage homePage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.exito.com/");
    }

    @Step("Cerrar publicidad")
    public void cerrarPubli(){
        espera1(homePage.getDriver(),homePage.getBtnPubli());
        Assert.assertTrue(
                homePage.getDriver().findElement(
                        homePage.getBtnPubli()
                ).isDisplayed()
        );
        homePage.getDriver().findElement(homePage.getBtnPubli())
                .click();
    }

    @Step("Click en Menu")
    public void clicMenu(){
        homePage.getDriver().findElement(homePage.getBtnMenu())
                .click();
    }

    @Step("Click en categoría y subCategoria")
    public void clicCategoria(){
        /*WebElement mainMenu = homePage.getDriver().findElement(homePage.getBtn1categoria());
        Actions actions = new Actions(homePage.getDriver());
        actions.moveToElement(mainMenu).perform();
        homePage.getDriver().findElement(homePage.getLnk2categoria())
                .click();*/
        String categoria1= Data.extractTo().get(0).get("Categoria1");
        System.out.println(categoria1);
        String categoria2= Data.extractTo().get(0).get("Categoria2");
        System.out.println(categoria2);
        WebElement mainMenu = homePage.getDriver().findElement(By.xpath("//p[contains(text(),'" + categoria1 + "']"));
        Actions actions = new Actions(homePage.getDriver());
        actions.moveToElement(mainMenu).perform();
        homePage.getDriver().findElement(By.xpath("//a[contains(text(),'" + categoria2 + "']"))
                .click();
    }

}
