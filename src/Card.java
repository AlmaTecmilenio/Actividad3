import java.util.*;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/

public class Card {

    private String palo;
    private String color;
    private String valor;

    public Card (String p, String c, String v){
        this.palo = p;
        this.color = c;
        this.valor = v;
    }
    public String getPalo(){
        return this.palo;
    }
    public String getColor() {
        return this.color;
    }
    public String getValor(){
            return this.valor;
    }
}
