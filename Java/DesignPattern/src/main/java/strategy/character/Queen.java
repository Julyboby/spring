package strategy.character;

import strategy.character.impl.BowAndArrow;

/**
 * @program: Java
 * @description: 皇后
 * @author: July
 * @create: 2018-09-26 16:51
 **/
public class Queen extends Character {

    public Queen() {
        weapon = new BowAndArrow();
    }

    @Override
    void fight() {

    }
}
