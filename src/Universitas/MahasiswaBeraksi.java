package Universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa data = new Mahasiswa("2110010426","Rinaldy","TI");
        
        System.out.println("NPM ="+data.getNpm());
        System.out.println("Nama ="+data.getNama());
        System.out.println("Prodi ="+data.getProdi());
        
    }
}
