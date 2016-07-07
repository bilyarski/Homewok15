
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem = "";
	String type = "";

	String changeOperationSystem(String newOpSys) {

		if (newOpSys.equals("")) {
			System.out.println("No OP system entered!");
		}
		return newOpSys;
	}

	void useMemory(int value) {

		if (value < 0) {
			System.out.println("invalid memory request!");

		} else {
			if (freeMemory >= value) {
				freeMemory -= value;
			} else {
				System.out.println("Not enough free memory!");
			}
		}
	}

	void print() {
		System.out.println(type + "\nyear= " + year + ": Prise = " + price + "lv: HDD memory =" + hardDiskMemory
				+ ":GB Free memory =" + freeMemory + ":GB Operation System -" + operationSystem + ": Notebook: "
				+ isNotebook);
	}

	Computer() {
		isNotebook = false;
		operationSystem = "WinXP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	int comparePrice(Computer c) {
		int compare = 0;
		if (this.price > c.price) {
			compare = -1;
		}
		if (this.price < c.price) {
			compare = 1;
		}
		if (this.price == c.price) {
			compare = 0;
		}
		return compare;
	}

}
