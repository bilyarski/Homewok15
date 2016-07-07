package task2;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (isDegree == false) {
			yearInCollege++;
			age++;
			if (yearInCollege == 4) {
				isDegree = true;
				System.out.println("The student did graduate");
			}
		} else {
			System.out.println("The student is graduated");
		}

	}

	double receiveScholarship(double min, double amount) {
		if (grade >= min && age < 30) {
			money += amount;
		}
		return money;
	}
}
