package in.somnadh.it.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.somnadh.it.binding.Course;
import in.somnadh.it.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(Course c) {
		courseRepo.save(c);
		return "Success.";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findByid=courseRepo.findById(cid);
		
		if(findByid.isPresent()) {return findByid.get();}
		
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid))
		{
			courseRepo.deleteById(cid);
			return "Successfully deleted.";
		}
		return "Not found record.";
	}

}
