/*
 * testRegisterWindow.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */


import registerWindow.RegisterWindow;

public class testRegisterWindow {
  public static void main(String[] args) {
    RegisterWindow rw = null;

    //Instanciation d’un register window
    System.out.println(rw.getInstance());
    //Verification que l’on récupère la même instance que celle instaciée lors du dernier appel de la fonction
    System.out.println(rw.getInstance());
  }
}
