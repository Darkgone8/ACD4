/*
 * SGBDImpl.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package connexion;

public class SGBDMySQL
    extends SGBD {

// -------------------------- OTHER METHODS --------------------------

  protected Connexion creerConnexion(String nom, String mdp) {
    return new ConnexionMySQL(nom, mdp);
  }
}
