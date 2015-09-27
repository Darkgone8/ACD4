/*
 * MenuLinux.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class MenuLinux
    extends Menu {

// --------------------------- CONSTRUCTORS ---------------------------

  protected MenuLinux(String couleur, double largeur) {
    super(couleur, largeur);
    this.typeMenu = "Menu de type Linux";
    System.out.println("Création d’un menu de type Linux");
  }
}
