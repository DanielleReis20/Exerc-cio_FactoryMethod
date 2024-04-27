package factorymethod;

import javax.swing.JOptionPane;

//Classe que representa o pedido do cliente para a criação do objeto
public class Client {
	
	//Método principal
	public static void main(String[] args) {
        
		//Criação de um objeto e chamada do método buildCar
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}

}
