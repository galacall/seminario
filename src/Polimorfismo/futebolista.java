package Polimorfismo;

public class futebolista extends humano {
	futebolista(String nome){
		super(nome);
	}
	public String assistir() {
		return "Analisa o jogo...";
	}
	public String jogar() {
		return "Entrar em campo.";
	}
}
