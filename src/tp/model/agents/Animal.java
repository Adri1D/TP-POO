package tp.model.agents;

import java.awt.Point;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
public class Animal extends Agent {
	private Agent hebergement;
	private Sexe sexe;
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		super();
		this.sexe=sexe;
		this.coord=new Point(coord);
	}
	
	public Animal(Sexe sexe) {
		this(sexe, new Point(0,0));
	}
	
	public Animal() {
		this(Sexe.Femelle, new Point(0,0));
	}
	
	// ***** Getters and Setters ****** 

	public Sexe getSexe() {
		return sexe;
	}

	public Agent getHebergement() {
		return hebergement;
	}

	public void setHebergement(Agent hebergeur) {
		this.hebergement = hebergeur;
	}

	public void seDeplacer() {
		long dx;
		long dy;
		// Pour se deplacer selon une seule direction à la fois
		/*
		 * long binarDir = Math.round(Math.random());
		if(binarDir==0) {
			dx = Math.round(Math.random());
			dy = 0;
			if(dx==0) {dx = -1;}
		}else {
			dx = 0;
			dy = Math.round(Math.random());
			if(dy==0) {dy = -1;}
		*/
		// Pour se deplacer selon le deux direction 
		dx = Math.round(Math.random());
		dy = Math.round(Math.random());
		if(dx==0) {dx = -1;}
		if(dy==0) {dy = -1;}

		this.coord.x = this.coord.x + (int)dx;
		this.coord.y = this.coord.y + (int)dy;
	}
	
	
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+this.sexe;
	}

	
	
	
	
	
	
	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Animal b = new Animal(Sexe.Male);
		Animal c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Animal e = new Animal(Sexe.Femelle,new Point(25,30));

		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		//System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss=Sexe.Male;
		System.out.println(d.getSexe());
		System.out.println(ss);
		
		
		//les lignes suivantes devraient afficher la même chose....
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		pt.x=50;
		System.out.println(d.getCoord());
		
		//TODO ajoutez vos propres tests de getters et setters
		
		
		//TODO test vieillir
		a.vieillir();
		System.out.println(a.age);
		
		
		//TODO test seDeplacer
		a.seDeplacer();
		System.out.println(a.getCoord());
		a.seDeplacer();
		System.out.println(a.getCoord());
		a.seDeplacer();
		System.out.println(a.getCoord());
		
		
		//TODO test id
		System.out.println(a.getId());
		System.out.println(b.getId());
		
		
		/*
		 * Test comparaison
		 */
		System.out.println("a".equals("a"));
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
		}

}
