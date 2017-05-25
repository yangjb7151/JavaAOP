package proxy;

import proxy.annon.Seven;
import proxy.imp.AnimalInterface;

public class DogImp implements AnimalInterface {

	@Seven(value = "Lumia")
	private String name;

	private String Property;

	public DogImp() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void say() {
		System.out.println("С��:��������.....");
	}

	@Seven(Property = "ˮ½����սʿ")
	public void setProperty(String Property) {
		this.Property = Property;
	}

	public void getProperty() {
		System.out.println(this.name + this.Property);
	}
}
