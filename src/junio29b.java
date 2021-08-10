import java.util.Scanner;

public class junio29b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola\t" + nombre);
    }
    //funciones
    //public static float nombre_funcion(int variable){}
    //def funcion (Variable:int):->float:
        //eghrigel
    // args kwards 
    public static String saludar(String nombre) {
        return "Hola" + nombre;
        
    }
}
