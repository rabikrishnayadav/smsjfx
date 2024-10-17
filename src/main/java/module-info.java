module com.vidsik.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vidsik.studentmanagementsystem to javafx.fxml;
    exports com.vidsik.studentmanagementsystem;
}
