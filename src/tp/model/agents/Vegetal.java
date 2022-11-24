package tp.model.agents;

import tp.model.agents.Animal;
import java.awt.Point;

public class Vegetal extends Agent {
	
	protected int nectar;

	public Vegetal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vegetal(Point coord) {
		super(coord);
		// TODO Auto-generated constructor stub
	}
	
	public void prodNectar() {
		this.nectar++;
	}
	
	public void perdNectar(Animal a) {
		if(a instanceof Abeille) {
			this.nectar--;
		}
	}
	
	
}
