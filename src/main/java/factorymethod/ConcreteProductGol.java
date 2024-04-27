package factorymethod;

//Nessa classe está sendo setado os atributos de um carro do modelo

public class ConcreteProductGol extends Car{
	
	//Construtor da classe
	public ConcreteProductGol() {
		
		//Faz a definição dos atributos
		this.setModel("Gol");
		this.setFactory("Volka");
		this.setCategory("Hatch");
		//Exibe as informações
		this.showInformation();
	}

}
