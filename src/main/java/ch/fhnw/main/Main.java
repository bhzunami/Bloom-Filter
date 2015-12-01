package ch.fhnw.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ch.fhnw.bloomfilter.BloomFilter;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	int n = 58110;
    	double p = 0.01;
    	
    	BloomFilter bf = new BloomFilter(n, p);
    	
    	File aWordFile = new File("src/main/resources/words.txt");
    	BufferedReader br = new BufferedReader(new FileReader(aWordFile));
    	
    	String word;
    	while((word = br.readLine()) != null){
    		bf.cacheString(word);
//    		System.out.println(bf.checkIfContains(word));
    	}
    	
    	System.out.println(bf.checkIfContains("abaft"));
    	System.out.println(bf.checkIfContains("abbft"));
    	System.out.println(bf.checkIfContains("abagt"));
    	System.out.println(bf.checkIfContains("abast"));
    	System.out.println(bf.checkIfContains("abaht"));
    	System.out.println(bf.checkIfContains("abart"));
    	System.out.println(bf.checkIfContains("abalt"));
    	System.out.println(bf.checkIfContains("abaqt"));
//    	System.out.println(bf.checkIfContains("asdf"));
//    	System.out.println(bf.checkIfContains("aaaaaaaaa2"));
//        
    }
    
    

}
