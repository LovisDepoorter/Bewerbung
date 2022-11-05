
/**
 * Uebungen mit Arrays. 
 * 
 * Die Lerngrupe erstellt Funktionen, die sehr einfache Operationen 
 * auf int-Arrays durchfuehren.
 * 
 * @author Urs Lautebach
 * @version 30.10.2015
 */
public class ArrayExperimente
{
    public static int beispiel[]= new int[] {1, 3, 4, -13, 0, 70, -111,};
    public static int nochnArray[]= new int[] {20,21,22,23,24,25,27,26,30,44};
    public static int joeBiden[]= new int[] {69, 420, 187, 1337, 42,}; 
    public static int cringe[]= new int[] {1,2,3,4,5,6,7,8};

    /**
     * Gibt das uebergebene Array auf der Konsole aus.
     * @param Array, das ausgegeben werden soll.
     */
    public static void arrayAusgeben(int[] auszugebendesArray)
    {
        // TODO...
        for(int i=0;i<auszugebendesArray.length; i++){
        System.out.print(auszugebendesArray[i]+". ");
        }
    }

    public static void testen()
    {
        // TODO
         
    }

    /**
     * Ermittelt, ob der Wert von x im Array vorkommt, d.h. ob
     * eines der Arrayelemente den Wert x hat.
     * @param x zu suchender Wert.
     * @param dasArray Array, in dem gesucht wird.
     * @returns ob x im Array vorkommt.
     */    
    public static boolean istEnthalten(int gesucht, int[] durchsuchArray)
    {
        // Indexvariable anlegen und null setzen:
        int index = 0;

        while( index < durchsuchArray.length )
        {

            // entspricht der Arrayeintrag am aktuellen Index dem 
            // gesuchten Wert?
            if(durchsuchArray[index] == gesucht)
            {
                // ja: gib true zurück:
                return true;
            }

            else
            {
                // nein: erhöhe die Indexvariable um 1 und wiederhole
                index ++ ;
                return false;
            }
        }

        // das return steht hier nur, damit der Compiler nicht meckert:
        return false;
    }    

    /**
     * Ermittelt, an welchem Index im Array der Wert "gesucht" vorkommt.
     * @param gesucht Wert, nach dem im Array gesucht wird.
     * @param durchsuchArray Array, in dem gesucht wird.
     * @returns den Index, an dem gesucht im Array vorkommt; -1, falls es
     * nicht vorkommt.
     */
    public static int indexVon(int gesucht, int[] durchsuchArray)
    {
        // TODO...
        int index = 0;
        
        while( index < durchsuchArray.length )
        {

           
            if(durchsuchArray[index] == gesucht)
            {
                System.out.print(index);
                return 0;
            }

            else
            {
                
                index ++ ;
                return 1;
            }
        }
        
        

        // das return steht hier nur, damit der Compiler nicht meckert:
        return -3246;
    }    

    /**
     * Ermittelt den Wert des groessten im Array enthaltenen Elements.
     * @param dasArray Array, in dem gesucht wird. Es darf nicht leer sein.
     * @returns Den groessten vorkommenden Wert.
     */
    public static int maxWert(int[] durchsuchArray)
    {
        // TODO...
        int merkWert = durchsuchArray[0];
        for(int i=0; i<durchsuchArray.length-1; i++) {
            if(merkWert<durchsuchArray[i+1]){
            merkWert=durchsuchArray[i+1];
            } 
        
        
        }
        System.out.print(merkWert);

        // das return steht hier nur, damit der Compiler nicht meckert:
        return merkWert;
    }    

    /**
     * Ermittelt den Index des groessten im Array enthaltenen Elements.
     * @param dasArray Array, in dem gesucht wird.
     * @returns Den Index des groessten vorkommenden Werts.
     */
    public static int maxIndex(int[] durchsuchArray)
    {
        // TODO...
        int merkWert = durchsuchArray[0];
        int merkIndex = 0;
        for(int i=0; i<durchsuchArray.length-1; i++) {
            if(merkWert<durchsuchArray[i+1]){
            
            merkWert=durchsuchArray[i+1];
            merkIndex=i+1;
            } 
        
        
        }
        System.out.print(merkWert);
        System.out.print(merkIndex);
        // das return steht hier nur, damit der Compiler nicht meckert:
        return merkIndex;
    }

