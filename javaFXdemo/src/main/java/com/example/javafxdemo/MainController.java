package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

public class MainController implements Externalizable {
    public TextField filePath;

    public MainController(){

    }
    static final long SerialVersionUID = 1L;

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

    private double hotNewValueD = 0.0;
    private double coldNewValueD = 0.0;
    private double energyNewValueD = 0.0;

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

            double waterEjectValueD = (coldNewValueD - coldOldValueD) + (hotNewValueD - hotOldValueD);
            double waterEjectPayD = waterEjectValueD * waterEjectPriceD;

            waterEjectValue.setText(String.format("%.2f", waterEjectValueD));
            coldPay.setText(String.format("%.2f", (coldNewValueD - coldOldValueD) * coldPriceD));
            hotPay.setText(String.format("%.2f", (hotNewValueD - hotOldValueD) * hotPriceD));
            energyPay.setText(String.format("%.2f", (energyNewValueD - energyOldValueD) * energyPriceD));
            waterEjectPay.setText(String.format("%.2f", waterEjectPayD));
            monthlyPay.setText(String.format("%.2f", monthlyPriceD));

            double energyPayD = (energyNewValueD - energyOldValueD) * energyPriceD;
            double coldPayD = (coldNewValueD - coldOldValueD) * coldPriceD;
            double hotPayD = (hotNewValueD - hotOldValueD) * hotPriceD;
            double calculatePaymentD = waterEjectPayD + monthlyPriceD + energyPayD + coldPayD + hotPayD;
            calculatePayment.setText(String.format("%.2f", calculatePaymentD));

            exceptionLabel.setText("");

        } catch (NumberFormatException nfe){
            System.out.println("Вводите числа разделенные '.' и ',' в текстовые поля");
            exceptionLabel.setText("Проверьте, все ли поля заполнены правильно");
        }
    }

    @FXML
    protected void saveData(){
        if (HelloApplication.isUnix()){
            System.out.println("This is Unix");
            //System.out.println("Set default filePath for Unix /home/phsave.bin");
            filePath.setText("/home/phsave.bin");
        } else if (HelloApplication.isWindows()){
            System.out.println("This is Windows");
            //System.out.println("Set default filePath for Windows C:\tmp\phsave.bin");
            filePath.setText("C:\\tmp\\phsave.bin");
        }
        System.out.println("save to >>> " + filePath.getText());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath.getText()))) {
            writeExternal(oos);
            exceptionLabel.setText("Сохранение успешно");
        } catch (IOException e) {
            e.printStackTrace();
            exceptionLabel.setText("Проверьте путь к файлу");
            System.out.println("Что-то не так " + e);
        }
    }

    @FXML
    protected void loadData() {
        if (HelloApplication.isUnix()){
            System.out.println("This is Unix");
            //System.out.println("Set default filePath for Unix /home/phsave.bin");
            filePath.setText("/home/phsave.bin");
        } else if (HelloApplication.isWindows()){
            System.out.println("This is Windows");
            //System.out.println("Set default filePath for Windows C:\tmp\phsave.bin");
            filePath.setText("C:\\tmp\\phsave.bin");
        }
        System.out.println("load from >>> " + filePath.getText());
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath.getText()))) {
            readExternal(ois);
            exceptionLabel.setText("Загрузка успешна");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            exceptionLabel.setText("Проверьте путь к файлу");
            System.out.println("Что-то не так " + e);
        }
    }

    @FXML
    protected void swapData(){
        exceptionLabel.setText("");
        hotOldValue.setText(String.valueOf(hotNewValueD));
        coldOldValue.setText(String.valueOf(coldNewValueD));
        energyOldValue.setText(String.valueOf(energyNewValueD));

        hotNewValue.setText(String.valueOf(hotOldValueD));
        coldNewValue.setText(String.valueOf(coldOldValueD));
        energyNewValue.setText(String.valueOf(energyOldValueD));
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        onCalculateButtonClick();
        //prices
        out.writeObject(hotPriceD);
        out.writeObject(coldPriceD);
        out.writeObject(energyPriceD);
        out.writeObject(waterEjectPriceD);
        out.writeObject(monthlyPriceD);
        //old values
        out.writeObject(hotOldValueD);
        out.writeObject(coldOldValueD);
        out.writeObject(energyOldValueD);
        //out.writeObject(waterEjectValueD);
        //values
        out.writeObject(hotNewValueD);
        out.writeObject(coldNewValueD);
        out.writeObject(energyNewValueD);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        hotPriceD = (Double) in.readObject();
        coldPriceD = (Double) in.readObject();
        energyPriceD = (Double) in.readObject();
        waterEjectPriceD = (Double) in.readObject();
        monthlyPriceD = (Double) in.readObject();

        hotOldValueD = (Double) in.readObject();
        coldOldValueD = (Double) in.readObject();
        energyOldValueD = (Double) in.readObject();
        //waterEjectValueD = (Double) in.readObject();

        hotNewValueD = (Double) in.readObject();
        coldNewValueD = (Double) in.readObject();
        energyNewValueD = (Double) in.readObject();

        hotPrice.setText(String.valueOf(hotPriceD));
        coldPrice.setText(String.valueOf(coldPriceD));
        energyPrice.setText(String.valueOf(energyPriceD));
        waterEjectPrice.setText(String.valueOf(waterEjectPriceD));
        monthlyPrice.setText(String.valueOf(monthlyPriceD));

        hotOldValue.setText(String.valueOf(hotOldValueD));
        coldOldValue.setText(String.valueOf(coldOldValueD));
        energyOldValue.setText(String.valueOf(energyOldValueD));
        //waterEjectValue.setText(String.valueOf(waterEjectValueD));

        hotNewValue.setText(String.valueOf(hotNewValueD));
        coldNewValue.setText(String.valueOf(coldNewValueD));
        energyNewValue.setText(String.valueOf(energyNewValueD));
    }
}
