package www.test.com;

public class Example {
       String str=new String("good");
       char[] ch={'a','b','c'};
       
       public static void main(String[] args) {
		Example ex=new Example();
		ex.change( ex.ch);
		System.out.println(ex.str+" and");
		System.out.println(ex.ch);
	}
       
    public void change(char ch[]){
    	str="test ok";
    	ch[0]='g';
    }
}
