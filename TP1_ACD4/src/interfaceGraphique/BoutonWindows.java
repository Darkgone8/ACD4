/*
 * BoutonWindows.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BoutonWindows
    extends Bouton {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BoutonWindows(String couleur, double longeur, double hauteur) {
    super(couleur, longeur, hauteur);
    this.typeBouton = "Bouton de type Windows";
    System.out.println("Création d’un bouton de type Windows");
  }
}
