package ejemploatributosobjetos;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class EjemploAtributosObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta objCuenta = new Cuenta();
        Personas objPersonas = new Personas();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre:");
        objPersonas.setNombre(sc.nextLine());
        System.out.println("Introduzca el DNI");
        objPersonas.setDNI(sc.nextLine());
       
        
        System.out.println(objCuenta.toString());
    }
    
}
