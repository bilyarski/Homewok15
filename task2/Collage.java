package task2;

public class Collage {

	public static void main(String[] args) {
		Student georgi = new Student("Georgi", "IT Talents", 26);
		georgi.grade = 6;

		georgi.upYear();

		georgi.receiveScholarship(5, 1000);

		Student krasi = new Student("Krasi", "IT Talents", 27);
		krasi.upYear();
		krasi.receiveScholarship(4, 500);
		Student ivo = new Student("Ivo", "TS", 26);
		Student pesho = new Student("Petur", "TS", 29);
		pesho.upYear();
		Student misho = new Student("Mihail", "IT Talents", 25);
		Student dinko = new Student("Dinko", "IT Talents", 18);
		Student dimitar = new Student("Dimitar", "IT Talents", 22);
		Student penka = new Student("Penka", "IT Talents", 29);
		
		StudentGroup itTalent = new StudentGroup("IT Talents");
		itTalent.addStudent(georgi);
		itTalent.addStudent(krasi);
		itTalent.addStudent(ivo);
		itTalent.addStudent(pesho);
		itTalent.addStudent(misho);
		itTalent.addStudent(dinko);
		itTalent.addStudent(dimitar);
		itTalent.addStudent(penka);
		
		System.out.println("Best student in "+itTalent.groupSubject + ": " + itTalent.theBestStudent());
		
		itTalent.printStudentsInGroup();
		itTalent.emptyGroup();
		System.out.println("\nFree places after empty: " + itTalent.freePlaces);

	}

}
