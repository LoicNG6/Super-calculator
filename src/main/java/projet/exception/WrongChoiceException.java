package projet.exception;

public class WrongChoiceException extends Exception {
    public WrongChoiceException() {
        super(" Sorry your choice is not in the list. Choice an operator in the list.");
    }
}
