
package lab4_b1;

import java.util.Scanner;


public class gd {
    private String magd, ngaygd;
    private long dg;
    private float dt;
    Scanner sc =new Scanner(System.in);
   public gd(){
        super();
    }
    void gd(String magd,String ngaygd,long dg,float dt)
    {
        this.dg=dg;
        this.dt=dt;
        this.magd=magd;
        this.ngaygd=ngaygd;
    }
    String getMagd(){
        return magd;
    }
    void setMagd(String magd){
        this.magd=magd;
    }
    long getDg(){
        return dg;
    }
    void setDg(long dg){
        this.dg=dg;
    }
    String getNgaygd(){
        return ngaygd;
    }
    void setNgaygd(String ngaygd){
        this.ngaygd=ngaygd;
    }
    float getDt(){
        return dt;
    }
    void setDg(float dt){
        this.dt=dt;
    }
    void nhap(){
        System.out.println("Nhập mã gd");
        magd =sc.nextLine();
        System.out.println("Nhập ngày gd");
        ngaygd=sc.nextLine();
        System.out.println("Nhập đơn giá");
        dg=sc.nextLong();
        System.out.println("Nhập diện tích");
        dt= sc.nextFloat();
    }
    @Override
    public String toString(){
       return "Mã GD:"+getMagd()+"Ngày GD(ngày/tháng/năm):"+getNgaygd()+"đơn giá:"+getDg()+"Diện tích:"+getDt(); 
    }
}
