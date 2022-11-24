package tp.model.agents;

import java.awt.Point;

public class Agent {

	private static int currentId = 0;
	/** identifiant unique de l'animal*/
	private int id;
	/** age en unité de temps*/
	protected int age;
	/** position sur la carte*/
	protected Point coord;
	/** état de santé de l'animal */
	protected Etat etat = Etat.Normal;

	
	public Agent(Point coord) {
		this.age = 0;
		this.id = Agent.getUniqueId();
		this.coord = new Point(coord);
		this.etat = Etat.Normal;
		}
	
	public Agent() {
		this(new Point(0,0));
	}
	
	
	
	public static int getCurrentId() {
		return currentId;
	}

	public int getId() {
		return id;
	}

	public static int getUniqueId() {
		int pId = Agent.currentId;
		currentId++;
		return pId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=this.age) {
			this.age = age;
		}
	}

	public Point getCoord() {
		return coord;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}

	public Etat getEtat() {
		return etat;
	}

	public void vieillir() {
		this.age++;
		//TODO fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne...
	}
	
	
	
	@Override
	public String toString() {
		return getClass().getName().replace("tp.model.agents.", "")+" n° "+getId()+"("+this.coord.x+", "+this.coord.y+"))";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (etat != other.etat)
			return false;
		return true;
	}

}