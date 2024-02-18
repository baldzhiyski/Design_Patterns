package example.raccoons;

import java.awt.*;

public interface SpaceRaccoon {
    /**
     * Gets the color of the raccoon's fur.
     *
     * @return color of the raccoon's fur.
     */
    public Color getUniformColor();

    /**
     * Encourages the hamster.
     */
    public void encourage();

    /**
     * Uses the raccoon's special ability.
     * If the raccoon is encouraged, it uses the special ability more vigorously.
     */
    public void useSpecialAbility();
}
