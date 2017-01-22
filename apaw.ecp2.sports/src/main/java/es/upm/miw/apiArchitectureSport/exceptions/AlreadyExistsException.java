package es.upm.miw.apiArchitectureSport.exceptions;

public class AlreadyExistsException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "La entidad ya existe";

	public AlreadyExistsException() {
		super(DESCRIPTION);
	}

}
