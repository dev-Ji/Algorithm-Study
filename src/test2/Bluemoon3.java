package test2;

import java.math.BigInteger;

public class Bluemoon3 {
	// 1부터 50 까지 짝수들의 곱한값
	public static void main(String[] args) {
       BigInteger big = new BigInteger("1");
       
		for (int i = 1; i <= 50 ; i++) {
			if(i % 2 == 0) {
				big = big.multiply(BigInteger.valueOf(i));
				System.out.println(big);
			}
		}
		


	}

}
