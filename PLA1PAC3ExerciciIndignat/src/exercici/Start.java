package exercici;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		printMenu();
		while (true) {
		System.out.print("\nIntrodueix alguna merda de comanda: ");
		String comanda = reader.nextLine();
		if (comanda.equals("atomapelcul")) {
		System.out.print("Final del cony de programa. Imb�cil!");
		break;
		} else if (comanda.isEmpty()) {
		printMenu();
		} else if (comanda.equals("putotriangle")) {
		System.out.print("Introdueix el puto costat 1: ");
		int costat1 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix el puto costat 2: ");
		int costat2 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix el puto costat 3: ");
		int costat3 = Integer.parseInt(reader.nextLine());
		System.out.println(
		"El per�metre del teu puto triangle �s " + calculadoraTriangle(costat1, costat2, costat3) + ".\n\n");
		printMenu();
		} else if (comanda.equals("putoquadrat")) {
		System.out.print("Introdueix la puta merda de longitud del costat: ");
		int costat = Integer.parseInt(reader.nextLine());
		System.out.println("El per�metre de la teva merda de quadrat �s " + calculadoraQuadrat(costat) + ".\n\n");
		printMenu();
		} else if (comanda.equals("putorectangle")) {
		System.out.print("Introdueix la longitud del puto costat curt: ");
		int costat1 = Integer.parseInt(reader.nextLine());
		System.out.print("Introdueix la longitud del puto costat curt: ");
		int costat2 = Integer.parseInt(reader.nextLine());
		System.out.println("El per�metre del teu merda de rectangle �s " + calculadoraRectangle(costat1, costat2) + ".\n\n");
		printMenu();
		} else {
		System.out.print("Comanda no identificada. Torna a provar-ho, capullo!");
		}
		}

		}
	

		public static void printMenu() {
		System.out.println("<<< CALCULADORA DE MERDES >>>\n");
		System.out.println("Un programa per in�tils que no saben sumar:");
		System.out.println("atomapelcul - Tancar el programa");
		System.out.println("putotriangle - calcular el per�metre d'un triangle");
		System.out.println("putoquadrat - calcular el per�metre d'un quadrat");
		System.out.println("putorectangle - calcular el per�metre d'un rectangle");
		System.out.println("(res) - Tornar a imprimir aquest men�");

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
