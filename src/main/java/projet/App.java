package projet;

import projet.exception.WrongChoiceException;
import projet.service.OperationSvcImp;
import java.util.Scanner;

public class App {
    public static void output() {
        System.out.println("\n" + "---------------------------------Super Calculator On--------------------------" + "\n");
        System.out.println(" Welcome to the Super Calculator. ");
        System.out.println(" First, choose your operator : ");

        System.out.println("\t" + "(A) Sum");
        System.out.println("\t" + "(S) Subtraction");
        System.out.println("\t" + "(M) Multiplication");
        System.out.println("\t" + "(D) Division" + "\n");
    }
    public static void main(String[] args) throws WrongChoiceException {
        output();
        Scanner userInput = new Scanner(System.in);
        String inputOperator = userInput.next();
        OperationSvcImp operator = new OperationSvcImp();

        System.out.println("\n" + "Great ! You've chosen operator is " + operator.getOperator(inputOperator.charAt(0)));
    }
}
