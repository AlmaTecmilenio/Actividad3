import java.util.Scanner;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/

public class Game {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean continuar=true;
        Deck conjuntoCartas = new Deck();
        while(continuar) {
            System.out.println("Hola, escribe \n 'shuffle' para mezclar el deck \n 'head' para mostrar la primera carta\n 'salir' para terminar el programa");
            input = sc.nextLine();
            if (input.equals("shuffle")) {
                System.out.println(conjuntoCartas.shuffle());
            } else if (input.equals("head")) {
                System.out.println(conjuntoCartas.head());
            } else if(input.equals("salir")) {
                continuar=false;
            }else{
                System.out.println("Opción no valida");
            }
        }
    }
}