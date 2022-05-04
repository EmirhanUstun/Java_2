package setget;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		
		product.id = 1;
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.price = 250;
		product.renk = "White";
		
		
		ProductService productService = new ProductService();
		
		productService.Add(product);
		
		
		productService.add(1,"Laptop","Asus",200);
				

	}

}
