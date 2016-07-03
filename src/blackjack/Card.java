package blackjack;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Game card
 *
 * Can be one of the 4 suits with value
 * ranging from 'Ace' to '2'
 *
 * @author Almas
 * @version 1.0
 */
public class Card extends Parent {

    enum Suit {
        KIER, KARO, TREFL, PIK
    };

    enum Rank {
        DWOJKA(2), TROJKA(3), CZWORKA(4), PIATKA(5), SZOSTKA(6), SIODEMKA(7), OSEMKA(8), DZIEWIATKA(9), DZIESIATKA(10),
        JUPEK(10), KROLOWA(10), KROL(10), AS(11);

        final int value;
        private Rank(int value) {
            this.value = value;
        }
    };

    public final Suit suit;
    public final Rank rank;
    public final int value;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = rank.value;

        Rectangle bg = new Rectangle(80, 100);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        bg.setFill(Color.WHITE);

        Text text = new Text(toString());
        text.setWrappingWidth(70);

        getChildren().add(new StackPane(bg, text));
    }

    @Override
    public String toString() {
        return rank.toString() + " " + suit.toString();
    }
}