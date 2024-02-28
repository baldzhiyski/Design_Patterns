package round_square_example.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(round_square_example.round.RoundPeg peg) {
       return  this.getRadius() >= peg.getRadius();

    }
}
