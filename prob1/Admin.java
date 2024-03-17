package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> result = new HashMap<>();
		for(Student s:students){
			result.put(new Key(s.getFirstName(),s.getLastName()),s);
		}
		return result;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double totalGPA = 0.0;double averageGPA;int studentTotal = 0;
		for(Student student:maps.values()){
			totalGPA += student.getGpa();
			studentTotal += 1;
		}
		if(studentTotal>0){
			averageGPA = totalGPA/studentTotal;
		}
		return totalGPA;
}
}
