package example.raccoons;

import example.abilities.SpecialAbility;
import example.entities.SpaceShip;

import java.awt.*;

public class ScienceRaccoon extends OrdinarySpaceRaccoon{
    /**
     * Creates a new science space raccoon.
     *
     * @param ship    the ship the space raccoon is on
     * @param ability the raccoon's special ability
     */
    public ScienceRaccoon(SpaceShip ship, SpecialAbility ability) {
        super(ship, ability);
    }

    @Override
    public Color getUniformColor() {
        return Color.BLUE;
    }
}
