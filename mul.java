package ss;
public class mul {
	int arg1=10;
	int arg2=20;
	int arg3=30;
	public mul(int a, int b, int c)
	{
		System.out.println("inside constructor");
		this.arg1=a;
		this.arg2=b;
		this.arg2=c;
	}
	public int mul()
	{
		System.out.println("mul method");

		return arg1*arg2*arg3;
	


	}
	public static void main(String[] args){
		mul obj=new mul(10,20,30);
		System.out.println("output of multiplicationtion" +obj.mul());
	}
}

