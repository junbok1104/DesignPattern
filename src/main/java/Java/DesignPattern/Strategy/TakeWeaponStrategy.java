package Java.DesignPattern.Strategy;

public class TakeWeaponStrategy {
    Weapon weapon;

    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack() {
        weapon.offensive();
    }
}
