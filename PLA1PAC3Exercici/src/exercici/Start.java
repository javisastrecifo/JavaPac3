package exercici;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		printMenu();
		while (true) {
		System.out.print("\nIntrodueix una comanda: ");
		String comanda = reader.nextLine();
		if (comanda.equals("fi")) {
		System.out.print("Final del programa. Salut!");
		break;
		} else if (comanda.isEmpty()) {
		printMenu();
		} else if (comanda.equals("triangle")) {
		System.out.print("Introdueix el costat 1: ");
		int costat1 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix el costat 2: ");
		int costat2 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix el costat 3: ");
		int costat3 = Integer.parseInt(reader.nextLine());
		System.out.println(
		"El perímetre del triangle és " + calculadoraTriangle(costat1, costat2, costat3) + ".\n\n");
		printMenu();
		} else if (comanda.equals("quadrat")) {
		System.out.print("Introdueix la longitud del costat: ");
		int costat = Integer.parseInt(reader.nextLine());
		System.out.println("El perímetre del quadrat és " + calculadoraQuadrat(costat) + ".\n\n");
		printMenu();
		} else if (comanda.equals("rectangle")) {
		System.out.print("Introdueix la longitud del costat curt: ");
		int costat1 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix la longitud del costat curt: ");
		int costat2 = Integer.parseInt(reader.nextLine());
		System.out.println("El perímetre del rectangle és " + calculadoraRectangle(costat1, costat2) + ".\n\n");
		printMenu();
		} else {
		System.out.print("Comanda no identificada. Torna a provar-ho!");
		}
		}

		}

		public static void printMenu() {
		System.out.println("<<< CALCULADORA DE PERÍMETRES >>>\n");
		System.out.println("Menú:");
		System.out.println("fi - Tancar el programa");
		System.out.println("triangle - calcular el perímetre d'un triangle");
		System.out.println("quadrat - calcular el perímetre d'un quadrat");
		System.out.println("rectangle - calcular el perímetre d'un rectangle");
		System.out.println("(res) - Tornar a imprimir aquest menú");

		}

		public static int calculadoraTriangle(int costat1, int costat2, int costat3) {
		int perimetre = costat1 + costat2 + costat3;
		return perimetre;
		}

		public static int calculadoraQuadrat(int costat) {
		int perimetre = costat * 4;
		return perimetre;
		}

		public static int calculadoraRectangle(int costat1, int costat2) {
		int perimetre = (costat1 * 2) + (costat2 * 2);
		return perimetre;
		}

		}
