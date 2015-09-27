/*
 * Client.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package voyage;

public class Client {

// ------------------------------ FIELDS ------------------------------

  public String nomClient = "";

  private BuilderVoyage voyage;

// --------------------------- CONSTRUCTORS ---------------------------

  public Client(String nom) {
    this.nomClient = nom;
  }

// -------------------------- OTHER METHODS --------------------------

  //Le client choisit son type de voyage
  public void choixVoyage(BuilderVoyage v) {
    this.voyage = v;
  }

  //Contruction du voyage en fonction du type, soit PartieVoyageEco soit PartieVoyageLuxe
  public void construireVoyage() {
    voyage.creerVoyage();
    voyage.choixHotel();
    voyage.choixVol();
    voyage.choixRepas();
    voyage.choixActivite();
  }

  public String getNomClient() {
    return nomClient;
  }

  public Voyage getVoyage() {
    return voyage.getVoyage();
  }
}
