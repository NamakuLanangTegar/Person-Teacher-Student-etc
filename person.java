package Person;

public class person {
	protected String name;
	protected int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public person() {
		name = "Yashinta";
		age = 26;
	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

}
