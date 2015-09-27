/*
 * InterfaceGraphiqueLinux.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class InterfaceGraphiqueLinux
    implements FabriqueInterfaceGraphique {
  public Bouton creerBouton(String couleur, double longeur, double hauteur) {
    return new BoutonLinux(couleur, longeur, hauteur);
  }

  public Barre creerBarre(String couleur, double hauteur) {
    return new BarreLinux(couleur, hauteur);
  }

  public Menu creerMenu(String couleur, double hauteur) {
    return new MenuLinux(couleur, hauteur);
  }
}
