package factorymethod;

//Nessa classe est� sendo setado os atributos de um carro do modelo

public class ConcreteProductPalio extends Car {

//Construtor da classe
public ConcreteProductPalio () {
	
	//Define os atributos
	this.setModel("Palio");
	this.setFactory("Fiat");
	this.setCategory("Hatch");
	//Exibe as informa��es
	this.showInformation();
	}

}
