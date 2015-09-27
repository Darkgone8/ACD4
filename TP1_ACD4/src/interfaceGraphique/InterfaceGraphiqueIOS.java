/*
 * InterfaceGraphiqueIOS.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class InterfaceGraphiqueIOS
    implements FabriqueInterfaceGraphique {
  public Bouton creerBouton(String couleur, double longeur, double hauteur) {
    return new BoutonIOS(couleur, longeur, hauteur);
  }

  public Barre creerBarre(String couleur, double hauteur) {
    return new BarreIOS(couleur, hauteur);
  }

  public Menu creerMenu(String couleur, double hauteur) {
    return new MenuIOS(couleur, hauteur);
  }
}
