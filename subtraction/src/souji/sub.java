package souji;

public class sub {
	int arg1=3;
	int arg2=2;
	public sub(int a, int b)
	{
		System.out.println("inside constructor");
		this.arg1=a;
		this.arg2=b;
	}
	public int sub()
	{
		System.out.println("sub method");
		return arg1-arg2;

	}
	public static void main(String[] args){
		sub obj=new sub(100,50);
		System.out.println("output of subtraction" +obj.sub());
	}


}
