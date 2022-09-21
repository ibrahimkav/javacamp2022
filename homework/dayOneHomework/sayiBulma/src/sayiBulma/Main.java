package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int [] numbers = new int [] {1,2,5,7,9,0};
		int aranacak=10;
		boolean varMi=false;
		for (int number : numbers) {
			if(number==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayı Listede Bulunuyor.");
		}
		else {
			System.out.println("Sayı listede yok.");
		}
	}

}
