/*
 * BuilderVoyage.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package voyage;

public abstract class BuilderVoyage {

// ------------------------------ FIELDS ------------------------------

  Voyage voyage = null;

// -------------------------- OTHER METHODS --------------------------

  abstract void choixActivite();

  abstract void choixHotel();

  abstract void choixRepas();

  abstract void choixVol();

  public void creerVoyage() {
    voyage = new Voyage();
  }

  public Voyage getVoyage() {
    return voyage;
  }
}
