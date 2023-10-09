package factory;

public class produitfactory {

	public static final int  TYPE_PRODUITA1=1;
	public static final int  TYPE_PRODUITA2=2;
	public static final int  TYPE_PRODUITA3=3;
	
	public produitA getProduitA(int type_produit) {
		
		produitA produitA=null;
		
		
		switch(type_produit) {
		
		case TYPE_PRODUITA1:
			produitA= new produitA1();
		    break;
		case TYPE_PRODUITA2:
			produitA= new produitA2();
		    break;
		    
		case TYPE_PRODUITA3:
			produitA= new produitA3();
		    break;    
		    
		    default : throw new IllegalArgumentException("type de produit inconnu");
		    
		}
		
		
		return produitA;
	}
}
