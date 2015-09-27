/*
 * PartieVoyageEco.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package voyage;

public class PartieVoyageEco
    extends BuilderVoyage {

// -------------------------- OTHER METHODS --------------------------

  void choixActivite() {
    voyage.setActivite("Activités de base");

  }

  void choixHotel() {
    voyage.setHotel("Hotel 2 étoiles");
  }

  void choixRepas() {
    voyage.setRepas("Buffet froid");
  }

  void choixVol() {
    voyage.setVol("Vol économique");
  }
}
