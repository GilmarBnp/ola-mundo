package entidades;

import java.util.Date;

public class Professor extends Pessoa {

	private Date dataAdmiss�o;
	
	
	public Date getDataAdmiss�o() {
		return dataAdmiss�o;
	}
	public void setDataAdmiss�o(Date dataAdmiss�o) {
		this.dataAdmiss�o = dataAdmiss�o;
	}
	
	public String informaTipo() {
		return "Meu tipo � Professor";
	}
	
	

}
