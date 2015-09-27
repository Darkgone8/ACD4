/*
 * RegisterWindow.java
 * SAUNIER DEBES Brice
 * TP1 AC4
 * 16/09/15
 */

package registerWindow;

public class RegisterWindow {
  private volatile static RegisterWindow instance;
  private                 String         registerName;

  private RegisterWindow() {
    System.out.println("Instantiation du RegisterWindow");
    this.registerName = "Ceci est le nom du registerWindow";
  }

  public static synchronized RegisterWindow getInstance() {
    if (instance == null) {
      synchronized (RegisterWindow.class) {
        if (instance == null) {
          System.out.println("Création du RegisterWindow");
          instance = new RegisterWindow();
        }
      }
    }
    return instance;
  }
}
