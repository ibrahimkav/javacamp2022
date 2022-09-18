package inro;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		
		String ortaMetin = "�lginizi �ekebilir";
		String altMetin = "Vades�resi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.18;
		double dolarBugun = 18.18;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		System.out.println("+++++++++++++++++++++++++++++");
		//array
		
		String[] krediler = {"H�zl� Kredi","Halkbanktan","Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
