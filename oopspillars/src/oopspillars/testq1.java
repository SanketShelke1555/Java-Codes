package oopspillars;

class testq1 {

    int rollno;
    String name;
    String city;
    int m1, m2, m3;   

  
    public void setData(int r, String n, String c, int a, int b, int d) {
        rollno = r;
        name = n;
        city = c;
        m1 = a;
        m2 = b;
        m3 = d;
    }

    
    float cP(int totalMarks) {
        int obt = m1 + m2 + m3;
        return (float)obt*100/totalMarks;  
    }

  
    public void showData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Marks: " + m1 + " " + m2 + " " + m3);
    }

    public static void main(String[] args) {

        testq1 san = new testq1();

        san.setData(1, "Sanket", "Pune", 85, 78, 95);

        san.showData();

        float p = san.cP(300);   
        System.out.println("Percentage: " + p + "%");
    }
}
