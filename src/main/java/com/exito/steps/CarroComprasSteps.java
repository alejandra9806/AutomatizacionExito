package com.exito.steps;

import com.exito.models.ProductModel;
import com.exito.pageObject.CarroComprasPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.exito.utils.Esperas.espera1;

public class CarroComprasSteps {
    @Page
    CarroComprasPage carroComprasPage;
    @Step("Ir al carro de compras")
    public void irCarroCompras(){
        carroComprasPage.getDriver().findElement(carroComprasPage.getLnkCarro()).click();
    }
    @Step("Ingresar correo para continuar")
    public void confCorreo(){
        espera1(carroComprasPage.getDriver(),carroComprasPage.getTxtCorreo());
        Assert.assertTrue(
                carroComprasPage.getDriver().findElement(
                        carroComprasPage.getTxtCorreo()
                ).isDisplayed()
        );
        carroComprasPage.getDriver().findElement(carroComprasPage.getTxtCorreo())
                .sendKeys("compra@gmail.com");
        carroComprasPage.getDriver().findElement(carroComprasPage.getBtnCorreo()).click();
    }

    @Step("Ingresar correo para continuar")
    public void verificaProd(){
        String txtProdCarro = carroComprasPage.getDriver().findElement
                (carroComprasPage.getNomProd()).getText();
        //String txtProducto = ProductoSteps.txtProducto; --Como lo manejé inicialmente por medio de una variable publica
        Assert.assertEquals(txtProdCarro,ProductModel.getNameProduct());
    }
}
