public class HonSo{
    private int nguyen,tuSo,mauSo;

    HonSo(){
        nguyen = 0;
        tuSo = 0;
        mauSo = 1;
    }
    HonSo(int tuSo,int mauSo){
        nguyen = 0;
        this.tuSo = tuSo;
        if(mauSo>0) this.mauSo = mauSo;
        else this.mauSo = 1;
    }
    HonSo(int nguyen,int tuSo,int mauSo){
        this.nguyen = nguyen;
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }
    public int getNguyen() {
        return nguyen;
    }

    public void setNguyen(int nguyen) {
        this.nguyen = nguyen;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if(mauSo>0) this.mauSo = mauSo;
        else this.mauSo = 1;
    }
    public String toString() {
        if(nguyen!=0) return nguyen + " nguyên " +tuSo+" phần "+mauSo;
        else if(nguyen==0&&this.tuSo!=0) return tuSo+" phần "+mauSo;
        else return "0";
    }
    private static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    private static int BCNN(int a,int b){
        return (a*b)/USCLN(a,b);
    }
    void HonSangPhan(){
        if(nguyen!=0){
            this.tuSo = this.nguyen * this.mauSo + this.tuSo;
            this.nguyen = 0;
            if(this.tuSo<0) this.tuSo = this.tuSo*-1;
        }
    }
    void PhanSangHon(){
            if(this.nguyen==0){
                this.nguyen = this.tuSo/this.mauSo;
                this.tuSo = this.tuSo%this.mauSo;
                if(this.tuSo<0) this.tuSo = this.tuSo*-1;
            }
    }
    HonSo Cong(HonSo h){
        HonSo t1 = new HonSo(this.nguyen,this.tuSo,this.mauSo);
        t1.HonSangPhan();
        HonSo t2 = new HonSo(h.nguyen,h.tuSo,h.mauSo);
        t2.HonSangPhan();
        HonSo t;
        if(t1.mauSo==t2.mauSo){
            t = new HonSo((t1.tuSo+t2.tuSo),t1.mauSo);
        } else{
            int mau = BCNN(t1.mauSo,t2.mauSo);
            t = new HonSo(((t1.tuSo*(mau/t1.mauSo))+(t2.tuSo*(mau/t2.mauSo))),mau);
        }
        t.PhanSangHon();
        return t;
    }
    HonSo Tru(HonSo h){
        HonSo t1 = new HonSo(this.nguyen,this.tuSo,this.mauSo);
        t1.HonSangPhan();
        HonSo t2 = new HonSo(h.nguyen,h.tuSo,h.mauSo);
        t2.HonSangPhan();
        HonSo t;
        if(t1.mauSo==t2.mauSo){
            t = new HonSo((t1.tuSo-t2.tuSo),t1.mauSo);
        } else{
            int mau = BCNN(t1.mauSo,t2.mauSo);
            t = new HonSo(((t1.tuSo*(mau/t1.mauSo))-(t2.tuSo*(mau/t2.mauSo))),mau);
        }
        t.PhanSangHon();
        return t;
    }
    HonSo Nhan(HonSo h){
        HonSo t1 = new HonSo(this.nguyen,this.tuSo,this.mauSo);
        t1.HonSangPhan();
        HonSo t2 = new HonSo(h.nguyen,h.tuSo,h.mauSo);
        t2.HonSangPhan();
        HonSo t = new HonSo((t1.tuSo*t2.tuSo),(t1.mauSo*t2.mauSo));
        t.PhanSangHon();
        return t;
    }
    HonSo Chia(HonSo h){
        HonSo t1 = new HonSo(this.nguyen,this.tuSo,this.mauSo);
        t1.HonSangPhan();
        HonSo t2 = new HonSo(h.nguyen,h.tuSo,h.mauSo);
        t2.HonSangPhan();
        HonSo t = new HonSo((t1.tuSo*t2.mauSo),(t1.mauSo*t2.tuSo));
        t.PhanSangHon();
        return t;
    }
    String SoSanh(HonSo h){
        HonSo t1 = new HonSo(this.nguyen,this.tuSo,this.mauSo);
        t1.HonSangPhan();
        HonSo t2 = new HonSo(h.nguyen,h.tuSo,h.mauSo);
        t2.HonSangPhan();
        HonSo t;
        if(t1.mauSo==t2.mauSo){
            t = new HonSo((t1.tuSo-t2.tuSo),t1.mauSo);
        } else{
            int mau = BCNN(t1.mauSo,t2.mauSo);
            t = new HonSo(((t1.tuSo*(mau/t1.mauSo))-(t2.tuSo*(mau/t2.mauSo))),mau);
        }
        t.PhanSangHon();
        if(t.getNguyen()>0||t.getTuSo()>0) return "Lớn hơn";
        else if(t.getNguyen()<0||t.getTuSo()<0) return "Bé hơn";
        else return "Bằng nhau";
    }
}