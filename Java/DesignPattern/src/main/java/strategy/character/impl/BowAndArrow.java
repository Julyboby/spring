package strategy.character.impl;

import strategy.character.WeaponBehavior;

/**
 * @program: Java
 * @description: 用弓箭刺杀
 * @author: July
 * @create: 2018-09-26 16:48
 **/
public class BowAndArrow implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("用弓箭射击");
    }
}
