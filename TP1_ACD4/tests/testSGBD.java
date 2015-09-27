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
    SGBD sgbdMySQL = new SGBDMySQL();
    SGBD sgbdOracle = new SGBDOracle();

    sgbdMySQL.nouvelleConnexion("root", "root");
    sgbdMySQL.nouvelleConnexion("admin", "admin");
    sgbdMySQL.nouvelleConnexion("Django", "123456");

    for (Connexion connexion : sgbdMySQL.getConnexions())
      connexion.getDescription();

    sgbdOracle.nouvelleConnexion("tsrn", "0128");
    sgbdOracle.nouvelleConnexion("directeur", "IER");

    for (Connexion connexion : sgbdOracle.getConnexions())
      connexion.getDescription();
  }

}
