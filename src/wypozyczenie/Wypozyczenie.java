package wypozyczenie;

import java.time.LocalDate;

public class Wypozyczenie {

    private static final int DLUGOSC_WYPOZYCZENIA = 30;
    private static final double KARA = 0.1;
    private Egzemplarz egzemplarz;
    private LocalDate dataWypozyczenia;
    private LocalDate dataOddania;
    private LocalDate przewidywanaDataOddanial;

    public Wypozyczenie(Egzemplarz egzemplarz) {
        this.egzemplarz = egzemplarz;
        egzemplarz.setStan(Egzemplarz.Stan.WYPOZYCZONY);
        dataWypozyczenia = LocalDate.now();
        przewidywanaDataOddanial = dataWypozyczenia.plusDays(DLUGOSC_WYPOZYCZENIA);
        dataOddania = null;

    }
    public double oddaj(){

    }
}
