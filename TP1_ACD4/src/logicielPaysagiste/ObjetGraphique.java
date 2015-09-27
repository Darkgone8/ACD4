/*
 * ObjetGraphique.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

public abstract class ObjetGraphique {

// ------------------------------ FIELDS ------------------------------

  protected int coordonneeX = 0;
  protected int coordonneeY = 0;

// ------------------------ CANONICAL METHODS ------------------------

  public abstract ObjetGraphique clone();

  public abstract String toString();

// -------------------------- OTHER METHODS --------------------------

  public void setCoordonnee(int x, int y) {
    coordonneeX = x;
    coordonneeY = y;
  }


}
