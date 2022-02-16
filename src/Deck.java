import java.util.ArrayList;
import java.util.Collections;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/
public class Deck {
    private String [] palos = {"trebol", "corazon", "pica", "diamante"};
    private String [] valores = {"A", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<Card> deckCartas= new ArrayList<Card>();

    public Deck (){
        String color="negro";
        for (String palo:this.palos){
            if(palo=="corazon" || palo=="diamante"){
                color="rojo";
            }
                for(String valor:this.valores){
                    Card carta = new Card(palo, color, valor);
                    this.deckCartas.add(carta);
                }

        }
    }
    public String shuffle (){
        Collections.shuffle(this.deckCartas);
        return "Se mezcló el deck\n";
    }
    public String head (){
        Card temp = this.deckCartas.get(0);
        this.deckCartas.remove(0);
        return temp.getPalo()+", "+temp.getColor()+", "+temp.getValor()+ "\n Quedan "+this.deckCartas.size()+" cartas\n";
    }
}
