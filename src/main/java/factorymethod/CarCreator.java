package factorymethod;

//Classe de f�brica respons�vel por criar o objeto a partir da chamada de cliente

//Faz a defini��o da classe abstrata CarCreator
public abstract class CarCreator {
	
	public void buildCar() {
		//Chama o m�todo factoryMethod()
		Car carro = factoryMethod();
	}
	
	//M�todo abstrato da cria��o do carro
	protected abstract Car factoryMethod();
}
