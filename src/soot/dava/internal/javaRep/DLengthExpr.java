package soot.dava.internal.javaRep;

import soot.*;
import soot.grimp.*;
import soot.jimple.*;
import soot.jimple.internal.*;

public class DLengthExpr extends AbstractLengthExpr
{
    public DLengthExpr(Value op)
    {
        super(Grimp.v().newObjExprBox(op));
    }
      
    public Object clone() 
    {
        return new DLengthExpr(Grimp.cloneIfNecessary(getOp()));
    }

    public void toString( UnitPrinter up ) {
        getOpBox().toString(up);
        up.literal(".");
        up.literal("length");
    }

    public String toString()
    {
	return ( getOpBox().getValue()).toString() + ".length"; 
    }
}
