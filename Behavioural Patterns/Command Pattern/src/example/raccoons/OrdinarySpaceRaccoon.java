package example.raccoons;

import example.abilities.SpecialAbility;
import example.entities.SpaceShip;

import java.awt.*;

public class OrdinarySpaceRaccoon implements SpaceRaccoon {
    protected int pointsOfEncouragement;
    private final SpecialAbility ability;
    private final SpaceShip ship;

    /**
     * Creates a new ordinary space raccoon.
     *
     * @param ship the ship the space hamster is on
     * @param ability the raccoon's special ability
     */
    public OrdinarySpaceRaccoon(final SpaceShip ship, final SpecialAbility ability) {
        super();
        this.ability = ability;
        this.ship = ship;
        this.ship.getCrew().add(this);
    }

    @Override
    public Color getUniformColor() {
        return Color.GRAY;
    }

    @Override
    public void encourage() {
        this.pointsOfEncouragement+=5;
    }

    @Override
    public void useSpecialAbility() {
        ability.applySpecialAbility(ship);
    }

    public int getPointsOfEncouragement() {
        return pointsOfEncouragement;
    }
}
