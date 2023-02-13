package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AA1_Test {

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
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        java.lang.Class<?> wildcardClass1 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass4 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        java.lang.Class<?> wildcardClass7 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass2 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass7 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        java.lang.Class<?> wildcardClass4 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass6 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = analysisStrategy10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = analysisStrategy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        java.lang.Class<?> wildcardClass7 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = analysisStrategy10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = analysisStrategy7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = analysisStrategy3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass3 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        java.lang.Class<?> wildcardClass17 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass4 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = analysisStrategy7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass6 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = analysisStrategy13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = analysisStrategy16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass16 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = analysisStrategy7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = analysisStrategy9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        java.lang.Class<?> wildcardClass16 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = analysisStrategy2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        java.lang.Class<?> wildcardClass19 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = analysisStrategy4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        java.lang.Class<?> wildcardClass17 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass7 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        java.lang.Class<?> wildcardClass19 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = analysisStrategy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        java.lang.Class<?> wildcardClass6 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = analysisStrategy9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = analysisStrategy10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        java.lang.Class<?> wildcardClass16 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = analysisStrategy14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        Analysis.AnalysisStrategy analysisStrategy20 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy20);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = analysisStrategy15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        java.lang.Class<?> wildcardClass6 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass20 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = analysisStrategy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = analysisStrategy18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = analysisStrategy5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = analysisStrategy12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass17 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = analysisStrategy3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        java.lang.Class<?> wildcardClass16 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass18 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        java.lang.Class<?> wildcardClass18 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy19 = null;
        analysisContent0.setStrategy(analysisStrategy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        java.lang.Class<?> wildcardClass20 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        java.lang.Class<?> wildcardClass19 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = analysisStrategy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = analysisStrategy7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        java.lang.Class<?> wildcardClass11 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        java.lang.Class<?> wildcardClass19 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = analysisStrategy14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = analysisStrategy15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        java.lang.Class<?> wildcardClass17 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = analysisStrategy16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        java.lang.Class<?> wildcardClass18 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        java.lang.Class<?> wildcardClass19 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = null;
        analysisContent0.setStrategy(analysisStrategy18);
        Analysis.AnalysisStrategy analysisStrategy20 = null;
        analysisContent0.setStrategy(analysisStrategy20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = analysisStrategy19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        Analysis.AnalysisStrategy analysisStrategy18 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy18);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        java.lang.Class<?> wildcardClass5 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        java.lang.Class<?> wildcardClass18 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy20 = null;
        analysisContent0.setStrategy(analysisStrategy20);
        Analysis.AnalysisStrategy analysisStrategy22 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy22);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
        Analysis.AnalysisStrategy analysisStrategy19 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy19);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass13 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = null;
        analysisContent0.setStrategy(analysisStrategy15);
        Analysis.AnalysisStrategy analysisStrategy17 = null;
        analysisContent0.setStrategy(analysisStrategy17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass17 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass16 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        java.lang.Class<?> wildcardClass15 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        java.lang.Class<?> wildcardClass10 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        Analysis.AnalysisStrategy analysisStrategy16 = null;
        analysisContent0.setStrategy(analysisStrategy16);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        java.lang.Class<?> wildcardClass5 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        java.lang.Class<?> wildcardClass14 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass12 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        Analysis.AnalysisStrategy analysisStrategy14 = null;
        analysisContent0.setStrategy(analysisStrategy14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy12 = null;
        analysisContent0.setStrategy(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy17 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy17);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = null;
        analysisContent0.setStrategy(analysisStrategy2);
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = null;
        analysisContent0.setStrategy(analysisStrategy9);
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = null;
        analysisContent0.setStrategy(analysisStrategy6);
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = null;
        analysisContent0.setStrategy(analysisStrategy10);
        Analysis.AnalysisStrategy analysisStrategy12 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy16 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            analysisContent0.executeStrategy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.displayChart()\" because \"this.strategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy16);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass8 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = null;
        analysisContent0.setStrategy(analysisStrategy4);
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        Analysis.AnalysisStrategy analysisStrategy13 = null;
        analysisContent0.setStrategy(analysisStrategy13);
        Analysis.AnalysisStrategy analysisStrategy15 = analysisContent0.getStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        java.lang.Class<?> wildcardClass9 = analysisContent0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy6 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy7 = null;
        analysisContent0.setStrategy(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy9 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = null;
        analysisContent0.setStrategy(analysisStrategy11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Analysis.AnalysisContent analysisContent0 = new Analysis.AnalysisContent();
        Analysis.AnalysisStrategy analysisStrategy1 = null;
        analysisContent0.setStrategy(analysisStrategy1);
        Analysis.AnalysisStrategy analysisStrategy3 = null;
        analysisContent0.setStrategy(analysisStrategy3);
        Analysis.AnalysisStrategy analysisStrategy5 = null;
        analysisContent0.setStrategy(analysisStrategy5);
        Analysis.AnalysisStrategy analysisStrategy7 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy8 = null;
        analysisContent0.setStrategy(analysisStrategy8);
        Analysis.AnalysisStrategy analysisStrategy10 = analysisContent0.getStrategy();
        Analysis.AnalysisStrategy analysisStrategy11 = analysisContent0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = analysisStrategy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy11);
    }
}

