package cuentas;

/**
 * @author Ana M� Ram�rez
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * M�todo constructor sin par�metros
     */
    public CCuenta()
    {
    }

    /**
     * M�todo constructor que inicializa los parametros de clase CCuenta 
     * 
     * @param nom nombre usuario, par�metro de tipo String
     * @param cue c�digo de la cuenta, par�metro de tipo String
     * @param sal saldo, par�metro de tipo double 
     * @param tipo tipo de inter�s, par�metro de tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * M�todo que retorna la cantidad de saldo que tiene una cuenta
     * 
     * @return saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo encargado de ingresar saldo en la cuenta
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
     * M�todo encargado de retirar saldo de la cuenta
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
	 * M�todo que retorna un nombre
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que establece el nombre del usuario
	 * @param nombre nombre de usuario, par�metro de tipo String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que retorna un n�mero de cuenta
	 * @return cuenta del usuario
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * M�todo que establece el n�mero de cuenta
	 * @param cuenta cuenta de usuario, de tipo String
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * M�todo que retorna la cantidad de saldo de una cuenta
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo que establece el saldo de la cuenta
	 * @param saldo saldo de la cuenta, de tipo double
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * M�todo que retorna el tipo de inter�s de una cuenta
	 * @return tipoInteres de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * M�todo que establece el tipo de inter�s de la cuenta
	 * @param tipoInteres tipo de inter�s de la cuenta, de tipo double
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
