package cuentas;

/**
 * @author Ana Mª Ramírez
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Método constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor que inicializa los parametros de clase CCuenta 
     * 
     * @param nom nombre usuario, parámetro de tipo String
     * @param cue código de la cuenta, parámetro de tipo String
     * @param sal saldo, parámetro de tipo double 
     * @param tipo tipo de interés, parámetro de tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método que retorna la cantidad de saldo que tiene una cuenta
     * 
     * @return saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método encargado de ingresar saldo en la cuenta
     * 
     * @param cantidad cantidad de saldo a ingresar, es de tipo double
     * @throws Exception salta si se intenta ingresar una cantidad de saldo negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método encargado de retirar saldo de la cuenta
     * 
     * @param cantidad cantidad de saldo a retirar, es de tipo double
     * @throws Exception salta si se intenta retirar una cantidad de saldo menor
     *  o igual a cero, o si la cantidad a retirar es mayor que el saldo de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Método que retorna un nombre
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el nombre del usuario
	 * @param nombre nombre de usuario, parámetro de tipo String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que retorna un número de cuenta
	 * @return cuenta del usuario
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método que establece el número de cuenta
	 * @param cuenta cuenta de usuario, de tipo String
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método que retorna la cantidad de saldo de una cuenta
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que establece el saldo de la cuenta
	 * @param saldo saldo de la cuenta, de tipo double
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que retorna el tipo de interés de una cuenta
	 * @return tipoInteres de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método que establece el tipo de interés de la cuenta
	 * @param tipoInteres tipo de interés de la cuenta, de tipo double
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
