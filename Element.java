package XML;

public  interface  Element {
	
	ElementXML  getEnfant(int  index);
	ElementXML  getPremierEnfantAvecTag(String  tag);
	int  getNombreEnfants ();
}
