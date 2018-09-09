public class parimpar{

	public static void main(String[] args){
		
		int x = 13;
		while (x != 1){
			if (x%2 == 0) {
				System.out.print(x +" > ");
				x = x / 2;
			}else{
			System.out.print(x +" > ");
			x = 3*x + 1;
			}
		}
		System.out.print(x);
	}
}