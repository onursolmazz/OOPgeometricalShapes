public interface Shape2D {
    double alan();
    double hacim();
}

class Dikdortgen implements Shape2D {

    private double uzunluk;
    private double yukseklik ;

    public Dikdortgen(double uzunluk, double yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
    }


    public double alan() {

        return uzunluk * yukseklik;
    }


    public double hacim() {

        return 0.0;//dikdortgenin hacmi yoktur.
    }
}

class Daire implements Shape2D {

    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;

    }


    public double alan() {

        return Math.PI * yaricap * yaricap;
    }


    public double hacim() {

        return 0.0;//dikdortgenin hacmi yoktur.
    }
}
class Kare implements Shape2D {

    private double uzunluk;

    public Kare(double uzunluk) {
        this.uzunluk = uzunluk;
    }


    public double alan() {

        return uzunluk * uzunluk;
    }


    public double hacim() {

        return 0.0;//dikdortgenin hacmi yoktur.
    }
}


class Ucgen implements Shape2D {

    private double uzunluk;
    private double yukseklik;

    public Ucgen(double uzunluk, double yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
    }


    public double alan() {

        return (uzunluk * yukseklik) / 2;
    }


    public double hacim() {

        return 0.0;//dikdortgenin hacmi yoktur.
    }
}

