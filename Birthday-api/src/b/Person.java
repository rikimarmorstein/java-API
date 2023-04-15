package b;

public class Person {

	private int id;
	private String name;
	private String city;
	private double age;
	private double knPerWeek;

	public Person(int id, String name, String city, double age, double knPerWeek) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.knPerWeek = knPerWeek;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", knPerWeek=" + knPerWeek
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getKnPerWeek() {
		return knPerWeek;
	}

	public void setKnPerWeek(double knPerWeek) {
		this.knPerWeek = knPerWeek;
	}

}
