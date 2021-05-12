package entidades;

import java.util.Date;

public class Professor extends Pessoa {

	private Date dataAdmissão;
	
	
	public Date getDataAdmissão() {
		return dataAdmissão;
	}
	public void setDataAdmissão(Date dataAdmissão) {
		this.dataAdmissão = dataAdmissão;
	}
	
	public String informaTipo() {
		return "Meu tipo é Professor";
	}
	
	

}
