/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarkalkulator;

/**
 *
 * @author user-3
 */
public class Belajarkalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    penjumlahan jumlah = new penjumlahan (497, 375);
    pengurangan kurang = new pengurangan (497, 375);
    perkalian kali = new perkalian (497, 375);
     pembagian bagi = new pembagian (497, 45);
      perakaran akar = new perakaran (497, 5);
     kuadrat kuadrat = new kuadrat (10);
    
}

private static class penjumlahan {
   public penjumlahan(int a, int b){
     System.out.print("Hasil dari penjumlahan: ");
   
     int c ;
     c = a+b;
     System.out.println(c);
   }
}
private static class pengurangan {
   public pengurangan(int a, int b){
     System.out.print("Hasil dari pengurangan: ");
   
     int c ;
     c = a-b;
     System.out.println(c);
   }
}
private static class perkalian {
   public perkalian(int a, int b){
     System.out.print("Hasil dari perkalian: ");
   
     int c ;
     c = a*b;
     System.out.println(c);
   }
}
private static class pembagian {
   public pembagian(int a, int b){
     System.out.print("Hasil dari pembagian: ");
   
     int c ;
     c = a/b;
     System.out.println(c);
   }
}
private static class perakaran {
   public perakaran(int a, int b){
     System.out.print("Hasil dari perakaran: ");
   
    double hasil = a * Math.sqrt(b);
    System.out.println(hasil);
    
   }
}
private static class kuadrat {
   public kuadrat(int a){
     System.out.print("Hasil dari pengkuadratan: ");
   
    double hasil = Math.pow(a, 2);
    System.out.println(hasil);
   }
}
}