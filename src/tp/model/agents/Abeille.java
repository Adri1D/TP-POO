package tp.model.agents;

import tp.model.comportements.Hebergeur;
import tp.model.agents.Vegetal;
import java.awt.Point;

public class Abeille extends Animal implements Hebergeur{
	
	protected int nectar = 0;

	public Abeille() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abeille(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}

	public Abeille(Sexe sexe) {
		super(sexe);
		// TODO Auto-generated constructor stub
	}
	
	public boolean peutAccepterNectar() {
		if (this.getNectar() <= 10)// valeur arbitraire 
		{
			return true;
		}
		return false;
	}
	
	
	public boolean peutPrendreNectar(Vegetal a) {
		if(a.nectar >= 1) {
			return true;
		}
		return false;
	}
	
	public void prendreNectar(Vegetal a) {
		if((this.peutPrendreNectar(a)==true) & (this.peutAccepterNectar()==true)) {
			this.nectar++;
			a.perdNectar(this);
			}
		
		}
	
	
	
	public int getNectar() {
		return nectar;
	}

	@Override
	public boolean peutAccueillir(Agent a) {
		if(a instanceof Varroa) {
			return true;
		};
		return false;
	}

	

	@Override
	public boolean accueillir(Animal a) {
		return a.getHebergement().equals(this);
	}

}
