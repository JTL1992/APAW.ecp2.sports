package es.upm.miw.apiArchitectureSport.daos;

import java.util.List;

import es.upm.miw.apiArchitectureSport.entities.Sport;
import es.upm.miw.apiArchitectureSport.entities.User;

public interface UserDao extends GenericDao<User, String> {
	List<User> findValueBySportName(Sport sportName);
	void update(User entity, Sport sport);
}
