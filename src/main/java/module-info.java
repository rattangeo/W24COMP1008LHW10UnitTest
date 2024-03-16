module com.example.w24comp1008lhw10unittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w24comp1008lhw10unittest to javafx.fxml;
    exports com.example.w24comp1008lhw10unittest;
}