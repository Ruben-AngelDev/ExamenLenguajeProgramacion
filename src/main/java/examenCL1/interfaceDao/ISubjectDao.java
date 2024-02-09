package examenCL1.interfaceDao;

import java.util.List;

import examenCL1.model.Subject;



public interface ISubjectDao {
	
	public void create(Subject s);

	public void update(Subject s);
	
	public void delete(Integer id);
	
	public Subject find(Integer id);
	
	public List<Subject> findAll();

}
