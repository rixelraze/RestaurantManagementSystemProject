module com.example.restaurantmanagementsystemproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;
    requires mysql.connector.java;


    opens com.example.restaurantmanagementsystemproject to javafx.fxml;
    exports com.example.restaurantmanagementsystemproject;
}