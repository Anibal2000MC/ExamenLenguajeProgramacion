package clases;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectDao dao = new SubjectDaoImpl();

		Subject subject = dao.find(3);

		dao.delete(subject);

		List<Subject> rolList = dao.findAll();

		for (Subject r : rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}

}
