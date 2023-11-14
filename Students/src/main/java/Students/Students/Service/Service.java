package Students.Students.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Students.Students.Exception.*;
import Students.Students.Model.Student;
import Students.Students.Repo.StudentRepoInt;

@Component
public class Service implements StudentServiceImp {
	@Autowired
    private StudentRepoInt studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id)throws StudentNotFoundException {
    	if (studentRepository.existsById(id)) {
            return studentRepository.findById(id);
    	}
    	else {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
    	
    }

    @Override
    public Student updateStudent(int id, Student updatedStudent) throws StudentNotFoundException  {
    	 

	        if (studentRepository.existsById(id)) {
	            updatedStudent.setId(id);
	            return studentRepository.save(updatedStudent);
	        } else {
	            throw new StudentNotFoundException("Student with ID " + id + " not found.");
	        }
    	
		
    }

    @Override
    public void deleteStudent(int id){
    	
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    	
    }
}

