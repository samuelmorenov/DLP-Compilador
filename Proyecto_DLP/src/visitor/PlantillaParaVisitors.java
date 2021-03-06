/**
 * @generated VGen (for ANTLR) 1.7.0
 */

package visitor;

import ast.*;

/*
Plantilla para Visitors.
Para crear un nuevo Visitor cortar y pegar este código y ya se tendría un visitor que compila y
que al ejecutarlo recorrería todo el árbol (sin hacer nada aún en él).
Solo quedaría añadir a cada método visit aquello adicional que se quiera realizar sobre su nodo del AST.
*/

public class PlantillaParaVisitors extends DefaultVisitor {

	// ---------------------------------------------------------
	// Tareas a realizar en cada método visit:
	//
	// Si en algún método visit NO SE QUIERE HACER NADA más que recorrer los hijos
	// entonces se puede
	// borrar (dicho método se heredaría de DefaultVisitor con el código de
	// recorrido).
	//
	// Lo siguiente es para cuando se quiera AÑADIR alguna funcionalidad adicional a
	// un visit:
	//
	// - El código que aparece en cada método visit es aquel que recorre los hijos.
	// Es el mismo código
	// que está implementado en el padre (DefaultVisitor). Por tanto la llamada a
	// 'super.visit' y el
	// resto del código del método hacen lo mismo (por ello 'super.visit' está
	// comentado).
	//
	// - Lo HABITUAL será borrar todo el código de recorrido dejando solo la llamada
	// a 'super.visit'. De esta
	// manera, cada método visit se puede centrar en la tarea que tiene que realizar
	// sobre su nodo del AST
	// (dejando que el padre se encargue del recorrido de los hijos).
	//
	// - La razón de que aparezca el código de recorrido de los hijos es por si se
	// necesita realizar alguna
	// tarea DURANTE el mismo (por ejemplo ir comprobando su tipo). En este caso, ya
	// se tiene implementado
	// dicho recorrido y solo habría que incrustar las acciones adicionales en el
	// mismo. En este caso,
	// es la llamada a 'super.visit' la que debería ser borrada.
	// ---------------------------------------------------------

	// class Program { List<Definicion> definicion; }
	public Object visit(Program node, Object param) {

		// super.visit(node, param);

		if (node.getDefinicion() != null)
			for (Definicion child : node.getDefinicion())
				child.accept(this, param);

		return null;
	}

	// class Definicion_variable { String nombre; Tipo tipo; Ambito ambito; }
	public Object visit(Definicion_variable node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	// class Definicion_struct { String nombre; List<Campo_struct> campo_struct; }
	public Object visit(Definicion_struct node, Object param) {

		// super.visit(node, param);

		if (node.getCampo_struct() != null)
			for (Campo_struct child : node.getCampo_struct())
				child.accept(this, param);

		return null;
	}

	// class Definicion_funcion { String nombre; List<Definicion_variable>
	// parametros; Tipo retorno; List<Definicion_variable> locales; List<Sentencia>
	// sentencias; }
	public Object visit(Definicion_funcion node, Object param) {

		// super.visit(node, param);

		if (node.getParametros() != null)
			for (Definicion_variable child : node.getParametros())
				child.accept(this, param);

		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);

		if (node.getLocales() != null)
			for (Definicion_variable child : node.getLocales())
				child.accept(this, param);

		if (node.getSentencias() != null)
			for (Sentencia child : node.getSentencias())
				child.accept(this, param);

		return null;
	}

	// class Campo_struct { String nombre; Tipo tipo; }
	public Object visit(Campo_struct node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	// class Sentencia_asignacion { Expr izquierda; Expr derecha; }
	public Object visit(Sentencia_asignacion node, Object param) {

		// super.visit(node, param);

		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);

		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);

