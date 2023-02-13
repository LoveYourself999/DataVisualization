package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_DF_Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        boolean boolean4 = data_Fetcher3.year();
        boolean boolean5 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        java.lang.Class<?> wildcardClass2 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        boolean boolean4 = data_Fetcher3.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        java.lang.Class<?> wildcardClass1 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher0.getMethod();
        int int5 = data_Fetcher0.getStartYear();
        java.lang.Class<?> wildcardClass6 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        java.lang.String str5 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        boolean boolean4 = data_Fetcher3.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        int int4 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getStartYear();
        java.lang.String str5 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        int int4 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher0.getMethod();
        int int5 = data_Fetcher0.getStartYear();
        int int6 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        java.lang.String str1 = data_Fetcher0.getCountryName();
        java.lang.Class<?> wildcardClass2 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 1, (int) (short) 0);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) -1, 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getStartYear();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getStartYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        java.lang.Class<?> wildcardClass5 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) 'a', 52);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        java.lang.Class<?> wildcardClass7 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        int int6 = data_Fetcher0.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        java.lang.String str1 = data_Fetcher0.getCountryName();
        int int2 = data_Fetcher0.getStartYear();
        int int3 = data_Fetcher0.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (-1));
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        boolean boolean4 = data_Fetcher3.year();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        java.lang.Class<?> wildcardClass7 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        boolean boolean2 = data_Fetcher0.year();
        java.lang.Class<?> wildcardClass3 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        boolean boolean5 = data_Fetcher0.year();
        int int6 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        java.lang.String str1 = data_Fetcher0.getCountryName();
        java.lang.String str2 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        java.lang.Class<?> wildcardClass5 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        int int4 = data_Fetcher3.getStartYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        int int5 = data_Fetcher0.getStartYear();
        java.lang.Class<?> wildcardClass6 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        boolean boolean1 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        boolean boolean5 = data_Fetcher3.year();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        boolean boolean6 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        boolean boolean7 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 0, (int) 'a');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        int int7 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 52, (int) (byte) 10);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 0, (int) 'a');
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        int int6 = data_Fetcher3.getStartYear();
        java.lang.String str7 = data_Fetcher3.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy8 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        int int1 = data_Fetcher0.getEndYear();
        java.lang.Class<?> wildcardClass2 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        int int7 = data_Fetcher3.getEndYear();
        java.lang.Class<?> wildcardClass8 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        int int4 = data_Fetcher3.getStartYear();
        boolean boolean5 = data_Fetcher3.year();
        boolean boolean6 = data_Fetcher3.year();
        int int7 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        boolean boolean5 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getEndYear();
        boolean boolean4 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) 'a', 52);
        boolean boolean4 = data_Fetcher3.year();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        java.lang.Class<?> wildcardClass6 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 0, (int) 'a');
        int int4 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) -1, 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        boolean boolean5 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, (int) (short) 0);
        boolean boolean4 = data_Fetcher3.year();
        boolean boolean5 = data_Fetcher3.year();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        int int2 = data_Fetcher0.getStartYear();
        int int3 = data_Fetcher0.getStartYear();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, 97);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 100, 100);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        boolean boolean6 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        java.lang.String str2 = data_Fetcher0.getCountryName();
        java.lang.Class<?> wildcardClass3 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 10, (int) (short) -1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 1, (int) '#');
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) -1, (int) '4');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        boolean boolean1 = data_Fetcher0.year();
        int int2 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        int int5 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 100, (int) ' ');
        int int4 = data_Fetcher3.getEndYear();
        int int5 = data_Fetcher3.getEndYear();
        java.lang.Class<?> wildcardClass6 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 100, (int) '#');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) 'a');
        int int4 = data_Fetcher3.getEndYear();
        int int5 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getEndYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        boolean boolean6 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getStartYear();
        int int7 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        boolean boolean6 = data_Fetcher0.year();
        int int7 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy8 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) 'a', 52);
        boolean boolean4 = data_Fetcher3.year();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        boolean boolean4 = data_Fetcher3.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        int int6 = data_Fetcher3.getEndYear();
        java.lang.Class<?> wildcardClass7 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 10);
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 1, 1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        int int4 = data_Fetcher3.getStartYear();
        boolean boolean5 = data_Fetcher3.year();
        boolean boolean6 = data_Fetcher3.year();
        boolean boolean7 = data_Fetcher3.year();
        int int8 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        boolean boolean1 = data_Fetcher0.year();
        java.lang.String str2 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getStartYear();
        boolean boolean6 = data_Fetcher3.year();
        int int7 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 0, (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getEndYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = analysisStrategy6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 10);
        int int4 = data_Fetcher3.getStartYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getEndYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, 97);
        int int4 = data_Fetcher3.getStartYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        boolean boolean2 = data_Fetcher0.year();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (-1), (int) (short) 1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        int int6 = data_Fetcher0.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        int int6 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) '#');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        int int6 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, (int) (short) 0);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) -1, (int) (short) 1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        boolean boolean6 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.Class<?> wildcardClass6 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 1);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getStartYear();
        boolean boolean8 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, 97);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        java.lang.Class<?> wildcardClass4 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 1, (int) (short) 0);
        int int4 = data_Fetcher3.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        boolean boolean6 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (-1), (int) (byte) 100);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        int int4 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) 'a', (int) 'a');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 1, (int) (short) 0);
        int int4 = data_Fetcher3.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        boolean boolean7 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getStartYear();
        int int8 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy9 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        java.lang.String str5 = data_Fetcher0.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        boolean boolean7 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 100, (int) (byte) 1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) '4');
        java.lang.String str4 = data_Fetcher3.getCountryName();
        boolean boolean5 = data_Fetcher3.year();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher3.getMethod();
        int int8 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        java.lang.String str6 = data_Fetcher3.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy7 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher0.getMethod();
        int int5 = data_Fetcher0.getStartYear();
        int int6 = data_Fetcher0.getStartYear();
        boolean boolean7 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getStartYear();
        boolean boolean5 = data_Fetcher0.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        int int2 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        int int7 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        int int4 = data_Fetcher3.getStartYear();
        boolean boolean5 = data_Fetcher3.year();
        boolean boolean6 = data_Fetcher3.year();
        boolean boolean7 = data_Fetcher3.year();
        java.lang.String str8 = data_Fetcher3.getCountryName();
        int int9 = data_Fetcher3.getEndYear();
        java.lang.Class<?> wildcardClass10 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (byte) 100, 97);
        java.lang.Class<?> wildcardClass4 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getStartYear();
        boolean boolean6 = data_Fetcher3.year();
        java.lang.String str7 = data_Fetcher3.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 10);
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getEndYear();
        boolean boolean6 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (-1), 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        java.lang.String str4 = data_Fetcher3.getCountryName();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getEndYear();
        boolean boolean7 = data_Fetcher3.year();
        int int8 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        int int4 = data_Fetcher3.getStartYear();
        boolean boolean5 = data_Fetcher3.year();
        boolean boolean6 = data_Fetcher3.year();
        java.lang.String str7 = data_Fetcher3.getCountryName();
        java.lang.Class<?> wildcardClass8 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        int int4 = data_Fetcher3.getStartYear();
        boolean boolean5 = data_Fetcher3.year();
        boolean boolean6 = data_Fetcher3.year();
        boolean boolean7 = data_Fetcher3.year();
        java.lang.String str8 = data_Fetcher3.getCountryName();
        java.lang.Class<?> wildcardClass9 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        Analysis.AnalysisStrategy analysisStrategy1 = data_Fetcher0.getMethod();
        java.lang.String str2 = data_Fetcher0.getCountryName();
        int int3 = data_Fetcher0.getEndYear();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 0, (int) (short) -1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) 'a');
        boolean boolean4 = data_Fetcher3.year();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 0, (int) '#');
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        boolean boolean6 = data_Fetcher0.year();
        int int7 = data_Fetcher0.getEndYear();
        java.lang.Class<?> wildcardClass8 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) '4', (int) (byte) 10);
        int int4 = data_Fetcher3.getStartYear();
        int int5 = data_Fetcher3.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getStartYear();
        int int8 = data_Fetcher0.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (int) (short) 100, (int) ' ');
        int int4 = data_Fetcher3.getEndYear();
        int int5 = data_Fetcher3.getEndYear();
        int int6 = data_Fetcher3.getStartYear();
        int int7 = data_Fetcher3.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (short) 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getStartYear();
        java.lang.Class<?> wildcardClass8 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 10, 0);
        int int4 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        boolean boolean4 = data_Fetcher0.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher0.getMethod();
        boolean boolean6 = data_Fetcher0.year();
        int int7 = data_Fetcher0.getStartYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Data_fetcher.Data_Fetcher data_Fetcher0 = Data_fetcher.Data_Fetcher.getInstance();
        java.lang.String str1 = data_Fetcher0.getCountryName();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.Class<?> wildcardClass3 = data_Fetcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(data_Fetcher0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) -1, (int) 'a');
        int int4 = data_Fetcher3.getStartYear();
        java.lang.Class<?> wildcardClass5 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, (int) (byte) 100);
        boolean boolean4 = data_Fetcher3.year();
        Analysis.AnalysisStrategy analysisStrategy5 = data_Fetcher3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 0, 1);
        int int4 = data_Fetcher3.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        int int4 = data_Fetcher0.getStartYear();
        int int5 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 32, (int) '4');
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", 100, (int) (short) -1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (short) 1, (int) (short) -1);
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher3.getMethod();
        java.lang.String str5 = data_Fetcher3.getCountryName();
        boolean boolean6 = data_Fetcher3.year();
        java.lang.Class<?> wildcardClass7 = data_Fetcher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        int int3 = data_Fetcher0.getStartYear();
        int int4 = data_Fetcher0.getEndYear();
        int int5 = data_Fetcher0.getEndYear();
        Analysis.AnalysisStrategy analysisStrategy6 = data_Fetcher0.getMethod();
        int int7 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy8 = data_Fetcher0.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("", (-1), (int) (short) 1);
        boolean boolean4 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        java.lang.String str4 = data_Fetcher0.getCountryName();
        int int5 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 100, 97);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) ' ', (int) (byte) 0);
        boolean boolean4 = data_Fetcher3.year();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy3 = data_Fetcher0.getMethod();
        Analysis.AnalysisStrategy analysisStrategy4 = data_Fetcher0.getMethod();
        int int5 = data_Fetcher0.getStartYear();
        int int6 = data_Fetcher0.getStartYear();
        int int7 = data_Fetcher0.getStartYear();
        int int8 = data_Fetcher0.getEndYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Data_fetcher.Data_Fetcher data_Fetcher0 = new Data_fetcher.Data_Fetcher();
        int int1 = data_Fetcher0.getStartYear();
        Analysis.AnalysisStrategy analysisStrategy2 = data_Fetcher0.getMethod();
        java.lang.String str3 = data_Fetcher0.getCountryName();
        boolean boolean4 = data_Fetcher0.year();
        int int5 = data_Fetcher0.getEndYear();
        java.lang.String str6 = data_Fetcher0.getCountryName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", (int) (byte) 1, (-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 0, (int) (short) 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Data_fetcher.Data_Fetcher data_Fetcher3 = new Data_fetcher.Data_Fetcher("hi!", 97, (int) (short) 10);
    }
}

