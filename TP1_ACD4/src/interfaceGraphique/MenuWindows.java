/*
 * MenuWindows.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class MenuWindows
    extends Menu {

// --------------------------- CONSTRUCTORS ---------------------------

  protected MenuWindows(String couleur, double largeur) {
    super(couleur, largeur);
    this.typeMenu = "Menu de type Windows";
    System.out.println("Création d’un menu de type Windows");
  }
}
