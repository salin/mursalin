package ngoding;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double modal, tahun, inves = 0;
        System.out.print("Masukkan modal awal.    : ");
        modal = input.nextDouble();
        System.out.print("lama investasi (/tahun) : ");
        tahun = input.nextInt();
        for (int i = 1; i <= tahun; i++) {
            inves = modal * 0.05;
            modal += inves;

            System.out.println("investasi tahun ke " + i + " : Rp " + modal);
        }
        System.out.println("================================");
        System.out.print("total investasi " + " tahun " + " : Rp " + modal);
    }
}

