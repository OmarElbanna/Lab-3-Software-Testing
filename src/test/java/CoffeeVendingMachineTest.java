import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CoffeeVendingMachineTest {
    public static CoffeeVendingMachine m;
    public static CoffeeVendingStorage s;
    @BeforeAll
    public static void init(){
        m = new CoffeeVendingMachine();
        s = new CoffeeVendingMachine();
    }
    // Make sure class CoffeeMachine extends CoffeeStorage
    @Nested
    class BottomUpTest{
        @Test
        public void test(){
            assertFalse(s.useBeans());
            assertFalse(s.useWater());
            assertFalse(s.useMilk());
            assertFalse(s.useChocolate());
            s.addBeans(1);
            s.addWater(1);
            s.addMilk(1);
            s.addChocolate(1);
            assertTrue(s.useBeans());
            assertTrue(s.useWater());
            assertTrue(s.useMilk());
            assertTrue(s.useChocolate());
        }


        @Test
        public void test1(){
            assertFalse(m.getinput('c'));
        }

        @Test
        public void test2(){
            assertFalse(m.getinput('l'));
        }

        @Test
        public void test3(){
            assertFalse(m.getinput('m'));
        }

        @Test
        public void test4(){
            assertTrue(m.getinput('r'));
        }

        @Test
        public void test5(){
            assertTrue(m.getinput('c'));
        }

        @Test
        public void test6(){
            assertTrue(m.getinput('m'));
        }

        @Test
        public void test7(){
            assertTrue(m.getinput('w'));
        }

        @Test
        public void test8(){
            assertTrue(m.getinput('b'));
        }

        @Test
        public void test9(){
            assertTrue(m.getinput('v'));
        }

        @Test
        public void test10(){
            assertTrue(m.getinput('c'));
        }

    }

    // Make sure class CoffeeMachine extends CoffeeResStub
    @Nested
    class TopDownTest{
        @Test
        public void test1(){
            assertFalse(m.getinput('c'));
        }

        @Test
        public void test2(){
            assertFalse(m.getinput('l'));
        }

        @Test
        public void test3(){
            assertFalse(m.getinput('m'));
        }

        @Test
        public void test4(){
            assertTrue(m.getinput('r'));
        }

        @Test
        public void test5(){
            assertTrue(m.getinput('c'));
        }

        @Test
        public void test6(){
            assertTrue(m.getinput('m'));
        }

        @Test
        public void test7(){
            assertTrue(m.getinput('w'));
        }

        @Test
        public void test8(){
            assertTrue(m.getinput('b'));
        }

        @Test
        public void test9(){
            assertTrue(m.getinput('v'));
        }

        @Test
        public void test10(){
            assertFalse(m.getinput('c'));
        }

        @Test
        public void test(){
            assertFalse(s.useBeans());
            assertFalse(s.useWater());
            assertFalse(s.useMilk());
            assertFalse(s.useChocolate());
            s.addBeans(1);
            s.addWater(1);
            s.addMilk(1);
            s.addChocolate(1);
            assertTrue(s.useBeans());
            assertTrue(s.useWater());
            assertTrue(s.useMilk());
            assertTrue(s.useChocolate());
        }

    }


}