
/**
 * Beschreiben Sie hier die Klasse BubbleSort.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BubbleSort
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    public int i;
    public int z;
    public boolean tausch;
    public int index;
    public static int beispiel[]= new int[] {111, 3, 4, 13, 70, 1,};
    public static int testarray[] = new int[15000];
    /**
     * Konstruktor für Objekte der Klasse BubbleSort
     */
    public static void tauschen(int[] sortierArray, int index)
    { 
        //index = i; zwischenspeicher = z
        
        int z = sortierArray [index];  
        sortierArray [index] = sortierArray [index + 1];
        sortierArray [index + 1] = z;
        
    }
    
    
    public void grossesArray(){
     
        for(i=0; i<15000; i++){
        testarray[i]=15000-i;
        }
        
    }
    public static void vergleiche(int[] index)
    {
    
    
    }
    public static void arrayAusgeben(int[] auszugebendesArray)
    {
        // TODO...
        for(int i=0;i<auszugebendesArray.length; i++){
        System.out.print(auszugebendesArray[i]+". ");
        }
        System.out.println();
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public static void BubbleSort( int[] array)
    {   
        arrayAusgeben(array);
        boolean tausch = true;
        int index = 0;
        int z = 0;
        while (tausch==true){
                index=0;
                tausch=false;
                while(index< array.length-1){
                    if (array[index] > array[index + 1]){
                        tauschen(array, index);
                        tausch = true;
                    }   
                    index ++;
                }
                
            
               
            }
            arrayAusgeben(array);
        }
    }

