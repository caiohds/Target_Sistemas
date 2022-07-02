public class Faturamentos{
	private String nome;
	private double faturamento;
	
	public Faturamentos(){
		
	}
	public Faturamentos(String nome, double faturamento){
		
		this.nome = nome;
		this.faturamento = faturamento;
	}
	public void setNome(String nome){
	
		this.nome = nome;
	}
	public void setFaturamento(double faturamento){
		
		this.faturamento = faturamento;
	}
	public String getNome(){
	
		return nome;
	}
	public double getFaturamento(){
		
		return faturamento;
	}
}
