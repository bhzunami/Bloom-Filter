package ch.fhnw.bloomfilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class BloomFilterTest {

    int n = 58110;
    double[] p = new double[] { 0.1, 0.05, 0.01, 0.005, 0.001, 0.0005, 0.0001, 0.00005, 0.00001 };

    BufferedReader br;
    BloomFilter bf;

    // Initalize a bloomfilter with the given words
    @Before
    public void initialize() throws IOException {

    }

    @Test
    public void testBloomFilter1() throws IOException {
        bf = new BloomFilter(n, p[0]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[0]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();

    }

    @Test
    public void testBloomFilter2() throws IOException {
        bf = new BloomFilter(n, p[1]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[1]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }

    @Test
    public void testBloomFilter3() throws IOException {
        bf = new BloomFilter(n, p[2]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[2]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }

    @Test
    public void testBloomFilter4() throws IOException {
        bf = new BloomFilter(n, p[3]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[3]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }

    @Test
    public void testBloomFilter5() throws IOException {
        bf = new BloomFilter(n, p[4]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[4]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }
    
    @Test
    public void testBloomFilter6() throws IOException {
        bf = new BloomFilter(n, p[5]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[5]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }
    
    @Test
    public void testBloomFilter7() throws IOException {
        bf = new BloomFilter(n, p[6]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[6]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }

    
    @Test
    public void testBloomFilter8() throws IOException {
        bf = new BloomFilter(n, p[7]);
        File aWordFile = new File("src/main/resources/words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        String word;
        while ((word = br.readLine()) != null) {
            bf.cacheString(word);
        }
        aWordFile = new File("src/test/resources/non_existing_words.txt");
        br = new BufferedReader(new FileReader(aWordFile));

        word = null;
        int words = 0;
        int counter = 0;
        while ((word = br.readLine()) != null) {
            words++;
            if (bf.checkIfContains(word)) {
                counter++;
            }
        }
        System.out.println("Anzahl Wörter: " + words);
        System.out.println("Fehlerwahrscheinlichkeit: " + p[7]);
        System.out.println("Wrong checks: " + counter);
        System.out.println("Filter Grösse: " + bf.optimalFilterSize);
        System.out.println("Anzahl Hash Funktion: " + bf.hashFunctions.size());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();
    }
}
