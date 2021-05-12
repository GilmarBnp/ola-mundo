package Módulo3;

public class carroInterface implements MeioLocomocao {
	private String modelo;
	private String cor;
	private Integer ano;
	private Integer velocidade;
	public void Carro() {//é preciso criar um construtor ou então setar o valor da velocidade com carro.setVelocidade(0), se não vai ficar como nulo e vai dar erro ao compilar
		velocidade = 0;
	}
	public void acelerar() {
		velocidade = velocidade + 5;
		System.out.println("Aceleração do carro");
	}

	public void frear() {
		if (velocidade > 0) {
			velocidade = velocidade - 5;
		}
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public Integer getVelocidade() {
		return velocidade;
	}
	
	public Integer setVelocidade() {
		return velocidade;
	}


}
