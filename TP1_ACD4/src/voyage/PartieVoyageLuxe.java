/*
 * PartieVoyageLuxe.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package voyage;

public class PartieVoyageLuxe
    extends BuilderVoyage {

// -------------------------- OTHER METHODS --------------------------

  void choixActivite() {
    voyage.setActivite("Activités exceptionelles");

  }

  void choixHotel() {
    voyage.setHotel("Hotel 5 étoiles");
  }

  void choixRepas() {
    voyage.setRepas("Repas gastronomique");
  }

  void choixVol() {
    voyage.setVol("Vol première classe");
  }
}