    /**
     * Ermittelt den Index des groessten im Array enthaltenen Elements. 
     * @param dasArray Array, in dem gesucht wird.
     * @returns Den Index des groessten vorkommenden Werts.
     */
    public static int maxIndex_Eleganter(int[] durchsuchArray)
    {
        int merkIndex = 0;
        for(int i=0; i<durchsuchArray.length-1; i++) {
            if(merkIndex<durchsuchArray[i+1]){
                merkIndex=i+1;
            } 
        }
        System.out.print(merkIndex);
        
        return merkIndex;
    }

    /**
     * Ermittelt die Summe ueber alle Arrayelemente.
     * @param dasArray Array, das aufaddiert wird.
     * @returns Summe aller Arrayelemente.
     */
    public static int querSumme(int[] aufaddierArray)
    {
        // TODO...
        int merkWert = 0;
        for(int i=0; i<aufaddierArray.length; i++) {
             merkWert=merkWert+aufaddierArray[i];
        }
        System.out.print(merkWert);

        // das return steht hier nur, damit der Compiler nicht meckert:
        return merkWert;
    }    

    /**
     * Die Funktion erhoeht im urspruenglichen Array jeden Eintrag um "zuschlag".
     * Es wird kein neues Array angelegt.
     * @param dasArray Zu manipulierendes Array. Es darf nicht leer sein.    
     * @param zuschlag diese Zahl wird zu jedem Arrayeintrag dazuaddiert.
     */
    public static void addiereJeweilsD(int[] bspArray, int zuschlag)
    {
        // TODO...
    }

    /**
     * Berechnet die Vektorsumme der Arrays a und b
     * (elementweise Summe).
     * a und b MUESSEN gleiche Laenge haben - die Funktion
     * gibt sonst null zurueck!
     * @param a ein Vektor, darf nicht null sein
     * @param b noch ein Vektor, darf nicht null sein
     * @returns Summe von a und b
     */
    public static int[] vektorsumme(int[] a, int[] b)
    {
        // das return steht hier nur, damit der Compiler nicht meckert:
        return null;

        // TODO...
    }

    /**
     * Erstellt ein neues Array, in dem die Elemente des
     * urspruenglichen Array in der umgekehrten Reihenfolge drin sind.
     * @param array urspruengliches Array, darf nicht null sein
     * @returns neues Array mit umgekehrter Reihenfolge.
     */
    public static int[] arrayUmdrehen(int[] wendeArray)
    {
        // so legt man ein neues Array an:
        int[] neuesArray = new int[wendeArray.length];

        // das return steht hier nur, damit der Compiler nicht meckert:
        return null;

        // TODO...
    }

    /**
     * Dreht im bestehenden Array dessen Elemente in 
     * die umgekehrte Reihenfolge. Man sagt, die Funktion bearbeitet 
     * das Array "in place".
     * @param wendeArray urspruengliches Array 
     */
    public static void arrayUmdrehenInPlace(int[] wendeArray)
    {
        // TODO...
    }

    /**
     * Wandelt ein Array von Booleans in einen long-Wert um.
     * 
     * @param bits Array, das als Binaerwort interpretiert wird. 
     * Die Eintraege links (bei kleinen Indizes) sollen als 
     * hoeherwertige, die rechts (bei grossen Indizes) als 
     * niederwertigere Binaerstellen interpretiert werden. 
     * Das Array soll maximal 63 Eintraege haben, damit zunaechst
     * nicht ueber Zweierkomplemente nachgedacht werden muss.
     * 
     * @returns die resultierende Zahl; -1, falls das uebergebene Array
     * nicht in einen long umgewandelt werden kann.
     */
    public static long binaerNachDezimal(boolean[] bits)
    {
        // TODO...

        return -43745;
    }

    /**
     * Wandelt einen short-Wert in ein Array von Booleans um.
     * 
     * @returns Array, das als Binaerwort interpretiert wird. 
     * Jedes boolean darin steht fuer ein Bit. 
     * Die Eintraege links (bei kleinen Indizes) sollen als 
     * hoeherwertige, die rechts (bei grossen Indizes) als 
     * niederwertigere Binaerstellen interpretiert werden. 
     * Der Rueckgabewert ist null, falls zahl negativ ist.
     * 
     * @param zahl die Zahl, die umgewandelt werden soll.
     */
    public static boolean[] dezimalNachBinaer(short zahl)
    {
        // TODO...

        return null;
    }

    /**
     * Die Funktion sortiert das uebergebene Array aufsteigend und in-place.
     * @param array Das zu sortierende Array.
     */
    public static void bubbleSort(int[] array)
    {
        // TODO...

    }
}
