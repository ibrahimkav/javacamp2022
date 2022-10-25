package kodlama.ioHomePage.dataAccess.teacher;

import kodlama.ioHomePage.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("JDBC tarafından Teacher eklendi.");
		
	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("JDBC tarafından Teacher silindi.");
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("JDBC tarafından Teacher güncellendi.");
		
	}	

}
