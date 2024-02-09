package examenCL1.pruebas;

import java.util.List;

import examenCL1.daoImpl.SubjectDaoImpl;
import examenCL1.interfaceDao.ISubjectDao;
import examenCL1.model.Subject;

public class PruebaEditar {

	public static void main(String[] args) {
		ISubjectDao subjectDao = new SubjectDaoImpl();
		
		Subject sub = subjectDao.find(2);
		sub.setSubjects("Lenguaje de programacion");
		sub.setCredits("5");
		
		subjectDao.update(sub);
		
		List<Subject> subjectList = subjectDao.findAll();
		for (Subject s : subjectList) {

			System.out.println(s.getIdsubject());
			System.out.println(s.getSubjects());
			System.out.println(s.getCredits());

		}

		
	}

}
