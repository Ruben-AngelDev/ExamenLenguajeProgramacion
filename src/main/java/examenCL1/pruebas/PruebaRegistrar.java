package examenCL1.pruebas;

import java.util.List;

import examenCL1.daoImpl.SubjectDaoImpl;
import examenCL1.interfaceDao.ISubjectDao;
import examenCL1.model.Subject;

public class PruebaRegistrar {

	public static void main(String[] args) {

		ISubjectDao subjectDao = new SubjectDaoImpl();
		Subject sub = new Subject();
		sub.setSubjects("Desarrollo web");
		sub.setCredits("5");
		
		subjectDao.create(sub);
		
		List<Subject> subjectList = subjectDao.findAll();
		for (Subject s : subjectList) {

			System.out.println(s.getIdsubject());
			System.out.println(s.getSubjects());
			System.out.println(s.getCredits());

		}
	}

}
