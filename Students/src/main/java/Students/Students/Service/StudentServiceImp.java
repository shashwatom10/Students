package Students.Students.Service;
import java.util.List;
import java.util.Optional;
import Students.Students.Exception.StudentNotFoundException;
import Students.Students.Model.*;
public interface StudentServiceImp {
	 Student addStudent(Student student);
	    List<Student> getAllStudents();
	    Optional<Student> getStudentById(int id) throws StudentNotFoundException;
	    Student updateStudent(int id, Student updatedStudent) throws StudentNotFoundException;
	    void deleteStudent(int id) throws StudentNotFoundException;
}
