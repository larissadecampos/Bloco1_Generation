package Atividades;

public class Conta {
/* Crie uma classe conta bancaria e apresente os atributos
 * e métodos referentes esta classe, em seguida crie um objeto
 * conta bancaria, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
 */
	private String banco;
	private String agencia;
	private String conta;
	private String endereco;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	 
	}