package cuentas;

/**
 * Clase principal donde se inicializa un obejeto de tipo CCuenta y se realizan
 * las operaciones retirar ingresar y se muestra el saldo.
 *
 * @author Eduardo Palacios Moreno
 * @version 26/02/2021/A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Método estático que realiza las funciones principales de la clase
     * utilizando los métodos de la clase CCuenta.
     * @param cuenta1 se inicializa el objeto con parámetros definidoos.
     * @param saldoActual se guardara el saldo actual.
     * @param cantidad
     * @exception e indica que se ha retirado mal.
     * @exception e indica que se ha ingresadoo de forma incooorrecta.
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio LÃ³pez", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
