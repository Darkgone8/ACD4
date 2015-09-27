/*
 * SGBD.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */

package connexion;

import java.util.ArrayList;

public abstract class SGBD {

// ------------------------------ FIELDS ------------------------------

  private ArrayList<Connexion> connexions;

// --------------------------- CONSTRUCTORS ---------------------------

  protected SGBD() {
    setConnexions(new ArrayList<Connexion>());
  }

// -------------------------- OTHER METHODS --------------------------

  public ArrayList<Connexion> getConnexions() {
    return connexions;
  }

  public void setConnexions(ArrayList<Connexion> connexions) {
    this.connexions = connexions;
  }

  public void nouvelleConnexion(String nom, String mdp) {
    getConnexions().add(this.creerConnexion(nom, mdp));
  }

  protected abstract Connexion creerConnexion(String nom, String mdp);
}
