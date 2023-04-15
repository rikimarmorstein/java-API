package b.sortingLists;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Comparable<Person>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Person other) {
//if(this.id < other.id) {
//	return -1;
//}
//else if(this.id> other.id) {
//	return 1;
//}else {
	//	return 0;
//	}}
	@Override
	public int compareTo(Person other) {
		return(this.name.compareTo(other.name)) ;
	}
	
//	@Override
//	public int compareTo(Person other) {
//	Integer id1 = this.id;
//	Integer id2 = this.id;

//	return id1.compereTo(id2);}
}
