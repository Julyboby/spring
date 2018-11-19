package strategy.character;

import strategy.character.impl.Sword;

/**
 * @program: Java
 * @description: 王
 * @author: July
 * @create: 2018-09-26 16:52
 **/
public class King extends Character {

    public King() {
        weapon = new Sword();
    }

    @Override
    void fight() {

    }
}
