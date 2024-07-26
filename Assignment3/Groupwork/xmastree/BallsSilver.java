public class BallsSilver extends Ball {
    public BallsSilver(Tree tree) {
        super(tree);
    }

    public String getDescription() {
        return tree.getDescription() + ", Balls Silver";
    }

    public double cost() {
        return 3 + tree.cost();
    }
}