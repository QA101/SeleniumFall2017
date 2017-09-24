package Main;

public class InfiniteLoops {

	public static void main(String[] args) {
		for (int i = 0; i< 1; i++){
			System.out.println(i);
			i--;
		}
		
		while(true){
			System.out.println("infinite");
		}

	}

}
