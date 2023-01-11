package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AO13_Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap6 = subject0.setState("", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.Class<?> wildcardClass3 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass9 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass9 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("hi!", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.lang.Class<?> wildcardClass12 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        java.lang.Class<?> wildcardClass10 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.setState("hi!", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap6 = subject0.setState("", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = strList4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.setState("hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass9 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass6 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("hi!", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass15 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        java.lang.Class<?> wildcardClass11 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (-1), (int) '#');
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("hi!", 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) 'a', 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("hi!", (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) 'a', 0);
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap6 = subject0.notifyAllObservers("hi!", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass9 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        Analysis_Observer.Observer observer18 = null;
        subject0.attach(observer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.notifyAllObservers("hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        Analysis_Observer.Observer observer3 = null;
        subject0.attach(observer3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList5 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList6 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        Analysis_Observer.Observer observer17 = null;
        subject0.attach(observer17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.setState("hi!", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.lang.String str14 = subject0.getState();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("hi!", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.Class<?> wildcardClass10 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.notifyAllObservers("", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        Analysis_Observer.Observer observer16 = null;
        subject0.attach(observer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.notifyAllObservers("", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass13 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.lang.String str15 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) 'a', 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) (byte) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList5 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("hi!", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 0, (int) '4');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 100, 100);
        java.lang.Class<?> wildcardClass18 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.Class<?> wildcardClass15 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.util.ArrayList<java.lang.String> strList12 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        java.lang.Class<?> wildcardClass7 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass15 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", 10, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("", (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass19 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", (int) ' ', (int) (byte) 1);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.ArrayList<java.lang.String> strList1 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = strMap5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.setState("hi!", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", 0, (int) (byte) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.setState("", 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("", (int) (short) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.lang.String str11 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("hi!", (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass16 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) '4', (int) (byte) 10);
        java.lang.String str22 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList23 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass24 = strList23.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("hi!", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = strMap18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 0, (int) '4');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 100, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) (short) 0, (int) '#');
        java.util.ArrayList<java.lang.String> strList22 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap26 = subject0.setState("hi!", (int) (short) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.setState("hi!", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("hi!", 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        java.lang.String str5 = subject0.getState();
        java.lang.Class<?> wildcardClass6 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.ArrayList<java.lang.String> strList1 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (short) 1, (int) (short) -1);
        java.lang.String str6 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.lang.String str16 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.lang.String str11 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("hi!", (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", 10, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("", (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass19 = strMap18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        Analysis_Observer.Observer observer16 = null;
        subject0.attach(observer16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.lang.String str13 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (short) 1, (-1));
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.lang.String str14 = subject0.getState();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        java.lang.String str3 = subject0.getState();
        java.lang.Class<?> wildcardClass4 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.lang.String str14 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", 0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        java.lang.String str13 = subject0.getState();
        java.lang.String str14 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        java.lang.String str19 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap23 = subject0.notifyAllObservers("", (int) (byte) 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 10, (int) (short) 100);
        java.lang.String str18 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.setState("", (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList5 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        Analysis_Observer.Observer observer17 = null;
        subject0.attach(observer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.lang.String str5 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList6 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 0, (int) '4');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 100, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass22 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        Analysis_Observer.Observer observer21 = null;
        subject0.attach(observer21);
        Analysis_Observer.Observer observer23 = null;
        subject0.attach(observer23);
        java.util.ArrayList<java.lang.String> strList25 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.lang.Class<?> wildcardClass12 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("hi!", (int) '4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 0, (int) 'a');
        java.util.ArrayList<java.lang.String> strList18 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.lang.String str18 = subject0.getState();
        java.lang.String str19 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        java.lang.Class<?> wildcardClass16 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        Analysis_Observer.Observer observer7 = null;
        subject0.attach(observer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.lang.Class<?> wildcardClass12 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList5 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        Analysis_Observer.Observer observer19 = null;
        subject0.attach(observer19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        Analysis_Observer.Observer observer16 = null;
        subject0.attach(observer16);
        java.util.ArrayList<java.lang.String> strList18 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.notifyAllObservers("hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", (int) '4', 0);
        java.util.ArrayList<java.lang.String> strList18 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("hi!", (-1), 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("", (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", 10, (int) (short) -1);
        java.lang.String str9 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.lang.String str6 = subject0.getState();
        java.lang.String str7 = subject0.getState();
        java.lang.String str8 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.util.ArrayList<java.lang.String> strList18 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("hi!", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 0, (int) '4');
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap7 = subject0.notifyAllObservers("hi!", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 10, (int) (short) 100);
        java.lang.String str18 = subject0.getState();
        Analysis_Observer.Observer observer19 = null;
        subject0.attach(observer19);
        java.lang.Class<?> wildcardClass21 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList3 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 10, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        java.lang.String str3 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap7 = subject0.notifyAllObservers("", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        Analysis_Observer.Observer observer17 = null;
        subject0.attach(observer17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.notifyAllObservers("hi!", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        Analysis_Observer.Observer observer21 = null;
        subject0.attach(observer21);
        Analysis_Observer.Observer observer23 = null;
        subject0.attach(observer23);
        java.lang.String str25 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.lang.String str15 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        java.lang.String str17 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", (int) (byte) 10, (int) ' ');
        java.util.ArrayList<java.lang.String> strList22 = subject0.getMethod_list();
        Analysis_Observer.Observer observer23 = null;
        subject0.attach(observer23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.lang.String str5 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 0, (-1));
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("", (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (byte) 100, (int) (byte) 0);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", 10, (int) (short) -1);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", 0, 1);
        java.util.ArrayList<java.lang.String> strList21 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("hi!", 10, 100);
        Analysis_Observer.Observer observer22 = null;
        subject0.attach(observer22);
        Analysis_Observer.Observer observer24 = null;
        subject0.attach(observer24);
        java.lang.String str26 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList27 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap31 = subject0.setState("hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.lang.String str14 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("hi!", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", (int) (byte) -1, (-1));
        java.lang.String str15 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 0, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("hi!", 10, 100);
        Analysis_Observer.Observer observer22 = null;
        subject0.attach(observer22);
        Analysis_Observer.Observer observer24 = null;
        subject0.attach(observer24);
        java.lang.String str26 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList27 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass28 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList2 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap6 = subject0.setState("hi!", (int) (short) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.lang.String str18 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap23 = subject0.notifyAllObservers("hi!", (int) (short) 10, (-1));
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap27 = subject0.notifyAllObservers("hi!", (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 0, (-1));
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.lang.String str14 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.notifyAllObservers("", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", 10, (int) (short) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) ' ', (int) (byte) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("hi!", (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        java.lang.String str13 = subject0.getState();
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        java.util.ArrayList<java.lang.String> strList16 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap7 = subject0.notifyAllObservers("", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.lang.String str10 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList11 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("", (int) (short) 100, 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("", 1, (int) '#');
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("hi!", 10, 100);
        Analysis_Observer.Observer observer22 = null;
        subject0.attach(observer22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap27 = subject0.notifyAllObservers("hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (-1), (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap25 = subject0.setState("", (int) '4', (int) ' ');
        Analysis_Observer.Observer observer26 = null;
        subject0.attach(observer26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        java.lang.String str16 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) ' ', (int) (byte) -1);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.lang.String str16 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        Analysis_Observer.Observer observer17 = null;
        subject0.attach(observer17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.setState("", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) 'a', 0);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass18 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.lang.String str2 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap6 = subject0.notifyAllObservers("", (int) 'a', (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap10 = subject0.notifyAllObservers("hi!", (int) '4', 0);
        java.lang.String str11 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.setState("hi!", (int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", (int) '4', 0);
        java.lang.String str18 = subject0.getState();
        Analysis_Observer.Observer observer19 = null;
        subject0.attach(observer19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.lang.String str14 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.lang.String str18 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass20 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("hi!", (int) (short) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass15 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", (int) (byte) 0, 0);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.util.ArrayList<java.lang.String> strList12 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        java.lang.String str7 = subject0.getState();
        java.lang.Class<?> wildcardClass8 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("", (int) (short) 100, 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("", 1, (int) '#');
        Analysis_Observer.Observer observer21 = null;
        subject0.attach(observer21);
        java.lang.Class<?> wildcardClass23 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("hi!", (int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass18 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (-1), (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap25 = subject0.setState("hi!", (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        java.lang.String str14 = subject0.getState();
        java.lang.String str15 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        java.util.ArrayList<java.lang.String> strList11 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass12 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        java.lang.String str21 = subject0.getState();
        java.lang.Class<?> wildcardClass22 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (short) 1, (-1));
        Analysis_Observer.Observer observer14 = null;
        subject0.attach(observer14);
        Analysis_Observer.Observer observer16 = null;
        subject0.attach(observer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) ' ', (int) (byte) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("", (int) '#', 1);
        java.lang.String str17 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", (int) (byte) 1, 100);
        java.lang.String str9 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("hi!", (int) (byte) 0, 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("", 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList11 = subject0.getMethod_list();
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.lang.String str4 = subject0.getState();
        java.lang.String str5 = subject0.getState();
        java.lang.String str6 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        Analysis_Observer.Observer observer9 = null;
        subject0.attach(observer9);
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.notifyAllObservers("hi!", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", (int) '4', 0);
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("hi!", 0, (int) '4');
        java.lang.String str14 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("hi!", 0, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (-1), (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        Analysis_Observer.Observer observer12 = null;
        subject0.attach(observer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.setState("", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.notifyAllObservers("hi!", (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 1, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("", (int) '#', (int) ' ');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap22 = subject0.setState("hi!", 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("", (int) (short) 10, 100);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("hi!", (int) (byte) 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (short) 10, (int) 'a');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.util.ArrayList<java.lang.String> strList12 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        java.lang.String str16 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        Analysis_Observer.Observer observer4 = null;
        subject0.attach(observer4);
        java.lang.Class<?> wildcardClass6 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", 10, (int) (short) 100);
        java.lang.String str18 = subject0.getState();
        Analysis_Observer.Observer observer19 = null;
        subject0.attach(observer19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap24 = subject0.notifyAllObservers("hi!", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.lang.String str11 = subject0.getState();
        java.lang.String str12 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 1, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("", (int) '#', (int) ' ');
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", (int) '4', (int) (short) -1);
        java.lang.String str19 = subject0.getState();
        java.lang.String str20 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("", (int) (byte) 1, (int) '#');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.notifyAllObservers("", (-1), (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        Analysis_Observer.Observer observer6 = null;
        subject0.attach(observer6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap11 = subject0.setState("hi!", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.lang.String str18 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap23 = subject0.notifyAllObservers("hi!", (int) (short) 10, (-1));
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap27 = subject0.notifyAllObservers("", (int) (short) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        Analysis_Observer.Observer observer11 = null;
        subject0.attach(observer11);
        java.lang.Class<?> wildcardClass13 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", 100, (int) '#');
        java.lang.String str18 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        java.lang.String str20 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.lang.String str15 = subject0.getState();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap19 = subject0.setState("", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", 10, (int) ' ');
        java.lang.String str15 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap7 = subject0.setState("hi!", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 0, (-1));
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("", 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) '4', (int) (byte) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap25 = subject0.setState("hi!", (int) (short) 10, (int) ' ');
        Analysis_Observer.Observer observer26 = null;
        subject0.attach(observer26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        Analysis_Observer.Observer observer21 = null;
        subject0.attach(observer21);
        java.lang.Class<?> wildcardClass23 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        java.util.ArrayList<java.lang.String> strList7 = subject0.getMethod_list();
        Analysis_Observer.Observer observer8 = null;
        subject0.attach(observer8);
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("hi!", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("hi!", (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass14 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        Analysis_Observer.Observer observer6 = null;
        subject0.attach(observer6);
        Analysis_Observer.Observer observer8 = null;
        subject0.attach(observer8);
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.lang.String str12 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("hi!", 10, 100);
        Analysis_Observer.Observer observer22 = null;
        subject0.attach(observer22);
        Analysis_Observer.Observer observer24 = null;
        subject0.attach(observer24);
        java.lang.String str26 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList27 = subject0.getMethod_list();
        Analysis_Observer.Observer observer28 = null;
        subject0.attach(observer28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) ' ', (int) 'a');
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("hi!", 10, 100);
        java.lang.String str22 = subject0.getState();
        java.lang.Class<?> wildcardClass23 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        Analysis_Observer.Observer observer17 = null;
        subject0.attach(observer17);
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (short) 10, (int) (short) 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (short) 1, (int) '#');
        java.lang.String str13 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) (short) -1);
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        java.lang.String str14 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("", 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("hi!", (int) (byte) 1, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("", (int) (byte) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 0, (-1));
        java.lang.String str14 = subject0.getState();
        java.lang.Class<?> wildcardClass15 = subject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", (int) (byte) 10, (int) ' ');
        java.lang.String str22 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", 100, (int) (short) 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.notifyAllObservers("hi!", (int) (byte) 100, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.notifyAllObservers("", (int) '4', (int) (byte) 10);
        java.lang.String str22 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList23 = subject0.getMethod_list();
        Analysis_Observer.Observer observer24 = null;
        subject0.attach(observer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap15 = subject0.notifyAllObservers("hi!", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.lang.String str5 = subject0.getState();
        java.lang.String str6 = subject0.getState();
        Analysis_Observer.Observer observer7 = null;
        subject0.attach(observer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        Analysis_Observer.Observer observer5 = null;
        subject0.attach(observer5);
        java.util.ArrayList<java.lang.String> strList7 = subject0.getMethod_list();
        Analysis_Observer.Observer observer8 = null;
        subject0.attach(observer8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("hi!", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("hi!", 10, (int) '#');
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.ArrayList<java.lang.String> strList10 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.notifyAllObservers("", 10, (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap18 = subject0.setState("hi!", (int) (short) 1, (int) (short) 0);
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        Analysis_Observer.Observer observer10 = null;
        subject0.attach(observer10);
        java.util.ArrayList<java.lang.String> strList12 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.notifyAllObservers("hi!", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.notifyAllObservers("", (int) (short) 10, (int) (byte) 100);
        java.util.ArrayList<java.lang.String> strList14 = subject0.getMethod_list();
        Analysis_Observer.Observer observer15 = null;
        subject0.attach(observer15);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.ArrayList<java.lang.String> strList1 = subject0.getMethod_list();
        Analysis_Observer.Observer observer2 = null;
        subject0.attach(observer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) '#', (int) (byte) 0);
        java.lang.String str13 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap17 = subject0.setState("hi!", (int) '4', 0);
        java.lang.String str18 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList19 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.lang.String str4 = subject0.getState();
        java.lang.String str5 = subject0.getState();
        Analysis_Observer.Observer observer6 = null;
        subject0.attach(observer6);
        java.lang.String str8 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.lang.String str1 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap5 = subject0.setState("hi!", (int) (byte) 100, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.setState("", (-1), (int) ' ');
        java.lang.String str10 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("", (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.lang.String str10 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap14 = subject0.setState("", (int) (short) -1, 100);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.notifyAllObservers("", (int) (byte) -1, (int) (short) 1);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap20 = subject0.setState("", (int) (short) 100, (int) '4');
        Analysis_Observer.Observer observer21 = null;
        subject0.attach(observer21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap26 = subject0.setState("", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.lang.String str9 = subject0.getState();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap13 = subject0.setState("", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.notifyAllObservers("", (int) (short) 1, (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, (int) '#');
        java.util.ArrayList<java.lang.String> strList9 = subject0.getMethod_list();
        java.lang.String str10 = subject0.getState();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.notifyAllObservers("", (int) 'a', (int) 'a');
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) ' ', (int) 'a');
        java.util.ArrayList<java.lang.String> strList13 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        Analysis_Observer.Observer observer13 = null;
        subject0.attach(observer13);
        java.util.ArrayList<java.lang.String> strList15 = subject0.getMethod_list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap4 = subject0.setState("", 0, 100);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap8 = subject0.setState("", (int) (byte) -1, 10);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap12 = subject0.setState("hi!", (int) (byte) 100, (int) (byte) 0);
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap16 = subject0.setState("", (int) (byte) 10, 0);
        java.util.ArrayList<java.lang.String> strList17 = subject0.getMethod_list();
        java.util.HashMap<java.lang.String, java.util.ArrayList> strMap21 = subject0.setState("", (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMap21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Analysis_Observer.Subject subject0 = new Analysis_Observer.Subject();
        Analysis_Observer.Observer observer1 = null;
        subject0.attach(observer1);
        java.lang.String str3 = subject0.getState();
        java.util.ArrayList<java.lang.String> strList4 = subject0.getMethod_list();
        java.util.ArrayList<java.lang.String> strList5 = subject0.getMethod_list();
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashMap<java.lang.String, java.util.ArrayList> strMap9 = subject0.notifyAllObservers("", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis_Observer.Observer.getObserverDes()\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList5);
    }
}

