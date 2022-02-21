package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculateButtonClickedController {

    public TextField hotPrice;
    public TextField coldPrice;
    public TextField energyPrice;
    public TextField waterEjectPrice;
    public TextField monthlyPrice;

    public TextField hotOldValue;
    public TextField coldOldValue;
    public TextField energyOldValue;
    public TextField waterEjectValue;

    public TextField hotNewValue;
    public TextField coldNewValue;
    public TextField energyNewValue;

    //Локальные переменные для хранения распарсенных значений из строк
    private double hotPriceD = 0.0;
    private double coldPriceD = 0.0;
    private double energyPriceD = 0.0;
    private double waterEjectPriceD = 0.0;
    private double monthlyPriceD = 0.0;

    @FXML
    protected void onCalculateButtonClick() {
        try{
            hotPriceD = Double.parseDouble(hotPrice.getText().trim().replaceAll(",", "."));
            coldPriceD = Double.parseDouble(coldPrice.getText().trim().replaceAll(",", "."));
            energyPriceD = Double.parseDouble(energyPrice.getText().trim().replaceAll(",", "."));
            waterEjectPriceD = Double.parseDouble(waterEjectPrice.getText().trim().replaceAll(",", "."));
            monthlyPriceD = Double.parseDouble(monthlyPrice.getText().trim().replaceAll(",", "."));
        } catch (NumberFormatException nfe){
            System.out.println("Вводите числа разделенные '.' и ',' в текстовые поля");
        }

        System.out.println(hotPriceD);
        System.out.println(coldPriceD);
        System.out.println(energyPriceD);
        System.out.println(waterEjectPriceD);
        System.out.println(monthlyPriceD);
    }
}
