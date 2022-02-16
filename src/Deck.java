import java.util.ArrayList;
import java.util.Collections;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/
public class Deck {

    //Se crean los array para Palos y Valores
    private String [] palos = {"trebol", "corazon", "pica", "diamante"};
    private String [] valores = {"A", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<Card> deckCartas= new ArrayList<Card>();

    public Deck (){
        String color="negro";
        for (String palo:this.palos){

            /*Se crea un IF, en el cual si el palo es tipo corazon o diamante, el color sera rojo
            y si es de otro (pica o trebol) sera negro*/

            if(palo=="corazon" || palo=="diamante"){
                color="rojo";
            }
                for(String valor:this.valores){
                    Card carta = new Card(palo, color, valor);
                    this.deckCartas.add(carta);
                }

        }
    }
    //metodo shuffle para mezclar las cartas y metodo head para tomar la primera carta
    public String shuffle (){
        Collections.shuffle(this.deckCartas);
        return "Se mezcló el deck\n";
    }
    public String head (){
        Card temp = this.deckCartas.get(0);
        //se elimina la carta que se tomo
        this.deckCartas.remove(0);
        return temp.getPalo()+", "+temp.getColor()+", "+temp.getValor()+ "\n Quedan "+this.deckCartas.size()+" cartas\n";
    }
}
