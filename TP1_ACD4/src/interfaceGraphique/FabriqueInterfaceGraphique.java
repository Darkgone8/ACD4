/*
 * FabriqueInterfaceGraphique.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public interface FabriqueInterfaceGraphique {
  Bouton creerBouton(String couleur, double longeur, double hauteur);

  Barre creerBarre(String couleur, double hauteur);

  Menu creerMenu(String couleur, double hauteur);
}
