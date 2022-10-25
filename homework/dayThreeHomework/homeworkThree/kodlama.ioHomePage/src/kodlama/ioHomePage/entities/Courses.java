package kodlama.ioHomePage.entities;

public class Courses {
	private int id;
	private String courseName;
	private String courseStartDate;
	private double coursePrice;
	
	public Courses() {
		super();
	}
	
	public Courses(int id, String courseName, String courseStartDate, double coursePrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseStartDate = courseStartDate;
		this.coursePrice = coursePrice;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}
