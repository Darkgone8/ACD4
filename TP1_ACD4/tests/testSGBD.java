/*
 * testSGBD.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */


import connexion.Connexion;
import connexion.SGBD;
import connexion.SGBDMySQL;
import connexion.SGBDOracle;

public class testSGBD {
  public static void main(String[] args) {
    //Création d’un SGBD concret de chaque type
    SGBD sgbdMySQL = new SGBDMySQL();
    SGBD sgbdOracle = new SGBDOracle();

    //Création de trois nouvelles connexions de type MySQL stockées dans le SGBD adéquat
    sgbdMySQL.nouvelleConnexion("root", "root");
    sgbdMySQL.nouvelleConnexion("admin", "admin");
    sgbdMySQL.nouvelleConnexion("Django", "123456");

    //Affichage de chaque connexion de type MySQL
    for (Connexion connexion : sgbdMySQL.getConnexions())
      connexion.getDescription();

    //Création de deux nouvelles connexions de type Oracle stockées dans le SGBD adéquat
    sgbdOracle.nouvelleConnexion("tsrn", "0128");
    sgbdOracle.nouvelleConnexion("directeur", "IER");

    //Affichage de chaque connexion de type Oracle
    for (Connexion connexion : sgbdOracle.getConnexions())
      connexion.getDescription();
  }

}
