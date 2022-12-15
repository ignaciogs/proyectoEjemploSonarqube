package curso.es;

import  org.junit.Assert;

import org.junit.Test;


public class AppTest {
    
    @Test
    public void test_sumar_numeros_positivos() {
        double devuelto = App.sumar(1,5);
        Assert.assertEquals( 6.0 , devuelto , 0);
    }
    @Test
    public void test_sumar_numeros_negativos() {
        double devuelto = App.sumar(-1,-5);
        Assert.assertEquals( -6.0 , devuelto , 0);
    }
    @Test
    public void test_sumar_numeros_mixtos() {
        double devuelto = App.sumar(1,-5);
        Assert.assertEquals( -4.0 , devuelto , 0);
    }
    @Test
    public void test_sumar_numeros_con_cero() {
        double devuelto = App.sumar(1,0);
        Assert.assertEquals( 1.0 , devuelto , 0);
    }
    @Test
    public void test_doblar_numeros_positivos() {
        double devuelto = App.Doblar(1);
        Assert.assertEquals( 2.0 , devuelto , 0);
    }
    @Test
    public void test_doblar_numeros_negativos() {
        double devuelto = App.Doblar(-1);
        Assert.assertEquals( -2.0 , devuelto , 0);
    }
    @Test
    public void test_doblar_numero_cero() {
        double devuelto = App.Doblar(0);
        Assert.assertEquals( 0.0 , devuelto , 0);
    }
}
