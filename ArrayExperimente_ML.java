
/**
 * Uebungen mit Arrays. 
 * 
 * Die Lerngrupe erstellt Funktionen, die sehr einfache Operationen 
 * auf int-Arrays durchfuehren.
 * 
 * @author Urs Lautebach
 * @version 30.10.2015
 */
public class ArrayExperimente_ML
{
    public static int beispiel[]= new int[] {1, 3, 4, -13, 0, 70, -111};
    public static int nochnArray[]= new int[] {20,21,22,23,24,25,26};

    /**
     * Ermittelt, ob der Wert von x im Array vorkommt, d.h. ob
     * eines der Arrayelemente den Wert x hat.
     * @param x zu suchender Wert.
     * @param dasArray Array, in dem gesucht wird.
     * @returns ob x im Array vorkommt.
     */    
    public static boolean istEnthalten(int gesucht, int[] durchsuchArray)
    {
        int suchIndex = 0;
        while (suchIndex < durchsuchArray.length)
        {
            // überprüfe das "aktuelle" Element und antworte "ja", falls es 
            // den gleichen Wert hat wie das gesuchte:
            if(durchsuchArray[suchIndex] == gesucht)
            {
                return true;
            };
            suchIndex = suchIndex + 1;
        }
        // Wenn die ganze Schleife durchgelaufen ist, war es offensichtlich
        // nicht enthalten und die Funktion muss "nein" antworten:
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
        // Fang bei index 0 an:
        int suchIndex ; 
        suchIndex = 0;
        // Schleife über das ganze Array
        while( suchIndex < durchsuchArray.length ) 
        {
            // in der Schleife: Entscheide 
            if( durchsuchArray[suchIndex] == gesucht) 
            {
                // Wenn der gesuchte Wert an dieser 
                // Stelle des Arrays steht, dann...: 
                return suchIndex ;
            }
            // sonst (falls nicht):
            suchIndex ++ ;  
        }
        return -1 ;
    }    

    /**
     * Ermittelt den Wert des groessten im Array enthaltenen Elements.
     * @param dasArray Array, in dem gesucht wird. Es darf nicht leer sein.
     * @returns Den groessten vorkommenden Wert.
     */
    public static int maxWert(int[] durchsuchArray)
    {
        int maxWertBisher = durchsuchArray[0];
        // Obwohl der erste Wert schon beruecksichtigt wurde, fangen wir
        // bei index 0 an, weil sonst ein einelementiges Array zu einem
        // Fehler fuehrt:
        int suchIndex = 0;
        // Schleife über das ganze Array
        while( suchIndex < durchsuchArray.length ) 
        {
            // in der Schleife: Entscheide 
            if( durchsuchArray[suchIndex] > maxWertBisher) 
            {
                // wenn der aktuelle Arrayeintrag noch groesser ist
                // als der bisherige Maximalwert, merke dir den neuen:
                maxWertBisher = durchsuchArray[suchIndex] ;
            }
            // und weiter geht's:
            suchIndex ++ ;  
        }
        return maxWertBisher ;
    }    

    /**
     * Ermittelt den Index des groessten im Array enthaltenen Elements.
     * @param dasArray Array, in dem gesucht wird.
     * @returns Den Index des groessten vorkommenden Werts.
     */
    public static int maxIndex(int[] durchsuchArray)
    {
        // Fang bei index 1 an:
        int indexAktuell = 0;
        int maxIndexBisher = 0;

        // Schleife über das ganze Array
        while( indexAktuell < durchsuchArray.length ) 
        {
            // in der Schleife: Entscheide 
            if( durchsuchArray[indexAktuell] > durchsuchArray[maxIndexBisher]) 
            {
                // wenn der Eintrag beim aktuellen Index noch groesser ist
                // als der beim bisherigen Maximalwert, merke dir den neuen:
                maxIndexBisher = indexAktuell ;
            }

            // und weiter geht's:
            indexAktuell ++ ;  
        }
        return maxIndexBisher ;
    }

