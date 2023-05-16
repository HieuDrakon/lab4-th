package lab4_b1;
public class gdnha extends gd {
    private String loainha,diachi;
    private int chon;
    public gdnha(){
        super();
    }
    public gdnha(String loainha,String diachi ){
        super();
        this.loainha=loainha;
        this.diachi=diachi;
    }
    String getLoainha(){
        return loainha;
    }
    void setLoainha(String loainha){
        this.loainha=loainha;
    }
    String getDiachi(){
        return diachi;
    }
    void setDiachi(String diachi){
        this.diachi=diachi;
    }
    void nhap(){
        super.nhap();
        System.out.println("Nhập địa chì");
        diachi=sc.nextLine();
        System.out.println("Nhập Loại nhà (0: cao cấp | 1: thường)");
        chon=sc.nextInt();
        switch(chon){
            case 0:
                loainha ="cao cấp";
                break;
            case 1:
                loainha ="thường";
                break;
            default:
                break;
        }
        
    }
     @Override
    public String toString(){
        return super.toString()+"Loại nhà:"+getLoainha()+"địa chỉ"+getDiachi();
    }
}
