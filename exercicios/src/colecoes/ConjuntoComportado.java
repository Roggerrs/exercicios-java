package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set lista = new HashSet(); // crtl + shit o importar 
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // organizar a lista
		listaAprovados.add("Ana");
		listaAprovados.add("Calor");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		Set <Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(34);
		nums.add(50);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
	}
	
}
