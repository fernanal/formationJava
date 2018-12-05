package fr.uga.projet1.explambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

import fr.uga.projet1.poo.heritage.CompteB;

public class testStream {

	public static void main(String[] args) {
		
		Etudiant et1 = new Etudiant("toto","toto",10);
		Etudiant et2 = new Etudiant("tota","tota",11);
		Etudiant et3 = new Etudiant("tato","tato",15);
		Etudiant et4 = new Etudiant("tata","tata",18);
		
		List<Etudiant> lEtu= new ArrayList<>();
		lEtu.add(et1);
		lEtu.add(et2);
		lEtu.add(et3);
		lEtu.add(et4);
		
		List<Etudiant> LMoy = lEtu.stream()
			.sorted(Comparator.comparing(Etudiant::getMoyenne))
			.collect(Collectors.toList());
		
		System.out.println("Moyenne triées");
		
		LMoy.stream()
			.forEach(System.out::println);
		
		
		List<Etudiant> LMoySupDix = lEtu.stream()
				.filter(Etudiant -> Etudiant.getMoyenne() >= 10)
				.sorted(Comparator.comparing(Etudiant::getMoyenne))
				.collect(Collectors.toList());
		
		System.out.println("Moyenne triées et sup a 10");
		
		LMoySupDix.stream()
			.forEach(System.out::println);
		
		List<String> LMoyNomEtuSupDix = lEtu.stream()
				.filter(Etudiant -> Etudiant.getMoyenne() >= 10)
				.sorted(Comparator.comparing(Etudiant::getMoyenne))
				.map(Etudiant::getNom)
				.collect(Collectors.toList());
		
		System.out.println("Nom des étudiants avec une moyenne sup a 10");
		
		LMoyNomEtuSupDix.stream()
			.forEach(System.out::println);
		
		String result = String.join(", ", LMoyNomEtuSupDix);
		
		System.out.println("Nom des étudiants avec une moyenne sup a 10 séparée par une virgule");
		
		System.out.println(result);
		
		double moyenneNote = lEtu.stream()
								.collect(Collectors.averagingDouble( Etudiant::getMoyenne));
		
		System.out.println("La moyenne est " + moyenneNote);
		
		String passable ="passable";
		
		List<Etudiant> lEtuPassable= new ArrayList<>();
		
		Map<String,List<Etudiant>> collect = lEtu.stream()
				.collect(Collectors.groupingBy(Etudiant::getMention));
		
		collect.forEach((key, value) -> {
			System.out.println("passable : " + value);
			value.forEach(e->System.out.print(e.getNom() + ","));
		});
		
		

				
		
		
		
	}
}
