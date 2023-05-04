import java.util.HashSet;

public class Professor extends Funcionario {
	
	private String tipo;
	private HashSet<Aluno> alunos;
	
	public Professor(){
		alunos = new HashSet<Aluno>();
	}

	public HashSet<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(HashSet<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}
}
