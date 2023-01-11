package Randoop_Test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_VF6_Test {

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
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.lang.Class<?> wildcardClass2 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.Class<?> wildcardClass1 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "Report", "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass3 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.lang.Class<?> wildcardClass3 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap2, "hi!", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.util.ArrayList<java.lang.String> strList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "hi!", strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.Class<?> wildcardClass3 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "Report", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass3 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap2, "Report", strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "Report", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.util.ArrayList<java.lang.String> strList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "Report", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap10, "hi!", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "Report", "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "hi!", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = component7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Report", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "hi!", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.lang.String str4 = report0.getType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "Report", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "Report", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.util.ArrayList<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = component6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "Report", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "Report", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        java.awt.Component component15 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.lang.String str11 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap1, "", strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap2, "Report", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("hi!");
        java.awt.Component component6 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "Report", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str6 = report0.returnType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "Report", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.awt.Component component5 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.util.ArrayList<java.lang.String> strList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        java.lang.String str11 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass13 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.returnType();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "Report", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        report0.setType("");
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.lang.String str15 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap16, "hi!", strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = component4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.lang.String str4 = report0.getType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.lang.String str4 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.util.ArrayList<java.lang.String> strList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "hi!", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap15 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap15, "", strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.getType();
        java.awt.Component component10 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.awt.Component component11 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap12, "hi!", strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.lang.String str15 = report0.getType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.awt.Component component8 = report0.getReturn_chart();
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.returnType();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "hi!", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "Report", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.awt.Component component6 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        report0.setType("Report");
        report0.setType("Report");
        java.awt.Component component14 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap15 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "Report", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap15, "", strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.awt.Component component11 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap12, "", strList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report", "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.returnType();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.getType();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        java.lang.String str9 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.Class<?> wildcardClass17 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "Report", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        report0.setType("Report");
        report0.setType("Report");
        java.awt.Component component14 = report0.getReturn_chart();
        java.lang.String str15 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Report" + "'", str15.equals("Report"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        java.lang.String str15 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "Report", "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str7 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("hi!");
        java.lang.String str6 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "Report", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.lang.String str2 = report0.getType();
        java.lang.Class<?> wildcardClass3 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "Report", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        java.lang.String str8 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        java.lang.String str8 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str7 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        java.awt.Component component9 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("hi!");
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        java.lang.String str9 = report0.returnType();
        java.lang.Class<?> wildcardClass10 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass11 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "Report", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "Report", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.lang.String str11 = report0.getType();
        java.lang.String str12 = report0.getType();
        java.lang.Class<?> wildcardClass13 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Report" + "'", str12.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("");
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report", "", "Report" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.awt.Component component4 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.awt.Component component8 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.String str17 = report0.returnType();
        java.lang.String str18 = report0.returnType();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        report0.setType("Report");
        report0.setType("Report");
        java.awt.Component component14 = report0.getReturn_chart();
        java.lang.String str15 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Report" + "'", str15.equals("Report"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "hi!", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.String str10 = report0.getType();
        java.lang.Class<?> wildcardClass11 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.returnType();
        java.lang.String str10 = report0.returnType();
        report0.setType("Report");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.lang.String str7 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.awt.Component component7 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.getType();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.getType();
        java.lang.Class<?> wildcardClass12 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        java.awt.Component component8 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.awt.Component component4 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        java.awt.Component component8 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        java.lang.String str9 = report0.returnType();
        java.lang.String str10 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        report0.setType("");
        java.lang.String str10 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        report0.setType("");
        java.lang.String str10 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.returnType();
        java.lang.String str10 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "Report", strList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.getType();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.getType();
        java.lang.String str12 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Report" + "'", str12.equals("Report"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("Report");
        java.lang.String str8 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "hi!", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "hi!", strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        java.awt.Component component9 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "Report", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass5 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap14, "hi!", strList19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "hi!", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("");
        java.lang.String str6 = report0.returnType();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        java.lang.String str15 = report0.returnType();
        java.lang.String str16 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("Report");
        java.lang.String str11 = report0.getType();
        java.lang.String str12 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Report" + "'", str12.equals("Report"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap12, "Report", strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.lang.String str11 = report0.getType();
        java.lang.String str12 = report0.getType();
        java.lang.String str13 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Report" + "'", str12.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Report" + "'", str13.equals("Report"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap13, "", strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.String str17 = report0.returnType();
        java.lang.String str18 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("hi!");
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = component4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("");
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str6 = report0.returnType();
        java.awt.Component component7 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass10 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.lang.String str8 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.awt.Component component8 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "Report", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.Class<?> wildcardClass6 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("hi!");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.getType();
        java.awt.Component component8 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass10 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.String str8 = report0.getType();
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass10 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap10, "", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.getType();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap12, "hi!", strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component7 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "Report", strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("hi!");
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap10, "hi!", strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.lang.String str9 = report0.returnType();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "Report", "Report" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap11, "hi!", strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("");
        java.lang.Class<?> wildcardClass15 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap11, "Report", strList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.lang.String str9 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("hi!");
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.util.ArrayList<java.lang.String> strList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "Report", strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.get(int)\" because \"method_list\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap3, "", strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component7 = report0.getReturn_chart();
        java.awt.Component component8 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        report0.setType("hi!");
        java.awt.Component component8 = report0.getReturn_chart();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("");
        java.lang.String str7 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap8, "hi!", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("");
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap5, "hi!", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap9, "", strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("");
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.String str17 = report0.returnType();
        java.lang.String str18 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap19 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap19, "hi!", strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        java.lang.Class<?> wildcardClass9 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "Report" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap4, "hi!", strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        report0.setType("");
        java.awt.Component component8 = report0.getReturn_chart();
        java.lang.String str9 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.String str17 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap18 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "Report" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap18, "Report", strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.awt.Component component10 = report0.getReturn_chart();
        java.lang.String str11 = report0.returnType();
        java.lang.String str12 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Report" + "'", str11.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Report" + "'", str12.equals("Report"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        report0.setType("Report");
        report0.setType("");
        java.lang.String str14 = report0.getType();
        java.awt.Component component15 = report0.getReturn_chart();
        java.lang.String str16 = report0.returnType();
        java.lang.String str17 = report0.getType();
        java.lang.String str18 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("hi!");
        java.awt.Component component6 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.getType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        report0.setType("Report");
        java.lang.String str9 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        java.lang.String str9 = report0.returnType();
        report0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        report0.setType("hi!");
        java.lang.String str7 = report0.getType();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.String str10 = report0.getType();
        java.lang.String str11 = report0.returnType();
        java.lang.String str12 = report0.getType();
        java.awt.Component component13 = report0.getReturn_chart();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = component13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component13);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.awt.Component component6 = report0.getReturn_chart();
        java.awt.Component component7 = report0.getReturn_chart();
        report0.setType("Report");
        java.lang.String str10 = report0.returnType();
        java.awt.Component component11 = report0.getReturn_chart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        java.lang.String str8 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        report0.setType("Report");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        report0.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.lang.Class<?> wildcardClass4 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "Report", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        java.awt.Component component5 = report0.getReturn_chart();
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        java.lang.Class<?> wildcardClass8 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.awt.Component component10 = report0.getReturn_chart();
        report0.setType("");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "Report" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap13, "", strList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        report0.setType("Report");
        java.lang.String str7 = report0.returnType();
        java.awt.Component component8 = report0.getReturn_chart();
        java.lang.String str9 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Report" + "'", str9.equals("Report"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "Report", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.String str6 = report0.returnType();
        java.lang.String str7 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        report0.setType("Report");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Report" + "'", str7.equals("Report"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        report0.setType("");
        java.lang.String str9 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.getType();
        java.lang.String str3 = report0.getType();
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        report0.setType("");
        java.lang.String str6 = report0.getType();
        java.lang.String str7 = report0.returnType();
        report0.setType("hi!");
        java.lang.String str10 = report0.returnType();
        java.lang.String str11 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        report0.setType("hi!");
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.getType();
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "Report", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap6, "", strList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        report0.setType("hi!");
        java.lang.String str6 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.lang.String str2 = report0.returnType();
        java.lang.String str3 = report0.getType();
        java.lang.String str4 = report0.returnType();
        java.lang.String str5 = report0.getType();
        java.lang.String str6 = report0.getType();
        java.awt.Component component7 = report0.getReturn_chart();
        java.lang.String str8 = report0.getType();
        java.awt.Component component9 = report0.getReturn_chart();
        java.lang.String str10 = report0.returnType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Report" + "'", str8.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Report" + "'", str10.equals("Report"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.returnType();
        report0.setType("");
        java.awt.Component component4 = report0.getReturn_chart();
        java.lang.String str5 = report0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.awt.Component component2 = report0.getReturn_chart();
        java.awt.Component component3 = report0.getReturn_chart();
        java.awt.Component component4 = report0.getReturn_chart();
        report0.setType("hi!");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "Report", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap7, "Report", strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.lang.String str1 = report0.getType();
        java.awt.Component component2 = report0.getReturn_chart();
        java.lang.String str3 = report0.returnType();
        java.lang.String str4 = report0.getType();
        java.lang.String str5 = report0.returnType();
        java.lang.String str6 = report0.getType();
        java.lang.Class<?> wildcardClass7 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Report" + "'", str1.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Report" + "'", str3.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Report" + "'", str5.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Report" + "'", str6.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ViewerFactory.Report report0 = new ViewerFactory.Report();
        java.awt.Component component1 = report0.getReturn_chart();
        java.lang.String str2 = report0.returnType();
        java.awt.Component component3 = report0.getReturn_chart();
        java.lang.String str4 = report0.getType();
        java.awt.Component component5 = report0.getReturn_chart();
        java.awt.Component component6 = report0.getReturn_chart();
        report0.setType("hi!");
        report0.setType("Report");
        java.util.HashMap<java.lang.String, java.util.ArrayList<Analysis.Analysis_Data>> strMap11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "Report", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            report0.draw(strMap11, "", strList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.get(Object)\" because \"result\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Report" + "'", str2.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Report" + "'", str4.equals("Report"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}

