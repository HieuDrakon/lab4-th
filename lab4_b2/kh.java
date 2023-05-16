package lab4_b2;

import java.util.Scanner;

public class kh {
    private String makh,hoten,nlhd;
    private long dg;
    private float sl;
    public kh(){
        super();
    }
    public kh(String makh,String hoten,String nlhd,long dg,float sl){
        super();
        this.dg=dg;
        this.hoten=hoten;
        this.makh=makh;
        this.nlhd=nlhd;
        this.sl=sl;
    }
    String getMakh(){
        return makh;
    }
    void setMakh(String makh){
         this.makh=makh;
    }
    String getHoten(){
        return hoten;
    }
    void setHoten(String hoten){
        this.hoten=hoten;
    }
    String getNlhd(){
        return nlhd;
    }
    void setNlhd(String nlhd){
        this.nlhd=nlhd;
    }
    long getDg(){
        return dg;
    }
    void setdg(long dg){
        this.dg=dg;
    }
    float getSl(){
        return sl;
    }
    void setsl(float sl){
        this.sl=sl;
    }
    void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập mã KH");
        makh=sc.nextLine();
        System.out.println("nhập họ tên KH");
        hoten=sc.nextLine();
        System.out.println("nhập ngày lập hóa đơn ");
        nlhd=sc.nextLine();
        System.out.println("nhập đơn giá");
        dg=sc.nextLong();
        System.out.println("nhập số lượng");
        sl=sc.nextFloat();
    }
    @Override
    public String toString(){
        return "mã kh: "+getMakh()+"họ tên: "+getHoten()+"Ngày lập đơn: "+getNlhd()+"đơn giá"+getDg()+"số lượng"+getSl();
    }
}
