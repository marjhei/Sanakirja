/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marjaana
 */
import java.util.HashMap;
import java.util.ArrayList;


public class Sanakirja {



    private HashMap<String, String> kaannokset;



    public Sanakirja() {

        this.kaannokset = new HashMap<>();

    }



    public String kaanna(String sana) {

        return this.kaannokset.get(sana);

    }



    public void lisaa(String sana, String kaannos) {

        this.kaannokset.put(sana, kaannos);

    }
    
     public int sanojenLukumaara() {

        return this.kaannokset.size();

    }
     
     public ArrayList<String> kaannoksetListana() {

        ArrayList<String> kaannoksetListana = new ArrayList<>();

        for (String avain : this.kaannokset.keySet()) {

            kaannoksetListana.add(avain + " = " + this.kaannokset.get(avain));

        }

        return kaannoksetListana;

    }

}
