package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=266;
		int sayi2=25;
		int sayi3=26;
		String mesaj =" Sayisi büyüktür.";
		
		if(sayi1>sayi2 && sayi1>sayi3 ) {
			System.out.println(sayi1+mesaj);
		}
		else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println(sayi2+mesaj);
		}
		else if (sayi3>sayi1 && sayi3>sayi2) {
			System.out.println(sayi3+mesaj);
		}

	}

}
