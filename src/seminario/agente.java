package seminario;

public class agente {
	String nome;
	byte forca;
	byte agilidade;
	byte vigor;
	byte presenca;
	byte intelecto;
	byte level;
	//Variáveis acima ue se transformam em atributos abaixo
	public agente(String nome, byte forca, byte agilidade, byte vigor, byte presenca, byte intelecto, byte level) {
		this.nome = nome;
		this.forca = forca;
		this.agilidade = agilidade;
		this.vigor = vigor;
		this.presenca = presenca;
		this.intelecto = intelecto;
		this.level = level;
	}
	
	public String mostrarNome() { //Método que mostra Nome
		return nome;
	}
	
	public byte[] mostrarHabilidade() { //Método que mostra seus valores de habilidade
		byte[] habilidades = { forca, agilidade, vigor, presenca, intelecto };
		return habilidades;
	}
	
	public short mostrarNivel() { //Método que mostra o nível
		return level;
	}
	
	public String mostrarClasse() { // Método que mostra a classe
		return "Sem classe";
	}	
}
