import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ATMTest {
    public static ATM atm;
    public static Storage atmStorage;

    // Make sure class ATM extends ATMStorageStub
    @Nested
    class TopDownTest{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atmStorage = new Storage();
        }

        @Test
        public void test1(){
            assertTrue(atm.getinput('l'));
        }

        @Test
        public void test2(){
            assertFalse(atm.getinput('w'));
        }

        @Test
        public void test3(){
            assertTrue(atm.getinput('d'));
        }

        @Test
        public void test4(){
            assertTrue(atm.getinput('o'));
        }

        @Test
        public void test5(){
            assertTrue(atm.getinput('u'));
        }

        @Test
        public void test6(){
            assertTrue(atm.getinput('f'));
        }

        @Test
        public void test7(){
            assertTrue(atm.getinput('l'));
        }

        @Test
        public void testatmStorage(){
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(1);
            assertTrue(atmStorage.withdraw());
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(3);
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
        }

    }


    // Make sure class ATM extends ATMstorage
    @Nested
    class BottomUpTest{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atmStorage = new Storage();
        }

        @Test
        public void testatmStorage(){
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(1);
            assertTrue(atmStorage.withdraw());
            assertFalse(atmStorage.withdraw());
            atmStorage.fill(3);
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
            assertTrue(atmStorage.withdraw());
        }


        @Test
        public void test1(){
            assertFalse(atm.getinput('l'));
        }

        @Test
        public void test2(){
            assertFalse(atm.getinput('w'));
        }

        @Test
        public void test3(){
            assertTrue(atm.getinput('d'));
        }

        @Test
        public void test4(){
            assertTrue(atm.getinput('w'));
        }

        @Test
        public void test5(){
            assertTrue(atm.getinput('o'));
        }

        @Test
        public void test6(){
            assertTrue(atm.getinput('u'));
        }

        @Test
        public void test7(){
            assertTrue(atm.getinput('f'));
        }

        @Test
        public void testa8(){
            assertTrue(atm.getinput('l'));
        }

        @Test
        public void test9(){
            assertTrue(atm.getinput('l'));
        }

    }

}