module com.example.palindrome {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.palindrome to javafx.fxml;
    exports com.example.palindrome;
}