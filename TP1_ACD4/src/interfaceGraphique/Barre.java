/*
 * Barre.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public abstract class Barre {

// ------------------------------ FIELDS ------------------------------

  protected String couleur;
  protected double hauteur;

// --------------------------- CONSTRUCTORS ---------------------------

  protected Barre(String couleur, double hauteur) {
    this.couleur = couleur;
    this.hauteur = hauteur;
  }

// -------------------------- OTHER METHODS --------------------------

  protected String getCouleur() {
    return couleur;
  }

  protected void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  protected double getHauteur() {
    return hauteur;
  }

  protected void setHauteur(double hauteur) {
    this.hauteur = hauteur;
  }
}
