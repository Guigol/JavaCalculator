module FX_Calc {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	opens application to javafx.fxml;
	exports application to javafx.graphics;
	}