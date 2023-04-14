module com.mycompany.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;
    requires java.sql;

    opens com.mycompany.test to javafx.fxml;
    exports com.mycompany.test;
}
