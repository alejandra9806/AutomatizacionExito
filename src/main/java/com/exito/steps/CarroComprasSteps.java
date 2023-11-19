package com.exito.steps;

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
        System.out.println("Lo que esta en el carro: "+txtProdCarro);
        String txtProducto = ProductoSteps.txtProducto;
        //String txtProductos = productoSteps.getTxtProducto();
        System.out.println("Lo que se seleccionó: "+txtProducto);
        Assert.assertEquals(txtProdCarro,txtProducto);
        System.out.println("funciono!");
    }
}
