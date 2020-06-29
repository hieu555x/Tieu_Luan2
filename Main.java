import java.util.Scanner;

public class Main{
    public static void sapXep(DanhSach d,int n){
        int temp1 = d.getHonSo(0).getNguyen();
        int temp2 = d.getHonSo(0).getTuSo();
        int temp3 = d.getHonSo(0).getMauSo();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(d.getHonSo(i).SoSanh(d.getHonSo(j)).equals("Lớn hơn")){
                    temp1 = d.getHonSo(j).getNguyen();
                    temp2 = d.getHonSo(j).getTuSo();
                    temp3 = d.getHonSo(j).getMauSo();

                    d.getHonSo(j).setNguyen(d.getHonSo(i).getNguyen());
                    d.getHonSo(j).setTuSo(d.getHonSo(i).getTuSo());
                    d.getHonSo(j).setMauSo(d.getHonSo(i).getMauSo());

                    d.getHonSo(i).setNguyen(temp1);
                    d.getHonSo(i).setTuSo(temp2);
                    d.getHonSo(i).setMauSo(temp3);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HonSo h = new HonSo();
        DanhSach d = new DanhSach();
        int lc,n = 0;
        do{
            System.out.println("=============================================");
            System.out.println("=           CHƯƠNG TRÌNH HỖN SỐ             =");
            System.out.println("=============================================");
            System.out.println("=   1.Cộng, Trừ, Nhân Chia hai hỗn số       =");
            System.out.println("=   2.Nhập dãy hỗn số                       =");
            System.out.println("=   3.In dãy hỗn số                         =");
            System.out.println("=   4.Tính tổng dãy hỗn số                  =");
            System.out.println("=   5.Tìm kiếm hỗn số trong dãy             =");
            System.out.println("=   6.Sắp xếp hỗn số theo thứ tự tăng dần   =");
            System.out.println("=   7.Kết hợp 2 danh sách                   =");
            System.out.println("=   8.Thoát                                 =");
            System.out.println("=============================================");
            System.out.print("Nhập lựa chọn:");
            lc = sc.nextInt();
            while (lc<1||lc>8){
                System.out.print("Nhập sai nhập lại:");
                lc = sc.nextInt();
            }
            switch (lc){
                case 1:{
                    //Cộng trừ nhân chia hai hỗn số
                    int lc1;
                    do{
                        System.out.println("=============================================");
                        System.out.println("=           CHƯƠNG TRÌNH HỖN SỐ             =");
                        System.out.println("=============================================");
                        System.out.println("=   1.Cộng                                  =");
                        System.out.println("=   2.Trừ                                   =");
                        System.out.println("=   3.Nhân                                  =");
                        System.out.println("=   4.Chia                                  =");
                        System.out.println("=   5.Thoát                                 =");
                        System.out.println("=============================================");
                        System.out.print("Nhập lựa chọn:");
                        lc1 = sc.nextInt();
                        while(lc1<1||lc1>5){
                            System.out.print("Nhập sai nhập lại:");
                            lc1 = sc.nextInt();
                        }
                        switch(lc1){
                            case 1:{
                                //Cộng hai hỗn số
                                HonSo h1 = new HonSo();
                                for(int i=1;i<=2;i++){
                                    System.out.println("Hỗn số "+i+":");
                                    System.out.print("Nhập phần nguyên:");
                                    int nguyen = sc.nextInt();
                                    int tuSo,mauSo;
                                    do{
                                        System.out.print("Nhập tử số:");
                                        tuSo = sc.nextInt();
                                        System.out.print("Nhập mẫu số:");
                                        mauSo = sc.nextInt();
                                        if(tuSo>mauSo){
                                            System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                                        }
                                    }while(tuSo > mauSo);
                                    if(i==1){
                                        h1 = new HonSo(nguyen,tuSo,mauSo);
                                    } else {
                                        System.out.println("Tổng = "+h1.Cong(new HonSo(nguyen,tuSo,mauSo)).toString());
                                    }
                                }
                                break;
                            }
                            case 2:{
                                //Trừ 2 phân số
                                HonSo h1 = new HonSo();
                                for(int i=1;i<=2;i++){
                                    System.out.println("Hỗn số "+i+":");
                                    System.out.print("Nhập phần nguyên:");
                                    int nguyen = sc.nextInt();
                                    int tuSo,mauSo;
                                    do{
                                        System.out.print("Nhập tử số:");
                                        tuSo = sc.nextInt();
                                        System.out.print("Nhập mẫu số:");
                                        mauSo = sc.nextInt();
                                        if(tuSo>mauSo){
                                            System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                                        }
                                    }while(tuSo > mauSo);
                                    if(i==1){
                                        h1 = new HonSo(nguyen,tuSo,mauSo);
                                    } else {
                                        System.out.println("Hiệu = "+h1.Tru(new HonSo(nguyen,tuSo,mauSo)).toString());
                                    }
                                }
                                break;
                            }
                            case 3:{
                                //Nhân hai phân số
                                HonSo h1 = new HonSo();
                                for(int i=1;i<=2;i++){
                                    System.out.println("Hỗn số "+i+":");
                                    System.out.print("Nhập phần nguyên:");
                                    int nguyen = sc.nextInt();
                                    int tuSo,mauSo;
                                    do{
                                        System.out.print("Nhập tử số:");
                                        tuSo = sc.nextInt();
                                        System.out.print("Nhập mẫu số:");
                                        mauSo = sc.nextInt();
                                        if(tuSo>mauSo){
                                            System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                                        }
                                    }while(tuSo > mauSo);
                                    if(i==1){
                                        h1 = new HonSo(nguyen,tuSo,mauSo);
                                    } else {
                                        System.out.println("Tích = "+h1.Nhan(new HonSo(nguyen,tuSo,mauSo)).toString());
                                    }
                                }
                                break;
                            }
                            case 4:{
                                //Chia hai hỗn số
                                HonSo h1 = new HonSo();
                                for(int i=1;i<=2;i++){
                                    System.out.println("Hỗn số "+i+":");
                                    System.out.print("Nhập phần nguyên:");
                                    int nguyen = sc.nextInt();
                                    int tuSo,mauSo;
                                    do{
                                        System.out.print("Nhập tử số:");
                                        tuSo = sc.nextInt();
                                        System.out.print("Nhập mẫu số:");
                                        mauSo = sc.nextInt();
                                        if(tuSo>mauSo){
                                            System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                                        }
                                    }while(tuSo > mauSo);
                                    if(i==1){
                                        h1 = new HonSo(nguyen,tuSo,mauSo);
                                    } else {
                                        System.out.println("Thương = "+h1.Chia(new HonSo(nguyen,tuSo,mauSo)).toString());
                                    }
                                }
                                break;
                            }
                        }
                    }while(lc1!=5);
                    break;
                }
                case 2:{
                    //Nhập dãy hỗn số đã lưu vào danh sách mảng
                    System.out.print("Nhập số lượng hỗn số cần lưu:");
                    n = sc.nextInt();
                    d = new DanhSach(n);
                    for(int i=0;i<n;i++){
                        System.out.println("Hỗn số thứ "+(i+1)+":");
                        System.out.print("Nhập phần nguyên:");
                        d.getHonSo(i).setNguyen(sc.nextInt());
                        int tuSo,mauSo;
                        do{
                            System.out.print("Nhập tử số:");
                            tuSo = sc.nextInt();
                            System.out.print("Nhập mẫu số:");
                            mauSo = sc.nextInt();
                            if(tuSo>mauSo){
                                System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                            }
                        }while(tuSo>mauSo);
                        d.getHonSo(i).setTuSo(tuSo);
                        d.getHonSo(i).setMauSo(mauSo);
                    }
                    break;
                }
                case 3:{
                    //In danh sách
                    if(n<1){
                        System.out.println("Chưa có dữ liệu vui lòng nhập dữ liệu trước");
                    } else {
                        for(int i=0;i<n;i++){
                            System.out.println("Hỗn số "+(i+1)+":"+d.getHonSo(i).toString());
                        }
                    }
                    break;
                }
                case 4:{
                    //Tính tổng các hỗn số trong mảng
                    if(n<1){
                        System.out.println("Chưa có dữ liệu vui lòng nhập dữ liệu trước");
                    } else {
                        HonSo tong = new HonSo();
                        for(int i=0;i<n;i++){
                            tong = tong.Cong(d.getHonSo(i));
                        }
                        System.out.println("Tổng tất cả là:"+tong.toString());
                    }
                    break;
                }
                case 5:{
                    //Tìm kiếm hỗn số trong dãy
                    if(n<1){
                        System.out.println("Chưa có dữ liệu vui lòng nhập dữ liệu trước");
                    } else {
                        int lc1;
                        do{
                            System.out.println("=============================================");
                            System.out.println("=           CHƯƠNG TRÌNH HỖN SỐ             =");
                            System.out.println("=============================================");
                            System.out.println("=   1.Tìm kiếm theo phần nguyên             =");
                            System.out.println("=   2.Tìm kiếm theo tử số                   =");
                            System.out.println("=   3.Tìm kiếm theo mẫu số                  =");
                            System.out.println("=   4.Thoát                                 =");
                            System.out.println("=============================================");
                            System.out.print("Nhập lựa chọn:");
                            lc1 = sc.nextInt();
                            while(lc1<1||lc1>4){
                                System.out.println("Nhập sai nhập lại:");
                                lc1 = sc.nextInt();
                            }
                            switch (lc1){
                                case 1:{
                                    //Tìm kiếm theo phần nguyên
                                    System.out.print("Nhập phần nguyên cần tìm kiếm");
                                    int nguyen = sc.nextInt();
                                    boolean kt = false;
                                    for(int i=0;i<n;i++){
                                        if(nguyen==d.getHonSo(i).getNguyen()){
                                            System.out.println("Hỗn số thứ "+i+":"+d.getHonSo(i).toString());
                                            kt = true;
                                        }
                                    }
                                    if(kt==false){
                                        System.out.println("Không tìm thấy kết quả đã nhập");
                                    }
                                    break;
                                }
                                case 2:{
                                    //Tìm kiếm theo tử số
                                    System.out.print("Nhập tử số cần tìm kiếm:");
                                    int tuSo = sc.nextInt();
                                    boolean kt = false;
                                    for(int i=0;i<n;i++){
                                        if(tuSo==d.getHonSo(i).getTuSo()){
                                            System.out.println("Hỗn số thứ "+i+":"+d.getHonSo(i).toString());
                                            kt = true;
                                        }
                                    }
                                    if(kt==false){
                                        System.out.println("Không tìm thấy kết quả đã nhập");
                                    }
                                    break;
                                }
                                case 3:{
                                    //Tìm kiếm theo mẫu số
                                    System.out.print("Nhập mẫu số cần tìm kiếm:");
                                    int mauSo = sc.nextInt();
                                    boolean kt = false;
                                    for(int i=0;i<n;i++){
                                        if(mauSo==d.getHonSo(i).getMauSo()){
                                            System.out.println("Hỗn số thứ "+i+":"+d.getHonSo(i).toString());
                                            kt = true;
                                        }
                                    }
                                    if(kt==false){
                                        System.out.println("Không tìm thấy kết quả đã nhập");
                                    }
                                    break;
                                }
                            }
                        }while(lc!=4);
                    }
                    break;
                }
                case 6:{
                    //Sắp xếp hỗn số
                    if(n<1){
                        System.out.println("Chưa có dữ liệu vui lòng nhập dữ liệu trước");
                    } else{
                        sapXep(d, n);
                        System.out.println("Hoàn thành");
                    }
                    break;
                }
                case 7:{
                    //Kết hợp danh sách
                    if(n<1){
                        System.out.println("Chưa có dữ liệu vui lòng nhập dữ liệu trước");
                    } else{
                        DanhSach d1 = new DanhSach();
                        System.out.print("Nhập số lượng cần thêm vào danh sách mới");
                        int m = sc.nextInt();
                        d1 = new DanhSach(m);
                        for(int i=0;i<m;i++){
                            System.out.println("Hỗn số thứ "+(i+1)+":");
                            System.out.print("Nhập phần nguyên:");
                            d1.getHonSo(i).setNguyen(sc.nextInt());
                            int tuSo,mauSo;
                            do{
                                System.out.print("Nhập tử số:");
                                tuSo = sc.nextInt();
                                System.out.print("Nhập mẫu số:");
                                mauSo = sc.nextInt();
                                if(tuSo>mauSo){
                                    System.out.println("Tử số phải nhỏ hơn mẫu số nhập lại:");
                                }
                            }while(tuSo > mauSo);
                            d1.getHonSo(i).setTuSo(tuSo);
                            d1.getHonSo(i).setMauSo(mauSo);
                        }
                        int k = n+m;
                        DanhSach d2 = new DanhSach(k);
                        for(int i=0;i<k;i++){
                            if(i<n){
                                d2.getHonSo(i).setNguyen(d.getHonSo(i).getNguyen());
                                d2.getHonSo(i).setTuSo(d.getHonSo(i).getTuSo());
                                d2.getHonSo(i).setMauSo(d.getHonSo(i).getMauSo());
                            } else{
                                d2.getHonSo(i).setNguyen(d1.getHonSo(i-n).getNguyen());
                                d2.getHonSo(i).setTuSo(d1.getHonSo(i-n).getTuSo());
                                d2.getHonSo(i).setMauSo(d1.getHonSo(i-n).getMauSo());
                            }
                        }
                        sapXep(d2, k);
                        for(int i=0;i<k;i++){
                            System.out.println("Hỗn số "+(i+1)+":"+d2.getHonSo(i).toString());
                        }
                    }
                    break;
                }
            }
        }while(lc!=8);
    }
}