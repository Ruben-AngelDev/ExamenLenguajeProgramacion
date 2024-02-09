package examenCL1.daoImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import examenCL1.interfaceDao.ISubjectDao;
import examenCL1.model.Subject;

public class SubjectDaoImpl implements ISubjectDao{
    
	EntityManagerFactory factory;
	EntityManager entityManager;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("examenCL1");
		entityManager = factory.createEntityManager();
	}
	@Override
	public void create(Subject s) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(s);
			entityManager.getTransaction().commit();
			System.out.println("Se guardo correctamente");	
		} catch (Exception e) {
			if(entityManager.getTransaction() != null) {
				entityManager.getTransaction().rollback();
			}
			e.printStackTrace();
		}
	}
	@Override
	public void update(Subject s) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(s);
			entityManager.getTransaction().commit();
			System.out.println("Se Actualizo correctamente");	
		} catch (Exception e) {
			if(entityManager.getTransaction() != null) {
				entityManager.getTransaction().rollback();
			}
			e.printStackTrace();
		}	
	}
	@Override
	public void delete(Integer id) {
		Subject s = find(id);
		entityManager.getTransaction().begin();
		entityManager.remove(s);
		entityManager.getTransaction().commit();	
		
	}

	@Override
	public Subject find(Integer id) {
		return entityManager.find(Subject.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> findAll() {
		Query query = entityManager.createNamedQuery("Subject.findAll");
		List<Subject> list = query.getResultList();
		return list;
	}

}
