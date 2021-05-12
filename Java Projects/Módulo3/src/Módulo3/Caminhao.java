package Módulo3;

public class Caminhao implements MeioLocomocao {//quem dá implements é obrigado a usar os métodos da interface, no caso aqui do "MeioLocomocao"
	private String chassi;
	private String modelo;
	private Integer eixos;
	private Integer velocidade;
	
	public void acelerar() {
	velocidade = velocidade + 2;	
	}
	
	public void frear() {
	if(velocidade > 0) {
		velocidade = velocidade - 2;
	}
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getEixos() {
		return eixos;
	}
	public void setEixos(Integer eixos) {
		this.eixos = eixos;
	}
	public Integer getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	
}
	
	



