/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
*/
package Main;
public class Lavadora extends Electrodomestico {

	private static int cargaBase = 5;
	private int carga;

	public Lavadora() {
		this.carga = cargaBase;
		comprobarColor(color);
	}

	public Lavadora(double precio_base, double peso) {
		super(precio_base, peso);
		this.carga = cargaBase;
	}

	public Lavadora(double precio_base, String color, char consumo_energetico, double peso, int carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}

	public double precioFinal() {
		double precio = super.precioFinal();

		if (carga > 30) {
			precio = precio + 50;
		}

		return precio;
	}
}
