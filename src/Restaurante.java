
public class Restaurante {

	static Pratos prato1 = new Pratos ("Costelinha", 40);
	static Pratos prato2 = new Pratos ("Lasanha", 45);
	static Pratos prato3 = new Pratos ("Fondue", 55);
	
	
	public static void mostrarCardapio(){
		
		System.out.println("Cardápio: \n");
		
		System.out.println(prato1.getNome()+": R$ "+ prato1.getPreco());
		prato1.setDescricao("Costelinha de porco ao molho barbecue");
		System.out.println("Costelinha de porco ao molho barbecue\n");
		
		System.out.println(prato2.getNome()+": R$ "+prato2.getPreco());
		prato2.setDescricao("Lasanha de carne com presunto e queijo");
		System.out.println("Lasanha de carne com presunto e queijo\n");
		
		System.out.println(prato3.getNome()+": R$ "+ prato3.getPreco());
		prato3.setDescricao("Fondue de carne com molho de queijo e fondue frutas com calda de chocolate");
		System.out.println("Fondue de carne com molho de queijo e fondue frutas com calda de chocolate\n");
		
		
	}
	
	
	
	
}
