package onebill;

public class child extends parent {
	int z,a,b,c,d;
		child(int x,int y,int z)
		{
			super(x,y);
			this.z=z;
			System.out.println("2");
		}
		child(int x,int y,int z,int a,int b)
		{
			this(x,y,z);
			this.a=a;
			this.b=b;
			System.out.println("3");
		}
		child(int x,int y,int z,int a,int b,int c,int d)
		{
			this(x,y,z,a,b);
			this.c=c;
			this.d=d;
			System.out.println("4");
		}
}
