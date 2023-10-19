import java.util.ArrayList;
import  java.util.List;

public class Card {

    private String colour;
    private String suits;
    private String number;

    public Card(String colour, String suits, String number) {
        this.colour = colour;
        this.suits = suits;
        this.number = number;
    }

    public String toString(){
        return colour + " " + number + " of " + suits;
        
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
