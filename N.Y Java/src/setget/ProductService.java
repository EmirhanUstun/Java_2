package setget;

public class ProductService {
	
	public void Add(Product product) {
		//JDBC ba�lant�s� 
		System.out.println("�r�n eklendi" + product.name);
	}

	public void add(int id,String name, String description, double price) {
		//JDBC ba�lant�s�
		System.out.println("�r�n eklendi" + name);
	}
}
