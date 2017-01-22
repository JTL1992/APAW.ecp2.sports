package es.upm.miw.apiArchitectureSport.exceptions;

public class NotFoundException extends Exception {
	private static final long serialVersionUID = -3893110892899234744L;

	public static final String DESCRIPTION = "El id no corresponde a ninguna entidad";

	public NotFoundException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public NotFoundException() {
		this("");
	}
}
