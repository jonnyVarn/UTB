import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args ) {
    double num1=0;
    double num2=0;
    String quitProgram = "N";
    String iostreamChecker ="";
    Scanner input = new Scanner(System.in);
    String operatorMode = "r";
        Calc min = new Calc();
        

            while (!quitProgram.contentEquals("q")) {
            System.out.println("calculator press +  - / * (q)");
            iostreamChecker = input.nextLine();
            operatorMode = iostreamChecker;
            if (iostreamChecker.equals("q")) { quitProgram = "q";} 
             
            if (!iostreamChecker.equals("q"))  {
                try {
                    System.out.print("Enter a number: ");
                    num1 = input.nextDouble();
                }

                catch (final InputMismatchException e) {
                    input.nextLine();
                }
            

                try {System.out.print("Enter a second number: "); num2 = input.nextDouble();}

                catch (final InputMismatchException e) {input.nextLine();}
            }
            if (operatorMode.equals("/")) {System.out.println(min.division(num1, num2));}
            if (operatorMode.equals("*")) {System.out.println(min.times(num1, num2 ));}
            if (operatorMode.equals("+")) {System.out.println(min.plus(num1, num2));}
            if(operatorMode.equals("-")) {System.out.println(min.minus(num1, num2));}
            else {System.out.println("quit ? press q"); iostreamChecker = input.nextLine();}

        } 


    }  
            
}

