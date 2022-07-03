package com.tns.app;

public abstract class Shppingfactory {
	public abstract Primeacc getNewPrimeAcc(int accNo, String accNm, float charges);
	
			public abstract Normalacc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);

}
