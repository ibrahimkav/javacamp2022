package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// get
		// System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer IndividualCustomer = new IndividualCustomer();
		IndividualCustomer.setId(1);
		IndividualCustomer.setCustomerNumber("12345");
		IndividualCustomer.setPhone("5459999999");
		IndividualCustomer.setFirstName("İbrahim");
		IndividualCustomer.setLastName("Kav");
		
		CorporateCustomer corporatecustomer = new CorporateCustomer();
		corporatecustomer.setId(2);
		corporatecustomer.setCompanyName("Kodlama.io");
		corporatecustomer.setPhone("0533333333");
		corporatecustomer.setTaxNumber("1111111111");
		corporatecustomer.setCustomerNumber("54321");
		
		Customer[] customers = {IndividualCustomer,corporatecustomer};
	}

}
