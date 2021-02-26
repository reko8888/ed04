
package cuentas;

/**
 * Esta clase define Objeto que contendran variables de tipo String  y double.
 * @author Eduardo Palacios Moreno
 * @version  26/02/2021/A
 */
public class CCuenta {
    /**
     *@param nombre  Guardaremos el nombre en esta variable
     *@param cuenta  Guardaremos el númeroo de cuenta
     *@param saldo   Variable que usaremos para almacenar el saldo.
     *@param tipoInteres Guardaremos el interés que vamos aplicar posteriormente.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Metodo para obtener el nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para modificar la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo para obtener el saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para modificar el saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el tipoInteres
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo para modificar el tipoInteres
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

/**
 * Constructor CCuenta sin parámetros
 */
    public CCuenta() {
    }

  /**
 * Constructor CCuenta con los parámetros
     * @param nom guardaremos el nombre, tipo String
     * @param cue lo usaremos para la cuenta, tipo String
     * @param sal guardaremos el saldo, tipo double
     * @param tipo guardaremos el tipo de interes, tipo double
 */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * Metodo para mostrar el saldo actual.
     * @return getSaldo() 
     */
    public double estado() {
        return getSaldo();
    }
    /**
     * Metodo  realizar ingresos mientras que la cantidad sea positiva
     * @throws Exception si es negativa saltara la excepcion.
     * @param cantidad se sumara al saldo.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Metodo para retirar dinero, mientras mayor o igual a 0 y mayor que estado.
 * @param cantidad se restará al saldo
 * @throws Exception  si es negativa la cantidad indicara que no se puede retirar por que es cantidad negativa
 * @throws Exception  sies mayor lo que se quiere retirar que lo que hay indicara que no hay suficiente saldo
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