    /**
     * Ermittelt den Index des groessten im Array enthaltenen Elements. 
     * @param dasArray Array, in dem gesucht wird.
     * @returns Den Index des groessten vorkommenden Werts.
     */
    public static int maxIndex_Eleganter(int[] durchsuchArray)
    {
        // Diese Funktion soll (mit Hilfe der bisher geschrieben) das 
        // Problem in einer einzigen Codezeile loesen.
        return indexVon(maxWert(durchsuchArray), durchsuchArray);
    }

    /**
     * Ermittelt die Summe ueber alle Arrayelemente.
     * @param dasArray Array, das aufaddiert wird.
     * @returns Summe aller Arrayelemente.
     */
    public static int querSumme(int[] aufaddierArray)
    {
        int summe = 0;
        // Fang bei index 1 an:
        int indexAktuell = 0;
        // Schleife über das ganze Array
        while( indexAktuell < aufaddierArray.length ) 
        {
            summe = summe + aufaddierArray[indexAktuell];
            // und weiter geht's:
            indexAktuell ++ ;  
        }
        return summe ;
    }    

    /**
     * Die Funktion erhoeht im urspruenglichen Array jeden Eintrag um "zuschlag".
     * Es wird kein neues Array angelegt.
     * @param dasArray Zu manipulierendes Array. Es darf nicht leer sein.    
     * @param zuschlag diese Zahl wird zu jedem Arrayeintrag dazuaddiert.
     */
    public static void addiereJeweilsD(int[] bspArray, int zuschlag)
    {
        // Fang bei index 1 an:
        int indexAktuell = 0;
        // Schleife über das ganze Array
        while( indexAktuell < bspArray.length ) 
        {
            bspArray[indexAktuell] = bspArray[indexAktuell] + zuschlag ;
            // und weiter geht's:
            indexAktuell ++ ;  
        }
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
        if(a.length != b.length)
            return null;
        int[] summe = new int[a.length];
        int index = 0;
        while(index < a.length) {
            summe[index] = a[index] + b[index];
            index ++ ;
        }
        return summe;
    }

    /**
     * Erstellt ein neues Array, in dem die Elemente des
     * urspruenglichen Array in der umgekehrten Reihenfolge drin sind.
     * @param array urspruengliches Array, darf nicht null sein
     * @returns neues Array mit umgekehrter Reihenfolge.
     */
    public static int[] arrayUmdrehen(int[] wendeArray)
    {
        if(wendeArray == null) 
            return null;
        int[] neuesArray = new int[wendeArray.length];
        // Fang bei index 0 an:
        int idx = 0;
        // Schleife ueber das ganze Array:
        while( idx < wendeArray.length) 
        {
            neuesArray[idx] = wendeArray[wendeArray.length - 1 - idx] ;
            // und weiter geht's:
            idx ++ ;  
        }
        return neuesArray ;
    }

