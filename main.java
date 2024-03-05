package ex1;

import java.util.Collection;

public class main {
    public static void main(String[] args) {
        DossierPharmacie pharmacie = new DossierPharmacie("pharmacie du jour");

       pharmacie.nvPatient("Balkiss", new String[]{"Rhuvex", "paracetamol"});
       pharmacie.nvPatient("Sami", new String[]{"Doliprane", "paracetamol"});
      // pharmacie.nvPatient("Sami2", new String[]{"Doliprane", "Paracetamol"});
       
        pharmacie.affiche();

        System.out.println("\nPatients avec paracetamol:");
        Collection<String> patientsAvecParacetamol = pharmacie.affichePatientAvecMedicament("paracetamol");
        for (String nom : patientsAvecParacetamol) {
            System.out.println("- " + nom);
        }

        pharmacie.ajoutMedicament("Alice", "Ibuprofen");
        pharmacie.affichePatient("Alice");
    }
}
