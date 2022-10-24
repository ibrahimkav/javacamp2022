package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name="mouse";
		product.price=10;
		productManager.add(product);
		DataBaseHelper.Crud.Delete();
		DataBaseHelper.Connection.CreateConnection();
	}

}
