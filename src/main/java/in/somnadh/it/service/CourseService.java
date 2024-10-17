package in.somnadh.it.service;

import java.util.List;

import in.somnadh.it.binding.Course;

public interface CourseService {
	
	public String upsert( Course c);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);

}
