package es.upm.miw.apiArchitectureSport.api;

import es.upm.miw.apiArchitectureSport.controllers.UserController;
import es.upm.miw.apiArchitectureSport.exceptions.AlreadyExistsException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidSportFieldException;
import es.upm.miw.apiArchitectureSport.exceptions.NotFoundException;
import es.upm.miw.apiArchitectureSport.wrappers.UserListWrapper;

public class UserResource {
	// POST **/users body="nick:email"
	public void createUser(String nick, String email) throws InvalidSportFieldException, AlreadyExistsException {
		this.validateField(nick);
		new UserController().createUser(nick, email);
	}

	// GET **/users
	public UserListWrapper userList() {
		return new UserController().userList();
	}

	// GET **/user/search?sport=*
	public UserListWrapper userList(String sport) {
		return new UserController().userList(sport);
	}

	// PUT **/user/{nick}/sport body="sportName"
	public void update(String nick, String sportName) throws NotFoundException {
		new UserController().update(nick, sportName);
	}

	private void validateField(String field) throws InvalidSportFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidSportFieldException(field);
		}
	}
}