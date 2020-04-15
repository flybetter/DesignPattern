package bigtalkdesignpattern.simplefactorypattern;

public class OperationFactory {

    public static Operation getOperation(String operation){
        switch (operation){
            case "*": return new MulOperation() ;
            case "/": return new DivOperation() ;
            case "+": return new AddOperation() ;
            case "-": return new SubOperation() ;
            default:break;
        }
        return null;
    }
}
