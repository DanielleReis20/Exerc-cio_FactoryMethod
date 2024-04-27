package factorymethod;

public abstract class Car {
	private String model;
	private String factory;
	private String category;
	
	//Exibe o modelo, f�brica e categoria do carro 
	public void showInformation() {
		System.out.println("Model: " + this.getModel() + "\nFactory: " + this.getFactory() + "\nCategory: " + this.getCategory());
	}
	
	//M�todos para acessar e modificar o modelo do carro
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
 
	//M�todo para acessar e modificar a f�brica do carro
	public String getFactory() {
		return factory;
	}
 
	public void setFactory(String factory) {
		this.factory = factory;
	}
 
	//M�todo para acessar e modificar a categoria do carro
	public String getCategory() {
		return category;
	}
 
	public void setCategory(String category) {
		this.category = category;
	}
}
		


