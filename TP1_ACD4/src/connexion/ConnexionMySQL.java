/*
 * ConnexionMySQL.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package connexion;

public class ConnexionMySQL
    extends Connexion {

// --------------------------- CONSTRUCTORS ---------------------------

  public ConnexionMySQL(String nom, String mdp) {
    super(nom, mdp);
  }

// -------------------------- OTHER METHODS --------------------------

  public void getDescription() {
    System.out.println("Connexion de type MySQL");
    System.out.println("Nom : " + this.nom + " et mot de passe : " + this.mdp);
  }
}
