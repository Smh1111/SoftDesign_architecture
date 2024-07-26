public class BallsBlue extends Ball {
    public BallsBlue(Tree tree) {
        super(tree);
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Blue";
    }

    public double cost() {
        return 2 + tree.cost();
    }
}