import ksiazka.Autor;
import ksiazka.Gatunek;
import ksiazka.Ksiazka;
import wypozyczenie.Egzemplarz;
import wypozyczenie.Wypozyczenie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<>();
    public Ksiazka wyszukajKsiazke(String tytul){
        return null;
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Autor autor){
        return null;
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Gatunek gatunek){
        return null;
    }
    public Egzemplarz wyszukajWolnyEgzemplarz(){
        return null;
    }

}
