package lab4_b1;

public class gddat extends gd {
    private String loaidat;
    public gddat(){
        super();
    }
    public gddat(String loaidat){
        super();
        this.loaidat=loaidat;
    }
    String getLoaidat(){
        return loaidat;
    }
    void setLoaidat(String loaidat){
        this.loaidat=loaidat;
    }
    @Override
    public void nhap(){     
        System.out.println("Nhập loại đất (a/b/c)");
        loaidat=sc.nextLine();
        super.nhap();
        
    }
    @Override
    public String toString(){
        return super.toString()+"Loại nhà:"+getLoaidat();
                
    }
    
}
