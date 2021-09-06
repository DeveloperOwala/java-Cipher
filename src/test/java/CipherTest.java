import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instanceCorrectly() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(true, testCipher instanceof Cipher);

    }

    @Test
    public void newCipher_getStatement_a() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("a", testCipher.getStatement());

    }

    @Test
    public void newCipher_getKey_2() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(2, testCipher.getKey());
    }

    @Test
    public void newCipher_replaceLetter_b() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("b", testCipher.isEncrypted());

    }

    @Test
    public void runCipher_ifInputIsString() {
        Cipher testCipher = new Cipher("abc", 3);
        assertEquals("abc", testCipher.getStatement());
    }

    @Test
    public void encrypt() {
    }

    @Test
    public void decrypt() {
    }
}