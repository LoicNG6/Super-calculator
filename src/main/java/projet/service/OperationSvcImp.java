package projet.service;

import projet.constants.OperatorName;
import projet.exception.WrongChoiceException;

public class OperationSvcImp implements OperationSvc {
    private OperatorName operator;

    public OperationSvcImp() {
    }

    void setOperator(OperatorName newOperator) {
        this.operator = newOperator;
    }

    @Override
    public OperatorName getOperator(char inputOperator) throws WrongChoiceException {
        switch (inputOperator) {
            case 'A':
                setOperator(OperatorName.SUM);
                break;
            case 'S':
                setOperator(OperatorName.SUBTRACTION);
                break;
            case 'M':
                setOperator(OperatorName.MULTIPLICATION);
                break;
            case 'D':
                setOperator(OperatorName.DIVISION);
                break;
            default:
                throw new WrongChoiceException();
        }
        return this.operator;
    }
}
