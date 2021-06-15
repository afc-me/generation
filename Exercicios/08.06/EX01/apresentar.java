package Class0806;

public class apresentar {

	public static void main(String[] args) {
		
		cliente[] info = new cliente [2];
		
		info[0] = new cliente ("Ana","Jardins",18);
		info[1] = new cliente ("Flobis","SBC",20);
		
		for(cliente ablue:info)
		{
			ablue.imprimir();
		}


	}

}
