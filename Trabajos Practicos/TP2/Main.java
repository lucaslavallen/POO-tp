import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//crea el scaner
        
        do {
            System.out.print("Introduce el primer número: ");//muestra en pantalla
            double num1 = scanner.nextInt();//el scaner lee un numero 
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextInt();
            System.out.print("Introduce el tercer número: ");
            double num3 = scanner.nextInt();
            
            if (num1 > 0) {
                double producto = num2 * num3;
                System.out.println("El producto de los otros dos números es: " + producto);
            } else {
                double suma = num2 + num3;
                System.out.println("La suma de los otros dos números es: " + suma);
            }
            
            System.out.print("¿Desea volver a realizar la operación? (s/n): ");
            String respuesta = scanner.next();//el scaner lee un caracter
            
            if (!respuesta.equalsIgnoreCase("s")) {//compara la cadena que contiene "palabra" con la "s"
                break;//finaliza el bucle
            }
            
        } while (true);
        
        scanner.close();//finaliza la utilizacion del scaner
        
    }
}


