import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readFirstNumber();
        String Num2 = myApp.readSecondNumber();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        String Addition = myApp.AddNumbers(int1, int2);
        String Subtraction = myApp.SubtractNumbers(int1, int2);
        String Multiplication = myApp.MultiplyNumbers(int1, int2);
        String Division = myApp.DivideNumbers(int1, int2);
        String outputString = myApp.generateOutputString(Addition, Subtraction, Multiplication, Division);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readFirstNumber(){
        System.out.print("What is the first number? ");
        return in.nextLine();
    }

    public String readSecondNumber(){
        System.out.print("What is the second number? ");
        return in.nextLine();
    }

    public String AddNumbers(int int1, int int2){
        int sum = int1 + int2;
        return String.format("%d + %d = %d",int1, int2, sum);
    }

    public String SubtractNumbers(int int1, int int2){
        int difference = int1 - int2;
        return String.format("%d - %d = %d",int1, int2, difference);
    }

    public String MultiplyNumbers(int int1, int int2){
        int product = int1 * int2;
        return String.format("%d - %d = %d",int1, int2, product);
    }

    public String DivideNumbers(int int1, int int2){
        int quotient = int1 / int2;
        return String.format("%d - %d = %d",int1, int2, quotient);
    }

    public String generateOutputString(String Addition, String Subtraction, String Multiplication, String Division){
        return String.format("%s\n%s\n%s\n%s", Addition, Subtraction, Multiplication, Division);
    }
}
