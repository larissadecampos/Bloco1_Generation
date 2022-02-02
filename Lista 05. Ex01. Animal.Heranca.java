package Atividades;

public class Animal {

	private String nome;
	private int idade;
	private String emitirSom;
	private String especie;
	
	 public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	//sempre letra minúscula + boa prática +
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	
}