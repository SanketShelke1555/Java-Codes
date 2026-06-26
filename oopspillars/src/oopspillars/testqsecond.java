package oopspillars;

interface A {
    public void showA();
}


interface B {
    public void showB();
}


class C implements A, B {

    public void showA() {
        System.out.println("This is showA from Interface A");
    }

    public void showB() {
        System.out.println("This is showB from Interface B");
    }
}

public class testqsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  C obj = new C();
	        obj.showA();
	        obj.showB();
	}

}
