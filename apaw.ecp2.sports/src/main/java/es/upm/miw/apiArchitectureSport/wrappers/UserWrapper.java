package es.upm.miw.apiArchitectureSport.wrappers;

import java.util.List;

import es.upm.miw.apiArchitectureSport.entities.Sport;

public class UserWrapper {

	private String nick;

	private String email;

	private List<Sport> sports;

	public UserWrapper(String nick, String email) {
		this.nick = nick;
		this.email = email;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Sport> getSports() {
		return this.sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "{nick=" + this.nick + ", email=" + this.email + "}";
	}
}
