package cuentasBanco;

/**
 * @author Daniel Bola
 * 
 * **/
public class Main {

    public static void main(String[] args) {
        CuentaBanco cuentaPersonal;
        double saldoActual;

        extracted();
    }

    /**
     * Crea una cuenta bancaria y hace una llamada a otro metodo para operar con esta.
     * @return No retorna ningun atributo
     * **/
	private static void extracted() {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		cuentaPersonal = new CuentaBanco("Antonio López","1000-2365-85-1230456789",2500,0);
        operativaCuenta(cuentaPersonal, 0.0f);
	}
	
	/**
     * Metodo que sirve para extraer e ingresar diferentes cantidades de saldo en una cuenta bancaria pasada por parámetro
     * @return No retorna nada
     * @deprecated Se tiene que hacer una renovación.
     * @param Se le pasa como parámetros un objeto CuentaBanco y una cantidad en forma de float.
     * **/
	private static void operativaCuenta(CuentaBanco cuentaPersonal, float cantidad) {
		double saldoActual;
		saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
