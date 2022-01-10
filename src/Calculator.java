import javax.swing.*;

public class Calculator {
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorGraphics().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String runOperation(String sa , String sb , char operation){
        double a, b;
        if(sb != "") {
            a = Double.valueOf(sa);
            b = Double.valueOf(sb);
            if (operation == '+') {
                return String.valueOf(a + b);
            } else if (operation == '-') {
                return String.valueOf(a - b);
            } else if (operation == 'X') {
                return String.valueOf(a * b);
            } else if (operation == '/') {
                if (b != 0)
                    return String.valueOf(a / b);
                else
                    return "MathError";
            } else {
                return null;
            }
        }else{
            return sa;
        }
    }

    public boolean checkForInvalide(String s){
        String a = "1234567890";
        int length = s.length();
        int counter = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '.'){
                for(int j = 0 ; j <= 9 ; j++){
                    if(s.charAt(i) == a.charAt(j)){
                        counter += 1;
                    }
                }
            }
            else{
                counter += 1;
            }
        }
        if(counter == length){
            return false;
        }else{
            return true;
        }
    }
}
