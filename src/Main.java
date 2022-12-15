
public class Main {

    public static void main(String[] args) {
        // Dikdortgen
        double uzunluk = 2.0;
        double yukseklik = 3.0;
        Dikdortgen dikdortgen = new Dikdortgen(uzunluk, yukseklik);

        System.out.println("Dikdortgen - alan: " + dikdortgen.alan());
        System.out.println("Dikdortgen - hacim: " + dikdortgen.hacim());

        // Daire
        double yaricap = 2.0;
        Daire daire = new Daire(yaricap);
        System.out.println("Daire - alan: " + daire.alan());
        System.out.println("Daire - hacim: " + daire.hacim());

        //Kare
        double uzunluk1 = 10.0;
        Kare kare = new Kare(uzunluk1);
        System.out.println("Kare - alan: " + kare.alan());
        System.out.println("Kare - hacim: " + kare.hacim());

        //ucgen
        double uzunluk2 = 4.0;
        double yukseklik2 = 2.0;
        Ucgen ucgen = new Ucgen(uzunluk2, yukseklik2);
        System.out.println("Ucgen - alan: " + ucgen.alan());
        System.out.println("Ucgen - hacim:" + ucgen.hacim());

        // Dikdortgen Prizma
        double uzunluk3 = 2.0;
        double yukseklik3 = 3.0;
        double genislik3 = 2.0;
        DikdortgenPrizma dikdortgenPrizma = new DikdortgenPrizma(uzunluk3, yukseklik3, genislik3);

        System.out.println("Dikdortgen Prizma - alan: " + dikdortgenPrizma.alan());
        System.out.println("Dikdortgen Prizma - hacim: " + dikdortgenPrizma.hacim());

        // Kure
        double yaricap4 = 2.0;
        Kure kure = new Kure(yaricap4);
        System.out.println("Kure - alan: " + kure.alan());
        System.out.println("Kure - hacim: " + kure.hacim());

        //Kup
        double uzunluk5 = 10.0;
        Kup kup = new Kup(uzunluk5);
        System.out.println("Kup - alan: " + kup.alan());
        System.out.println("Kup - hacim: " + kup.hacim());

        //UcgenPrizma
        double uzunluk6= 3;
        double uzunluk7= 4;
        double uzunluk8 = 5;
        double yukseklik9 = 10 ;
        UcgenPrizma ucgenPrizma = new UcgenPrizma(uzunluk6,uzunluk7,uzunluk8,yukseklik9);
        System.out.println("Ucgen prizma - alan: "+ucgenPrizma.alan());
        System.out.println("Ucgen prizma - hacim: "+ucgenPrizma.hacim());

        //Polymorpishm
        Shape2D d = (Shape2D) new Dikdortgen(1.0,2.0);
        System.out.println("Dikdortgen hacim :"+d.hacim());
        System.out.println("Dikdortgen alan :"+d.alan());

        Shape3D d1 = (Shape3D) new DikdortgenPrizma(3.0,2.0,2.0);
        System.out.println("Dikdortgen Prizma alan:"+d1.alan());
        System.out.println("Dikdortgen Prizma hacim:"+d1.hacim());


    }
}