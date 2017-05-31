package www.test.com;

public class SwitchTo {

	public static void main(String[] args) {
		int i =getValue(2);
		System.out.println(i);
	}
	
	public static int getValue(int i){
		int result=0;
		switch(i){
		case 1:
			result=result+1;
		case 2:
			result=result+i*2;
		case 3:
			result=result+i*3;
		}
		return result;
	}
}
