package example;

import example.abilities.MotivatorAbility;
import example.abilities.RepairAbility;
import example.entities.SpaceShip;
import example.raccoons.CommandSpaceRaccoon;
import example.raccoons.ScienceRaccoon;

public class Main {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ScienceRaccoon engineerSpaceHamster = new ScienceRaccoon(ship, new RepairAbility());
        CommandSpaceRaccoon scienceSpaceHamster = new CommandSpaceRaccoon(ship,new MotivatorAbility());

        ship.addCrewMember(engineerSpaceHamster);
        ship.addCrewMember(scienceSpaceHamster);

        scienceSpaceHamster.useSpecialAbility();
        System.out.println(scienceSpaceHamster.getPointsOfEncouragement());

    }
}