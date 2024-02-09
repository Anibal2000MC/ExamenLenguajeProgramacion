package clases;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Editar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubjectDao dao = new SubjectDaoImpl();

		Subject rol = new Subject();
		rol.setIdsubject(3);
		rol.setSubject("Maria");
		rol.setCredits(0);
		dao.update(rol);

		List<Subject> rolList = dao.findAll();

		for (Subject r : rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}

}
