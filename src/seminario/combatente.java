package seminario;

public class combatente extends agente {
	combatente(String nome, byte forca, byte agilidade, byte vigor, byte presenca, byte intelecto, byte level){
        super(nome, forca, agilidade, vigor, presenca, intelecto, level);
	}
	
	public String mostrarClasse() { //Altera o método mostrarClasse do agente, tornando
		// a resposta do código diferente
		return "Combatente";
	}
}
