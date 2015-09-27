/*
 * testLogicielPaysagiste.java
 * SAUNIER DEBES Brice
 * 26/09/15
 */


import logicielPaysagiste.*;

public class testLogicielPaysagiste {
  public static void main(String[] args) {
    //Instanciation du catalogue et du paysage
    Catalogue catalogue = new Catalogue();
    Paysage   paysage   = new Paysage();

    Immeuble immeuble;
    Banc banc;
    Arbre arbre;

    paysage.ajouterObjetGraphique(catalogue.getProtopypeArbre());
    paysage.ajouterObjetGraphique(catalogue.getProtopypeBanc());
    paysage.ajouterObjetGraphique(catalogue.getPrototypeImmeuble());

    paysage.afficherPaysage();

    //Le prototype est cloné
    arbre = catalogue.getProtopypeArbre();
    //Puis on change les attributs que l’on souhaite
    arbre.setCouleurTronc("Jaune");
    arbre.setCoordonnee(12, 889);
    arbre.setDensite(32);
    arbre.setHauteur(21);
    //Enfin on ajoute l’objet au paysage
    paysage.ajouterObjetGraphique(arbre);

    //Le prototype est cloné
    arbre = catalogue.getProtopypeArbre();
    //Puis on change les attributs que l’on souhaite
    arbre.setCouleurTronc("Brun");
    arbre.setCoordonnee(9812, 222);
    arbre.setDensite(30);
    arbre.setHauteur(28);
    //Enfin on ajoute l’objet au paysage
    paysage.ajouterObjetGraphique(arbre);


    //Le prototype est cloné
    arbre = catalogue.getProtopypeArbre();
    //Puis on change les attributs que l’on souhaite
    arbre.setCouleurTronc("Marron");
    arbre.setCoordonnee(222, 39);
    arbre.setDensite(42);
    arbre.setHauteur(59);
    //Enfin on ajoute l’objet au paysage
    paysage.ajouterObjetGraphique(arbre);

    //Le prototype est cloné
    banc = catalogue.getProtopypeBanc();
    //Puis on change les attributs que l’on souhaite
    banc.setCoordonnee(228,29);
    banc.setCouleur("Rouge");
    banc.setLargeur(3);
    //Enfin on ajoute l’objet au paysage
    paysage.ajouterObjetGraphique(banc);

    //Le prototype est cloné
    immeuble = catalogue.getPrototypeImmeuble();
    //Puis on change les attributs que l’on souhaite
    immeuble.setCoordonnee(28,328);
    immeuble.setCouleur("Blanc");
    immeuble.setHauteurEtage(8);
    immeuble.setNbrEtages(22);
    //Enfin on ajoute l’objet au paysage
    paysage.ajouterObjetGraphique(immeuble);

    paysage.afficherPaysage();
  }

}

