/*
 * testFabriqueInterfaceGraphique.java
 * SAUNIER DEBES Brice
 * 16/09/15
 */


import interfaceGraphique.FabriqueInterfaceGraphique;
import interfaceGraphique.InterfaceGraphiqueIOS;
import interfaceGraphique.InterfaceGraphiqueLinux;
import interfaceGraphique.InterfaceGraphiqueWindows;

public class testFabriqueInterfaceGraphique {
  public static void main(String[] args) {
    FabriqueInterfaceGraphique IGWindows = new InterfaceGraphiqueWindows();
    FabriqueInterfaceGraphique IGLinux = new InterfaceGraphiqueLinux();
    FabriqueInterfaceGraphique IGIOS = new InterfaceGraphiqueIOS();

    IGWindows.creerBarre("rouge", 12);
    IGWindows.creerBouton("bleu", 22, 5);
    IGWindows.creerMenu("jaune", 123);

    IGLinux.creerBarre("rouge", 22);
    IGLinux.creerBouton("noir",89,999);
    IGLinux.creerMenu("blanc", 222222);

    IGIOS.creerBarre("jaune", 012);
    IGIOS.creerBouton("noir", 218, 398);
    IGIOS.creerMenu("bleu", 1789);
  }
}
