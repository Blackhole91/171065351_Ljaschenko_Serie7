import javax.swing.*;

public class VerschiedeneAbfragen {


 static int minuskommazahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine minus komma zahl ein"));
    static String zehnStellen = JOptionPane.showInputDialog("Geben sie 10 Zeichen ein");
    public static void main(String[] args) {

        try {
            int ganzZahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine Ganzzahl ein"));
            System.out.println();
        }
        catch (ArithmeticException e){
            System.err.println("keine ganzZahl");
        }

        try {
            int minusZahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine minus kommazahl ein"));
            System.out.println();
        }
        catch (ArithmeticException e){
            System.err.println("keine ganzZahl");
        }
        try {
            int ganzZahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine Ganzzahl ein"));
            System.out.println();
        }
        catch (ArithmeticException e){
            System.err.println("keine ganzZahl");
        }
        try {
            int ganzZahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine Ganzzahl ein"));
            System.out.println();
        }
        catch (ArithmeticException e){
            System.err.println("keine ganzZahl");
        }
        try {
            int ganzZahl = Integer.parseInt(JOptionPane.showInputDialog("gebne Sie eine Ganzzahl ein"));
            System.out.println();
        }
        catch (ArithmeticException e){
            System.err.println("keine ganzZahl");
        }






    }
}
