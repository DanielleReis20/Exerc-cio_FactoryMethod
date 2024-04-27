package factorymethod;

public abstract class Car {
	private String model;
	private String factory;
	private String category;
	
	//Exibe o modelo, fábrica e categoria do carro 
	public void showInformation() {
		System.out.println("Model: " + this.getModel() + "\nFactory: " + this.getFactory() + "\nCategory: " + this.getCategory());
	}
	
	//Métodos para acessar e modificar o modelo do carro
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
 
	//Método para acessar e modificar a fábrica do carro
	public String getFactory() {
		return factory;
	}
 
	public void setFactory(String factory) {
		this.factory = factory;
	}
 
	//Método para acessar e modificar a categoria do carro
	public String getCategory() {
		return category;
	}
 
	public void setCategory(String category) {
		this.category = category;
	}
}
		


