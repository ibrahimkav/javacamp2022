package kodlama.ioHomePage.dataAccess.courses;

import kodlama.ioHomePage.entities.Courses;

public class HibernateCoursesDao implements CoursesDao {

	@Override
	public void add(Courses courses) {
		System.out.println("Hibernate tarafından Course eklendi");
		
	}

	@Override
	public void delete(Courses courses) {
		System.out.println("Hibernate tarafından Course silindi");
		
	}

	@Override
	public void update(Courses courses) {
		System.out.println("Hibernate tarafından Course güncellendi.");
		
	}

}
