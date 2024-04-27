package factorymethod;

//Classe de fábrica responsável por criar o objeto a partir da chamada de cliente

//Faz a definição da classe abstrata CarCreator
public abstract class CarCreator {
	
	public void buildCar() {
		//Chama o método factoryMethod()
		Car carro = factoryMethod();
	}
	
	//Método abstrato da criação do carro
	protected abstract Car factoryMethod();
}
