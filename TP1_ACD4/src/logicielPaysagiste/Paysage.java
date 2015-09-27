/*
 * Paysage.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */

package logicielPaysagiste;

import java.util.ArrayList;
import java.util.List;

public class Paysage {

// ------------------------------ FIELDS ------------------------------

  List<ObjetGraphique> objetsGraphique = null;

// --------------------------- CONSTRUCTORS ---------------------------

  public Paysage() {
    this.objetsGraphique = new ArrayList<ObjetGraphique>();
  }

// -------------------------- OTHER METHODS --------------------------

  public void afficherPaysage() {
    for (ObjetGraphique objetGraphique : objetsGraphique)
      System.out.println(objetGraphique);
  }

  public void ajouterObjetGraphique(ObjetGraphique objetGraphique) {
    objetsGraphique.add(objetGraphique.clone());
  }

  public List<ObjetGraphique> getObjetsGraphique() {
    return objetsGraphique;
  }

  public void setObjetsGraphique(List<ObjetGraphique> objetsGraphique) {
    this.objetsGraphique = objetsGraphique;
  }
}
