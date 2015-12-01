package ch.fhnw.bloomfilter;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class BloomFilter {

	/**
	 * An empty Bloom filter is a bit array of m bits, all set to 0.
	 */
	private byte[] bitArray;

	private int numberOfInsertedElements;

	private double falsePositiveProbability;

	private int optimalFilterSize; // m
	
	private List<HashFunction> hashFunctions;

	/**
	 * Constructor.
	 * 
	 * @param inNumberOfInsertedElements
	 *            Anzahl n an zu erwartenden Elementen.
	 * @param inFalsePositiveProbability
	 *            Fehlerwahrscheinlichkeit p.
	 */
	public BloomFilter(int inNumberOfInsertedElements, double inFalsePositiveProbability) {
		numberOfInsertedElements = inNumberOfInsertedElements;
		falsePositiveProbability = inFalsePositiveProbability;
		optimalFilterSize = getOptimalFilterSize(numberOfInsertedElements, falsePositiveProbability);
		hashFunctions = createHashFunctions();
		bitArray = new byte[optimalFilterSize];
	}

	/**
	 * Berechnet die optimale Anzahl k an Hashfunktionen.
	 * 
	 * @param inFilterSize
	 *            eine geeignete Filtergrösse m.
	 * @param inNumberOfInsertedElements
	 *            Anzahl n an zu erwartenden Elementen.
	 * @return optimale Anzahl k an Hashfunktionen
	 */
	private int getOptimalNumberOfHashfunctions(int inFilterSize, int inNumberOfInsertedElements) {
		int m = inFilterSize;
		int n = inNumberOfInsertedElements;
		return (int) (m / n * Math.log(2));
	}

	/**
	 * Berechnet die geeignete Filtergrösse m.
	 * 
	 * @param inNumberOfInsertedElements
	 *            Anzahl n an zu erwartenden Elementen.
	 * @param inFalsePositiveProbability
	 *            Fehlerwahrscheinlichkeit p.
	 * @return die geeignete Filtergrösse m.
	 */
	private int getOptimalFilterSize(int inNumberOfInsertedElements, double inFalsePositiveProbability) {
		int n = inNumberOfInsertedElements;
		double p = inFalsePositiveProbability;
		return (int) (-1 * (n * Math.log(p)) / (Math.pow(Math.log(2), 2)));
	}

	/**
	 * Gets list of hash functions.
	 * @return list of hash functions.
	 */
	private List<HashFunction> createHashFunctions() {
		List<HashFunction> listOfHashFunctions = new LinkedList<HashFunction>();
		for (int i = 0; i < getOptimalNumberOfHashfunctions(optimalFilterSize, numberOfInsertedElements); i++) {
			Random r = new Random();
			int seed = r.nextInt();
			listOfHashFunctions.add(Hashing.murmur3_128(seed));
		}
		return listOfHashFunctions;
	}
	
	/**
	 * Hashes a word.
	 * @param inWord the word to hash.
	 */
	public void cacheString(String inWord){
		for(HashFunction hf : hashFunctions){
			HashCode hashCode = hf.hashString(inWord);
			int index = (int) Math.sqrt(Math.pow(hashCode.asLong() % optimalFilterSize, 2));
			bitArray[index] = 1;
		}
	}
	
	//TODO: DRY This method is similar to chacheString. Make one method! 
	public boolean checkIfContains(String word) {
	    boolean found = true;
	    for(HashFunction hf : hashFunctions){
            HashCode hashCode = hf.hashString(word);
            int index = (int) Math.sqrt(Math.pow(hashCode.asLong() % optimalFilterSize, 2));
            if(bitArray[index] == 0) {
                found = false;
            }
        }
	    return found;
	}
}
