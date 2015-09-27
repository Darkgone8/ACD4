/*
 * Banc.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

public class Banc
    extends ObjetGraphique {

// ------------------------------ FIELDS ------------------------------

  private String couleur;
  private int    hauteur;
  private int    largeur;

// --------------------------- CONSTRUCTORS ---------------------------

  public Banc(String couleur, int hauteur, int largeur, int x, int y) {
    this.couleur = couleur;
    this.hauteur = hauteur;
    this.largeur = largeur;
    this.coordonneeX = x;
    this.coordonneeY = y;
  }

// ------------------------ CANONICAL METHODS ------------------------

  public ObjetGraphique clone() {
    return new Banc(couleur, hauteur, largeur, coordonneeX, coordonneeY);
  }

  public String toString() {
    return "Coordonnées : X = " + coordonneeX + "  y = " + coordonneeY
        + "\nCouleur : " + couleur + "\nHauteur : " + hauteur + "\nLargeur : "
        + largeur + "\n\n";
  }

// -------------------------- OTHER METHODS --------------------------

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public void setHauteur(int hauteur) {
    this.hauteur = hauteur;
  }

  public void setLargeur(int largeur) {
    this.largeur = largeur;
  }
}
