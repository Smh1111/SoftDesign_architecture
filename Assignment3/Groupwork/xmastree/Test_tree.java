public class Test_tree {
	
	// public static void main(String[] args) {
	// 	Tree mytree = new BlueSpruce();
	// 	mytree = new Star(mytree);
	// 	mytree = new Ruffles(mytree);
	// 	mytree = new Star(mytree);
	// 	mytree = new Ruffles(mytree);
	// 	System.out.println(mytree.getDescription() + " costs:" +mytree.cost());
	// }

	public static void main(String[] args) {
		Tree mytree = new DouglasFir();
		mytree = new Star(mytree);
		mytree = new BallsBlue(mytree);
		mytree = new Star(mytree);
		mytree = new BallsBlue(mytree);
		mytree = new Ruffles(mytree);
		mytree = new BallsRed(mytree);
		mytree = new BallsSilver(mytree);
		System.out.println(mytree.getDescription());
		System.out.println("costs $" +mytree.cost());
	}
}

