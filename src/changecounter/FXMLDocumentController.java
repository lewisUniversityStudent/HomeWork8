/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecounter;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.IntStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 *
 * @author awais
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Font x1;
    @FXML
    private TextField QuartersTextField;
    @FXML
    private TextField DimesTextField;
    @FXML
    private TextField NickelsTextField;
    @FXML
    private TextField PenniesTextField;
    @FXML
    private TextField QuartersValueTextField;
    @FXML
    private TextField dimesValueTextField;
    @FXML
    private TextField nickelsValueTextField;
    @FXML
    private TextField penniesValueTextField;
    @FXML
    private Label exceptionHandling;
    @FXML
    private TextField GrandTotal;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Compute(ActionEvent event) {
     
        ArrayList<Double> Total = new ArrayList<>(); // Create an ArrayList object

        //if the textfield is not empty
        if(!QuartersTextField.getText().trim().isEmpty()){
           try{
            Double Quarters = Double.valueOf(QuartersTextField.getText());
            Double TotalQuarters = Quarters * 0.25;
            QuartersValueTextField.setText(String.valueOf(TotalQuarters));
            Total.add(TotalQuarters);
            }catch(Exception e)
            {
                exceptionHandling.setText("Please Type In Correct Quarters Value");
            } 
        }
        if(!DimesTextField.getText().trim().isEmpty()){
           try{
            Double Dimes = Double.valueOf(DimesTextField.getText());
            Double TotalDimes = Dimes * 0.1;
            dimesValueTextField.setText(String.valueOf(TotalDimes));
            Total.add(TotalDimes);
            }catch(Exception e)
            {
                exceptionHandling.setText("Please Type In Correct Dimes Value");
            } 
        }
        if(!NickelsTextField.getText().trim().isEmpty()){
           try{
            Double Nickels = Double.valueOf(NickelsTextField.getText());
            Double TotalNickels = Nickels * 0.05;
            nickelsValueTextField.setText(String.valueOf(TotalNickels));
            Total.add(TotalNickels);
            }catch(Exception e)
            {
                exceptionHandling.setText("Please Type In Correct Nickels Value");
            } 
        }
        if(!PenniesTextField.getText().trim().isEmpty()){
           try{
            Double Pennies = Double.valueOf(PenniesTextField.getText());
            Double TotalPennies = Pennies * 0.01;
            penniesValueTextField.setText(String.valueOf(TotalPennies));
            Total.add(TotalPennies);
            }catch(Exception e)
            {
                exceptionHandling.setText("Please Type In Correct Pennies Value");
            } 
        }
        
//        Double sum = IntStream.of(Total).sum();
        Double sum = 0.0;
        
        for(int i = 0; i != Total.size(); i++)
        {
            sum = sum+ Total.get(i);
        }
        GrandTotal.setText(String.valueOf(sum));
    }
    
}
