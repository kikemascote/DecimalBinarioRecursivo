package app;

public class Convert {
	
	public static String toBinary(int n){
		if (n<1) {
			return "";
		}else{
			return toBinary(n/2)+n%2;
		}
	}
}
