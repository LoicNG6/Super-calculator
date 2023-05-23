import org.junit.Test;
import projet.constants.OperatorName;
import projet.exception.WrongChoiceException;
import projet.service.OperationSvcImp;

import static org.junit.Assert.*;

public class OperationSvcImpTest {
    @Test
    public void rightOperatorNameTest() throws WrongChoiceException {
        OperationSvcImp operation = new OperationSvcImp();
        boolean result = operation.getOperator('D') == OperatorName.DIVISION;
        System.out.println("\n" + "\t" + "testResult = " + result + "\n");
        assertSame(operation.getOperator('D'), OperatorName.DIVISION);
    }
}
