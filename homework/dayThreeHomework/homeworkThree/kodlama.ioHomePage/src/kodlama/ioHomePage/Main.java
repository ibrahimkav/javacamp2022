package kodlama.ioHomePage;

import kodlama.ioHomePage.business.CategoryManager;
import kodlama.ioHomePage.business.CoursesManager;
import kodlama.ioHomePage.core.logging.DatabaseLogger;
import kodlama.ioHomePage.core.logging.FileLogger;
import kodlama.ioHomePage.core.logging.Logger;
import kodlama.ioHomePage.core.logging.MailLogger;
import kodlama.ioHomePage.dataAccess.category.HibernateCategoryDao;
import kodlama.ioHomePage.dataAccess.courses.HibernateCoursesDao;
import kodlama.ioHomePage.entities.Category;
import kodlama.ioHomePage.entities.Courses;
import kodlama.ioHomePage.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Courses courses = new Courses(1, "Sıfırdan ileri seviye java", "14 eylül 2022", 99.99);
		Logger[] loggers = { new MailLogger(), new FileLogger(), new DatabaseLogger() };
		CoursesManager coursesManager = new CoursesManager(new HibernateCoursesDao(), loggers);
		coursesManager.add(courses);
		Teacher teacher = new Teacher();
		teacher.getTeacherName("Engin Demirog");
		Category category = new Category();
		category.setCategoryName("Arşif");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);

	}

}