    /**
     * Dreht im bestehenden Array dessen Elemente in 
     * die umgekehrte Reihenfolge. Man sagt, die Funktion bearbeitet 
     * das Array "in place".
     * @param wendeArray urspruengliches Array 
     */
    public static void arrayUmdrehenInPlace(int[] wendeArray)
    {
        int[] neuesArray = new int[wendeArray.length];

        // Fang bei index 0 an:
        int idx = 0;

        // Schleife ueber das halbe Array, von Index 0 bis zum letzten 
        // Element der ersten Haelfte. Bei gerade Laenge (z.B. 8) laeuft 
        // der Index von 0 bis 3; bei ungerader (z.B. 9) von 0 bis 4. Dann 
        // wird das mittlere Element mit sich selbst getauscht, was aber
        // keinen Schaden anrichtet.
        while( idx < wendeArray.length / 2) 
        {
            // Tausche das Element an der Stelle idx mit dem "Spiegelpartner".
            // Fuer einen Tausch braucht man immer einen Zwischenspeicher:
            int zwischenspeicher = wendeArray[idx];
            wendeArray[idx] = wendeArray[wendeArray.length - 1 - idx] ;
            wendeArray[wendeArray.length - 1 - idx] = zwischenspeicher;

            // und weiter geht's:
            idx ++ ;  
        }
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
        if( (bits.length > 63) || (bits == null) )
        {
            return -1;
        }        
        long ergebnis = 0;
        // Fange rechts an, d.h. bei den niederwertigen Bits:
        int index = bits.length - 1;        
        // Das Bit dort hat die Wertigkeit 2 hoch 0:
        long zweierpotenz = 1;       
        // So lange wir noch nicht ganz links angekommen sind...:
        while(index >=	 0)
        {
            // ... ueberpruefen wir jedes Bit und addieren ggf. 
            // die passende Zweierpotenz zum Ergebnis dazu:
            if(bits[index] == true) 
            {
                ergebnis += zweierpotenz;
            }           
            // Die naechste Zweierpotenz fuer eine Stelle weiter links
            // ist doppelt so gross, der Arrayindex schrumpft um eins:
            zweierpotenz *= 2;
            index -- ;
        }
        return ergebnis;
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
        if( zahl < 0 )
        {
            return null;
        }
        boolean[] ergebnis = new boolean[16];
        // Fange rechts an, d.h. bei den niederwertigen Bits:
        int stelle = ergebnis.length - 1;        
        // Das Bit dort hat die Wertigkeit 2 hoch 0:
        long zweierpotenz = 1;       
        // Das linkeste Bit stellt das Vorzeichen dar, und wir wollen 
        // ja bei positiven Zahlen bleiben:
        ergebnis[0] = false;
        // Deswegen laeuft die Schleife auch nur runter bis 1, nicht bis 0:
        while(stelle > 0)
        {
            // ... ist zahl ungerade? Das bedeutet, dass ganz rechts 
            // eine Eins steht:
            if(zahl % 2 == 1) 
            {
                ergebnis [stelle] = true;
            }           
            else
            {
                ergebnis[stelle] = false;
            }
            // Kuerzere und coolere Formulierung, aber viel schwerer 
            // zu lesen und deswegen nicht empfehlenswert:
            // ergebnis[stelle] = (zahl % 2 == 1);

            // Die Halbierung von zahl "wirft" die gerade betrachtete 
            // Binaerstellen weg und rueckt alle anderen eins nach rechts, so 
            // dass der naechste Durchlauf die naechste Stelle bearbeitet:
            zahl /= 2;
            stelle -- ;
        }
        return ergebnis;
    }

    /**
     * Die Funktion sortiert das uebergebene Array aufsteigend und in-place.
     * @param array Das zu sortierende Array.
     */
    public static void bubbleSort(int[] array)
    {
        int letzterNochUnsortierterIndex  = array.length -1;
        // Die Schleife laeuft so lange, wie noch mindestens zwei
        // Elemente (also die bei den Indizes 0 und 1) unsortiert sind:
        while(letzterNochUnsortierterIndex >= 1)
        {
            int bubbleIndex = 0; 
            // Arbeite nur innerhalb des noch unsortierten Bereichs:
            while(bubbleIndex < letzterNochUnsortierterIndex )
            {
                // Stehen die Nachbarn falsch herum?
                if( array[bubbleIndex] > array[bubbleIndex + 1] )
                {
                    // vertausche die Elemente bei bubbleIndex und dahinter:
                    int temp = array[bubbleIndex];
                    array[bubbleIndex] = array[bubbleIndex + 1] ;
                    array[bubbleIndex + 1] = temp ;
                }
                bubbleIndex ++ ; 
            }
            // Der bisher letzte ist dann jetzt sortiert:
            letzterNochUnsortierterIndex -- ;
        }
    }
}
