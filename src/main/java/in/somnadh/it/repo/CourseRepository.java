package in.somnadh.it.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.somnadh.it.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
