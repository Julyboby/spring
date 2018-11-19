package strategy.character;


import strategy.character.impl.Axe;

/**
 * @program: Java
 * @description:
 * @author: July
 * @create: 2018-09-26 16:54
 **/
public class Troll extends Character {

    public Troll() {
        weapon = new Axe();
    }

    @Override
    void fight() {

    }
}
