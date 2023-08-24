package Encapsulamento;

public class index {

	public static void main(String[] args) {
		pessoa t1 = new pessoa("Jorge", (byte) 18, "Masculino");
		//Declarado nome, genero e idade da pessoa
		String novoNome = "Maria";
		String novoGenero = "Feminino";
		//Nome para quando ela fizer 18 anos e for fazer uma transição de gênero.
		t1.Transicao(novoNome, novoGenero);
		//Novo nome e novo gênero se tornam apenas nome e gênero, porém, isso só acontece caso a Maria tenha mais de 18 anos.
		System.out.println("Nome: " + t1.mostrarNome());
		System.out.println("Idade: " + t1.mostrarIdade());
		System.out.println("Gênero: " + t1.mostrarGenero());
			}
	
	
	
}
