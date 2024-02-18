package example.raccoons;

import example.abilities.SpecialAbility;
import example.entities.SpaceShip;

import java.awt.*;

public class CommandSpaceRaccoon extends OrdinarySpaceRaccoon {
    /**
     * Creates a new {@link CommandSpaceRaccoon}.
     *
     * @param ship the ship the space raccoon is on
     * @param ability the raccoon's special ability
     */
    public CommandSpaceRaccoon(final SpaceShip ship, final SpecialAbility ability) {
        super(ship, ability);
    }

    @Override
    public Color getUniformColor() {
        return Color.RED;
    }
}
