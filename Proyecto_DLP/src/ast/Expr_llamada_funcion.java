/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	expr_llamada_funcion:expr -> nombre:String  parametros:expr*

public class Expr_llamada_funcion extends AbstractExpr {
	
	private Definicion_funcion definicion;

	public Expr_llamada_funcion(String nombre, List<Expr> parametros) {
		this.nombre = nombre;
		this.parametros = parametros;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros);
	}

	public Expr_llamada_funcion(Object nombre, Object parametros) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.parametros = this.<Expr>getAstFromContexts(parametros);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, parametros);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Expr> getParametros() {
		return parametros;
	}
	public void setParametros(List<Expr> parametros) {
		this.parametros = parametros;
	}
	
	

	public Definicion_funcion getDefinicion() {
		return definicion;
	}

	public void setDefinicion(Definicion_funcion definicion) {
		this.definicion = definicion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private List<Expr> parametros;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametros:" + getParametros() + "}";
   }


}
