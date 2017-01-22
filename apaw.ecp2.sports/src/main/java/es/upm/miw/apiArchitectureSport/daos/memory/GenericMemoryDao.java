package es.upm.miw.apiArchitectureSport.daos.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import es.upm.miw.apiArchitectureSport.daos.GenericDao;

public abstract class GenericMemoryDao<T> implements GenericDao<T, String> {

	private Map<String, T> map;

	protected Map<String, T> getMap() {
		return this.map;
	}

	protected void setMap(Map<String, T> map) {
		this.map = map;
	}

	public abstract void create(T entity);

	public T read(String id) {
		return map.get(id);
	}

	public void update(T entity) {
		if (map.containsKey(this.getId(entity))) {
			map.put(this.getId(entity), entity);
		}
	}

	public void deleteById(String id) {
		map.remove(id);
	}

	public List<T> findAll() {
		return new ArrayList<T>(map.values());
	}

	protected abstract String getId(T entity);

	protected abstract void setId(T entity, String id);

}
