package example.abilities;

import example.entities.SpaceShip;

/**
 * Functional interface for special abilities of space hamsters.
 */
@FunctionalInterface
public interface SpecialAbility {
    /**
     * Applies a hamster's special ability to the given spaceship.
     *
     * @param ship the ship to apply the special ability to
     */
    public void applySpecialAbility(final SpaceShip ship);
}
