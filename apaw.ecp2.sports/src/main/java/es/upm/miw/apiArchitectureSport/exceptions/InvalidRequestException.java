package es.upm.miw.apiArchitectureSport.exceptions;

public class InvalidRequestException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "Petición no implementada";

	public InvalidRequestException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidRequestException() {
		this("");
	}

}
