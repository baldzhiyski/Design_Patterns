package example.entities;

import example.raccoons.SpaceRaccoon;

import java.util.HashSet;
import java.util.Set;

public class SpaceShip {

    private final Set<SpaceRaccoon> crew;

    /**
     * Create a new space ship with an empty crew.
     *
     * Ensures that {@code this.crew != null} and {@code this.crew.isEmpty() == true}.
     */
    public SpaceShip() {
        this.crew = new HashSet<SpaceRaccoon>();
    }

    /**
     *
     * @param hamster
     */
    public void addCrewMember(final SpaceRaccoon hamster) {
        if (hamster == null) {
            throw new IllegalArgumentException("New crew member must not be null!");
        }
        crew.add(hamster);
    }

    /**
     * Gets the crew of the spaceship.
     *
     * @return the ships's crew
     */
    public Set<SpaceRaccoon> getCrew() {
        return this.crew;
    }

    /**
     * Repairs the spaceship.
     */
    public void repair() {
        System.out.println("This ship is being repaired.");
    }
}
