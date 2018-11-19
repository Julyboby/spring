package strategy.character;

/**
 * @program: Java
 * @description: 角色类
 * @author: July
 * @create: 2018-09-26 16:26
 **/
public abstract class Character {

    WeaponBehavior weapon;

    public Character() {
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void show(){
        weapon.useWeapon();
    }

    abstract void fight();
}
