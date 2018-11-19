package strategy.character.impl;

import strategy.character.WeaponBehavior;

/**
 * @program: Java
 * @description: 用斧头砍劈
 * @author: July
 * @create: 2018-09-26 16:48
 **/
public class Axe implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("用斧头砍劈");
    }
}
