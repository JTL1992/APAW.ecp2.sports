package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.SportController;
import es.upm.miw.apiArchitectureSport.exceptions.AlreadyExistsException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidSportFieldException;

public class SportResource {

	// POST **/sport body="name"
	public void createSport(String name) throws InvalidSportFieldException, AlreadyExistsException {
		this.validateField(name);
		new SportController().createSport(name);
	}

	private void validateField(String field) throws InvalidSportFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidSportFieldException(field);
		}
	}
}
