 class Student{
	
	public static void main(String[] args) {
		
		float Floaty=96.41f;
		int IntegerToFloat=(int)Floaty;
		
		System.out.println("Floaty before typecasting:"+Floaty);
		System.out.println("Floaty after typecasting"+IntegerToFloat);
		
		
		
		double Doubley = 12345.6789;
		long DoubleTOLong = (long)Doubley;
		
		System.out.println("Doubley before typecasting"+Doubley);
		System.out.println("Doubley after typecasting"+DoubleTOLong);
		
		int Num = 65;
		char Character=(char)Num;
		
		System.out.println("Num before typecasting" +Num);
		System.out.println("Num Chnaged to Character" +Character);
		
		int numm=90;
		double newnumm=numm;
		
		System.out.println("numm before implicite typecasting"+numm);
		System.out.println("newnumm converted from int to double is"+newnumm);
		
		
		char letter = 'A';
		int number=(int)letter;
		
		System.out.println("letter for typecasting is"+letter);
		System.out.println("The ascii value of letter-A is"+number);
		
		
		int ascii = 65;
		char letterchr=(char)ascii;
		
		System.out.println("letter for ascii value is"+letterchr);
		
		long big=10000l;
		double value=(double)big;
		
		System.out.println("long to double is:"+value);
		
		
		double decimalno=12000.2336;
		long longnum=(long)decimalno;
		
		System.out.println("double to long is:"+longnum);
		
//		Operators
		int a=10;
		int b=20;
		
		int sum=a+b;
		int sub=a-b;
		int div=a/b;
		int module=a%b;
		int mul=a*b;
		
		System.out.println("Sum of a and b is:" +sum);
		System.out.println("Sub of a and b is:" +sub);
		System.out.println("Div of a and b is:" +div);
		System.out.println("Module of a and b is:" +module);
		System.out.println("Mul of a and b is:" +mul);
		
		
		System.out.println(++a);
		System.out.println(a + b++ + ++a + ++b);
		
		int x=10;
		
		System.out.println((x++ + ++x - x--));	
		System.out.println((x-- - --x + x++));
		
//		Area of circle
		int r=5;
		float p=3.14f*r*r;
		System.out.println(p);
		
//		Area of Triangle
		
		int side=4;
		int AreaT=side*side*side;
		
		System.out.println(AreaT);
		
		}
	
	
	
	
	
	
 }
 
 