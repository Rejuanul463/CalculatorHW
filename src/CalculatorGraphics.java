import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGraphics {
    Calculator cal = new Calculator();
    String textA ="" , textF , errorText;
    char operator = 'a';
    public JPanel panel1;
    private JTextArea textArea1;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton ACButton;
    private JButton button5;
    private JButton button6;
    private JButton xButton;
    private JButton button8;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton Button9;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button16;
    private JTextField textField1;
    private JButton button1;

    public CalculatorGraphics() {
        a1Button.addActionListener(e -> {
            textA = textA + a1Button.getText();
            textArea1.setText(textA);
        });
        a2Button.addActionListener(e -> {
            textA = textA + a2Button.getText();
            textArea1.setText(textA);
        });
        a3Button.addActionListener(e -> {
            textA = textA + a3Button.getText();
            textArea1.setText(textA);
        });
        a4Button.addActionListener(e -> {
            textA = textA + a4Button.getText();
            textArea1.setText(textA);
        });
        a5Button.addActionListener(e -> {
            textA = textA + a5Button.getText();
            textArea1.setText(textA);
        });
        a6Button.addActionListener(e -> {
            textA = textA + a6Button.getText();
            textArea1.setText(textA);
        });
        a7Button.addActionListener(e -> {
            textA = textA + a7Button.getText();
            textArea1.setText(textA);
        });
        a8Button.addActionListener(e -> {
            textA = textA + a8Button.getText();
            textArea1.setText(textA);
        });
        Button9.addActionListener(e -> {
            textA = textA + Button9.getText();
            textArea1.setText(textA);
        });
        a0Button.addActionListener(e -> {
            textA = textA + a0Button.getText();
            textArea1.setText(textA);
        });
        button1.addActionListener(e -> {
            textA = textA + button1.getText();
            textArea1.setText(textA);
        });
        //ResetButton
        ACButton.addActionListener(e ->{
            textA = "";
            textF = "";
            textField1.setText(textF);
            textArea1.setText(textA);
        });
        //Arethmetic operations
        //Sum
        button5.addActionListener(e ->{
            if(textF == null)
                textF = textArea1.getText();
            else{
                textF = cal.runOperation(textF , textA , operator);
            }
            textA = "";
            if(cal.checkForInvalide(textF)){
                textA = "Invalide input press AC to reset";
            }
            if(textF == "MathError"){
                textF = "";
                textA = "MathError Please Press AC to reset";
            }
            else if (textF == "SyntexError"){
                textF = "";
                textA = "Invalid Input Press AC to reset";
            }

            textField1.setText(textF + " " + button5.getText());
            textArea1.setText(textA);
            operator = '+';
        });
        //sub
        button6.addActionListener(e ->{
            if(textF == null)
                textF = textArea1.getText();
            else{
                textF = cal.runOperation(textF , textA , operator);
            }
            textA = "";
            if(cal.checkForInvalide(textF)){
                textA = "Invalide input press AC to reset";
            }
            if(textF == "MathError"){
                textF = "";
                textA = "MathError Please Press AC to reset";
            }
            textField1.setText(textF + " " + button6.getText());
            textArea1.setText(textA);
            operator = '-';
        });
        //multi
        xButton.addActionListener(e ->{
            if(textF == null)
                textF = textArea1.getText();
            else{
                textF = cal.runOperation(textF , textA , operator);
            }
            textA = "";
            if(cal.checkForInvalide(textF)){
                textA = "Invalide input press AC to reset";
            }
            if(textF == "MathError"){
                textF = "";
                textA = "MathError Please Press AC to reset";
            }
            textField1.setText(textF + " " + xButton.getText());
            textArea1.setText(textA);
            operator = 'X';
        });
        //Div
        button8.addActionListener(e ->{
            if(textF == null)
                textF = textArea1.getText();
            else{
                textF = cal.runOperation(textF , textA , operator);
            }
            textA = "";
            if(cal.checkForInvalide(textF)){
                textA = "Invalide input press AC to reset";
            }
            if(textF == "MathError"){
                textF = "";
                textA = "MathError Please Press AC to reset";
            }
            textField1.setText(textF + " " + button8.getText());
            textArea1.setText(textA);
            operator = '/';
        });
        //equation
        button16.addActionListener(e ->{
            if(textF == null)
                textF = textArea1.getText();
            else{
                textF = cal.runOperation(textF , textA , operator);
            }
            textA = "";
            if(cal.checkForInvalide(textF)){
                textA = "Invalide input press AC to reset";
            }
            if(textF == "MathError"){
                textF = "MathError Please Press AC to reset";
            }
            textField1.setText("");
            textArea1.setText(button16.getText() + " " +
                    "" + textF);
            textArea1.setAlignmentY(10f);
        });
    }
}
