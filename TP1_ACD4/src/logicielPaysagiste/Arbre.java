/*
 * Arbre.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

public class Arbre
    extends ObjetGraphique {

// ------------------------------ FIELDS ------------------------------

  private String couleurTronc;
  private int    hauteur;
  private int    densite;

// --------------------------- CONSTRUCTORS ---------------------------

  public Arbre(String couleurTronc, int hauteur, int densite, int x, int y) {
    this.couleurTronc = couleurTronc;
    this.hauteur = hauteur;
    this.densite = densite;
    this.coordonneeX = x;
    this.coordonneeY = y;
  }

// ------------------------ CANONICAL METHODS ------------------------

  public ObjetGraphique clone() {
    return new Arbre(couleurTronc, hauteur, densite, coordonneeX, coordonneeY);
  }

  public String toString() {
    return "Coordonnées : X = " + coordonneeX + "  y = " + coordonneeY
        + "\nCouleur du tronc : " + couleurTronc + "\nHauteur : " + hauteur
        + "\nDensité : " + densite + "\n\n";
  }

// -------------------------- OTHER METHODS --------------------------

  public void setCouleurTronc(String couleurTronc) {
    this.couleurTronc = couleurTronc;
  }

  public void setDensite(int densite) {
    this.densite = densite;
  }

  public void setHauteur(int hauteur) {
    this.hauteur = hauteur;
  }
}
