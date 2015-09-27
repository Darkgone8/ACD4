/*
 * BoutonIOS.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class BoutonIOS
    extends Bouton {

// --------------------------- CONSTRUCTORS ---------------------------

  protected BoutonIOS(String couleur, double longeur, double hauteur) {
    super(couleur, longeur, hauteur);
    this.typeBouton = "Bouton de type IOS";
    System.out.println("Création d’un bouton de type IOS");
  }
}
