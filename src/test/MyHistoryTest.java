/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testovano;

import java.io.File;
import java.nio.file.Files;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivo Hanuš
 */
public class MyHistoryTest {
    
    public MyHistoryTest() {
    }
    
    /* I think I dont need these:
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }*/

    /**
     * Test of read method, of class MyHistory.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("read");
        MyHistory instance = null;
        instance.read();
        for (int i = 0; i < instance.arr.size(); i++) {
            assertEquals(instance.arr.get(i), Files.readAllLines(instance.filePath));
        }
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class MyHistory.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        MyHistory instance = null;
        instance.save();
        File f = new File(instance.filePath.toString());
        assertEquals(f, instance.arr);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLine method, of class MyHistory.
     */
    @Test
    public void testAddLine() {
        System.out.println("addLine");
        String str = "b¤ ß'lk´$*b0€=9@daěr5jř#bí";
        MyHistory instance = null;
        instance.addLine(str);
        assertEquals(str, instance.arr.get(instance.arr.size() - 1));
        fail("The test case is a prototype.");
    }
    
}
