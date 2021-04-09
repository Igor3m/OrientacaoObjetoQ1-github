package aplicação;

import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		r.base = sc.nextDouble();
		r.altura = sc.nextDouble();
		
		double area, perimetro, diagonal;
		
		area = r.area();
		perimetro = r.perimetro();
		diagonal = r.diagonal();
		
		System.out.println("AREA" + " " + "=" + " " + area);
		System.out.println("PERIMETRO" + " " + "=" + " " + perimetro);
		System.out.println("DIAGONAL" + " " + "=" + " " + diagonal);
		
		sc.close();
	}

}
