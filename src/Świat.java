
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author marci
 */
public class Świat {

    public enum typPlanety{GazowyOlbrzym, SkalistyKarzel, GazowyKarzel, SkalistyOlbrzym}

    public static void main(String[] args) {
    typPlanety[] planety = new typPlanety[10];    
     planety[0] = typPlanety.GazowyKarzel;
     planety[1] = typPlanety.SkalistyKarzel;
     planety[2] = typPlanety.SkalistyOlbrzym;
    typPlanety[] planety_xd = new typPlanety[10];
     planety_xd[0] = typPlanety.GazowyOlbrzym;
     planety_xd[1] = typPlanety.SkalistyKarzel;
     planety_xd[2] = typPlanety.SkalistyOlbrzym;
    Układ słoneczny = new Układ("Słońce", 149600000, planety);
    Układ syriusza = new Układ("Syriusz", 810890000, planety_xd);
    słoneczny.czasPodrozy();
    syriusza.czasPodrozy();
    
    Układ pojmaj = new Układ(planety_xd);
    String nazwa_gwiazdy;
    int odległość_od_ziemi;
    
    Scanner odczyt = new Scanner(System.in);
    System.out.println("Podaj nazwę planety: ");
    nazwa_gwiazdy = odczyt.nextLine();
    System.out.println("Podaj odległość od Ziemi: ");
    odległość_od_ziemi = odczyt.nextInt();
    
    pojmaj.setNazwaGwiazdy(nazwa_gwiazdy);
    pojmaj.setOdległośćOdZiemi(odległość_od_ziemi);
    
    pojmaj.czasPodrozy();
    
    
    
    }
    
}
