package es.upm.miw.apiArchitectureSport.entities;

public class Sport {

	private String name;

	public Sport(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sport [name=" + this.name + "]";
	}
}
