package clases;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Registrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectDao dao = new SubjectDaoImpl();

		Subject subject = new Subject();
		subject.setSubject("Lucas");
		subject.setCredits(3);
		
		dao.create(subject);

		List<Subject> subjectList = dao.findAll();

		for (Subject r : subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}

}
