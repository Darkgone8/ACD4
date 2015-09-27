/*
 * BarreWindows.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BarreWindows
    extends Barre {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BarreWindows(String couleur, double hauteur) {
    super(couleur, hauteur);
    System.out.println("Création d’une barre de type Windows");
  }
}
