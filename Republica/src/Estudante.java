
public class Estudante {
	String nome;
	String email;
	float rendimentos;
	
	public Estudante(String nome, String email, float rendimentos) {
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	}

	public float getRendimentos() {
		return rendimentos;
	}

	public String getNome() {
		return nome;
	}
	
}
