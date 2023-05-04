import java.util.HashMap;

public class Recepcionista extends Funcionario {
	
	private HashMap<String,String> horarioTrabalho;
	
	public Recepcionista() {
		horarioTrabalho = new HashMap<String,String>();
	}

	public HashMap<String, String> getHorarioTrabalho() {
		return horarioTrabalho;
	}

	public void setHorarioTrabalho(HashMap<String, String> horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}
	
	public void addHorarioTrabalho(String dia,String hora) {
		horarioTrabalho.put(dia, hora);
	}
}
