package atvVeV;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	
	public Pessoa(String nome, String cpf, String rg) {
		this.nome=nome;
		this.cpf=cpf;
		this.rg=rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getRG() {
		return rg;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf=cpf;
	}
	
	public void setRG(String rg) {
		this.rg=rg;
	}
	
	//Returns the String representation of the Person object
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome+ ", CPF=" + cpf + ", RG"+ rg +"]";
    }

}
