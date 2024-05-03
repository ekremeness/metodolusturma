package info.com;

public class matematikmetod {
    public void carpma(int sayı1,int sayı2){
        int sonuc = sayı1*sayı2;
        System.out.println(sonuc);

    }
    public int topla(int sayı1 ,int sayi2 ,int sayi3){
        int toplam = sayı1+sayi2+sayi3;
        return toplam;
    }
    public int cıkarma(int sayı1, int sayı2,String isim){
        int cıkansonuc = sayı1-sayı2;
        System.out.println("işlem yapan ;" + isim);

        return cıkansonuc;

    }
    public int bolme(int sayı1,int sayı2,String isim){
        int bolmesonuc = sayı1/sayı2;
        System.out.println("işlem yapan ;" +isim);
        return bolmesonuc;
    }
}
