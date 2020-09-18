import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

class App {
  public static void main(final String[] args) {
    
    ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      Collections.sort(fruits); //Range par ordre alphabétique.

      // Créer une liste de contenu unique basée sur les éléments de la collection fruit
      Set<String> triFruit = new HashSet<String>(fruits);

      ArrayList<String> fruit = new ArrayList<String>(triFruit);

      System.out.println(fruit); //Contenu sans doublons
  }
}