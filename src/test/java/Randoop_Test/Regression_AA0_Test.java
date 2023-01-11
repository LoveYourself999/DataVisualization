package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AA0_Test {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.Class<?> wildcardClass7 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setUnit("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        java.lang.Class<?> wildcardClass13 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) (byte) 100);
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        double double10 = analysis_Data5.getValue();
        int int11 = analysis_Data5.getYear();
        java.lang.String str12 = analysis_Data5.getUnit();
        double double13 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setYear(0);
        double double8 = analysis_Data5.getValue();
        int int9 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        java.lang.String str8 = analysis_Data5.getUnit();
        java.lang.String str9 = analysis_Data5.getDes();
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) (short) 100);
        int int10 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        int int10 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) ' ');
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        double double10 = analysis_Data5.getValue();
        int int11 = analysis_Data5.getYear();
        double double12 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(100, (double) (short) 0, "", "hi!", "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        java.lang.String str13 = analysis_Data5.getMethod();
        java.lang.Class<?> wildcardClass14 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 100, "hi!", "", "");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        double double8 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        java.lang.Class<?> wildcardClass13 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setValue((double) 100L);
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setValue((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        double double10 = analysis_Data5.getValue();
        java.lang.String str11 = analysis_Data5.getMethod();
        java.lang.String str12 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        java.lang.String str10 = analysis_Data5.getMethod();
        java.lang.String str11 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setValue(0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        java.lang.String str8 = analysis_Data5.getUnit();
        java.lang.String str9 = analysis_Data5.getDes();
        analysis_Data5.setMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue(10.0d);
        int int10 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setValue((double) 0.0f);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setDes("hi!");
        analysis_Data5.setValue((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) (short) 1, "", "hi!", "");
        java.lang.String str6 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        java.lang.String str11 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.Class<?> wildcardClass7 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) '#');
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 0.0f);
        java.lang.String str16 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setYear((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        analysis_Data5.setDes("hi!");
        analysis_Data5.setUnit("hi!");
        java.lang.Class<?> wildcardClass13 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setValue((double) 100.0f);
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue(10.0d);
        analysis_Data5.setYear((int) (byte) -1);
        analysis_Data5.setMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        java.lang.String str14 = analysis_Data5.getDes();
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setDes("");
        analysis_Data5.setDes("hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) ' ');
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setMethod("");
        java.lang.String str12 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setValue((double) 100);
        double double17 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setValue((double) 100.0f);
        java.lang.String str11 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 0.0f);
        java.lang.Class<?> wildcardClass16 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("hi!");
        analysis_Data5.setYear((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        java.lang.String str10 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) (short) 1, "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) 1.0f, "hi!", "hi!", "hi!");
        analysis_Data5.setDes("hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) '#');
        double double9 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str13 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        double double6 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) ' ');
        double double9 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("hi!");
        int int13 = analysis_Data5.getYear();
        java.lang.String str14 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setYear((-1));
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setYear((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 100);
        java.lang.String str13 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setDes("");
        java.lang.Class<?> wildcardClass13 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        int int6 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 0L, "hi!", "", "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setYear((int) (byte) 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', 100.0d, "hi!", "", "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setUnit("");
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(1, (double) (short) 100, "", "hi!", "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        analysis_Data5.setDes("hi!");
        java.lang.String str10 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, (double) 1L, "", "", "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setDes("");
        int int13 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setValue((double) 100L);
        analysis_Data5.setValue((double) 100);
        java.lang.String str10 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue(10.0d);
        analysis_Data5.setYear((int) (short) 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 10, "", "", "hi!");
        java.lang.Class<?> wildcardClass6 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        double double7 = analysis_Data5.getValue();
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (byte) -1);
        analysis_Data5.setYear((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        analysis_Data5.setUnit("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        java.lang.String str8 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setUnit("");
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setValue((double) (short) -1);
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setValue((double) (byte) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        double double9 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        double double10 = analysis_Data5.getValue();
        java.lang.String str11 = analysis_Data5.getDes();
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) 1, (double) 0, "hi!", "", "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 1, (double) (byte) 10, "hi!", "hi!", "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        int int10 = analysis_Data5.getYear();
        java.lang.String str11 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setValue((double) (short) -1);
        java.lang.String str8 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 100, "hi!", "", "");
        analysis_Data5.setDes("");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getUnit();
        java.lang.String str8 = analysis_Data5.getDes();
        analysis_Data5.setValue((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) 100, (double) (byte) 100, "", "hi!", "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setUnit("hi!");
        java.lang.String str11 = analysis_Data5.getMethod();
        java.lang.String str12 = analysis_Data5.getDes();
        int int13 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setDes("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        java.lang.String str8 = analysis_Data5.getDes();
        analysis_Data5.setYear(10);
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 1, (double) (-1.0f), "hi!", "", "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, (double) 52, "hi!", "", "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setUnit("hi!");
        java.lang.String str11 = analysis_Data5.getMethod();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 0.0d, "", "hi!", "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setDes("");
        java.lang.String str9 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        java.lang.String str13 = analysis_Data5.getDes();
        java.lang.String str14 = analysis_Data5.getUnit();
        int int15 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 1.0d, "", "", "");
        int int6 = analysis_Data5.getYear();
        int int7 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) ' ', "hi!", "", "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("hi!");
        java.lang.Class<?> wildcardClass12 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setYear(1);
        analysis_Data5.setYear((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("hi!");
        java.lang.String str10 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setUnit("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (byte) -1);
        analysis_Data5.setYear((int) (short) 0);
        java.lang.String str10 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("");
        java.lang.String str10 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setYear((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        java.lang.String str8 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        java.lang.String str11 = analysis_Data5.getDes();
        int int12 = analysis_Data5.getYear();
        int int13 = analysis_Data5.getYear();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) 1.0f, "hi!", "hi!", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        java.lang.Class<?> wildcardClass7 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 100, "hi!", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        analysis_Data5.setMethod("");
        java.lang.String str15 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setDes("");
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue(10.0d);
        analysis_Data5.setValue(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) (-1L), "hi!", "hi!", "hi!");
        int int6 = analysis_Data5.getYear();
        analysis_Data5.setDes("hi!");
        double double9 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 1, 0.0d, "", "", "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), 0.0d, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) '4', "", "", "");
        analysis_Data5.setDes("hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str13 = analysis_Data5.getUnit();
        java.lang.String str14 = analysis_Data5.getDes();
        analysis_Data5.setDes("");
        java.lang.String str17 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(52, (double) 0.0f, "", "hi!", "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue(10.0d);
        java.lang.String str10 = analysis_Data5.getDes();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 100);
        analysis_Data5.setUnit("hi!");
        java.lang.String str15 = analysis_Data5.getMethod();
        java.lang.Class<?> wildcardClass16 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        java.lang.String str10 = analysis_Data5.getMethod();
        double double11 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) -1, "", "hi!", "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) (byte) 100);
        analysis_Data5.setUnit("");
        java.lang.String str11 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 1.0d, "", "", "");
        int int6 = analysis_Data5.getYear();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setDes("");
        analysis_Data5.setValue((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        java.lang.String str8 = analysis_Data5.getUnit();
        analysis_Data5.setYear(100);
        analysis_Data5.setValue((double) (byte) -1);
        java.lang.String str13 = analysis_Data5.getDes();
        int int14 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        int int9 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 10, "", "", "hi!");
        analysis_Data5.setMethod("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setDes("");
        analysis_Data5.setValue((double) 1L);
        int int11 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        java.lang.String str8 = analysis_Data5.getUnit();
        int int9 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) 'a', (double) (short) 100, "hi!", "", "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) 0, (double) 100, "", "", "hi!");
        double double6 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(100, (double) ' ', "", "hi!", "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setYear((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) ' ');
        java.lang.String str9 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        analysis_Data5.setUnit("");
        int int12 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass13 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        analysis_Data5.setYear(0);
        java.lang.String str13 = analysis_Data5.getDes();
        analysis_Data5.setValue((double) (short) 1);
        java.lang.String str16 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        java.lang.String str7 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), 0.0d, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setValue((double) 100L);
        java.lang.String str8 = analysis_Data5.getUnit();
        java.lang.String str9 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue(0.0d);
        java.lang.String str13 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        analysis_Data5.setValue((double) (byte) 100);
        java.lang.String str10 = analysis_Data5.getMethod();
        java.lang.String str11 = analysis_Data5.getDes();
        analysis_Data5.setValue((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 10, "", "", "hi!");
        analysis_Data5.setValue(1.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setYear(1);
        analysis_Data5.setDes("hi!");
        java.lang.String str13 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) 0, (double) 10, "", "hi!", "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, (double) ' ', "hi!", "hi!", "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        java.lang.String str13 = analysis_Data5.getDes();
        java.lang.String str14 = analysis_Data5.getUnit();
        java.lang.String str15 = analysis_Data5.getDes();
        java.lang.String str16 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setValue((double) 100.0f);
        analysis_Data5.setYear((int) (byte) 1);
        int int13 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setYear((-1));
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        java.lang.String str11 = analysis_Data5.getDes();
        java.lang.String str12 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setValue((double) (short) -1);
        analysis_Data5.setUnit("hi!");
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setYear((-1));
        double double17 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        analysis_Data5.setMethod("hi!");
        int int15 = analysis_Data5.getYear();
        java.lang.String str16 = analysis_Data5.getMethod();
        double double17 = analysis_Data5.getValue();
        analysis_Data5.setYear(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        java.lang.String str9 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        analysis_Data5.setYear(0);
        int int13 = analysis_Data5.getYear();
        analysis_Data5.setUnit("");
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        java.lang.String str11 = analysis_Data5.getDes();
        int int12 = analysis_Data5.getYear();
        int int13 = analysis_Data5.getYear();
        java.lang.String str14 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        int int9 = analysis_Data5.getYear();
        java.lang.String str10 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        analysis_Data5.setUnit("hi!");
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        java.lang.String str8 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        analysis_Data5.setValue((double) 10);
        java.lang.String str15 = analysis_Data5.getMethod();
        analysis_Data5.setYear((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setYear(0);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(100, (double) 10, "hi!", "", "");
        java.lang.String str6 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) (short) 100);
        double double10 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setValue((double) (-1L));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        java.lang.String str9 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(1, (double) (short) -1, "hi!", "hi!", "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setValue((double) (short) -1);
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setValue((double) '#');
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.Class<?> wildcardClass7 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        java.lang.String str11 = analysis_Data5.getDes();
        int int12 = analysis_Data5.getYear();
        int int13 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (byte) 100);
        int int16 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setYear((-1));
        java.lang.String str17 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) 0, (double) 100.0f, "hi!", "", "");
        int int6 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        double double13 = analysis_Data5.getValue();
        java.lang.Class<?> wildcardClass14 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 0, (double) 52, "hi!", "hi!", "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        analysis_Data5.setUnit("");
        java.lang.String str11 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("");
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        java.lang.String str8 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '#', (double) 10L, "hi!", "hi!", "");
        analysis_Data5.setValue((double) 0L);
        double double8 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) 0);
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        analysis_Data5.setMethod("hi!");
        int int15 = analysis_Data5.getYear();
        java.lang.String str16 = analysis_Data5.getMethod();
        double double17 = analysis_Data5.getValue();
        double double18 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) 100);
        int int11 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("");
        java.lang.String str12 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setDes("");
        int int10 = analysis_Data5.getYear();
        java.lang.Class<?> wildcardClass11 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) 100.0f, "hi!", "", "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '#', (double) 10L, "hi!", "hi!", "");
        analysis_Data5.setValue((double) 0L);
        int int8 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getUnit();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '#', (double) 10L, "hi!", "hi!", "");
        analysis_Data5.setUnit("hi!");
        double double8 = analysis_Data5.getValue();
        double double9 = analysis_Data5.getValue();
        java.lang.Class<?> wildcardClass10 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(100, (double) 10, "hi!", "", "");
        analysis_Data5.setMethod("hi!");
        java.lang.String str8 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) ' ', (double) (byte) 10, "", "hi!", "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        java.lang.String str9 = analysis_Data5.getMethod();
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) 100L);
        double double13 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 10.0d, "", "hi!", "");
        int int6 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) 1.0f, "hi!", "hi!", "hi!");
        analysis_Data5.setValue((double) ' ');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 100);
        analysis_Data5.setUnit("hi!");
        int int15 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        java.lang.String str9 = analysis_Data5.getMethod();
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) 100L);
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setYear(1);
        java.lang.String str11 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) -1, (double) (short) 100, "", "", "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue(10.0d);
        java.lang.String str12 = analysis_Data5.getDes();
        double double13 = analysis_Data5.getValue();
        java.lang.String str14 = analysis_Data5.getMethod();
        java.lang.Class<?> wildcardClass15 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 1.0d, "", "", "");
        java.lang.String str6 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        java.lang.String str8 = analysis_Data5.getUnit();
        analysis_Data5.setYear(100);
        analysis_Data5.setValue((double) (byte) -1);
        analysis_Data5.setValue((double) (-1L));
        double double15 = analysis_Data5.getValue();
        java.lang.String str16 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '#', (double) 10L, "hi!", "hi!", "");
        analysis_Data5.setValue((double) 0L);
        analysis_Data5.setDes("");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        analysis_Data5.setYear(0);
        int int13 = analysis_Data5.getYear();
        analysis_Data5.setUnit("");
        int int16 = analysis_Data5.getYear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) (-1L), "hi!", "hi!", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setDes("");
        analysis_Data5.setDes("hi!");
        analysis_Data5.setYear(0);
        java.lang.String str13 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("");
        java.lang.String str15 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 1, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setUnit("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) '4', "", "", "");
        java.lang.String str6 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 1.0d, "", "", "");
        int int6 = analysis_Data5.getYear();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setUnit("");
        double double10 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 100, (double) (short) 100, "hi!", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setValue((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setYear(1);
        analysis_Data5.setDes("hi!");
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(100, (double) (byte) -1, "hi!", "", "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) '4', (double) 1.0f, "hi!", "hi!", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) '4', "", "", "");
        int int6 = analysis_Data5.getYear();
        double double7 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getDes();
        java.lang.String str8 = analysis_Data5.getMethod();
        analysis_Data5.setDes("hi!");
        java.lang.String str11 = analysis_Data5.getDes();
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        analysis_Data5.setUnit("");
        int int12 = analysis_Data5.getYear();
        java.lang.String str13 = analysis_Data5.getUnit();
        double double14 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue(10.0d);
        java.lang.String str12 = analysis_Data5.getDes();
        java.lang.String str13 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (byte) 10, (double) 10, "", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setDes("");
        analysis_Data5.setUnit("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        analysis_Data5.setUnit("");
        int int12 = analysis_Data5.getYear();
        java.lang.String str13 = analysis_Data5.getUnit();
        analysis_Data5.setYear((int) 'a');
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str13 = analysis_Data5.getUnit();
        java.lang.String str14 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("hi!");
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setYear((int) (short) 100);
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue(10.0d);
        java.lang.Class<?> wildcardClass12 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        java.lang.String str14 = analysis_Data5.getDes();
        double double15 = analysis_Data5.getValue();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str13 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        double double13 = analysis_Data5.getValue();
        java.lang.String str14 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue(10.0d);
        analysis_Data5.setYear((int) (byte) -1);
        double double12 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setValue(100.0d);
        java.lang.String str13 = analysis_Data5.getDes();
        java.lang.String str14 = analysis_Data5.getUnit();
        java.lang.String str15 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getDes();
        java.lang.String str11 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setDes("");
        double double12 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setDes("");
        java.lang.Class<?> wildcardClass12 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setYear((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setMethod("");
        int int12 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) ' ');
        java.lang.String str9 = analysis_Data5.getMethod();
        java.lang.String str10 = analysis_Data5.getUnit();
        analysis_Data5.setYear(0);
        int int13 = analysis_Data5.getYear();
        analysis_Data5.setUnit("");
        java.lang.String str16 = analysis_Data5.getMethod();
        java.lang.String str17 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setValue((double) (short) 10);
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setUnit("");
        java.lang.String str16 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setDes("");
        analysis_Data5.setMethod("hi!");
        int int10 = analysis_Data5.getYear();
        java.lang.String str11 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getMethod();
        analysis_Data5.setYear((-1));
        java.lang.String str9 = analysis_Data5.getDes();
        analysis_Data5.setUnit("");
        int int12 = analysis_Data5.getYear();
        java.lang.String str13 = analysis_Data5.getMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(10, (double) 10.0f, "", "", "");
        java.lang.String str6 = analysis_Data5.getUnit();
        analysis_Data5.setMethod("hi!");
        java.lang.String str9 = analysis_Data5.getMethod();
        int int10 = analysis_Data5.getYear();
        analysis_Data5.setDes("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        analysis_Data5.setUnit("hi!");
        double double10 = analysis_Data5.getValue();
        analysis_Data5.setUnit("");
        analysis_Data5.setDes("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        analysis_Data5.setMethod("");
        int int8 = analysis_Data5.getYear();
        analysis_Data5.setYear((int) (byte) 10);
        analysis_Data5.setDes("hi!");
        int int13 = analysis_Data5.getYear();
        int int14 = analysis_Data5.getYear();
        java.lang.String str15 = analysis_Data5.getDes();
        analysis_Data5.setMethod("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        java.lang.String str8 = analysis_Data5.getUnit();
        java.lang.Class<?> wildcardClass9 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        double double7 = analysis_Data5.getValue();
        analysis_Data5.setValue((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getUnit();
        double double7 = analysis_Data5.getValue();
        double double8 = analysis_Data5.getValue();
        java.lang.String str9 = analysis_Data5.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) 0.0f, "", "hi!", "hi!");
        analysis_Data5.setYear(0);
        java.lang.Class<?> wildcardClass8 = analysis_Data5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        analysis_Data5.setYear((int) (byte) 1);
        analysis_Data5.setYear(1);
        double double11 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data(0, 1.0d, "", "", "");
        int int6 = analysis_Data5.getYear();
        int int7 = analysis_Data5.getYear();
        analysis_Data5.setDes("");
        double double10 = analysis_Data5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, (double) (short) 100, "hi!", "", "hi!");
        double double6 = analysis_Data5.getValue();
        java.lang.String str7 = analysis_Data5.getMethod();
        analysis_Data5.setValue((double) 1);
        java.lang.String str10 = analysis_Data5.getDes();
        analysis_Data5.setDes("");
        java.lang.String str13 = analysis_Data5.getMethod();
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setValue((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        analysis_Data5.setValue((double) (byte) 100);
        analysis_Data5.setYear(52);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((int) (short) -1, 10.0d, "hi!", "", "hi!");
        analysis_Data5.setValue((double) (short) 1);
        double double8 = analysis_Data5.getValue();
        analysis_Data5.setUnit("hi!");
        analysis_Data5.setMethod("hi!");
        analysis_Data5.setUnit("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Analysis.Analysis_Data analysis_Data5 = new Analysis.Analysis_Data((-1), (double) 100.0f, "hi!", "", "hi!");
        java.lang.String str6 = analysis_Data5.getDes();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }
}

