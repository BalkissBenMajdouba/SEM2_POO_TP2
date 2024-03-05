package ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DossierPharmacie {
	private String nom ;
	private HashMap <String , PAtient > pts ;
	public DossierPharmacie ( String n){
		nom =n;
		pts = new HashMap <String , PAtient >();
	}
	void nvPatient(String nom, String []ord) {
		 PAtient patient = new PAtient(nom);
		 for (String medicament : ord) {
             patient.ajoutMedicament(medicament);
         }
		 pts.put(nom, patient);
	}
	public boolean ajoutMedicament (String nom, String m){
		 PAtient p=pts.get(nom);
		 if(p!=null) {
			 p.ajoutMedicament(m);
			 return true;
		 }
		 else 
			 return false;
		
		}
	 public void affichePatient(String nom) {
	        PAtient patient = pts.get(nom.toLowerCase());
	        if (patient != null) {
	            patient.affiche();
	        }
	    }
	 public void affiche() {
	        System.out.println("Nom de la pharmacie: " + nom);
	        for (PAtient patient : pts.values()) {
	            patient.affiche();
	        }
	    }
	 public Collection<String> affichePatientAvecMedicament(String m) {
	        List<String> patientsAvecMedicament = new ArrayList<>();
	        for (PAtient patient : pts.values()) {
	            if (patient.contientMedicament(m)) {
	                patientsAvecMedicament.add(patient.getNom());
	            }
	        }
	        return patientsAvecMedicament;
	    }
}
