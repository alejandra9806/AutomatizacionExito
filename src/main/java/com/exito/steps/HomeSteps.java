package com.exito.steps;

import com.exito.pageObject.HomePage;
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

        WebElement mainMenu = homePage.getDriver().findElement(homePage.getBtn1categoria());
        Actions actions = new Actions(homePage.getDriver());
        actions.moveToElement(mainMenu).perform();
        homePage.getDriver().findElement(homePage.getLnk2categoria())
                .click();
    }

}
