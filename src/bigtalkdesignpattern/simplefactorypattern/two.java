package bigtalkdesignpattern.simplefactorypattern;

import java.io.PrintStream;
import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = System.out;
        try {

            printStream.println("numA value:");
            String numA = scanner.nextLine();
            printStream.println("numB value:");
            String numB = scanner.nextLine();
            printStream.println("operation action:");
            String operation = scanner.nextLine();

            int result=0;

            switch (operation){
                case "+" : result=Integer.parseInt(numA)+Integer.parseInt(numB); break;
                case "-" : result=Integer.parseInt(numA)-Integer.parseInt(numB); break;
                case "*" : result=Integer.parseInt(numA)*Integer.parseInt(numB); break;
                case "/" : result=Integer.parseInt(numA)/Integer.parseInt(numB); break;
                default:break;
            }

            printStream.println("result:"+result);
        } catch (NumberFormatException e) {
            printStream.println("error Message:"+e.getMessage());
        }
    }
}
