import java.io.PrintStream;
import java.util.Scanner;

//Desculpa para a robotizacao deste codigo. Acabei acidentalmente perdendo o .java, mas consegui decompilar o .class que ainda estava intacto
public class unidade00g {
	public static void terminal(int var0) {
		switch (var0) {
			case 1 :
				writeInput();
				break;
			case 2 :
				lerNota();
				break;
			case 3 :
				typeTriangle();
				break;
			case 4 :
				firstTenPairs();
				break;
			case 5 :
				log10_oneToTen();
				break;
			case 6 :
				mediaNotas();
				break;
			case 7 :
				mediaNotasOnly80();
				break;
			case 8 :
				higherThanAverage();
				break;
			case 9 :
				higherThanAverageWithName();
				break;
			case 10 :
				createArrayAndDisplay();
				break;
			case 11 :
				charOnString();
		}

	}

	public static void writeInput() {
		Scanner var0 = new Scanner(System.in);
		System.out.printf("String: ");
		String var1 = var0.nextLine();
		System.out.printf("char: ");
		char var2 = var0.nextLine().charAt(0);
		System.out.printf("inteiro: ");
		int var3 = var0.nextInt();
		System.out.printf("real: ");
		double var4 = var0.nextDouble();
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var2);
	}

	public static void lerNota() {
		Scanner var0 = new Scanner(System.in);
		System.out.printf("nota: ");
		int var1 = var0.nextInt();
		if (var1 >= 80) {
			System.out.println("Parabens, muito bom");
		} else if (var1 >= 70 && var1 < 80) {
			System.out.println("Parabens, aprovado");
		} else {
			System.out.println("Infelizmente, reprovado");
		}

	}

	public static void typeTriangle() {
		Scanner var0 = new Scanner(System.in);
		System.out.println("Entre os lados do triangulo - 3 inputs");
		double var1 = (double) var0.nextInt();
		double var3 = (double) var0.nextInt();
		double var5 = (double) var0.nextInt();
		if (var1 == var3 && var3 == var5) {
			System.out.println("Equilatero");
		} else if (var1 != var3 && var3 != var5) {
			System.out.println("Escaleno");
		} else {
			System.out.println("Isosceles");
		}

	}

	public static void firstTenPairs() {
		int var0 = 0;
		System.out.println(var0);

		while (var0 <= 10) {
			var0 += 2;
			System.out.println(var0);
		}

	}

	public static void log10_oneToTen() {
		for (int var0 = 1; var0 <= 10; ++var0) {
			System.out.println(Math.log((double) var0));
		}

	}

	public static void mediaNotas() {
		Scanner var0 = new Scanner(System.in);
		float var1 = 0.0F;

		for (int var3 = 0; var3 < 5; ++var3) {
			System.out.println("Entre nota");
			float var2 = var0.nextFloat();
			var1 += var2;
		}

		System.out.println(var1 / 5.0F);
	}

	public static void mediaNotasOnly80() {
		Scanner var0 = new Scanner(System.in);
		float var1 = 0.0F;
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			System.out.println("Entre nota");
			float var4 = var0.nextFloat();
			if (var4 >= 80.0F) {
				var1 += var4;
				++var2;
			}
		}

		if (var2 > 0) {
			System.out.println(var1 / (float) var2);
		} else {
			System.out.println("Nenhuma media para calcular");
		}

	}

	public static void higherThanAverage() {
		int[] var0 = new int[]{2, 5, 7, 8, 9};
		int var1 = 0;
		int[] var2 = var0;
		int var3 = var0.length;

		int var4;
		int var5;
		for (var4 = 0; var4 < var3; ++var4) {
			var5 = var2[var4];
			var1 += var5;
		}

		var1 /= 5;
		var2 = var0;
		var3 = var0.length;

		for (var4 = 0; var4 < var3; ++var4) {
			var5 = var2[var4];
			if (var5 > var1) {
				System.out.println(var5);
			}
		}

	}

	public static void higherThanAverageWithName() {
		int[] var0 = new int[]{2, 5, 7, 8, 9};
		String[] var1 = new String[]{"p1", "p2", "p3", "p4", "p5"};
		if (var0.length != var1.length) {
			System.out.println("Arrays nao correlacionados!");
		} else {
			int var2 = 0;
			int[] var3 = var0;
			int var4 = var0.length;

			for (int var5 = 0; var5 < var4; ++var5) {
				int var6 = var3[var5];
				var2 += var6;
			}

			var2 /= 5;

			for (int var7 = 0; var7 < var0.length; ++var7) {
				if (var0[var7] > var2) {
					System.out.println(var1[var7]);
					System.out.println(var0[var7]);
				}
			}

		}
	}

	public static void createArrayAndDisplay() {
		Scanner var0 = new Scanner(System.in);
		byte var1 = 10;
		int[] var2 = new int[var1];

		int var3;
		for (var3 = 0; var3 < var1; ++var3) {
			System.out.println("Entre valor");
			var2[var3] = var0.nextInt();
		}

		for (var3 = 0; var3 < var1; ++var3) {
			PrintStream var10000 = System.out;
			System.out.println(var2[var3]);	
		}

	}

	public static void charOnString() {
		Scanner var0 = new Scanner(System.in);
		System.out.println("string: ");
		String var1 = var0.nextLine();
		System.out.println("char: ");
		char var2 = var0.next().charAt(0);
		int var3 = 0;

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			if (var1.charAt(var4) == var2) {
				++var3;
			}
		}

		System.out.println(var3);
	}

	public static void main(String[] var0) {
		Scanner var1 = new Scanner(System.in);
		System.out.println("Alo pessoal!!!");
		terminal(var1.nextInt());
	}
}