		return null;
	}

	// class Sentencia_print { Expr expresiones; String fincadena; }
	public Object visit(Sentencia_print node, Object param) {

		// super.visit(node, param);

		if (node.getExpresiones() != null)
			node.getExpresiones().accept(this, param);

		return null;
	}

	// class Sentencia_read { Expr expresiones; }
	public Object visit(Sentencia_read node, Object param) {

		// super.visit(node, param);

		if (node.getExpresiones() != null)
			node.getExpresiones().accept(this, param);

		return null;
	}

	// class Sentencia_if { Expr condicion; List<Sentencia> sentencias;
	// List<Sentencia> sino; }
	public Object visit(Sentencia_if node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getSentencias() != null)
			for (Sentencia child : node.getSentencias())
				child.accept(this, param);

		if (node.getSino() != null)
			for (Sentencia child : node.getSino())
				child.accept(this, param);

		return null;
	}

	// class Sentencia_while { Expr condicion; List<Sentencia> sentencias; }
	public Object visit(Sentencia_while node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getSentencias() != null)
			for (Sentencia child : node.getSentencias())
				child.accept(this, param);

		return null;
	}

	// class Sentencia_llamada_funcion { String nombre; List<Expr> parametros; }
	public Object visit(Sentencia_llamada_funcion node, Object param) {

		// super.visit(node, param);

		if (node.getParametros() != null)
			for (Expr child : node.getParametros())
				child.accept(this, param);

		return null;
	}

	// class Sentencia_return { Expr expresion; }
	public Object visit(Sentencia_return node, Object param) {

		// super.visit(node, param);

		if (node.getExpresion() != null)
			node.getExpresion().accept(this, param);

		return null;
	}

	// class Tipo_Int { }
	public Object visit(Tipo_Int node, Object param) {
		return null;
	}

	// class Tipo_Float { }
	public Object visit(Tipo_Float node, Object param) {
		return null;
	}

	// class Tipo_Char { }
	public Object visit(Tipo_Char node, Object param) {
		return null;
	}

	// class Tipo_Void { }
	public Object visit(Tipo_Void node, Object param) {
		return null;
	}

	// class Tipo_Struct { String nombre; }
	public Object visit(Tipo_Struct node, Object param) {
		return null;
	}

	// class Tipo_Array { String tamanio; Tipo tipoElementos; }
	public Object visit(Tipo_Array node, Object param) {

		// super.visit(node, param);

		if (node.getTipoElementos() != null)
			node.getTipoElementos().accept(this, param);

		return null;
	}

	// class Tipo_Error { }
	public Object visit(Tipo_Error node, Object param) {
		return null;
	}

	// class Expr_int { String string; }
	public Object visit(Expr_int node, Object param) {
		return null;
	}

	// class Expr_real { String string; }
	public Object visit(Expr_real node, Object param) {
		return null;
	}

	// class Expr_char { String string; }
	public Object visit(Expr_char node, Object param) {
		return null;
	}

	// class Expr_uso_variable { String string; }
	public Object visit(Expr_uso_variable node, Object param) {
		return null;
	}

	// class Expr_operacion { Expr izquierda; Operador operador; Expr derecha; }
	public Object visit(Expr_operacion node, Object param) {

		// super.visit(node, param);

		if (node.getIzquierda() != null)
			node.getIzquierda().accept(this, param);

		if (node.getOperador() != null)
			node.getOperador().accept(this, param);

		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);

		return null;
	}

	// class Expr_negada { Operador operador; Expr derecha; }
	public Object visit(Expr_negada node, Object param) {

		// super.visit(node, param);

		if (node.getOperador() != null)
			node.getOperador().accept(this, param);

		if (node.getDerecha() != null)
			node.getDerecha().accept(this, param);

		return null;
	}

	// class Expr_cast { Tipo tipo_convertido; Expr expr; }
	public Object visit(Expr_cast node, Object param) {

		// super.visit(node, param);

		if (node.getTipo_convertido() != null)
			node.getTipo_convertido().accept(this, param);

		if (node.getExpr() != null)
			node.getExpr().accept(this, param);

		return null;
	}

	// class Expr_acceso_vector { Expr fuera; Expr dentro; }
	public Object visit(Expr_acceso_vector node, Object param) {

		// super.visit(node, param);

		if (node.getFuera() != null)
			node.getFuera().accept(this, param);

		if (node.getDentro() != null)
			node.getDentro().accept(this, param);

		return null;
	}

	// class Expr_acceso_struct { Expr struct; String campo; }
	public Object visit(Expr_acceso_struct node, Object param) {

		// super.visit(node, param);

		if (node.getStruct() != null)
			node.getStruct().accept(this, param);

		return null;
	}

	// class Expr_llamada_funcion { String nombre; List<Expr> parametros; }
	public Object visit(Expr_llamada_funcion node, Object param) {

		// super.visit(node, param);

		if (node.getParametros() != null)
			for (Expr child : node.getParametros())
				child.accept(this, param);

		return null;
	}

	// class Operador_aritmetico { String string; }
	public Object visit(Operador_aritmetico node, Object param) {
		return null;
	}

	// class Operador_logico { String string; }
	public Object visit(Operador_logico node, Object param) {
		return null;
	}

	// class Operador_comparacion { String string; }
	public Object visit(Operador_comparacion node, Object param) {
		return null;
	}
}
