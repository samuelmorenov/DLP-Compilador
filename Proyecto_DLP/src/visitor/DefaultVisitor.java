/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Program { List<Bloque> bloque; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getBloque(), param);
		return null;
	}

	//	class Definicion_variable { String nombre;  Tipo tipo; }
	public Object visit(Definicion_variable node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Definicion_variable_struct { String nombre;  Tipo tipo; }
	public Object visit(Definicion_variable_struct node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Definicion_variable_funcion { String nombre;  Tipo tipo; }
	public Object visit(Definicion_variable_funcion node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Tamanio_vector { int numero; }
	public Object visit(Tamanio_vector node, Object param) {
		return null;
	}

	//	class TipoInt {  }
	public Object visit(TipoInt node, Object param) {
		return null;
	}

	//	class TipoFloat {  }
	public Object visit(TipoFloat node, Object param) {
		return null;
	}

	//	class TipoChar {  }
	public Object visit(TipoChar node, Object param) {
		return null;
	}

	//	class TipoVar { String string; }
	public Object visit(TipoVar node, Object param) {
		return null;
	}

	//	class TipoArray { String tamanio;  Tipo tipo; }
	public Object visit(TipoArray node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Struct { String nombre;  List<Definicion_variable_struct> definicion_variable_struct; }
	public Object visit(Struct node, Object param) {
		visitChildren(node.getDefinicion_variable_struct(), param);
		return null;
	}

	//	class Funcion { String nombre;  List<Parametro> parametros;  List<Tipo> retorno;  List<Sentencia> sentencia; }
	public Object visit(Funcion node, Object param) {
		visitChildren(node.getParametros(), param);
		visitChildren(node.getRetorno(), param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	//	class Parametro { String nombre;  Tipo tipo; }
	public Object visit(Parametro node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Sentencia_asignacion { Expr izquierda;  Expr derecha; }
	public Object visit(Sentencia_asignacion node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class Sentencia_print { Expr expresiones; }
	public Object visit(Sentencia_print node, Object param) {
		if (node.getExpresiones() != null)
			node.getExpresiones().accept(this, param);
		return null;
	}

	//	class Sentencia_read { Expr expresiones; }
	public Object visit(Sentencia_read node, Object param) {
		if (node.getExpresiones() != null)
			node.getExpresiones().accept(this, param);
		return null;
	}

	//	class Sentencia_if { Expr condicion;  List<Sentencia> sentencias;  List<Sentencia> sino; }
	public Object visit(Sentencia_if node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getSentencias(), param);
		visitChildren(node.getSino(), param);
		return null;
	}

	//	class Sentencia_while { Expr condicion;  List<Sentencia> sentencias; }
	public Object visit(Sentencia_while node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getSentencias(), param);
		return null;
	}

	//	class Sentencia_return { Expr expresion; }
	public Object visit(Sentencia_return node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class Sentencia_expresion { Expr expresion; }
	public Object visit(Sentencia_expresion node, Object param) {
		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);
		return null;
	}

	//	class Expr_int { String string; }
	public Object visit(Expr_int node, Object param) {
		return null;
	}

	//	class Expr_real { String string; }
	public Object visit(Expr_real node, Object param) {
		return null;
	}

	//	class Expr_char { String string; }
	public Object visit(Expr_char node, Object param) {
		return null;
	}

	//	class Expr_ident { String string; }
	public Object visit(Expr_ident node, Object param) {
		return null;
	}

	//	class Expr_binaria { Expr izquierda;  Operador operador;  Expr derecha; }
	public Object visit(Expr_binaria node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getOperador() != null)
			node.getOperador().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class Expr_vector { Expr fuera;  Expr dentro; }
	public Object visit(Expr_vector node, Object param) {
		if (node.getFuera() != null)
			node.getFuera().accept(this, param);
		if (node.getDentro() != null)
			node.getDentro().accept(this, param);
		return null;
	}

	//	class Expr_punto { Expr izquierda;  Expr derecha; }
	public Object visit(Expr_punto node, Object param) {
		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);
		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);
		return null;
	}

	//	class Expr_parentesis { Expr expr; }
	public Object visit(Expr_parentesis node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Expr_cast { Tipo tipo;  Expr expr; }
	public Object visit(Expr_cast node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Expr_llamada_funcion { String nombre;  List<Expr> parametros; }
	public Object visit(Expr_llamada_funcion node, Object param) {
		visitChildren(node.getParametros(), param);
		return null;
	}

	//	class Operador_aritmetico { Operador operador_aritmetico; }
	public Object visit(Operador_aritmetico node, Object param) {
		if (node.getOperador_aritmetico() != null)
			node.getOperador_aritmetico().accept(this, param);
		return null;
	}

	//	class Operador_logico { Operador operador_logico; }
	public Object visit(Operador_logico node, Object param) {
		if (node.getOperador_logico() != null)
			node.getOperador_logico().accept(this, param);
		return null;
	}

	//	class Operador_booleano { Operador operador_booleano; }
	public Object visit(Operador_booleano node, Object param) {
		if (node.getOperador_booleano() != null)
			node.getOperador_booleano().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
