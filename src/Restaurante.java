
public class Restaurante {

	static Pratos prato1 = new Pratos ("Costelinha", 40);
	static Pratos prato2 = new Pratos ("Lasanha", 45);
	static Pratos prato3 = new Pratos ("Fondue", 55);
	
	
	public static void mostrarCardapio(){
		
		System.out.println(prato1.getNome()+": "+ prato1.getPreco());
		prato1.setDescricao("Costelinha de porco ao molho barbecue");
		
		System.out.println(prato2.getNome()+": "+prato2.getPreco());
		prato2.setDescricao("Lasanha de carne com presunto e queijo");
		
		System.out.println(prato3.getNome()+": "+ prato3.getPreco());
		prato3.setDescricao("Fondue de carne com molho de queijo e fondue frutas com calda de chocolate");
		
		
	}
	
	
	
	
}
