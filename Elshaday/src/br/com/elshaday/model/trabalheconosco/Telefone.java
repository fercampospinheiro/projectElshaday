package br.com.elshaday.model.trabalheconosco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="tb_telefone")
@NamedQuery(name="Telefone.list", query="SELECT t FROM Telefone t")
public class Telefone {
	
	@Id@GeneratedValue
	private Long id;
	private String residencial;
	private String celular;
	private String falarCom;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResidencial() {
		return residencial;
	}
	public void setResidencial(String residencial) {
		this.residencial = residencial;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFalarCom() {
		return falarCom;
	}
	public void setFalarCom(String falarCom) {
		this.falarCom = falarCom;
	}
	@Override
	public String toString() {
		return "Telefone [id=" + id + ", residencial=" + residencial
				+ ", celular=" + celular + ", falarCom=" + falarCom + "]";
	}
	
	
	
}
