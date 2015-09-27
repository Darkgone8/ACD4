/*
 * Bouton.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package interfaceGraphique;

public abstract class Bouton {

// ------------------------------ FIELDS ------------------------------

  protected String couleur;
  protected String typeBouton;
  protected double longeur;
  protected double hauteur;

// --------------------------- CONSTRUCTORS ---------------------------

  protected Bouton(String couleur, double longeur, double hauteur) {
    this.couleur = couleur;
    this.longeur = longeur;
    this.hauteur = hauteur;
  }

// -------------------------- OTHER METHODS --------------------------

  public String getCouleur() {
    return couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public double getHauteur() {
    return hauteur;
  }

  public void setHauteur(double hauteur) {
    this.hauteur = hauteur;
  }

  public double getLongeur() {
    return longeur;
  }

  public void setLongeur(double longeur) {
    this.longeur = longeur;
  }

}
