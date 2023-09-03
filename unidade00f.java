public class unidade00f {
	public static void BasicWrite(){
		Arq.openWrite("txt.txtignore");

		Arq.println(1);
		Arq.println(5.3);
		Arq.println('X');
		Arq.println(true);
		Arq.println("Algoritmos");

		Arq.close();
	}

	public static void BasicRead(){
		Arq.openRead("txt.txtignore");

		int inteiro = Arq.readInt();
		double real = Arq.readDouble();
		char caractere = Arq.readChar();
		boolean boleano = Arq.readBoolean();
		String str = Arq.readString();

		Arq.close();

		System.out.println("inteiro: " + inteiro);
		System.out.println("real: " + real);
		System.out.println("caractere: " + caractere);
		System.out.println("boleano: " + boleano);
		System.out.println("str: " + str);
	}

	public static void CopyFileToFile(String origin, String copy){
		Arq.openRead(origin);
		String str = "";
		while (Arq.hasNext()){
			str+=Arq.readChar();
		}

		Arq.close();

		Arq.openWrite(copy);
		System.out.println(str);
		Arq.print(str);
		Arq.close();

	}

	public static void main (String[] args) {
		BasicRead();
		CopyFileToFile("txt.txtignore","newtxt.txtignore");
	}
}
