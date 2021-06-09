package Class0806;

public class pacienteinfo {

	public static void main(String[] args) {

		paciente[] info = new paciente [2];
		
		info[0] = new paciente ("Ana","Estável","Diabetes",18);
		info[1] = new paciente ("Flobis","Saudável","Nenhum",20);
		
		for(paciente ablue:info)
		{
			ablue.imprimir();
		}
	}

}
