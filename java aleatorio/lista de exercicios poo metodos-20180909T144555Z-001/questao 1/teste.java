
class teste{
	public static void main(String[]args){

		//Criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		//Alterando os valores de minhaConta
		minhaConta.dono = "Nicholas";
		minhaConta.saldo = 1000;
		// Saque 200 reais
		minhaConta.saca(200);
		//Deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
		//Valor que deve ser exibido: 1300.00
	}
	/////////////////////////////////////GoodJob GabrielJulio
}