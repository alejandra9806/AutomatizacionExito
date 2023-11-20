package com.exito.stepDefinitions;

import com.exito.steps.CarroComprasSteps;
import com.exito.steps.HomeSteps;
import com.exito.steps.ProductoSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarProdSetpDef {
    @Steps
    HomeSteps homeSteps;
    @Steps
    ProductoSteps productoSteps;
    @Steps
    CarroComprasSteps carroComprasSteps;
    @Dado("que el usuario abre el navegador en la pagina web del exito")
    public void queElUsuarioAbreElNavegadorEnLaPaginaWebDelExito() {
        homeSteps.abrirNavegador();
        homeSteps.cerrarPubli();
    }
    @Cuando("el usuario seleccione la categoria y subcategoria")
    public void elUsuarioSeleccioneLaCategoriaYSubcategoria() {
        homeSteps.clicMenu();
        homeSteps.clicCategoria();
    }
    @Cuando("selecciona el producto")
    public void seleccionaElProducto() {
        productoSteps.agregarPro();
        carroComprasSteps.irCarroCompras();
        carroComprasSteps.confCorreo();
    }
    @Entonces("el usuario podra visualizar el producto en el carro de compras")
    public void elUsuarioPodraVisualizarElProductoEnElCarroDeCompras() {
        carroComprasSteps.verificaProd();

    }
}
