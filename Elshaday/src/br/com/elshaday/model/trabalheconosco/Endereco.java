package br.com.elshaday.model.trabalheconosco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity()
@Table(name="tb_endereco")
@NamedQuery(name="Endereco.list", query="SELECT e FROM Endereco e")
public class Endereco {

	@Id@GeneratedValue
	private Long id;
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String cep;
	private String bairro;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", pais=" + pais + ", estado=" + estado
				+ ", cidade=" + cidade + ", rua=" + logradouro + ", cep=" + cep
				+ ", bairro=" + bairro + "]";
	}
		
}
