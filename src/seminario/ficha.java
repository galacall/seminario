package seminario;
public class ficha {
// Class principal criado = Ficha
	//Agente é a class que define o padrão do personagem que será criado na ficha
	//Combatente, especilista e ocultista são classes filho de agente
	public static void main(String[] args) { //Tela = main
		agente ag1 = new agente("Cleuson", (byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 1, (byte) 0);
		mostrarFicha(ag1); //Executa o mostrarFicha()
		
		ocultista oct1 = new ocultista("Alice Gutierrez", (byte) 0, (byte) 2, (byte) 2, (byte) 3, (byte) 3, (byte) 7);
		mostrarFicha(oct1);
		
		combatente comb1 = new combatente("Antonio Pontevedra (Balu)", (byte) 4, (byte) 1, (byte) 2, (byte) 3, (byte) 1, (byte) 13);
		mostrarFicha(comb1);
	}
	
	public static void mostrarFicha(agente agente) { //Método mostrar Ficha()
        byte[] habilidades = agente.mostrarHabilidade();
        System.out.println("- " + agente.mostrarClasse() + " -");
        System.out.println(agente.mostrarNome());
        System.out.println("Força: " + habilidades[0]);
        System.out.println("Agilidade: " + habilidades[1]);
        System.out.println("Vigor: " + habilidades[2]);
        System.out.println("Presença: " + habilidades[3]);
        System.out.println("Intelecto: " + habilidades[4]);
        System.out.println("Nível: " + agente.mostrarNivel()*5 + "% de Exposição Paranormal");
        System.out.println(" ");
    }
}
