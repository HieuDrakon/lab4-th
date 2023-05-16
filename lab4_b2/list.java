
package lab4_b2;

import java.util.ArrayList;
import java.util.Scanner;


public class list {
    public void list(){
    ArrayList<khvn> arrkhvn= new ArrayList<>();
    ArrayList<khnn> arrkhnn= new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    long tongtien,ttbtongtienkhnn;
    int slkhvn,slkhnn;
    System.out.println("nhập số lượng khách vn");
    slkhvn=sc.nextInt();
    for(int i=0;i<slkhvn;i++){
        System.out.println("KH thứ: "+i+1);
        khvn vn=new khvn();
        vn.nhap();
        arrkhvn.add(vn);
    }
    System.out.println("nhập số lượng khách nước ngoài");
    slkhnn=sc.nextInt();
    for(int i=0;i<slkhnn;i++){
        System.out.println("KH thứ: "+i+1);
        khnn nn=new khnn();
        nn.nhap();
        arrkhnn.add(nn);
    }
    System.out.println("thông tin KH vn:");
    for(int i=0;i<arrkhvn.size();i++){
        System.out.println(arrkhvn.get(i).toString());
    }
    System.out.println("thông tin KH nước ngoài:");
    for(int i=0;i<arrkhnn.size();i++){
        System.out.println(arrkhnn.get(i).toString());
    }
    for(int i=0;i<arrkhvn.size();i++){
        if(sl < dm){
            
        }
    }
}
}