/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
package Main;
public class Television extends Electrodomestico {

	private static int resolucionB = 20;
	private static boolean sintonizadorTDTB = false;
	private int resolucion;
	private boolean sintonizadorTDT;

	public Television() {
		this.resolucion = resolucionB;
		this.sintonizadorTDT = sintonizadorTDTB;
		comprobarColor(color);
	}

	public Television(double precio_standard, double peso) {
		super(precio_standard, peso);
		this.resolucion = resolucionB;
		this.sintonizadorTDT = sintonizadorTDTB;
	}

	public Television(double precio_standard, String color, char consumoEnergia, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precio_standard, color, consumoEnergia, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double precioFinal() {
		double precio = super.precioFinal();

		if (resolucion > 40) {
			precio = precio + precioStandard * 0.3;

		}
		if (sintonizadorTDT) {
			precio = precio + 50;

		}

		return precio;
	}
}
