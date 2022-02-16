import java.util.*;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/

//se crea la clase Card para crear el objeto tipo carta
public class Card {
    //atributos del objeto
    private String palo;
    private String color;
    private String valor;

    public Card (String p, String c, String v){
        //metodo constructor del objeto Card

        this.palo = p;
        this.color = c;
        this.valor = v;
    }
    //metodo para regresar el  palo del objeto Card
    public String getPalo(){
        return this.palo;
    }
    //metodo para regresar el  color del objeto Card
    public String getColor() {
        return this.color;
    }
    //metodo para regresar el  valor del objeto Card
    public String getValor(){
            return this.valor;
    }
}
