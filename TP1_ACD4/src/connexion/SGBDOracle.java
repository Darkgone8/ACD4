/*
 * SGBDOracle.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package connexion;

public class SGBDOracle
    extends SGBD {

// -------------------------- OTHER METHODS --------------------------

  protected Connexion creerConnexion(String nom, String mdp) {
    return new ConnexionOracle(nom, mdp);
  }
}
