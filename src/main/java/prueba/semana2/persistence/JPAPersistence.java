package prueba.semana2.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAPersistence {

	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	
	public static void shotdown() {
		if (factory != null) {
			factory.close();
		}
	}
	
}
