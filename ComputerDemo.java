
public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc = new Computer();
		pc.year = 2014;
		pc.price = 800;
		pc.isNotebook = false;
		pc.hardDiskMemory = 800;
		pc.freeMemory = 300;
		pc.operationSystem = "Windows";
		pc.type = "Personal Computer";
		Computer notebook = new Computer();

		notebook.year = 2016;
		notebook.price = 1000;
		notebook.isNotebook = true;
		notebook.hardDiskMemory = 800;
		notebook.freeMemory = 400;
		notebook.operationSystem = "Windows";
		notebook.type = "Notebook";

		pc.useMemory(-100);
		notebook.operationSystem = notebook.changeOperationSystem("Linux");

		pc.print();
		notebook.print();

		Computer pcTwo = new Computer();
		Computer pcThree = new Computer(1996, 800, 8, 2);
		Computer pcFour = new Computer(2016, 900, false, 1024, 560, "Win10");
		Computer georgiPc = new Computer(2015, 900, 900, 800);

		System.out.println("-------------------------");
		System.out.println(" *-1 - first computer is more expensive than secont \n * 1 - second computer is more expensive than first \n * 0 - price of first is equal of price of second computer ");

		int result = pcThree.comparePrice(pcFour);
		System.out.println("is pcThree is more expensive than pcFour: " + result);

		int result2 = pcFour.comparePrice(pcThree);
		System.out.println("is pcFour is more expensive than pcThree: " + result2);

		int result3 = georgiPc.comparePrice(pcFour);
		System.out.println("is georgiPc is more expensive than pcFour: " + result3);
	}

}
