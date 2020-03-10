/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	definicion_funcion:definicion -> nombre:String  parametros:variable*  retorno:tipo  locales:variable*  sentencias:sentencia*

public class Definicion_funcion extends AbstractDefinicion {

	public Definicion_funcion(String nombre, List<Variable> parametros, Tipo retorno, List<Variable> locales, List<Sentencia> sentencias) {
		this.nombre = nombre;
		this.parametros = parametros;
		this.retorno = retorno;
		this.locales = locales;
		this.sentencias = sentencias;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametros, retorno, locales, sentencias);
	}

	public Definicion_funcion(Object nombre, Object parametros, Object retorno, Object locales, Object sentencias) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.parametros = this.<Variable>getAstFromContexts(parametros);
		this.retorno = (Tipo) getAST(retorno);
		this.locales = this.<Variable>getAstFromContexts(locales);
		this.sentencias = this.<Sentencia>getAstFromContexts(sentencias);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, parametros, retorno, locales, sentencias);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Variable> getParametros() {
		return parametros;
	}
	public void setParametros(List<Variable> parametros) {
		this.parametros = parametros;
	}

	public Tipo getRetorno() {
		return retorno;
	}
	public void setRetorno(Tipo retorno) {
		this.retorno = retorno;
	}

	public List<Variable> getLocales() {
		return locales;
	}
	public void setLocales(List<Variable> locales) {
		this.locales = locales;
	}

	public List<Sentencia> getSentencias() {
		return sentencias;
	}
	public void setSentencias(List<Sentencia> sentencias) {
		this.sentencias = sentencias;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private List<Variable> parametros;
	private Tipo retorno;
	private List<Variable> locales;
	private List<Sentencia> sentencias;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametros:" + getParametros() + ", retorno:" + getRetorno() + ", locales:" + getLocales() + ", sentencias:" + getSentencias() + "}";
   }
}
