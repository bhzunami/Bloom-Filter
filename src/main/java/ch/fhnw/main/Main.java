package ch.fhnw.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ch.fhnw.bloomfilter.BloomFilter;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	int n = 12;
    	double p = 0.65;
    	
    	BloomFilter bf = new BloomFilter(n, p);
    	
    	File aWordFile = new File("src/main/resources/words.txt");
    	BufferedReader br = new BufferedReader(new FileReader(aWordFile));
    	
    	String word;
    	while((word = br.readLine()) != null){
    		bf.hashString(word);
    	}
        
    }
    
    

}
