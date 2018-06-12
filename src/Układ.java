/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class Układ {
    private String nazwaGwiazdy;
    private int odlegloscOdZiemi;
    private final int predkoscSwiatla = 299792;  
    private Świat.typPlanety[] planety;
    
    public Układ(String nazwaGwiazdy, int odlegloscOdZiemi, Świat.typPlanety[] planety)
    {
    this.nazwaGwiazdy = nazwaGwiazdy;
    this.odlegloscOdZiemi = odlegloscOdZiemi;
    this.planety = planety;
    }

    public Układ( Świat.typPlanety[] planety)
    {
        this.planety = planety;
    }
    
    public void setNazwaGwiazdy(String nazwaGwiazdy)
    {
        this.nazwaGwiazdy = nazwaGwiazdy;
    }
    
    public void setOdległośćOdZiemi(int odlegloscOdZiemi)
    {
        this.odlegloscOdZiemi = odlegloscOdZiemi;
    }
    
    
    public void czasPodrozy()
    {
        int czas_podrozy = this.odlegloscOdZiemi/this.predkoscSwiatla;
        for (int i = 0; i < this.planety.length; i++)
        {
            if (this.planety[i] != null)
            {
             czas_podrozy = (czas_podrozy + czas_podrozy/10);
            }
        }
        int poczworzony_czas_podrozy = czas_podrozy << 2;
        System.out.println("Czas podrozy przeed rozciagnieciem przestrzeni: " + czas_podrozy + "\n" + "Czas podrozy po rozciagniecu przestrzeni: " + poczworzony_czas_podrozy);
    }
    
    public void sprawdzPlanete(Świat.typPlanety typPlanety)
    {
       for(int i = 0; i < this.planety.length; i++)
       {
            if (this.planety[i].equals(typPlanety)){
            System.out.println("Uklad " + this.nazwaGwiazdy + " posiada planetę: " + typPlanety);
            }
            else if(i == this.planety.length - 1)
            {
           System.out.println("Niestety układ nie posiada tej planety");
            }
       }       
    }
    
}

