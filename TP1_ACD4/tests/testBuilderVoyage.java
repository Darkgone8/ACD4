/*
 * testBuilderVoyage.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */


import voyage.*;

public class testBuilderVoyage {

// --------------------------- main() method ---------------------------

  public static void main(String[] args) {
    Client client1 = new Client("Client 1");
    Client client2 = new Client("Client 2");

    //Test voyage economique
    client1.choixVoyage(new PartieVoyageEco());
    client1.construireVoyage();
    Voyage voyage = client1.getVoyage();
    System.out.println(
        client1.getNomClient() + " a choisi un voyage économique avec: \n"
            + voyage + "\n\n");

    //Test voyage luxe
    client2.choixVoyage(new PartieVoyageLuxe());
    client2.construireVoyage();
    Voyage voyage4 = client2.getVoyage();
    System.out.println(
        client2.getNomClient() + " a choisi un voyage luxe avec: \n" + voyage4
            + "\n\n");
  }
}
