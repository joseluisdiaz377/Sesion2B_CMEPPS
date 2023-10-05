package pkg;

public class Empleado {

	public enum TipoEmpleado {
		Vendedor, Encargado, Otro
	};

	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salario = 0;

		/*
		 * Sueldo base dependiendo si es vendedor o encargado
		 */
		if (tipo == TipoEmpleado.Vendedor) {
			salario = 2000;
		} else if (tipo == TipoEmpleado.Encargado) {
			salario = 2500;
		} else
			return -1;

		/*
		 * Teniendo en cuenta las ventas del mes
		 */

		if (ventasMes >= 1500) {
			salario += 200;
		} else if (ventasMes >= 1000) {
			salario += 100;
		} else if (ventasMes < 0)
			return -1;
		
		/*
		 * Cálculo teniendo en cuenta las horas extras
		 */
		
		if(horasExtra >=0)
		{
			salario = salario + 30 * horasExtra;
		}
		else
			return -1;
		
		return salario;

		

	}

	public static float calculoNomina(float nominaBruta) {
		float retencion = 0;

		if (nominaBruta > 2500) {
			retencion = 0.18f;
		} else if (nominaBruta > 2100) {
			retencion = 0.15f;
		}
		else if(nominaBruta <0)
			return -1;

		return nominaBruta * (1 - retencion);
	}

	/*
	 * necesito un test para encargado, otro para vendedor, otro para OTRO
	 * 
	 * ventasMes ->Rango. Tendremos que probar 1 valida y 2 no validas. Nosotros
	 * haremos una prueba por cada rango significativo y una prueba con el valor
	 * negativo por probar. (0|1000|1500|max) 4 test
	 * 
	 * horasExtras --> Hacemos un test negativo y un test positivo.
	 * 
	 * nominaBruta --> test negativo, test <2100 , test entre 2100 y 2500 y test
	 * >2500
	 */

}
