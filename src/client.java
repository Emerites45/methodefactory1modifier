import factory.produitfactory;
import factory.produitA;

public class client {

	public client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		produitfactory produitfactory = new produitfactory();
		
		produitA produitA=null;
		
		produitA=produitfactory.getProduitA(produitfactory.TYPE_PRODUITA1);
		produitA.methodeA();
		 
		produitA=produitfactory.getProduitA(produitfactory.TYPE_PRODUITA2);
		produitA.methodeA();
		
		produitA=produitfactory.getProduitA(produitfactory.TYPE_PRODUITA3);
		produitA.methodeA();
		
		produitA=produitfactory.getProduitA(4);
		produitA.methodeA();

	}

}
