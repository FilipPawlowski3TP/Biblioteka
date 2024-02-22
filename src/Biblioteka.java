import ksiazka.Autor;
import ksiazka.Gatunek;
import ksiazka.Ksiazka;
import wypozyczenie.Egzemplarz;
import wypozyczenie.Wypozyczenie;

import java.util.ArrayList;
import java.util.Scanner;

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
        return null;
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Autor autor){
        for (Ksiazka ksiazka: ksiazki){
            if(ksiazka.getAutor().equals(autor)){
                ksiazki.add(ksiazka);
            }
        }
        return null;
    }
    public ArrayList<Ksiazka> wyszukajKsiazke(Gatunek gatunek){
        for (Ksiazka ksiazka: ksiazki){
            if(ksiazka.getGatunek().equals(gatunek)){
                ksiazki.add(ksiazka);
            }
        }
        return null;
    }
    public Egzemplarz wyszukajWolnyEgzemplarz(){
        for (Egzemplarz e: egzemplarze){
            if(e.getKsiazka().equals(ksiazki) && e.getStan() == Egzemplarz.Stan.WOLNY){
                return e;
            }

        } return null;
    }
    Scanner scanner = new Scanner(System.in);
    public Autor dodajKsiazke() {
        //dodaje nowa egzemplarz (przeprowadza dialog z uzytkownikime
        // jesli ksiazka nie isnteje najpierw ja tworzy
        System.out.println("Podaj Tytul ksiazki");
        String tytulKsiazki = scanner.next();
        System.out.println("Podaj gatunek ksiazki (Kryminał,Popularno Naukowe,Fantastyka,Biografia)");
        Gatunek gatunek = switch (scanner.next()) {
            case "Kryminał" -> Gatunek.KRYMINAŁ;
            case "Popularno Naukowe" -> Gatunek.POPULARNO_NAUKOWE;
            case "Fantastyka" -> Gatunek.FANTASTYKA;
            case "Biografia" -> Gatunek.BIOGRAFIA;
            default -> null;
        };
        System.out.println("Podaj rok wydania ksiazki");
        int rok_wydania = scanner.nextInt();


    }
    // pan adam ma na gicie;
    
    public Autor stworzAutora(){

        System.out.println("Podaj imie autora");
        String imieAutor = scanner.next();
        System.out.println("Podaj nazwisko autora");
        String nazwiskoAutor = scanner.next();
        System.out.println("Podaj rok urodzenia");
        int rokUrodzeniaAutora = scanner.nextInt();
        System.out.println("Jesli autor juz nie zyje to podaj jego date smierci, jesli zyje wpisz 0");
        int rokSmierciAutora = scanner.nextInt();
        Autor nowyAutor = new Autor(imieAutor,nazwiskoAutor,rokUrodzeniaAutora,rokSmierciAutora);
        return nowyAutor;
    }

};
