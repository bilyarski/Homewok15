package Task3;

public class Task {
	private String name;
	private double workingHours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	Task(String name, double workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}
}
