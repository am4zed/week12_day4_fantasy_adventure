import Game.Interfaces.ITool;
import Game.Players.Dwarf;
import Game.Players.Knight;
import Game.Players.Wizard;
import Game.Tools.Spell;
import Game.Tools.SpellType;
import Game.Tools.Weapon;
import Game.Tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Dwarf dwarf;
    Weapon axe;
    Spell fireBall;

    @Before
    public void before() {
        fireBall = new Spell(SpellType.FIREBALL);
        wizard = new Wizard(50, fireBall);
        axe = new Weapon(WeaponType.AXE);
        dwarf = new Dwarf(20, axe);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void hasDefenceLevel() {
        assertEquals(50, wizard.getDefenceLevel());
    }

    @Test
    public void hasWeapon() {
        assertEquals(fireBall, wizard.getTool());
    }

    @Test
    public void canDefend() {
        wizard.defend(130);
        assertEquals(80, wizard.getHealth());
    }

    @Test
    public void canDie() {
        wizard.defend(210);
        assertEquals( 0, wizard.getHealth());
    }

    @Test
    public void canAttack() {
        wizard.attack(dwarf);
        assertEquals(90, dwarf.getHealth());
    }
}
