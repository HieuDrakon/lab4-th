package lab4_b1;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public void list() {
        ArrayList<gddat> arrgddat= new ArrayList<>();
        ArrayList<gdnha> arrgdnha= new ArrayList<>();
        int sogddat=0 ,sogdnha=0;
        long tongtiengddat=0,tbthanhtien=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số GD đất: ");
        sogddat =sc.nextInt();
        System.out.println("Nhập số GD nhà: ");
        sogdnha =sc.nextInt();
        
        System.out.println("Nhập thông tin GD đất : ");
        for(int i=0 ; i< sogddat ;i++){
            System.out.println("Nhập số GD đất lần thứ : "+i+1);
            gddat gddat=new gddat();
            gddat.nhap();
            arrgddat.add(gddat);
        }
        System.out.println("Nhập thông tin GD nhà : ");
        for(int i=0 ; i< sogdnha ;i++){
            System.out.println("Nhập số GD đất lần thứ : "+i+1);
            gdnha gdnha=new gdnha();
            gdnha.nhap();
            arrgdnha.add(gdnha);
        }
        System.out.println("thông tin GD đất : ");
        for(int i=0;i<arrgddat.size();i++){
            System.out.println(arrgddat.get(i).toString());
        }
        System.out.println("thông tin GD nhà : ");
        for(int i=0;i<arrgdnha.size();i++){
            System.out.println(arrgdnha.get(i).toString());
        }
        for(int i=0;i<arrgddat.size();i++){
            if(arrgddat.get(i).getLoaidat().equalsIgnoreCase("a")){
                tongtiengddat+=arrgddat.get(i).getDt()*arrgddat.get(i).getDg()*1.5;
            }
            else if(arrgddat.get(i).getLoaidat().equalsIgnoreCase("b")||arrgddat.get(i).getLoaidat().equalsIgnoreCase("c")){
                tongtiengddat+=arrgddat.get(i).getDt()*arrgddat.get(i).getDg();
            } 
        }
        tbthanhtien =tongtiengddat/arrgddat.size();
        System.out.println("trung bình thành tiền GD đất : "+tbthanhtien);
        System.out.println("các gd đất trong tháng 9/2013 : ");
        for(int i=0;i<arrgddat.size();i++){
            String[] dategddat=arrgddat.get(i).getNgaygd().split("/");
            if(dategddat[1].equals("9")&&dategddat[2].equals("2013")){
                System.out.println(arrgddat.get(i).toString());
            }
        }
        System.out.println("các gd đất trong tháng 9/2013 : ");
        for(int i=0;i<arrgdnha.size();i++){
            String[] dategdnha=arrgdnha.get(i).getNgaygd().split("/");
            if(dategdnha[1].equals("9")&&dategdnha[2].equals("2013")){
                System.out.println(arrgdnha.get(i).toString());
            }
        }
}
}
