package Task3;

public class Employee {
	private String name;
	Task currentTask;
	private double hoursLeft;

	Employee(String name) {
		this.name = name;

	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	double getHoursLeft() {
		return hoursLeft;
	}

	void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	void work() {
		if (currentTask != null) {
			if (hoursLeft < currentTask.getWorkingHours()) {
				currentTask.setWorkingHours(currentTask.getWorkingHours()- hoursLeft); 
				hoursLeft = 0;
			} else {
				hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);

			}
			showReport();

		}
	}

	void showReport() {
		System.out.println("Name of Employee: " + this.name);
		System.out.println("Task of Employee: " + this.currentTask.getName());
		System.out.println("Employee hour left: " + this.hoursLeft);
		System.out.println("Current task hour left: " + this.currentTask.getWorkingHours());

	}
}
