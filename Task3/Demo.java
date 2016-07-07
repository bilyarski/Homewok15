package Task3;

public class Demo {

	public static void main(String[] args) {
		Task buildingWall = new Task("Wall building", 12);

		Employee stavri = new Employee("Stavri");
		stavri.setHoursLeft(8);
		stavri.currentTask = buildingWall;
		stavri.work();

		System.out.println("-----New day----");

		stavri.setHoursLeft(8);
		stavri.work();
		
		System.out.println("later that day.....\n");
		
		Task dreankABeer = new Task("Drink a beer", 5);
		stavri.currentTask = dreankABeer;
		stavri.work();
		
		if(stavri.getHoursLeft() == 0){
			System.out.println("----------------\nStavri: I finished the wall. I am leaving!");
		}
	}

}
