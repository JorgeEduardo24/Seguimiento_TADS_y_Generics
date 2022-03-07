package model;
import java.util.HashSet;
import java.util.Set;

public class SetArithmetic<C1> implements Conjunto<C1> {
	
	public Set<C1> union(Set<C1> a, Set<C1> b) {
		Set<C1> union = new HashSet<C1>(a);
		union.addAll(b);
		return union;
	}

	public Set<C1> intersection(Set<C1> a, Set <C1> b) {
		Set<C1> intersection = new HashSet<C1>(a);
		intersection.retainAll(b);
		return intersection;
	}

	public Set<C1> difference(Set<C1> a, Set <C1> b) {
		Set<C1> difference = new HashSet<C1>();
		a.removeAll(b);
		return difference;
	}

	@Override
	public Conjunto<C1> crearConjunto() {
		
		return null;
	}

	@Override
	public Conjunto<C1> crearNombreDeConjunto() {
		
		return null;
	}

	@Override
	public Conjunto<C1> crearElemento() {
		
		return null;
	}

	@Override
	public Conjunto<C1> añadirNombreElemento() {
		
		return null;
	}

	@Override
	public Conjunto<C1> unionDeElementos() {
		
		return null;
	}

	@Override
	public Conjunto<C1> interseccionDeElementos() {
		
		return null;
	}

	@Override
	public Conjunto<C1> diferenciaSimetrica() {
		
		return null;
	}

	@Override
	public Conjunto<C1> mostrarConjunto() {
		
		return null;
	}
	
}
