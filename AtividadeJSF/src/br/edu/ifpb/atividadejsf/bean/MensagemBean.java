package br.edu.ifpb.atividadejsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class MensagemBean {
	
	private String mensagem1, mensagem2, auxiliar;
	
	public MensagemBean() {
	
		this.auxiliar = " ";
		this.mensagem1 = " ";
		this.mensagem2 = " ";		
	}
		
	public String getMensagem1() {
		return mensagem1;
	}

	public void setMensagem1(String mensagem1) {
		this.mensagem1 = mensagem1;
	}

	public String getMensagem2() {
		return mensagem2;
	}

	public void setMensagem2(String mensagem2) {
		this.mensagem2 = mensagem2;
	}

	public String getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}

	public String inverterMensagem(){
		
		auxiliar = mensagem1;
		mensagem1 = mensagem2;
		mensagem2 = auxiliar;
		
		return null;
	}

}
