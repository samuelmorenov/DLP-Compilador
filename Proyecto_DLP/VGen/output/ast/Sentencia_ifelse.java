/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	sentencia_ifelse:sentencia -> condicion:expr  sentencias:sentencia*  sino:sentencia*

public class Sentencia_ifelse extends AbstractSentencia {

	public Sentencia_ifelse(Expr condicion, List<Sentencia> sentencias, List<Sentencia> sino) {
		this.condicion = condicion;
		this.sentencias = sentencias;
		this.sino = sino;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencias, sino);
	}

	@SuppressWarnings("unchecked")
	public Sentencia_ifelse(Object condicion, Object sentencias, Object sino) {
		this.condicion = (Expr) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);
		this.sentencias = (List<Sentencia>) sentencias;
		this.sino = (List<Sentencia>) sino;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencias, sino);
	}

	public Expr getCondicion() {
		return condicion;
	}
	public void setCondicion(Expr condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getSentencias() {
		return sentencias;
	}
	public void setSentencias(List<Sentencia> sentencias) {
		this.sentencias = sentencias;
	}

	public List<Sentencia> getSino() {
		return sino;
	}
	public void setSino(List<Sentencia> sino) {
		this.sino = sino;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condicion;
	private List<Sentencia> sentencias;
	private List<Sentencia> sino;

	public String toString() {
       return "{condicion:" + getCondicion() + ", sentencias:" + getSentencias() + ", sino:" + getSino() + "}";
   }
}
