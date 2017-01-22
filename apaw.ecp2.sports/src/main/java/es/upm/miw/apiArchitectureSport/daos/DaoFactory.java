package es.upm.miw.apiArchitectureSport.daos;

public abstract class DaoFactory {

	public static DaoFactory factory = null;

	public static void setFactory(DaoFactory factory) {
		DaoFactory.factory = factory;
	}

	public static DaoFactory getFactory() {
		assert factory != null;
		return factory;
	}

	public abstract SportDao getSportDao();

	public abstract UserDao getUserDao();

}
