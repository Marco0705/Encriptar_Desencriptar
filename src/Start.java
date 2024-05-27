import java.util.HashMap;
import java.util.Scanner;

public class Start {
	// Creo una función para encriptar un mensaje mediante el número ascii sumandole
	// 1
	public static String encriptar(String cadena) {
		String cadena2 = "";
		int ascii = 0;
		// Recorro la frase o palabra que le pedimos al usuario caracter por caracter y
		// lo almaceno en ascii
		// Almaceno en cadena2 los valores de ascii y le sumo 1
		for (int i = 0; i < cadena.length(); i++) {
			ascii = (int) cadena.charAt(i);
			cadena2 += Integer.toString(ascii + 1);
		}
		return cadena2;
	}

	// Creo la función desencriptar creando un HasMap de String a String con los
	// valores correspondientes(ascii + 1)
	public static String desencriptar(String cadena) {
		String cadena4 = "";
		String cadena3 = "";
		HashMap<String, String> map = new HashMap<>();
		map.put("98", "a");
		map.put("99", "b");
		map.put("100", "c");
		map.put("101", "d");
		map.put("102", "e");
		map.put("103", "f");
		map.put("104", "g");
		map.put("105", "h");
		map.put("106", "i");
		map.put("107", "j");
		map.put("108", "k");
		map.put("109", "l");
		map.put("110", "m");
		map.put("111", "n");
		map.put("242", "ñ");
		map.put("112", "o");
		map.put("113", "p");
		map.put("114", "q");
		map.put("115", "r");
		map.put("116", "s");
		map.put("117", "t");
		map.put("118", "u");
		map.put("119", "v");
		map.put("120", "w");
		map.put("121", "x");
		map.put("122", "y");
		map.put("123", "z");
		map.put("66", "A");
		map.put("67", "B");
		map.put("68", "C");
		map.put("69", "D");
		map.put("70", "E");
		map.put("71", "F");
		map.put("72", "G");
		map.put("73", "H");
		map.put("74", "I");
		map.put("75", "J");
		map.put("76", "K");
		map.put("77", "L");
		map.put("78", "M");
		map.put("79", "N");
		map.put("210", "Ñ");
		map.put("80", "O");
		map.put("81", "P");
		map.put("82", "Q");
		map.put("83", "R");
		map.put("84", "S");
		map.put("85", "T");
		map.put("86", "U");
		map.put("87", "V");
		map.put("88", "W");
		map.put("89", "X");
		map.put("90", "Y");
		map.put("91", "Z");
		map.put("33", " ");
		map.put("45", ",");
		map.put("47", ".");
		map.put("226", "á");
		map.put("238", "í");
		map.put("244", "ó");
		map.put("251", "ú");
		map.put("234", "é");
		map.put("162", "¡");
		map.put("34", "!");
		map.put("64", "?");
		map.put("192", "¿");
		map.put("60", ";");
		map.put("59", ":");
		// Recorro la cadena que le pedimos al usuario y en cadena3 se van almacenando
		// caracter a caracter la cadena
		// Cuando el bucle encuentra un caracter igual a una letra, la almacena en
		// cadena4 y cadena3 pasa a estar vacio, así hasta que recorra todos los
		// caracteres de la cadena
		for (int i = 0; i < cadena.length(); i++) {
			cadena3 += Character.toString(cadena.charAt(i));
			if (map.containsKey(cadena3)) {
				cadena4 += map.get(cadena3);
				cadena3 = "";
			}
		}
		return cadena4;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cadena2 = "";
		int opcion = 0;
		// Genero un bucle para el menú por si el usuario pone una opción que no es
		// correcta le aparezca un mensaje de error y vuelva a aparecer el menú
		do {
			System.out.println("1. Introduzca una frase");
			System.out.println("2. Código cifrado");
			System.out.println("3. Código después de ser cifrado");
			System.out.println("0. Salir");
			System.out.print("\nIntroduce una opción: ");
			opcion = scan.nextInt();
			scan.nextLine();
			// Genero switch para que el usuario depende de la opción escogida se meta por
			// un camino u otro
			switch (opcion) {
			// El usuario sale del programa
			case 0:
				System.out.println("\nFin del programa");
				break;
			// El usuario introduce una frase para ser encriptada (llamo a la función
			// encriptar)
			case 1:
				System.out.print("\nIntroduzca una frase: ");
				String cadena = scan.nextLine();
				cadena2 = encriptar(cadena);
				System.out.println("\nFrase encriptada\n");
				break;
			// Al introducir esta opción, muestra la cadena encriptada, si el usuario
			// anteriormente no ha escrito una frase, le salta mensaje de error
			case 2:

				if (cadena2.equals("")) {
					System.err.println("\nNo se introdujo una palabra\n");
				} else {
					System.out.println("\nLa palabra encriptada es: " + cadena2 + "\n");
				}
				break;
			case 3:
				// Muestra al usuario la palabra desencriptada (llamo a la función
				// desencriptar), si el usuario no ha escrito ninguna frase, le salta mensaje de
				// error
				if (cadena2.equals("")) {
					System.err.println("\nNo se introdujo una palabra\n");
				} else {
					System.out.println("\nLa palabra desencriptada es: " + desencriptar(cadena2) + "\n");
				}

				break;
			// En caso de que el usuario ponga una opción que no está en el menú, le parece este mensaje
			default:
				System.err.println("\nIntroduzca una opcón en el menú\n");
			}
		} while (opcion != 0);
		scan.close();
	}
}
