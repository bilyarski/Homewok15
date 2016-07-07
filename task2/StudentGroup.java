package task2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	public StudentGroup() {
		freePlaces = 5;
		students = new Student[freePlaces];
	}

	StudentGroup(String subject) {
		this();
		groupSubject = subject;
	}

	void addStudent(Student s) {
		if (freePlaces > 0 && groupSubject.equals(s.subject)) {
			students[5 - freePlaces] = s;
			freePlaces--;
		}else if (freePlaces == 0){
			System.out.println("there is no place fot this student");
		}
	}

	void emptyGroup() {
		freePlaces = 5;
		students = new Student[freePlaces];
	}

	String theBestStudent() {
		if (freePlaces == 5) {
			return "no students in the group";
		}
		int bestStudentIndex = 0;

		for (int i = 1; i < students.length; i++) {
			double grade = students[i].grade;
			double bestGrade = students[i].grade;
			if (grade > bestGrade) {
				bestStudentIndex = i;
			}
		}

		return students[bestStudentIndex].name;
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length; i++) {
			
			System.out.println();
			System.out.println("Name: " + students[i].name);
			System.out.println("Subject: " + students[i].subject);
			System.out.println("Grade: " + students[i].grade);
			System.out.println("Year In College: " + students[i].yearInCollege);
			System.out.println("Age: " + students[i].age);
			System.out.println("Graduated: " + students[i].isDegree);
			System.out.println("Money: " + students[i].money);

		}
	}
}
