/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	sentencia_returnVacia:sentencia -> 

public class Sentencia_returnVacia extends AbstractSentencia {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{Sentencia_returnVacia}";
   }
}
