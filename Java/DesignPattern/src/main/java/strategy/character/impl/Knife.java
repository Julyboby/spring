package strategy.character.impl;

import strategy.character.WeaponBehavior;

/**
 * @program: Java
 * @description: 匕首刺杀行为
 * @author: July
 * @create: 2018-09-26 16:46
 **/
public class Knife implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("用匕首刺杀");
    }
}
