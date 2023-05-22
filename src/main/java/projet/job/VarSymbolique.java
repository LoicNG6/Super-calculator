package projet.job;

import java.util.Map;
import java.util.TreeMap;

public final class VarSymbolique implements ExpressionArithmetique {

    private final char variable; 
    private int partInt=0;

    public VarSymbolique(char variable) {
        Map<Character,Character> tableauAssociatifVarS = new TreeMap<Character,Character>();
        tableauAssociatifVarS.put('x','x');
        tableauAssociatifVarS.put('y','y');
        tableauAssociatifVarS.put('z','z');
        this.variable = tableauAssociatifVarS.get(variable);
    }

    public char getVariable() {
        return this.variable;
    }
    public int getVariableEntier() {
    	return this.partInt;
    }

    public int modifierVariable(int nb) {
    	this.partInt=(int) this.variable;
    	this.partInt=nb;
    	return this.partInt;
    }
    
    @Override
    public ExpressionArithmetique simplifier() {
        return this;
    }

    @Override
    public double calculer() {
        return getVariableEntier();
    }

    @Override
	public boolean egaliteAr(ExpressionArithmetique expr2) {
		// TODO Auto-generated method stub
		return false;
	}


}
