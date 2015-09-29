/*
 * Champignon.java
 * SAUNIER DEBES Brice
 * 29/09/15
 */

package decorateurPizza;

public class Champignon
    extends DecorateurPizza {
  public Champignon(Pizza pizza) {
    super(pizza);
  }

  public double calculePrix() {
    return 0.50 + super.calculePrix();
  }

  public String afficheDescription() {
    return super.afficheDescription() + ", Champignons ";
  }
}
