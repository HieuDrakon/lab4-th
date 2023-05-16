package lab4_b2;

import java.util.Scanner;
public class khnn extends kh {
    private String qt;
    public khnn(){
        super();
    }
    public khnn(String qt){
        super();
        this.qt=qt;
    }
    String getQt(){
        return qt;
    }
    void setQt(String qt){
        this.qt=qt;
    }
    @Override
    void nhap(){
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập quốc tịch; ");
        qt=sc.nextLine();      
    }
    @Override
    public String toString(){
        return super.toString()+ "quốc tịch: "+getQt();   
    }   
}

