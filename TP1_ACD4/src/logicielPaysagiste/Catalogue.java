/*
 * Catalogue.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

public class Catalogue {

// ------------------------------ FIELDS ------------------------------

  private Immeuble prototypeImmeuble;
  private Arbre    protopypeArbre;
  private Banc     protopypeBanc;

// --------------------------- CONSTRUCTORS ---------------------------

  public Catalogue() {
    prototypeImmeuble = new Immeuble("prototypeCouleur", 0, 0, 0, 0);
    protopypeArbre = new Arbre("prototypeArbre", 0, 0, 0, 0);
    protopypeBanc = new Banc("prototypeBanc", 1, 2, 0, 0);
  }

// -------------------------- OTHER METHODS --------------------------

  public Arbre getProtopypeArbre() {
    return protopypeArbre;
  }

  public Banc getProtopypeBanc() {
    return protopypeBanc;
  }

  public Immeuble getPrototypeImmeuble() {
    return prototypeImmeuble;
  }
}
