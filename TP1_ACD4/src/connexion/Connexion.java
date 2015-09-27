/*
 * Connexion.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package connexion;

public abstract class Connexion {

// ------------------------------ FIELDS ------------------------------

  protected String nom;
  protected String mdp;

// --------------------------- CONSTRUCTORS ---------------------------

  public Connexion(String nom, String mdp) {
    this.nom = nom;
    this.mdp = mdp;
  }

// -------------------------- OTHER METHODS --------------------------

  abstract public void getDescription();
}
