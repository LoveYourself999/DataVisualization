package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AO0_Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, 0.0d, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 10.0f, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass9 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) (short) 0, "");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, (double) (-1L), "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) (short) 0, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) (byte) 100, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 10.0f, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) (short) 10, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (short) -1, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, (double) 0.0f, "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) '4', "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 10L, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', 32.0d, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, 0.0d, "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) (short) 0, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        double double8 = api_Data3.getValue();
        java.lang.String str9 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass10 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 10, (double) 'a', "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        int int9 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass10 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', (double) (byte) 10, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.String str8 = api_Data3.getMethod();
        java.lang.String str9 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 10, (double) 'a', "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.String str8 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass9 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        int int7 = api_Data3.getYear();
        double double8 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        double double8 = api_Data3.getValue();
        java.lang.String str9 = api_Data3.getMethod();
        double double10 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 100, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        double double4 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) -1, 100.0d, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) 10, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (-1L), "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (-1.0d), "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) -1, 1.0d, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 1, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        java.lang.String str9 = api_Data3.getMethod();
        java.lang.String str10 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 0, "hi!");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(52, (double) 1.0f, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 52, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) 1, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 10.0d, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (-1), "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(52, (double) 52, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (-1.0d), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 'a', "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, (double) 10.0f, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) 1, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (byte) -1, "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (-1.0d), "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 1L, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) 0.0f, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        java.lang.String str10 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) 0L, "hi!");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) (short) 100, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) (short) 100, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, 0.0d, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) 10, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (byte) 0, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        int int8 = api_Data3.getYear();
        int int9 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass10 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        int int9 = api_Data3.getYear();
        int int10 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 35, "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (-1.0f), "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) (byte) 0, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        java.lang.String str9 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass10 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 52, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) (byte) 0, "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) 10, "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) -1, 1.0d, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) 1L, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        int int9 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 0, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        java.lang.String str7 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) (short) 100, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) -1, 1.0d, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 10, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 1L, "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) (short) 0, "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (byte) 0, "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 1L, "");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, (double) 10.0f, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) 'a', "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, 0.0d, "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        java.lang.String str10 = api_Data3.getMethod();
        java.lang.String str11 = api_Data3.getMethod();
        int int12 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 100L, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        int int6 = api_Data3.getYear();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        int int6 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, (double) (-1L), "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 1.0f, "hi!");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) (byte) 0, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) (-1L), "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (-1.0f), "");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) ' ', "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 1, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 0, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (short) 0, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        double double6 = api_Data3.getValue();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 10L, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, (double) 10.0f, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 1.0f, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) (byte) 0, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) (-1L), "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        java.lang.String str10 = api_Data3.getMethod();
        java.lang.String str11 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass12 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) 100L, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, (double) 35, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) ' ', (double) 100.0f, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, 0.0d, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 'a', "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', (double) '4', "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (-1.0d), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 100, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 100, (double) 0.0f, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) ' ', 0.0d, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (byte) 0, "");
        double double4 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1.0f), "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        int int7 = api_Data3.getYear();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 100L, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (short) 0, "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass10 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, 100.0d, "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (short) 0, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (-1), "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) 1, "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 100.0d, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(52, (double) (short) -1, "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) ' ', (double) 100, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass9 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, 10.0d, "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) 1, "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 32, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, (double) ' ', "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) 10, "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 0.0f, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 0, (double) 10.0f, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(52, (double) '4', "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, 1.0d, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        double double7 = api_Data3.getValue();
        java.lang.String str8 = api_Data3.getMethod();
        java.lang.String str9 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        double double8 = api_Data3.getValue();
        double double9 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 1.0f, "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        java.lang.String str9 = api_Data3.getMethod();
        int int10 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.String str7 = api_Data3.getMethod();
        int int8 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass9 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) (byte) 100, "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        java.lang.String str9 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) '#', "");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (byte) 10, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        int int6 = api_Data3.getYear();
        double double7 = api_Data3.getValue();
        java.lang.String str8 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), 97.0d, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) ' ', "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 'a', "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 10, (double) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, 97.0d, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(1, (double) 52, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (byte) -1, "");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        java.lang.Class<?> wildcardClass4 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 97.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        java.lang.String str5 = api_Data3.getMethod();
        int int6 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        double double8 = api_Data3.getValue();
        double double9 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 10, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) 100.0f, "hi!");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        int int10 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), 0.0d, "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 'a', "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) 0, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, (double) 10.0f, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (byte) -1, "");
        double double4 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 1L, "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 10, (double) (byte) 10, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, (double) (short) -1, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass6 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 0.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(35, (double) (short) 0, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        int int6 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        int int7 = api_Data3.getYear();
        int int8 = api_Data3.getYear();
        double double9 = api_Data3.getValue();
        int int10 = api_Data3.getYear();
        java.lang.String str11 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '#', (double) (byte) 0, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) '4', 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(10, (double) ' ', "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (-1.0d), "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(97, (double) 10, "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 100, (double) 'a', "");
        int int4 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 0, (double) (short) 0, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        int int8 = api_Data3.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (short) 1, (double) 1L, "");
        java.lang.String str4 = api_Data3.getMethod();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 'a', "");
        int int4 = api_Data3.getYear();
        double double5 = api_Data3.getValue();
        double double6 = api_Data3.getValue();
        java.lang.String str7 = api_Data3.getMethod();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, 32.0d, "");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) 'a', (double) (short) 10, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) 100L, "hi!");
        double double4 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass5 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) 100L, "hi!");
        java.lang.String str4 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 10, 1.0d, "");
        double double4 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        java.lang.String str6 = api_Data3.getMethod();
        int int7 = api_Data3.getYear();
        java.lang.Class<?> wildcardClass8 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((-1), (double) (short) 100, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        int int4 = api_Data3.getYear();
        java.lang.String str5 = api_Data3.getMethod();
        java.lang.String str6 = api_Data3.getMethod();
        double double7 = api_Data3.getValue();
        double double8 = api_Data3.getValue();
        java.lang.String str9 = api_Data3.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(0, (double) (short) 1, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data(100, 10.0d, "hi!");
        int int4 = api_Data3.getYear();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) 1, (double) (byte) 10, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Analysis_Observer.Api_Data api_Data3 = new Analysis_Observer.Api_Data((int) (byte) -1, (double) 'a', "");
        double double4 = api_Data3.getValue();
        int int5 = api_Data3.getYear();
        double double6 = api_Data3.getValue();
        java.lang.Class<?> wildcardClass7 = api_Data3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

