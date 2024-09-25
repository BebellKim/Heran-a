package Herança;

public class Pessoa_Fisica extends Pessoa {
	
	private String cpf;
	private String rg;
	
	public Pessoa_Fisica (String nome, String telefone, String cpf, String rg) {
		super (nome, telefone); // herdando os atributos da super class
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf () {
		return cpf;
	}
	public void  setCpf (String cpf) {
		this.cpf = cpf;
	}
	public String getRg () {
		return rg;
	}
	public void  setRg (String rg) {
		this.rg = rg;
	}

}
