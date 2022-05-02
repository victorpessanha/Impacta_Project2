package cap05lab02;

public class Garagem {
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();

	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.modelo = "Palio";
		g.carroPasseio.cor = "Verde";
		g.carroPasseio.potencia = 1.0;
		
		g.carroUtilitario.modelo = "Saveiro";
		g.carroUtilitario.cor = "Branco";
		g.carroUtilitario.potencia = 2.0;
		
		System.out.println("Carro Passeio:");
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Potencia: " + g.carroPasseio.potencia);
		System.out.println();
		System.out.println("Carro Utilitario:");
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Potencia: " + g.carroUtilitario.potencia);
	}

}
