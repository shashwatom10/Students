package Students.Students.Repo;
import Students.Students.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface StudentRepoInt extends MongoRepository<Student, Integer>{

}
