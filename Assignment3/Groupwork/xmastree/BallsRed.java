public class BallsRed extends Ball {
    public BallsRed(Tree tree) {
        super(tree);
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Red";
    }

    public double cost() {
        return 1 + tree.cost();
    }
}