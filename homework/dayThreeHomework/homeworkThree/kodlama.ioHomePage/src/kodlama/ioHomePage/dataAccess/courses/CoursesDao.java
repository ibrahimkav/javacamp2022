package kodlama.ioHomePage.dataAccess.courses;

import kodlama.ioHomePage.entities.Courses;

public interface CoursesDao {
	public void add(Courses courses);
	public void delete(Courses courses);
	public void update (Courses courses);

}
