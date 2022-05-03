package cap07lab01;

public class Cap7_Lab1 {

	public static void main(String[] args) {
		CadastroLab01 cadastro1 = new CadastroLab01();
		CadastroLab01 cadastro2 = new CadastroLab01("Victor", "Pessanha");
		CadastroLab01 cadastro3 = new CadastroLab01("Victor", "Pessanha", 41);
		
		cadastro1.mostrar();
		cadastro2.mostrar();
		cadastro3.mostrar();

	}

}
