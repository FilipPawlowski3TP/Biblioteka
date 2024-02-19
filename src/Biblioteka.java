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
            for (Ksiazka ksiazka: ksiazki){
                if(ksiazka.getTytul().equals(tytul)){
                    return ksiazka;
                }
            }
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Autor autor){
        for (Ksiazka ksiazka: ksiazki){
            if(ksiazka.getAutor().equals(autor)){
                ksiazki.add(ksiazka);
            }
        }
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Gatunek gatunek){
        for (Ksiazka ksiazka: ksiazki){
            if(ksiazka.getGatunek().equals(gatunek)){
                ksiazki.add(ksiazka);
            }
        }
    }
    public Egzemplarz wyszukajWolnyEgzemplarz(){
        for (Ksiazka ksiazka: ksiazki){
            if(){
                return
            }
        }
    }

}
