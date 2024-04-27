package factorymethod;

//Nessa classe est� sendo setado os atributos de um carro do modelo

public class ConcreteProductGol extends Car{
	
	//Construtor da classe
	public ConcreteProductGol() {
		
		//Faz a defini��o dos atributos
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		//Exibe as informa��es
		this.showInformation();
	}

}
