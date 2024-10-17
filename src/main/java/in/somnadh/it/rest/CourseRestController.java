package in.somnadh.it.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.somnadh.it.binding.Course;
import in.somnadh.it.service.CourseService;


@RestController
public class CourseRestController {

	@Autowired
	public CourseService courseSer;
	
	@PostMapping ("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course c)
	{
		String status=courseSer.upsert(c);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid)
	{
		Course val=courseSer.getById(cid);
		return new ResponseEntity<>(val,HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List> getAllCourse()
	{
		List<Course> val=courseSer.getAllCourses();
		return new ResponseEntity<>(val,HttpStatus.OK);
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course c)
	{
		String val=courseSer.upsert(c);
		return new ResponseEntity<>(val,HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid)
	{
		String val=courseSer.deleteById(cid);
		return new ResponseEntity<>(val,HttpStatus.OK);
	}
	
	
	
}
