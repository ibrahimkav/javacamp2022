package kodlama.ioHomePage.dataAccess.teacher;

import kodlama.ioHomePage.entities.Teacher;

public interface TeacherDao {
	public void add(Teacher teacher);
	public void delete(Teacher teacher);
	public void update (Teacher teacher);
}
