import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// ......
// ......

public class DynamicAnnuaire {
  
  public static void main(String[] args) {
             lectureCommandeClavier();
  }
  
  public static void lectureCommandeClavier() {
    //  la gestion des entrées utilisateur (Saisi clavier)
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Tapez une commande : ");
    // récupérer la ligne saisie
    String commande = scanner.nextLine();
        
    // ....
    // ....
  
    if(commande.equals("C")) {
      System.out.println("Quel est le nom de la personne que vous souhaitez ajouter dans l'annuaire ?");
      String nom = scanner.nextLine();
      // .....
      // .....
      // ....
    } else {
      System.out.println("Veuillez affecter une autre commande");
      commande=scanner.nextLine();
    }
    
    // ....
    // ....
    if(commande.equals("Merci")) {
      System.out.println("Fin des consultations et modifications sur l'annuaire");
    }
  }
}
