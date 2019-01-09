import javax.swing.*;

public class ExeptionAbfangen {

    public static void main(String[] args) {

        try {


            int eingabe3 = Integer.parseInt(JOptionPane.showInputDialog("geben sie eine Zahl ein"));
            int eingabe4 = Integer.parseInt(JOptionPane.showInputDialog("geben sie eine weitere Zahl ein"));
            String name = "Artem";
            int eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("geben sie eine Zahl ein"));
            int eingabe2 = Integer.parseInt(JOptionPane.showInputDialog("geben sie eine weitere Zahl ein"));


            System.out.println(eingabe1 / eingabe2);
            System.out.println(name.charAt(9));

        }
        catch (ArithmeticException e) {
            System.err.println("Division durch 0");
        }
        catch (NumberFormatException d){
            System.err.println("keine zahl");
        }
        catch (StringIndexOutOfBoundsException f){
            System.err.println("zu wenig buchstaben");
        }



    }








    }

