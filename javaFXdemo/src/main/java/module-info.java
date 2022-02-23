module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo;
}