public class DanhSach {
    private HonSo[] h;
    DanhSach(){

    }
    DanhSach(int n){
        h = new HonSo[n];
        for(int i=0;i<n;i++){
            h[i] = new HonSo();
        }
    }
    public HonSo getHonSo(int i){
        return h[i];
    }
}