package example.abilities;

import example.entities.SpaceShip;
import example.raccoons.SpaceRaccoon;

public class MotivatorAbility implements SpecialAbility {
    @Override
    public void applySpecialAbility(SpaceShip ship) {
        ship.getCrew().forEach(SpaceRaccoon::encourage);
    }
}
