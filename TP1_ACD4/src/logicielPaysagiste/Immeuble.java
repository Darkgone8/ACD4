/*
 * Immeuble.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

public class Immeuble
    extends ObjetGraphique {

// ------------------------------ FIELDS ------------------------------

  private String couleur;
  private int    nbrEtages;
  private int    hauteurEtage;

// --------------------------- CONSTRUCTORS ---------------------------

  public Immeuble(String couleur, int nbrEtages, int hauteurEtage, int x,
      int y) {
    this.couleur = couleur;
    this.nbrEtages = nbrEtages;
    this.hauteurEtage = hauteurEtage;
    this.coordonneeX = x;
    this.coordonneeY = y;
  }

// ------------------------ CANONICAL METHODS ------------------------

  public ObjetGraphique clone() {
    return new Immeuble(couleur, nbrEtages, hauteurEtage, coordonneeX,
        coordonneeY);
  }

  public String toString() {
    return "Coordonnées : X = " + coordonneeX + "  y = " + coordonneeY
        + "\nCouleur : " + couleur + "\nNombres d’étages : " + nbrEtages
        + "\nHauteur étage : " + hauteurEtage + "\n\n";
  }

// -------------------------- OTHER METHODS --------------------------

  public void setCouleur(String couleur) {

    this.couleur = couleur;
  }

  public void setHauteurEtage(int hauteurEtage) {
    this.hauteurEtage = hauteurEtage;
  }

  public void setNbrEtages(int nbrEtages) {
    this.nbrEtages = nbrEtages;
  }
}
