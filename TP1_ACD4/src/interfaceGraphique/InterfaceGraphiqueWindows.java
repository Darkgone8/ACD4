/*
 * InterfaceGraphiqueWindows.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class InterfaceGraphiqueWindows
    implements FabriqueInterfaceGraphique {
  public Bouton creerBouton(String couleur, double longeur, double hauteur) {
    return new BoutonWindows(couleur, longeur, hauteur);
  }

  public Barre creerBarre(String couleur, double hauteur) {
    return new BarreWindows(couleur, hauteur);
  }

  public Menu creerMenu(String couleur, double hauteur) {
    return new MenuWindows(couleur, hauteur);
  }
}
