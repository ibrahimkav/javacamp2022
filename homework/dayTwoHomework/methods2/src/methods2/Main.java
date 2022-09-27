package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(sehirVer());
		int sayi = topla(2,5);
		System.out.println(sayi);
		System.out.println(topla2(2,4,6,32,1,3,5));

	}
	public static void add() {
		System.out.println("Added");
	}
	public static void delete() {
		System.out.println("deleted");
	}
	public static void update() {
		System.out.println("updated");
	}
	public static int topla(int sayi1 , int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam = toplam+i;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
