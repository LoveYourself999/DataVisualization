package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_VF2_Test {

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
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        java.lang.Class<?> wildcardClass1 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass5 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass9 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass7 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = chart8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass7 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass3 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = chart6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = chart6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = chart2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = chart8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = chart8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass9 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass29 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = chart4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = chart8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = chart4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass31 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass3 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass31 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = chart2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = chart10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass29 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = chart30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass33 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass17 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass29 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = chart30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        ViewerFactory.Chart chart36 = chartFactory0.getChart("");
        ViewerFactory.Chart chart38 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass39 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass35 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass31 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        ViewerFactory.Chart chart36 = chartFactory0.getChart("");
        ViewerFactory.Chart chart38 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = chart38.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart38);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass31 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass5 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = chart14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass31 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = chart30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = chart30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass13 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = chart30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = chart20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        ViewerFactory.Chart chart36 = chartFactory0.getChart("");
        ViewerFactory.Chart chart38 = chartFactory0.getChart("");
        ViewerFactory.Chart chart40 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass41 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass35 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass27 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = chart34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        ViewerFactory.Chart chart36 = chartFactory0.getChart("");
        ViewerFactory.Chart chart38 = chartFactory0.getChart("");
        ViewerFactory.Chart chart40 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass41 = chart40.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart40);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass11 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = chart34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = chart18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("");
        ViewerFactory.Chart chart36 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = chart36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart36);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = chart12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = chart26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = chart16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = chart28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass25 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = chart22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass15 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass23 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass19 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass33 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass21 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart34 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart34);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = chart24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = chart6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ViewerFactory.ChartFactory chartFactory0 = new ViewerFactory.ChartFactory();
        ViewerFactory.Chart chart2 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart4 = chartFactory0.getChart("");
        ViewerFactory.Chart chart6 = chartFactory0.getChart("");
        ViewerFactory.Chart chart8 = chartFactory0.getChart("");
        ViewerFactory.Chart chart10 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart12 = chartFactory0.getChart("");
        ViewerFactory.Chart chart14 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart16 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart18 = chartFactory0.getChart("");
        ViewerFactory.Chart chart20 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart22 = chartFactory0.getChart("");
        ViewerFactory.Chart chart24 = chartFactory0.getChart("");
        ViewerFactory.Chart chart26 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart28 = chartFactory0.getChart("hi!");
        ViewerFactory.Chart chart30 = chartFactory0.getChart("");
        ViewerFactory.Chart chart32 = chartFactory0.getChart("");
        java.lang.Class<?> wildcardClass33 = chartFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(chart32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }
}

