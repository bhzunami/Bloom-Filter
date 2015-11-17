package ch.fhnw.bloomfilter;

public class BloomFilter {

	/**
	 * An empty Bloom filter is a bit array of m bits, all set to 0.
	 */
	private byte[] bitArray;
	
	/**
	 * Constructor.
	 * @param inFilterSize eine geeignete Filtergrösse m.
	 */
	public BloomFilter(int inFilterSize){
		bitArray = new byte[inFilterSize];
	}
	
}
