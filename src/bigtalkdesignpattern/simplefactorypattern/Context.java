package bigtalkdesignpattern.simplefactorypattern;

import java.util.Scanner;

public class Context {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("opeartion action:");
        String operation=scanner.nextLine();
        System.out.println("numA value:");
        String numA=scanner.nextLine();
        System.out.println("numB value:");
        String numB=scanner.nextLine();


        Operation operationObject=OperationFactory.getOperation(operation);
        operationObject.setNumA(Double.parseDouble(numA));
        operationObject.setNumB(Double.parseDouble(numB));
        operationObject.getResult();

    }



}
