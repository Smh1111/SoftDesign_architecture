public class Test_tree {
	
	public static void ) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		printtree(mytree);
	}

	public static void printtree(Tree tree){
		System.out.println(tree.getDescription());
		System.out.println("cost $"+tree.cost());
	}
}


