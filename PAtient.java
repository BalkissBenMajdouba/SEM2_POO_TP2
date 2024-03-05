package ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PAtient {
	private String nom ;
	private Set <String > ordonnance ;
	public PAtient ( String n){
	nom = n ;
	ordonnance = new HashSet <String >();
	}
	public String getNom () { return nom ;}
	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
		}
	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
		}
	public void affiche(){
		System.out.println("Nom du patient: "+nom);
		if(ordonnanceVide()) {
			System.out.println("Ordonnace vide");
		}
		else {
			System.out.println("Ordonnace: ");
			for(String medicament:ordonnance) {
				System.out.println(medicament);
			}
		}
	}
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
	}
	public void trieOrdonnance() {
		Set<String> ordonnanceTriee = new TreeSet<>(ordonnance);
		ordonnance.clear();
		ordonnance.addAll(ordonnanceTriee);
	}
}
