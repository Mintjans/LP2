import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class NatalFitness {

	public static void main(String[] args) throws ParseException {
		
		BancoDados bd = new BancoDados();
		
		Recepcionista r1 = new Recepcionista();
		r1.setMatricula("001");
		r1.setNome("Madona");
		r1.addHorarioTrabalho("Segunda", "07:00");
		r1.addHorarioTrabalho("Terça", "15:00");
		
		Recepcionista r2 = new Recepcionista();
		r2.setMatricula("002");
		r2.setNome("Lady Gaga");
		r2.addHorarioTrabalho("Quarta", "12:00");
		r2.addHorarioTrabalho("Sexta", "12:00");
		
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		Aluno a1 = new Aluno();
		a1.setNome("Neymar");
		a1.setCpf("584.659.745-62");
		
		dt = formato.parse("05-02-1992");
		a1.setDataNascimento(dt);
		
		a1.gerarAtividade("10:00", "Hipertrofia");
		a1.gerarAtividade("11:00", "Ergometria");
		
		Aluno a2 = new Aluno();
		a2.setNome("Marta");
		a2.setCpf("234.897.954-78");
		
		dt = formato.parse("19-02-1986");
		a2.setDataNascimento(dt);
		
		a2.gerarAtividade("07:00", "Nado Livre");
		a2.gerarAtividade("08:00", "Nado de Costas");
		a2.gerarAtividade("09:00", "Nado Borboleta");
		
		Professor f3 = new Professor();
		f3.setMatricula("003");
		f3.setNome("Popeye");
		f3.setTipo("Musculação");
		f3.addAluno(a1);
		
		Professor f4 = new Professor();
		f4.setMatricula("004");
		f4.setNome("Phelps");
		f4.setTipo("Natação");
		f4.addAluno(a2);
		
		bd.addFuncionario(r1);
		bd.addFuncionario(r2);
		bd.addFuncionario(f3);
		bd.addFuncionario(f4);
		
		// Relatórios
		bd.imprimirFuncionarios();
		bd.imprimirAtividades();
		bd.imprimirRecepcionistas();
		bd.imprimirAlunos();
	}
}
