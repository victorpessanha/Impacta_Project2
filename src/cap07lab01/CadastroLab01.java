package cap07lab01;

public class CadastroLab01 {
	private String nome;
	private String sobrenome;
	private int idade;
	
	public CadastroLab01() {
		
	}
	
	public CadastroLab01(String nome, String sobrenome) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}
		
	public CadastroLab01(String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}
	
	public void mostrar() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sobrenome: " + this.getSobrenome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println();
	}
		
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
