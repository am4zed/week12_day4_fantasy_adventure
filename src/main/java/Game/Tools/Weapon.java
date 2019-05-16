package Game.Tools;

import Game.Interfaces.ITool;

public class Weapon implements ITool {

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getValue() {
        return weaponType.getDamage();
    }
}
