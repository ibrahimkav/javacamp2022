package kodlama.ioHomePage.dataAccess.teacher;

import kodlama.ioHomePage.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate tarafından Teacher eklendi.");
		
	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("Hibernate tarafından Teacher silindi.");
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("Hibernate tarafından Teacher güncellendi.");
		
	}

}
