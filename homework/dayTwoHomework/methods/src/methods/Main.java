package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulma();
	}
		public static void sayiBulma() {
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
				mesajVer("Sayı Listede Bulunuyor." +aranacak);
			}
			else {
				mesajVer("Sayı listede yok."+aranacak);
			}
		}
		public static void mesajVer(String mesaj) {
			System.out.println(mesaj);
		}

	}


