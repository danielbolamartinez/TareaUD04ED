package cuentasBanco;

/**
 * Clase que permite crear objetos CuentaBanco para operar con cuentas bancarias. 
 * @author Daniel Bola
 * @version 0.0.1
 * **/
public class CuentaBanco {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaBanco()
    {
    }

    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Hace una llamada al metodo getSaldo y devuelve la cantidad de dinero que hay en la cuenta
     * @return Double
     * **/
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método en el que ingresas una cantidad y se añade al saldo que había en la cuenta.
     * **/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método en el que retiras una cantidad y se resta del saldo que había en la cuenta.
     * **/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Metodo Get de nombre
	 * @return String - Nombre asociado a la cuenta bancaria
	 * **/
    private String getNombre() {
		return nombre;
	}

    /**
	 * Metodo Set de nombre
	 * Permite cambiar el nombre asociado a la cuenta bancaria
	 * **/
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo Get del codigo de cuenta
	 * @return String - Codigo de la cuenta bancaria
	 * **/
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo Set de Cuenta
	 * Permite cambiar el código de la cuenta bancaria
	 * **/
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Metodo Get de saldo
	 * @return Double - Cantidad de dinero en la cuenta bancaria
	 * **/
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo Set de saldo
	 * Permite asignar una cantidad de dinero la cuenta bancaria
	 * **/
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Metodo Get de tipo de interes
	 * @return Double - Devuelve el tipo de interés que se le aplica a la cuenta bancaria
	 * **/
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo Set de nombre
	 * Permite aplicar un tipo de interés que se le va a aplicar a la cuenta bancaria
	 * **/
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
