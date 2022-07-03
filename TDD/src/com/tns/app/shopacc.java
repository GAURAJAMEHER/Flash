package com.tns.app;

public abstract class shopacc extends Normalacc{
	//Field
		private final static float deliveryCharges = 100.0f;
		private String delivery;

		// Constructor
		public void NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			
		}

		public String getDeliveryCharges() {
			return null;
			
		}
		
		//methods
		@Override
		public void bookProduct(float book) {

		}

		@Override
		public String toString() {
			return super.toString() + " NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
		}

		public String getDelivery() {
			return delivery;
		}

		public void setDelivery(String delivery) {
			this.delivery = delivery;
		}
	}

