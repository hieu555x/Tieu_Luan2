public class test {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static void main(String[] args) {
        HonSo h = new HonSo(-1,-2,3);
        HonSo t = new HonSo(1,2,3);
        System.out.println(h.Tru(t));
        System.out.println(h.SoSanh(t));
    }
}