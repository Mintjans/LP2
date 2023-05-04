import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe responsável por armazenar os dados da academia.
 * @author João Carlos
 *
 */
public class BancoDados {
	
	private ArrayList<Funcionario> funcionarios;
	
	public BancoDados() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void addFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	
	public void removeFuncionario(Funcionario f) {
		funcionarios.remove(f);
	}

	/**
	 * Método que lista todos os funcionários da academia. 
	 */
	public void imprimirFuncionarios() {
		System.out.println("#################### Funcionários ########################################");
		for (Funcionario f : funcionarios) {
			if (f instanceof Professor) {
				System.out.println("Matrícula: " + f.getMatricula() + " Nome.: " + f.getNome() + 
						"\tTipo.: " + f.getClass() + " [" + ((Professor)f).getTipo() + "]");
			}
			else {
				System.out.println("Matrícula: " + f.getMatricula() + " Nome.: " + f.getNome() + 
						"\tTipo.: " + f.getClass());				
			}
		}
		System.out.println("##########################################################################");
		System.out.println("");
	}
	
	/**
	 * Método que lista as atividades dos alunos.
	 */
	public void imprimirAtividades() {
		System.out.println("#################### Professores #########################################");
		for (Funcionario f : funcionarios) {
			if (f instanceof Professor){
				System.out.println("Professor [" + f.getNome() + "]");
				for (Aluno aluno : ((Professor) f).getAlunos()) {
					System.out.println("Aluno >>> " + aluno.getNome() + " " 
							+ aluno.getHorarios());
				}
			}
		}
		System.out.println("##########################################################################");
		System.out.println("");
	}
	
	/**
	 * Método que lista os horários das recepcionistas.
	 */
	public void imprimirRecepcionistas() {
		System.out.println("#################### Recepcionistas ######################################");
		for (Funcionario f : funcionarios) {
			if (f instanceof Recepcionista) {
				System.out.println("Nome.: " + f.getNome() + " " + ((Recepcionista)f).getHorarioTrabalho());
			}
		}
		System.out.println("##########################################################################");
		System.out.println("");
	}

	public void imprimirAlunos() {
		
		System.out.println("########################### Alunos ######################################");
		for (Funcionario f : funcionarios) {
			if (f instanceof Professor){
				for (Aluno aluno : ((Professor) f).getAlunos()) {
					//System.out.println("CPF.: " + aluno.getCpf() + "\tNome.: " + aluno.getNome() + 
					//		"\tIdade.: " + aluno.getDataNascimento());
					
					System.out.println("CPF.: " + aluno.getCpf() + "\tNome.: " + aluno.getNome() + 
									"\tIdade.: " + calcularIdade(aluno.getDataNascimento()));
				}
			}
		}
		System.out.println("##########################################################################");
	}
	
	public Integer calcularIdade(Date d) {
		Date dt = new Date();
		int anoHoje = dt.getYear(); 
		int anoNascimento = d.getYear();
		
		return (anoHoje - anoNascimento);
	}

}
