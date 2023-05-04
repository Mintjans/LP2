import java.util.Date;
import java.util.HashMap;

/**
 * Classe Aluno guarda o nome do aluno (String) e os hor�rios de treinamento. 
 * <br>
 * Seguir com o coment�rio ....
 * @author Jo�o Carlos
 * @version 1.0
 *
 */
public class Aluno {
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private HashMap<String,String> horarios;
	
	/**
	 * M�todo construtor que inicializa os hor�rios.
	 */
	public Aluno(){
		horarios = new HashMap<String,String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String, String> getHorarios() {
		return horarios;
	}

	public void setHorarios(HashMap<String, String> horarios) {
		this.horarios = horarios;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * M�todo respons�vel por armazenar hora e atividade de cada aluno.
	 * 
	 * @param hora
	 * @param atividade
	 */
	public void gerarAtividade(String hora,String atividade){
		horarios.put(hora, atividade);
	}
	
}
