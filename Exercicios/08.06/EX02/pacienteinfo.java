package Class0806;

public class pacienteinfo {

	public static void main(String[] args) {

		paciente[] info = new paciente [2];
		
		info[0] = new paciente ("Ana","Est�vel","Diabetes",18);
		info[1] = new paciente ("Flobis","Saud�vel","Nenhum",20);
		
		for(paciente ablue:info)
		{
			ablue.imprimir();
		}
	}

}
