package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CalculateButtonClickedController implements Externalizable {

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

    public TextField hotPay;
    public TextField coldPay;
    public TextField energyPay;
    public TextField waterEjectPay;
    public TextField monthlyPay;

    public TextField calculatePayment;
    public Label exceptionLabel;

    //Локальные переменные для хранения распарсенных значений из строк
    private double hotPriceD = 0.0;
    private double coldPriceD = 0.0;
    private double energyPriceD = 0.0;
    private double waterEjectPriceD = 0.0;
    private double monthlyPriceD = 0.0;

    private double hotOldValueD = 0.0;
    private double coldOldValueD = 0.0;
    private double energyOldValueD = 0.0;
    private double waterEjectValueD = 0.0;

    private double hotNewValueD = 0.0;
    private double coldNewValueD = 0.0;
    private double energyNewValueD = 0.0;

    private double hotPayD;
    private double coldPayD;
    private double energyPayD;
    private double waterEjectPayD;
    private double monthlyPayD;

    private double calculatePaymentD = 0.0;

    @FXML
    protected void onCalculateButtonClick() {
        try{
            hotPriceD = Double.parseDouble(hotPrice.getText().trim().replaceAll(",", "."));
            coldPriceD = Double.parseDouble(coldPrice.getText().trim().replaceAll(",", "."));
            energyPriceD = Double.parseDouble(energyPrice.getText().trim().replaceAll(",", "."));
            waterEjectPriceD = Double.parseDouble(waterEjectPrice.getText().trim().replaceAll(",", "."));
            monthlyPriceD = Double.parseDouble(monthlyPrice.getText().trim().replaceAll(",", "."));

            hotOldValueD = Double.parseDouble(hotOldValue.getText().trim().replaceAll(",", "."));
            coldOldValueD = Double.parseDouble(coldOldValue.getText().trim().replaceAll(",", "."));
            energyOldValueD = Double.parseDouble(energyOldValue.getText().trim().replaceAll(",", "."));

            hotNewValueD = Double.parseDouble(hotNewValue.getText().trim().replaceAll(",", "."));
            coldNewValueD = Double.parseDouble(coldNewValue.getText().trim().replaceAll(",", "."));
            energyNewValueD = Double.parseDouble(energyNewValue.getText().trim().replaceAll(",", "."));

            waterEjectValueD = (coldNewValueD - coldOldValueD) + (hotNewValueD - hotOldValueD);
            waterEjectPayD = waterEjectValueD * waterEjectPriceD;

            waterEjectValue.setText(String.format("%.2f", waterEjectValueD));
            coldPay.setText(String.format("%.2f", (coldNewValueD - coldOldValueD) * coldPriceD));
            hotPay.setText(String.format("%.2f", (hotNewValueD - hotOldValueD) * hotPriceD));
            energyPay.setText(String.format("%.2f", (energyNewValueD - energyOldValueD) * energyPriceD));
            waterEjectPay.setText(String.format("%.2f", waterEjectPayD));
            monthlyPay.setText(String.format("%.2f", monthlyPriceD));

            energyPayD = (energyNewValueD - energyOldValueD) * energyPriceD;
            coldPayD = (coldNewValueD - coldOldValueD) * coldPriceD;
            hotPayD = (hotNewValueD - hotOldValueD) * hotPriceD;
            calculatePaymentD = waterEjectPayD + monthlyPriceD + energyPayD + coldPayD + hotPayD;
            calculatePayment.setText(String.format("%.2f", calculatePaymentD));

            exceptionLabel.setText("");

        } catch (NumberFormatException nfe){
            System.out.println("Вводите числа разделенные '.' и ',' в текстовые поля");
            exceptionLabel.setText("Проверьте, все ли поля заполнены правильно");
        }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
