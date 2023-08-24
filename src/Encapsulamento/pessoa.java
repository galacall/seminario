package Encapsulamento;

public class pessoa {
	private String nome; //Variável Privada
	byte idade;
	private String genero; //Variável Privada
	public pessoa(String nome, byte idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;		
	}
	
	public String mostrarNome() {
		return nome;
	}
	public byte mostrarIdade() {
		return idade;
	}
	public String mostrarGenero() {
		return genero;
	}
	
	public void Transicao(String novoNome, String novoGenero) { //Condição para fazer uma transição.
		if (idade >= 18) {
			nome = novoNome;
			genero = novoGenero;
			System.out.println("Transição feita.");
		} else {
			System.out.println("Você não tem idade o suficiente para isso.");
		}
	}
}
