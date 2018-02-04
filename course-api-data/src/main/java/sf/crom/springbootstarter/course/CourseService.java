package sf.crom.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
            	new Topic("spring", "Spring Framework", "Spring Framework Description"),
            	new Topic("java", "Core Java", "Core Java Description"),
            	new Topic("javascript", "JavaScript", "JavaScript Description")
		));*/

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	//return topics;
	//courseRepository.findAll()
	
	public Course getCourse(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//courseRepository.findByName(name);
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);	
		
	}

	public void updateCourse(Course course) {
		/*for (int i=0; i<topics.size(); i++){
			Topic t = topics.get(i);
			if (t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		/*topics.removeIf(t -> t.getId().equals(id));*/
		
		courseRepository.delete(id);
	}

	
}
