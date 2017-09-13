
public class Pratos {
	
	private String nome;
	private String descricao;
	private double preco;
	
	
	//MÉTODO CONSTRUTOR
	
	public Pratos(String nome, double preco){
		
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	
	
	//GETTERS
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	//SETTERS
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}
	
	
	

}
