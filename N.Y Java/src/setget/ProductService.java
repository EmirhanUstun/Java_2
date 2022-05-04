package setget;

public class ProductService {
	
	public void Add(Product product) {
		//JDBC baðlantýsý 
		System.out.println("Ürün eklendi" + product.name);
	}

	public void add(int id,String name, String description, double price) {
		//JDBC baðlantýsý
		System.out.println("Ürün eklendi" + name);
	}
}
