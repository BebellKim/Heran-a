package Herança;

public class Pessoa_Juridica extends Pessoa {
	
private String cnpj;
	
	public Pessoa_Juridica (String nome, String telefone, String cnpj) {
		super (nome, telefone); // herdando os atributos da super class
	    this.cnpj = cnpj;
	}
	public String getCnpj () {
		return cnpj;
	}
	public void  setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}

}
