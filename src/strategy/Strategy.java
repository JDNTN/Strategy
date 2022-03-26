package strategy;

import java.util.ArrayList;
import java.util.Scanner;
import Operations.*;

/**
 *
 * @author dntn
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Arithmetic> operaciones;
    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        operaciones = new ArrayList<>();

        agregarOperaciones(menuOperaciones());

        int primerNumero = pedirNumero("Ingrese el primer numero");
        int segundoNumero = pedirNumero("Ingrese segundo numero");
        
        operaciones.forEach((operacion) -> {
            System.out.println("El resultado de la "+ operacion.getType()+" es: ");
            operacion.execute(primerNumero, segundoNumero);
        } );

    }

    public static int menuOperaciones() {
        return pedirNumero("Ingrese la cantidad de operaciones que desea");
    }

    public static void agregarOperaciones(int noOperaciones) {
        String opcion;
        while (operaciones.size() < noOperaciones) {
            System.out.println("Seleccione la operacion a realizar: \n"
                    + "1. Suma \n"
                    + "2. Resta \n"
                    + "3. Multiplicacion \n"
                    + "4. Division");
            opcion = read.next();
            switch (opcion) {
                case "1":
                    operaciones.add(new Addition());
                    break;
                case "2":
                    operaciones.add(new Subtraction());
                    break;
                case "3":
                    operaciones.add(new Multiplication());
                    break;
                case "4":
                    operaciones.add(new Division());
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        }
    }

    private static int pedirNumero(String data) {
        while (true) {
            System.out.println(data);
            try {
                return Integer.parseInt(read.next());
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero");
            }
        }
    }
}
