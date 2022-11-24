package tp.model.decor;
import java.awt.Point;

import tp.model.agents.Agent;
import tp.model.agents.Animal;
import tp.model.comportements.Hebergeur;
import tp.model.agents.AbeilleDomestique;

public class Ruche extends Decor implements Hebergeur{

	public Ruche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ruche(Point coord) {
		super(coord);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean peutAccueillir(Agent a) {
		if(a instanceof AbeilleDomestique) {
			return true;
		};
		return false;
	}

	@Override
	public boolean accueillir(Animal a) {
		return a.getHebergement().equals(this);
	}
	
}
