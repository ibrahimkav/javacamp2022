package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 4;
		boolean isPrime=true;
		for (int i =2;i<number;i++) {
			if(number%2==0) {
				isPrime=false;
			}
				
		}
		if(number<0) {
			System.out.println("Lüften Doğal Sayı Giriniz.");
		}
		
		else if(number==1 && number==0) {
			System.out.println("Sayı Asal Sayı değilir.");
		}
		else if(isPrime) {
			System.out.println("Sayı Asaldır.");
		}
		
		else {
			System.out.println("Sayı Asal Değildir.");
		}
	}

}
