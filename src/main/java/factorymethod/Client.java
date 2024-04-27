package factorymethod;

import javax.swing.JOptionPane;

//Classe que representa o pedido do cliente para a cria��o do objeto
public class Client {
	
	//M�todo principal
	public static void main(String[] args) {
        
		//Cria��o de um objeto e chamada do m�todo buildCar
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}

}
