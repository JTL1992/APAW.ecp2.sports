package es.upm.miw.apiArchitectureSport.wrappers;

public class SportWrapper {
	private String name;

	public SportWrapper(String name) {
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
		return "{name=" + this.name + "}";
	}
}
