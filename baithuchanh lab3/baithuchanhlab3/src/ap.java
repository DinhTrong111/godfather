public class ap {
    public static void main(String[] args) throws Exception {
        hinhtron ht = new hinhtron();
        hinhtrutron htt = new hinhtrutron();
        nhanvien nv = new nhanvien();
        //bai 1
        ht.nhapBanKinh();
        ht.hienthitthinhtron();
        //bai 2
        htt.nhaptthtt();
        htt.hienthitthinhtrutron();
        //bai 3
        nv.nhapttnv();
        nv.hienthittnv();
    }
}