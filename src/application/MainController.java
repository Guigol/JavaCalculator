package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

import application.Modo;

public class MainController {
	
	@FXML
	private Label result;
	@FXML
	private Label labelMem;
	private double nbr1 = 0;
	private String operator ="";
	private boolean start = true;
	private boolean clearOperator = false, update = false;
	private Modo model = new Modo();
	private ArrayList<String> history = new ArrayList<>();
	
	@FXML	
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start = false;
		}
	String value = ((Button)event.getSource()).getText();
	result.setText(result.getText() + value);
		}
	
	@FXML
	public void processOperators(ActionEvent event) {
	String value = ((Button)event.getSource()).getText();
	
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
		operator = value;
		nbr1 = Double.parseDouble(result.getText());
		result.setText("");
			} else {
				if (operator.isEmpty())
					return;
			Double nbr2 = Double.parseDouble(result.getText());
			double output = model.calculate(nbr1, nbr2, operator);
			result.setText(String.valueOf(output));
			history.add(nbr1 + " " + operator + " " + nbr2 + " = " + output);
			operator = "";
			start = true;
			}
		
		}
	
	
	@FXML
	public void actionPerformed(ActionEvent arg0){
		clearOperator = false;
	      update = true;
	      nbr1 = 0;
	      operator = "";
	      result.setText("");
	      labelMem.setText("");
	     	    }
	
	@FXML
	public void actionMem(ActionEvent arg0) {
	    if (labelMem != null) {
	        StringBuilder sb = new StringBuilder();
	        for (String entry : history) {
	            sb.append(entry).append("\n");
	        }
	        labelMem.setText(sb.toString());
	    }
	}

	}   





