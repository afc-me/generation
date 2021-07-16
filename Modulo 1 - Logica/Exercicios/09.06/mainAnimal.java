package Herança_0906;

public class mainAnimal {

	public static void main(String[] args) {
		
		cachorro[] auau = new cachorro[2];
		cavalo[] cowboy = new cavalo[2];
		preguica[] soninho = new preguica[2];
		
		auau [0] = new cachorro("Rex",4,"",""); 
		auau [1] = new cachorro("Lola",10,"",""); 
		
		cowboy[0] = new cavalo ("Carlos",14,"","");
		cowboy[1] = new cavalo ("Monky",7,"","");
		
		soninho[0] = new preguica("Marlo",12,"","");
		soninho[1] = new preguica("Linda",16,"","");
		
		for(cachorro oi: auau) {
			oi.imprimir();
			oi.somdoanimal();
		}
		
		for(cavalo sela: cowboy)
		{
			sela.imprimir();
			sela.somdoanimal();
		}
		
		for(preguica ronco: soninho)
		{
			ronco.imprimir();
			ronco.somdoanimal();
		}
		
		
		

	}

}
