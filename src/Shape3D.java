public interface Shape3D {
    double alan();
    double hacim();
}

class DikdortgenPrizma implements Shape2D {

    private double uzunluk;
    private double yukseklik ;

    private double genislik ;

    public DikdortgenPrizma (double uzunluk, double yukseklik,double genislik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.genislik = genislik ;
    }


    public double alan() {

        return 2* ((uzunluk*yukseklik)+(yukseklik*genislik)+(uzunluk*genislik)) * ((uzunluk*yukseklik)+(yukseklik*genislik)+(uzunluk*genislik));
    }


    public double hacim() {

        return uzunluk*genislik*uzunluk ;
    }
}

class Kure implements Shape2D {

    private double yaricap;

    public Kure(double yaricap) {
        this.yaricap = yaricap;

    }


    public double alan() {

        return 4*Math.PI * yaricap * yaricap;
    }


    public double hacim() {

        return 4/3* Math.PI *yaricap*yaricap*yaricap ;
    }
}
class Kup implements Shape2D {

    private double uzunluk;

    public Kup(double uzunluk) {
        this.uzunluk = uzunluk;
    }


    public double alan() {

        return 6* (uzunluk * uzunluk);
    }


    public double hacim() {

        return uzunluk*uzunluk*uzunluk ;
    }
}


class UcgenPrizma implements Shape2D {

    private double uzunluk;
    private double uzunluk2;
    private double uzunluk3;
    private double yukseklik ;

    public UcgenPrizma(double uzunluk, double uzunluk2,double uzunluk3,double yukseklik) {
        this.uzunluk = uzunluk;
        this.uzunluk2 = uzunluk2;
        this.uzunluk3 = uzunluk3 ;
        this.yukseklik = yukseklik ;
    }


    public double alan() {

        return (uzunluk + uzunluk2 + uzunluk3) * yukseklik;
    }


    public double hacim() {

        return yukseklik * (uzunluk2 * uzunluk3) / 2;
    }
}