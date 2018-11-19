package strategy.character.impl;

import strategy.character.WeaponBehavior;

/**
 * @program: Java
 * @description: 用宝剑挥舞
 * @author: July
 * @create: 2018-09-26 16:49
 **/
public class Sword implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("用宝剑挥舞");
    }
}
