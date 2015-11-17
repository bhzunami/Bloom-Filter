package ch.fhnw.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start App");

    }
    
    /**
     * Berechnet die optimale Anzahl k an Hashfunktionen.
     * 
     * @param inFilterSize eine geeignete Filtergrösse m.
     * @param inNumberOfInsertedElements Anzahl n an zu erwartenden Elementen.
     * @return optimale Anzahl k an Hashfunktionen
     */
    private int getOptimalNumberOfHashfunctions(int inFilterSize, int inNumberOfInsertedElements){
    	int m = inFilterSize;
    	int n = inNumberOfInsertedElements;
    	return (int) ( m / n * Math.log(2) );
    }

}
