package projet.service;

import projet.constants.OperatorName;
import projet.exception.WrongChoiceException;

public interface OperationSvc {
    OperatorName getOperator(char inputOperator) throws WrongChoiceException;
}
