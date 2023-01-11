package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression__AA2_Test {

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
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        java.lang.Class<?> wildcardClass1 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass7 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass7 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 100, (int) 'a');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, (int) (short) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 10, 100);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 0, 100);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (-1), (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (byte) 1, 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) (byte) 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) '#', (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", 0, (int) '#');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (byte) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 1, (-1));
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (byte) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (short) -1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass43 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 1, (int) (byte) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", 1, (int) (byte) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "hi!", (int) (byte) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) -1, (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (-1), (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) '#', 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "", (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) -1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 0, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 10, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (short) 10, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 0, (int) (byte) 0);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", (int) (short) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "", (int) (short) -1, (int) 'a');
        ViewerFactory.Chart chart50 = null;
        Analysis.AnalysisStrategy analysisStrategy54 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart50, "hi!", 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass55 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", 10, (int) '#');
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '4', (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) ' ', (int) (short) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (short) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (short) 100, (int) (short) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) 'a', 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (-1), (int) (short) 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) '#', (int) (short) 100);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "hi!", (int) (byte) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (short) -1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", (int) (short) 0, (int) (short) 0);
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart44, "hi!", (int) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 0, (int) (short) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (short) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 10, (int) ' ');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (byte) 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) '#', (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", 100, 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (short) -1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "", (int) (byte) 1, (int) (byte) 100);
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "hi!", (int) (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) -1, (int) (short) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (-1));
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", (int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 0, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 10, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 1, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (-1), (int) (short) 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) '#', (int) (short) 100);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", 0, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 0, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 10, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (short) 10, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 0, (int) (byte) 0);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 1, (-1));
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (byte) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) 'a', (int) (short) -1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) '4', (int) (short) -1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "", (int) (byte) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", 1, (int) (byte) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (byte) 1, 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (short) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 0, (int) (short) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", 100, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '4', (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 10, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", 10, (int) (byte) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart44, "hi!", 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass49 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) '#', (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", 0, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 0, (int) (byte) 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "hi!", (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 100, (int) (short) 10);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 100, (int) 'a');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '#', (int) (short) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (-1), (int) (short) 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) 10, 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) ' ', (int) (short) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (short) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '#', 100);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) '#', (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 0, (int) (short) 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) 10, (int) (byte) 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", 1, 1);
        java.lang.Class<?> wildcardClass43 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '#', 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '4', (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 10, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", 10, (int) (byte) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 0, (int) (short) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", 100, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (-1), (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 1, (int) (byte) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 100, (int) (short) 10);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (short) 0, (int) (byte) 0);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "hi!", 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", 0, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 0, (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 10, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", 1, 0);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) '4', 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (byte) 0, (int) ' ');
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "hi!", (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) '4', (int) ' ');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) -1, (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) (byte) 100, (int) (short) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 1, 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", (int) (byte) 1, 1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 100, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 100, (int) 'a');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) '#', (int) (short) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 1, (int) (byte) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 10, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (short) -1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 10, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 0, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) '#', (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (-1), (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) '4', 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) -1, (int) (short) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (-1));
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (short) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (short) 100, (int) (short) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) 'a', 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", 10, (int) (byte) 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", 100, 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '4', (int) (byte) 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (byte) 0, (int) (short) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (short) 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", 10, 1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (short) -1, (int) (byte) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "", (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass43 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) ' ', (int) (byte) 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) 'a');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", 1, (int) (byte) 1);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "", (int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = analysisStrategy42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 0, (int) (short) 1);
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "", (int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) '#', (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", 100, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (short) 10, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) 0, (int) '4');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) '#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) -1, (int) (short) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass31 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", 0, (-1));
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", 100, (int) (byte) 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", (int) (short) 0, (int) (byte) -1);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass37 = analysisStrategy36.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (short) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) '#', (int) '4');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", 0, (int) '#');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) (byte) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart44, "hi!", 100, (int) (byte) 0);
        ViewerFactory.Chart chart50 = null;
        Analysis.AnalysisStrategy analysisStrategy54 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart50, "hi!", (int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy54);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "hi!", (int) (byte) 10, (int) (byte) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", 100, (int) '4');
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) -1, 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) 1, (int) (short) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (-1), (int) ' ');
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "", (int) (short) -1, (int) 'a');
        ViewerFactory.Chart chart50 = null;
        Analysis.AnalysisStrategy analysisStrategy54 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart50, "", (int) ' ', (int) (short) 0);
        ViewerFactory.Chart chart56 = null;
        Analysis.AnalysisStrategy analysisStrategy60 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart56, "", 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy60);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 10, (int) '#');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (short) 1, 0);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) '#', (-1));
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (byte) 0, (int) (byte) 1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 1, (int) (byte) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) -1, (int) (short) 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = analysisStrategy30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass19 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 1, 100);
        java.lang.Class<?> wildcardClass13 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "", (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "hi!", (int) (short) 10, (int) (byte) 10);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (byte) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) '#', (int) (byte) -1);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "hi!", (int) 'a', (int) (short) -1);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "", 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "", (int) (short) -1, (int) 'a');
        ViewerFactory.Chart chart50 = null;
        Analysis.AnalysisStrategy analysisStrategy54 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart50, "hi!", 100, (int) (short) 100);
        ViewerFactory.Chart chart56 = null;
        Analysis.AnalysisStrategy analysisStrategy60 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart56, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart62 = null;
        Analysis.AnalysisStrategy analysisStrategy66 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart62, "hi!", (int) ' ', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy66);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", (int) (byte) -1, 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 0, (int) (short) -1);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", 100, 100);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) 10, 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", 0, (int) (byte) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "hi!", 10, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (short) 100, (-1));
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("", chart20, "hi!", (int) (short) -1, (int) (byte) 0);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "hi!", (int) (byte) -1, (int) '#');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '4', (int) (byte) 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "", (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = analysisMethodFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "hi!", (int) (short) -1, (int) (short) 100);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "", 0, (int) '4');
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("", chart14, "", (int) (byte) 100, 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) 'a', (int) (byte) 10);
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart26, "", (int) '#', 100);
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart32, "hi!", (int) (byte) 1, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart38, "", 100, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("", chart2, "", 100, (int) (short) 1);
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart8, "hi!", (int) ' ', (int) (short) 100);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "hi!", (int) (byte) -1, (int) ' ');
        ViewerFactory.Chart chart26 = null;
        Analysis.AnalysisStrategy analysisStrategy30 = analysisMethodFactory0.getAnalysisStrategy("", chart26, "", 0, (int) 'a');
        ViewerFactory.Chart chart32 = null;
        Analysis.AnalysisStrategy analysisStrategy36 = analysisMethodFactory0.getAnalysisStrategy("", chart32, "hi!", (int) (byte) 100, 10);
        ViewerFactory.Chart chart38 = null;
        Analysis.AnalysisStrategy analysisStrategy42 = analysisMethodFactory0.getAnalysisStrategy("", chart38, "hi!", (int) (byte) 100, (int) 'a');
        ViewerFactory.Chart chart44 = null;
        Analysis.AnalysisStrategy analysisStrategy48 = analysisMethodFactory0.getAnalysisStrategy("", chart44, "hi!", (int) ' ', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy48);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Analysis.AnalysisMethodFactory analysisMethodFactory0 = new Analysis.AnalysisMethodFactory();
        ViewerFactory.Chart chart2 = null;
        Analysis.AnalysisStrategy analysisStrategy6 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart2, "", (int) (byte) 10, (int) '4');
        ViewerFactory.Chart chart8 = null;
        Analysis.AnalysisStrategy analysisStrategy12 = analysisMethodFactory0.getAnalysisStrategy("", chart8, "", 100, (int) (short) 10);
        ViewerFactory.Chart chart14 = null;
        Analysis.AnalysisStrategy analysisStrategy18 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart14, "", (int) (short) 1, (int) (short) 0);
        ViewerFactory.Chart chart20 = null;
        Analysis.AnalysisStrategy analysisStrategy24 = analysisMethodFactory0.getAnalysisStrategy("hi!", chart20, "", (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = analysisStrategy24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy24);
    }
}

