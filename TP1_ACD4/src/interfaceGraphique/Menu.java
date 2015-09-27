/*
 * Menu.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public abstract class Menu {

// ------------------------------ FIELDS ------------------------------

  protected String couleur;
  protected double largeur;
  protected String typeMenu;

// --------------------------- CONSTRUCTORS ---------------------------

  protected Menu(String couleur, double largeur) {
    this.couleur = couleur;
    this.largeur = largeur;
  }

// -------------------------- OTHER METHODS --------------------------

  public String getCouleur() {
    return couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public double getLargeur() {
    return largeur;
  }

  public void setLargeur(double largeur) {
    this.largeur = largeur;
  }
}
