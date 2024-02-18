package example.abilities;

import example.entities.SpaceShip;

public class RepairAbility implements SpecialAbility{
    @Override
    public void applySpecialAbility(SpaceShip ship) {
        ship.repair();
    }
}
