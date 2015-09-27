/*
 * PartieVoyage.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package voyage;

public class Voyage {

// ------------------------------ FIELDS ------------------------------

  private String hotel    = "";
  private String vol      = "";
  private String repas    = "";
  private String activite = "";

// ------------------------ CANONICAL METHODS ------------------------

  public String toString() {
    return hotel + "\n" + vol + "\n" + repas + "\n" + activite;
  }

// -------------------------- OTHER METHODS --------------------------

  public void setActivite(String activite) {
    this.activite = activite;
  }

  public void setHotel(String hotel) {
    this.hotel = hotel;
  }

  public void setRepas(String repas) {
    this.repas = repas;
  }

  public void setVol(String vol) {
    this.vol = vol;
  }
}
