/*
import Continente.Continente;
public class Main {
    public static void main(String[] args){
        Continente Asia = new Continente("China", "Beijin");
        Continente Europa = new Continente("Alemania", "Berlin");
        Continente America = new Continente("Argentina", "Entre Rios");
        System.out.println(Asia);
    }
}
*/


import java.util.ArrayList;
import java.util.Scanner;

class Provincia {
    private String nombre;
    private int poblacion;

    // Constructor
    public Provincia(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }
}

class Pais {
    private String nombre;
    private String capital;
    private long poblacion;
    private ArrayList<Provincia> provincias;

    // Constructor
    public Pais(String nombre, String capital, long poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.provincias = new ArrayList<>();
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public void addProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", poblacion=" + poblacion +
                ", provincias=" + provincias +
                '}';
    }
}

class Continente {
    private String nombre;
    private ArrayList<Pais> paises;

    // Constructor
    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPais(Pais pais) {
        paises.add(pais);
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    // Método para devolver los países de un continente
    public ArrayList<Pais> getPaisesContinente() {
        return paises;
    }

    // Método para devolver las provincias de un país
    public ArrayList<Provincia> getProvinciasPais(Pais pais) {
        for (Pais p : paises) {
            if (p.getNombre().equals(pais.getNombre())) {
                return p.getProvincias();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "nombre='" + nombre + '\'' +
                ", paises=" + paises +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear continente
        System.out.print("Ingrese el nombre del continente: ");
        String nombreContinente = scanner.nextLine();
        Continente continente = new Continente(nombreContinente);

        // Agregar países al continente
        System.out.print("¿Cuántos países desea ingresar al continente? ");
        int cantidadPaises = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        for (int i = 0; i < cantidadPaises; i++) {
            System.out.println("\nIngresando información del país " + (i + 1));
            System.out.print("Nombre del país: ");
            String nombrePais = scanner.nextLine();
            System.out.print("Capital del país: ");
            String capitalPais = scanner.nextLine();
            System.out.print("Población del país: ");
            long poblacionPais = scanner.nextLong();
            scanner.nextLine(); // Limpiar el buffer de entrada

            Pais pais = new Pais(nombrePais, capitalPais, poblacionPais);

            // Agregar provincias al país
            System.out.print("¿Cuántas provincias tiene el país " + nombrePais + "? ");
            int cantidadProvincias = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            for (int j = 0; j < cantidadProvincias; j++) {
                System.out.println("\nIngresando información de la provincia " + (j + 1));
                System.out.print("Nombre de la provincia: ");
                String nombreProvincia = scanner.nextLine();
                System.out.print("Población de la provincia: ");
                int poblacionProvincia = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                Provincia provincia = new Provincia(nombreProvincia, poblacionProvincia);
                pais.addProvincia(provincia);
            }

            continente.addPais(pais);
        }

        // Mostrar los países del continente
        System.out.println("\nLos países de " + nombreContinente + " son:");
        for (Pais pais : continente.getPaises()) {
            System.out.println(pais);
        }
    }
}
