import strategy.character.Character;
import strategy.character.King;
import strategy.character.Queen;
import strategy.character.impl.BowAndArrow;

/**
 * @program: Java
 * @description:
 * @author: July
 * @create: 2018-09-26 16:59
 **/
public class CharacterTest {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.setWeapon(new BowAndArrow());
        queen.show();

        Character king = new King();
        king.show();
    }
}
