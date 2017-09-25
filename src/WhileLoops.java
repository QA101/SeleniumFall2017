package src;

public class WhileLoops {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 5, 10, 15};
		System.out.println(NotFoundInArray(input, 20));
		System.out.println(NotFoundInString("Find me in this string", 's'));
		
		//alternately, you can use the built in string functions
		System.out.println("Find me in this string".contains("s"));
	}
	
	public static void CountTo200(){
		int i = 0;
		while( i < 200){
			System.out.println(i);
		}
	}
	
	public static int NotFoundInArray(int[] MyArray, int FindMe){
		int location = 0;
		Boolean Found = false;
		while(location < MyArray.length && Found == false){
			if (MyArray[location] == FindMe){
				Found = true;
				break;
			}
			location ++;
		}
		if (Found){
			return location;
		}
		else{
			return -1;
		}
	}
	
	public static int NotFoundInString(String MyString, char FindMe){
		int location = 0;
		Boolean Found = false;
		while(location < MyString.length() && Found == false){
			if (MyString.charAt(location) == FindMe){
				Found = true;
				break;
			}
			location ++;
		}
		if (Found){
			return location;
		}
		else{
			return -1;
		}
	}

}
