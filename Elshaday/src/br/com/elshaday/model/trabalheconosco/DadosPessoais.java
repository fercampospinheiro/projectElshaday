package br.com.elshaday.model.trabalheconosco;

import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="tb_dados_pessoais")
@NamedQuery(name="DadosPessoais.list",query="SELECT dp FROM DadosPessoais dp")
public class DadosPessoais {

	@Id@GeneratedValue
	private Long id;
	private String email;
	private String nome;
	private String nacionalidade;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	private String estadoCivil;
	private char sexo;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="telefone_id")
	private Telefone telefone;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Experiencia> experiencia;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Formacao> formacao;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Cursos> cursos;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="letter_id")
	private Apresentacao letter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public List<Formacao> getFormacao() {
		return formacao;
	}

	public void setFormacao(List<Formacao> formacao) {
		this.formacao = formacao;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}

	public Apresentacao getLetter() {
		return letter;
	}

	public void setLetter(Apresentacao letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "DadosPessoais [id=" + id + ", email=" + email + ", nome="
				+ nome + ", nacionalidade=" + nacionalidade
				+ ", dataNascimento=" + dataNascimento + ", estadoCivil="
				+ estadoCivil + ", sexo=" + sexo + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", experiencia=" + experiencia
				+ ", formacao=" + formacao + ", cursos=" + cursos + ", letter="
				+ letter + "]";
	}
	
	

	
	
}
