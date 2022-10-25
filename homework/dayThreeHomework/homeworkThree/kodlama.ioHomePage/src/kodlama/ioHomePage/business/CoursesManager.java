package kodlama.ioHomePage.business;

import kodlama.ioHomePage.core.logging.Logger;
import kodlama.ioHomePage.dataAccess.courses.CoursesDao;
import kodlama.ioHomePage.entities.Courses;


public class CoursesManager {
	private CoursesDao coursesDao;
	private Logger[] loggers;
	
	public CoursesManager(CoursesDao coursesDao, Logger[] loggers) {
		super();
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}
	
	public void add(Courses courses) throws Exception {
		if (courses.getCoursePrice()<0) {
			throw new Exception("Fiyat 0 dan küçük olamaz");
		}
		coursesDao.add(courses);
		for (Logger logger : loggers) {
			logger.log(courses.getCourseName());
		}
	}
}
