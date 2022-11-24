package tp.model.agents;

import tp.model.comportements.Hebergeur;

import java.awt.Point;

public class Arbre extends Vegetal implements Hebergeur{

	public Arbre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arbre(Point coord) {
		super(coord);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean peutAccueillir(Agent a) {
		// TODO Auto-generated method stub
		if(a instanceof AbeilleSolitaire) {
			return true;
		}else if(a instanceof Frelon){
			return true;
		};
		return false;
	}

	@Override
	public boolean accueillir(Animal a) {
		// TODO Auto-generated method stub
		return a.getHebergement().equals(this);
	}
	
}
