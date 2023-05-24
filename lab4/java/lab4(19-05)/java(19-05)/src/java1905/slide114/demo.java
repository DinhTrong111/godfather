package java1905.slide114;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Map<String, List<Sinhvien>> Svm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        Sinhvien.NhapDS(Svm);
        Sinhvien.DsSvThuocLop(Svm);
        Sinhvien.DsSvThuocMsv(Svm);
    }
}