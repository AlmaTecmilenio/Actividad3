import java.util.Scanner;
/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
*/

public class Game {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //se crea variable string para guardar el input del usuario
        String input;
        boolean continuar=true;
        Deck conjuntoCartas = new Deck();
        //se crea while loop para que el menu vuelva a salir
        while(continuar) {
            //output del programa
            System.out.println("Hola, escribe \n 'shuffle' para mezclar el deck \n 'head' para mostrar la primera carta\n 'salir' para terminar el programa");
           // se lee input del usuario
            input = sc.nextLine();
            //se crea condicinal, si el usuario escribe "shuffle" se mezclaran las cartas
            if (input.equals("shuffle")) {
                System.out.println(conjuntoCartas.shuffle());
                //si el usuario escribe "head" se sacara la primera carta y se eliminara del deck"
            } else if (input.equals("head")) {
                System.out.println(conjuntoCartas.head());
                //si el usuario escribe "salir" saldra del sistema
            } else if(input.equals("salir")) {
                continuar=false;
                //cualquier otro input dara "Opcion no valida"
            }else{
                System.out.println("Opción no valida");
            }
        }
    }
}