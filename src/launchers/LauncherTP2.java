package launchers;

import java.awt.Point;

import tp.model.agents.Animal;
import tp.model.agents.Sexe;
import tp.model.agents.*;
import tp.model.decor.*;


public class LauncherTP2 {
	
	public static void main(String [] args) {
		Animal a = new Animal(Sexe.Femelle,new Point(25,30));
		AbeilleDomestique b = new AbeilleDomestique();
		Varroa c = new Varroa();
		a.seDeplacer();
		
		//test abeille hebergeur
		System.out.println(b.peutAccueillir(a));
		System.out.println(b.peutAccueillir(c));
		c.setHebergement(b);
		System.out.println(b.accueillir(c));
		
		// test arbre hebergeur
		System.out.println("-----------------test arbre hebergeur-----------------------------");
		Arbre arbre = new Arbre();
		AbeilleSolitaire Obee1 = new AbeilleSolitaire();
		FrelonAsiatique F1 = new FrelonAsiatique();
		System.out.println(arbre.peutAccueillir(b));
		System.out.println(arbre.peutAccueillir(Obee1));
		System.out.println(arbre.peutAccueillir(F1));
		F1.setHebergement(arbre);
		System.out.println(arbre.accueillir(F1));
		
		
		// test arbre hebergeur
		System.out.println("-----------------test ruche hebergeur-----------------------------");
		Ruche ruche = new Ruche();
		System.out.println(ruche.peutAccueillir(Obee1));
		System.out.println(ruche.peutAccueillir(b));
		b.setHebergement(arbre);
		System.out.println(arbre.accueillir(b));
		
		
		//TODO
		//tester la hiérarchie d'agent
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.peutAccueillir(c));
	}

}
