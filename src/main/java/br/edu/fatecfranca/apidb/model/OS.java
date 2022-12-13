package br.edu.fatecfranca.apidb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//informe que a cclasse é uma entidade do banco de dados
@Entity
//Informe que a classe OS é uma tabela OS
@Table(name="OS")
public class OS {
	
    //cria uma variável que é uma chve primaria com
	//conteúdo gerado automaticamente com iincremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="documento")
	private String documento;
	
	@Column(name="cep")
    private String cep;
	@Column(name="uf")
    private String uf;
	@Column(name="cidade")
    private String cidade;
	@Column(name="bairro")
    private String bairro;
	@Column(name="rua")
    private String rua;
	@Column(name="numero")
    private int numero;
	
	@Column(name="telefone")
	private int telefone;
	
	@Column(name="nomeativo")
    private String nomeativo;
    @Column(name="marcaativo")
    private String marcaativo;
    @Column(name="servico")
    private String servico;
    @Column(name="custo")
    private float custo;
    @Column(name="obs")
    private String obs;
    
    @Column(name="status")
    private String status;
    
    
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getNomeativo() {
        return nomeativo;
    }
    public void setNomeativo(String nomeativo) {
        this.nomeativo = nomeativo;
    }
    public String getMarcaativo() {
        return marcaativo;
    }
    public void setMarcaativo(String marcaativo) {
        this.marcaativo = marcaativo;
    }
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public OS(Long id, String nome, String documento, String cep, String uf, String cidade, String bairro, String rua,
            int numero, int telefone, String nomeativo, String marcaativo, String servico, int custo, String obs, String status) {
        super();
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.telefone = telefone;
        this.nomeativo = nomeativo;
        this.marcaativo = marcaativo;
        this.servico = servico;
        this.custo = custo;
        this.obs = obs;
        this.status = status;
    }
	public OS() {
		super();
	}
	@Override
    public String toString() {
        return "OS [id=" + id + ", nome=" + nome + ", documento=" + documento + ", cep=" + cep + ", uf=" + uf
                + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + ", telefone="
                + telefone + ", nomeativo=" + nomeativo + ", marcaativo=" + marcaativo + ", servico=" + servico
                + ", custo=" + custo + ", obs=" + obs + ", status=" + status + "]";
    }
    
	
}