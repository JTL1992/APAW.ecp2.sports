package es.upm.miw.apiArchitectureSport.controllers;

import es.upm.miw.apiArchitectureSport.daos.DaoFactory;
import es.upm.miw.apiArchitectureSport.entities.Sport;
import es.upm.miw.apiArchitectureSport.exceptions.AlreadyExistsException;

public class SportController {
	public void createSport(String name) throws AlreadyExistsException {
		if (DaoFactory.getFactory().getSportDao().read(name) == null) {
			DaoFactory.getFactory().getSportDao().create(new Sport(name));
		} else {
			throw new AlreadyExistsException();
		}
	}
}
