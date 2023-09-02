import java.util.Scanner;

public class unidade00b{
	private static int[] intArray = {1,2,3,4,5,6,7,8,9,10};
	public static void terminal(int n) {
		switch (n){
			case 1:
				System.out.println(IsInArray(intArray, 3));
				break;
			case 2:
				System.out.println(IsInSortedArray(intArray, 3));
				System.out.println(IsInSortedArray(intArray, 11));
				break;
			case 3:
				BigAndSmall(intArray);
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select terminal input");
		int userInput = scanner.nextInt();
		terminal(userInput);
	}

	public static boolean IsInArray(int[] arr, int x){
		for (int n : arr){
			if (n == x) return true;
		}
		return false;
	}
	
	public static boolean IsInSortedArray(int[] arr, int x){
		int right = arr.length - 1;
		int left = 0;
		while (right >= left){
			int arrPos = (right - left)/2 + left; 
			if (arr[arrPos] == x){
				return true;
			}
			else {
				if (arr[arrPos] > x){
					right = arrPos - 1;
				}
				else {
					left  = arrPos + 1;
				}
			}
		}
		return false;
	}

	public static void BigAndSmall(int[] arr){
		int small = arr[0];
		int big = arr[0];
		for (int i = 1; i < arr.length; i++){
			if (arr[i] > big) big = arr[i];
			else if (arr[i] < small) small = arr[i];
		}
		System.out.println("Big = " + big + " / Small = " + small);
		//Ja temos o numero minimo de comparacoes aqui
	}
}


