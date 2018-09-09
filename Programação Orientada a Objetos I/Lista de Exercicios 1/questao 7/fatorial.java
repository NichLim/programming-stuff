public class fatorial{
	public static void main(String[]args){
	int i;
	double fat = 1;
	for (i = 0; i < 30; i++){
		fat = fat*(i+1);
		System.out.println(fat);
		}
	}
	//O tipo de variável int chega ao limite de caracteres que ela suporta
	//uma solução seria mudar o tipo de variável que guarda esse valor por uma de tipo double
}
