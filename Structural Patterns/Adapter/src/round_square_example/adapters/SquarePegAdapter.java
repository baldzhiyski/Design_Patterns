package round_square_example.adapters;

import round_square_example.round.RoundPeg;
import round_square_example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
