package Polimorfismo;

import java.util.ArrayList;

public class index2 {

	public static void main(String[] args) {
		ArrayList<humano> comentarista = new ArrayList<>();
		humano cr7 = new futebolista("Cristiano Ronaldo");
		comentarista.add(cr7);
		humano hm1 = new humano("Cléber Machado");
		comentarista.add(hm1);
		
		System.out.println("Cléber "+hm1.assistir());
		System.out.println(cr7.assistir()); //Ele analisa por ser futebolista
		//Condição que faz o cristiano jogar, sem ela ele não joga ->
		if (cr7 instanceof futebolista) {
			System.out.println(((futebolista)cr7).jogar());		
		}
	}	
}
