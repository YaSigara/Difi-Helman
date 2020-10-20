package com.company;
import java.math.*;

public class Main {

    public static void main(String[] args) {
	int a=7,b=389,A,B,K1,K2,p=860,g=1123;
	A=formula(g,a,p);
	B=formula(g,b,p);
	System.out.println("A= "+A);
	System.out.println("B= "+B);
	K1=formula(formula(g,b,p),a,p);
	K2=formula(formula(g,a,p),b,p);
	System.out.println("K1= "+K1);
	System.out.println("K2= "+K2);
	System.out.println("K1 = "+formula(formula(g,b,p),a,p)+"; K2 = "+formula(formula(g,a,p),b,p));
		//System.out.println("K1 = "+formula(formula(1123,3,860),7,860)+"; K2 = "+formula(formula(1123,7,860),3,860));
    }
    public static int formula(int x, int y, int z) {
		BigInteger X = new BigInteger(Integer.toString(x));
		BigInteger Y = new BigInteger(Integer.toString(y));
		BigInteger Z = new BigInteger(Integer.toString(z));
		return (X.modPow(Y,Z)).intValue();
	}
}
