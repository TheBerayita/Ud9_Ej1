/*
* Autores: 
* Pau Robuste
* Jordi Ribellas
* Albert Perez
*/
package Main;
public class Electrodomestico {

	private static double precio = 100;
	private static String colorB = "blanco";
	private static char consumo = 'F';
	private double pesoB = 5;
	protected double precioStandard;
	protected String color;
	protected char consumoEnergia;
	protected double peso;

	public Electrodomestico() {
		this.precioStandard = precio;
		this.color = colorB;
		this.consumoEnergia = consumo;
		this.peso = pesoB;
	}

	public Electrodomestico(double precio_standard, double peso) {
		this.precioStandard = precio_standard;
		this.color = colorB;
		this.consumoEnergia = consumo;
		this.peso = peso;
	}

	public Electrodomestico(double precio_standard, String color, char consumoEnergia, double peso) {
		this.precioStandard = precio_standard;
		this.color = comprobarColor(color);
		this.consumoEnergia = consumoEnergia;
		this.peso = peso;
	}

	// Aqui comprovaremos si el color que nos ha entrado es uno de los que
	// esperavamos o no
	public String comprobarColor(String color) {
		boolean bueno = false;
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equals(color)) {
				bueno = true;
			}
		}
		
		if (bueno == true) {
			return color;
		} else {
			return colorB;
		}
	}

	// Aqui revisamos que el consumo este entre 65 i 70
	public void revisarConsumo(char consumoEnergia) {
		if (consumoEnergia >= 65 && consumoEnergia <= 70) {
			this.consumoEnergia = consumoEnergia;
		} else {
			this.consumoEnergia = consumo;
		}
	}

	// Aqui controlamos que la enegia sea una correcta
	// y le sumamos el valor correspondiente
	public double precioFinal() {
		double precio = 0;
		switch (consumoEnergia) {
		case 'A':
			precio = precio + 100;
			break;
		case 'B':
			precio = precio + 80;
			break;
		case 'C':
			precio = precio + 60;
			break;
		case 'D':
			precio = precio + 50;
			break;
		case 'E':
			precio = precio + 30;
			break;
		case 'F':
			precio = precio + 10;
			break;

		default:
			System.out.println("El consumo introducido no es correcto");
			break;
		}

		if (peso >= 0 && peso < 19) {
			precio = precio + 10;

		} else if (peso >= 20 && peso < 49) {
			precio = precio + 50;

		} else if (peso >= 50 && peso < 79) {
			precio = precio + 80;

		} else if (peso > 80) {
			precio = precio + 100;

		}

		return precioStandard + precio;
	}

	public String toString() {
		return "El precio base del electrodomestico es de " + precioStandard + "€ es de color " + color
				+ " y el consumo energetico es " + consumoEnergia + " y pesa " + peso + "Kg.";
	}

}
