package Atividades;

public class Ex01Lista04TestaCliente {

		public static void main(String[] args) {
			
		Cliente c1 = new Cliente();
		
		c1.nome = "Larissa";	
		c1.valorCompra = 20;	
		c1.avaliaAtendimento = 10;
		
		System.out.println("Nome do cliente: "  + c1.nome);
		System.out.println("Valor da compra R$: " + c1.valorCompra);
		System.out.println("Como o cliente avaliou o atendimento? (0 a 10): " + c1.avaliaAtendimento);
		
		c1.comprar();
}
}