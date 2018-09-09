class Cliente{
	String nome;
	String sobrenome;
	String cpf;
}
class Conta{
	
	//dados principais
	String dono;
	double saldo;	
	double limite;
	Cliente titular = new Cliente();
	///... outros atributos...
	boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	//...outros atributos e métodos..
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
		//transferencia
	boolean transfere(Conta destino, double valor){
		boolean retirou == this.saca(valor);
		if (retirou == false){
			//não foi sacado
			return false
		}
		else{
			destino.deposita(valor);
			return true
		}
	}
}