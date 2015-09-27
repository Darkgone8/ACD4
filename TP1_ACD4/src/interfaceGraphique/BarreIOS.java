/*
 * BarreIOS.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BarreIOS
    extends Barre {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BarreIOS(String couleur, double hauteur) {
    super(couleur, hauteur);
    System.out.println("Création d’une barre de type IOS");
  }
}
