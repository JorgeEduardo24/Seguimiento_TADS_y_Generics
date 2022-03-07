package model;

public interface Conjunto<C1> {
	public Conjunto<C1> crearConjunto();
	public Conjunto<C1> crearNombreDeConjunto();
	public Conjunto<C1> crearElemento();
	public Conjunto<C1> añadirNombreElemento();
	public Conjunto<C1> unionDeElementos();
	public Conjunto<C1> interseccionDeElementos();
	public Conjunto<C1> diferenciaSimetrica();
	public Conjunto<C1> mostrarConjunto();
}
