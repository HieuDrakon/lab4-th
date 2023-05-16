
package lab4_b2;

import java.util.Scanner;


public class khvn extends kh {
    private String dtkh;
    private int chon;
    private float dm;
    public khvn(){
        super();
    }
    public khvn(String dtkh,float dm){
        super();
        this.dtkh=dtkh;
        this.dm=dm;
    }
    String getDtkh(){
        return dtkh;
    }
    void setdtkh(String dtkh){
        this.dtkh=dtkh;
    }
    float getDm(){
        return dm;
    }
    void setDm(float dm){
        dm=100;
        this.dm=dm;
    }
    @Override
    void nhap(){
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập mã đối tượng khách hàng");
        chon=sc.nextInt();
        switch(chon){
            case 1:
                dtkh="sinh hoạt";
                break;
            case 2:
                dtkh="kinh doanh";
                break;
            case 3:
                dtkh="sản xuất";
                break;
            default:
                break;
        }
        
    }
    @Override
    public String toString(){
        return super.toString()+ "đối tượng khách hàng : "+getDtkh()+"định mức"+getDm();   
    }   
}
