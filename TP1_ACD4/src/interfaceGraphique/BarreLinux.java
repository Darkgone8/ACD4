/*
 * BarreLinux.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BarreLinux
    extends Barre {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BarreLinux(String couleur, double hauteur) {
    super(couleur, hauteur);
    System.out.println("Création d’une barre de type Linux");
  }
}
