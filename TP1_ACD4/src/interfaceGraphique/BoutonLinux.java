/*
 * BoutonLinux.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BoutonLinux
    extends Bouton {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BoutonLinux(String couleur, double longeur, double hauteur) {
    super(couleur, longeur, hauteur);
    this.typeBouton = "Bouton de type Linux";
    System.out.println("Création d’un bouton de type Linux");
  }
}
