package info.com;

public class matematikmain {
    public static void main(String args[]){
        matematikmetod m1 = new matematikmetod();
        m1.carpma(88,5);
        m1.carpma(9,5);


        int gelendeger = m1.topla(3,6,96);
        System.out.println("toplam " + gelendeger);


        int cıkarmasonuc = m1.cıkarma(9,5,"enes");
        System.out.println("sonuç;" + cıkarmasonuc);

        int bolmesonuç = m1.bolme(88,4,"sema");
        System.out.println("sonuç; " + bolmesonuç);

    }
}
