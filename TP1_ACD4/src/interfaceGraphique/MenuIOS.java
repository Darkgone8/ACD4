/*
 * MenuIOS.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public class MenuIOS
    extends Menu {

// --------------------------- CONSTRUCTORS ---------------------------

  protected MenuIOS(String couleur, double largeur) {
    super(couleur, largeur);
    this.typeMenu = "Menu de type IOS";
    System.out.println("Création d’un menu de type IOS");
  }
}
