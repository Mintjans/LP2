import java.util.Date;
import java.util.HashMap;

/**
 * Classe Aluno guarda o nome do aluno (String) e os horários de treinamento. 
 * <br>
 * Seguir com o comentário ....
 * @author João Carlos
 * @version 1.0
 *
 */
public class Aluno {
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private HashMap<String,String> horarios;
	
	/**
	 * Método construtor que inicializa os horários.
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
	 * Método responsável por armazenar hora e atividade de cada aluno.
	 * 
	 * @param hora
	 * @param atividade
	 */
	public void gerarAtividade(String hora,String atividade){
		horarios.put(hora, atividade);
	}
	
}
