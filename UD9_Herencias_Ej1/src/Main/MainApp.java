/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
package Main;
public class MainApp {
	public static void main(String[] args) {
		Electrodomestico electro[] = new Electrodomestico[6];
		double sumaElectro = 0;
		double sumaLavadora = 0;
		double sumaTele = 0;

		electro[0] = new Electrodomestico(100, "blanco", 'F', 60);
		electro[1] = new Television(110, "negro", 'E', 20, 35, true);
		electro[2] = new Lavadora(120, "rojo", 'D', 80, 10);
		electro[3] = new Electrodomestico(130, "aaa", 'C', 10);
		electro[4] = new Television(140, "aaaa", 'B', 70, 40, true);
		electro[5] = new Lavadora(150, "aaa", 'A', 40, 6);

		for (int i = 0; i < electro.length; i++) {
			if (electro[i] instanceof Electrodomestico) {
				sumaElectro = sumaElectro + electro[i].precioFinal();
			}
			if (electro[i] instanceof Lavadora) {
				sumaLavadora = sumaLavadora + electro[i].precioFinal();
			}
			if (electro[i] instanceof Television) {
				sumaTele = sumaTele + electro[i].precioFinal();
			}
			
			System.out.println(electro[i]);
		}

		System.out.println("Todos los electrodomesticos juntas cuestan: " + sumaElectro);
		System.out.println("Todas lavadoras juntas cuestan: " + sumaLavadora);
		System.out.println("Todas televisiones juntas cuestan: " + sumaTele);

		
	}
}
