//Considere lo siguiente:
//public class PruebaArrays{
   //  public static void main(String[] args) {
   // int[] numeros = {4,2,3,8,1};
   
    // Escribir un método que imprima en pantalla: cuantos números hay en el array números, cual es el mayor
    //y cual es el promedio de todos los números. Devuelva los números ordenados de menor a mayor y a la
    //inversa.
public enum Punto4{
    public class Burbuja {
        public static void main(String[] args) {
            int[] numeros = {4, 2, 3, 8, 1};
            burbuja(numeros);

        public static void burbuja(int[] arreglo) {
            int n = arreglo.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                }
            }
        }
    }
 System.out.print("la lista de numeros, ordenada de mayor a menor es:",numeros);
}

public enum PUNTO_4 {
    public class promedio {
        public static void main(String[] args) {
            int[] numeros ={4, 2, 3, 8, 1};
            for (int i=0; i <numeros.length);{
                int total = numeros[i]+total;
            }
        }
    }
    System.out.print("el promedio total es"+total/numeros.length);{
    }

    }