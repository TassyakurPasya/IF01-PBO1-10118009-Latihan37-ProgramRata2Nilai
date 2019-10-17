
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Program Rata-rata Nilai
 */

public class IF01PBO110118009Latihan37ProgramRata2Nilai {

    /**
     * @param args the command line arguments
     */
    public static int[] nilaiMahasiswa = new int[10];
    public static int jumlahMhs;
    public static double rataNilai; 
    public static void hRata2(int jMahasiswa) {
        Scanner temp = new Scanner(System.in);
        
        for ( int i = 0; i < jumlahMhs; i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilaiMahasiswa[i] = temp.nextInt();
            rataNilai += nilaiMahasiswa[i];
       }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Tassyakur pasya";
        Scanner mahaSiswa = new Scanner(System.in);
        System.out.print("Memasukan Banyaknya Mahasiswa = ");
        jumlahMhs = mahaSiswa.nextInt();
        hRata2(jumlahMhs);
        rataNilai /= jumlahMhs;
        System.out.println("Maka, Rata-rata Nilainya adalah "+rataNilai);
        System.out.println("Developed by : "+nama);
        
            
        }
}
      