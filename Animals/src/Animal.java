
public class Animal {
	private int weight;
	private int age;
	private int leg;

	public Animal(int weight, int age, int leg) {
		this.weight = weight;
		this.age = age;
		this.leg = leg;

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void reproduce() {
		System.out.println("I am pregnant");
	}

	public void consume() {
		System.out.println("I need food");
	}
}
