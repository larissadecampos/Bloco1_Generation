package Atividades;

public class Ex06Lista04TesteConta {

	public static void main(String[] args) {
		  	
	Conta c1 = new Conta ();
	
	c1.setBanco("Brasil");
	c1.setAgencia("4025");
	c1.setConta("1210-6");
	c1.setEndereco("Rua Butantã,300.");
	
	System.out.println("Banco do " + c1.getBanco());
	System.out.println("Agência: " + c1.getAgencia());
	System.out.println("Conta Corrente: " +c1.getConta());
	System.out.println("Endereço: " + c1.getEndereco());
	
    }
}
