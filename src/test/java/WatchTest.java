import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class WatchTest {
    public static Watch a;
    public static Alarm b;
    @BeforeAll
    public static void init() {
        a = new Watch();
        b = new Alarm();
    }
    // Make sure class Watch eatends Alarm
    @Nested
    class BottomUpTest {
        @Test
        public void test() {
            assertFalse(b.check());
            assertFalse(b.unset());
            assertTrue(b.set());
            assertTrue(b.check());
            assertTrue(b.set());
            assertFalse(b.set());
            assertTrue(b.unset());
        }


        @Test
        public void test1(){
            assertTrue(a.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(a.input('a'));
        }

        @Test
        public void test3(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test4(){
            assertTrue(a.input('c'));
        }

        @Test
        public void test5(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test6(){
            assertTrue(a.input('u'));
        }

        @Test
        public void test7(){
            assertTrue(a.input('t'));
        }

        @Test
        public void test8(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test9(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test10(){
            assertTrue(a.input('m'));
        }

        @Test
        public void test11(){
            assertTrue(a.input('D'));
        }

        @Test
        public void test12(){
            assertTrue(a.input('M'));
        }

        @Test
        public void test13(){
            assertFalse(a.input('b'));
        }

        @Test
        public void test14(){
            assertTrue(a.input('t'));
        }
    }

    // Make sure class Watch eatends AlarmModStub
    @Nested
    class TopDownTest{

        @Test
        public void test1(){
            assertTrue(a.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(a.input('a'));
        }

        @Test
        public void test3(){
            assertFalse(a.input('u'));
        }

        @Test
        public void test4(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test5(){
            assertTrue(a.input('c'));
        }

        @Test
        public void test6(){
            assertTrue(a.input('t'));
        }

        @Test
        public void test7(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test8(){
            assertTrue(a.input('s'));
        }

        @Test
        public void test9(){
            assertTrue(a.input('m'));
        }

        @Test
        public void test10(){
            assertFalse(a.input('D'));
        }

        @Test
        public void test11(){
            assertFalse(a.input('M'));
        }

        @Test
        public void test12(){
            assertFalse(a.input('b'));
        }

        @Test
        public void test13(){
            assertTrue(a.input('t'));
        }

        @Test
        public void test(){
            assertFalse(b.check());
            assertFalse(b.unset());
            assertTrue(b.set());
            assertTrue(b.check());
            assertTrue(b.set());
            assertFalse(b.set());
            assertTrue(b.unset());
        }

    }

}