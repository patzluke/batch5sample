package org.ssglobal.training.codes.itemH;

class Product {
	public String prodName;
	public short prodStock;
	
	public void download(int pieces) {
		prodStock += pieces;
	}
	
	public void upload(int pieces) {
		prodStock -= pieces;
	}
	
	public String print() {
		return prodName + ", " + prodStock + " pieces";
	}
}


public class TestProduct {
	public static void main (String[] args) {
		Product lamp = new Product(); // instantiate
		lamp.prodName = "IKEA Lamp"; // replace the variable name
		lamp.prodStock = 10000; // replace the variable name
			
		System.out.println("Before the loading: " + lamp.print());
		lamp.download(1000);
		lamp.upload(100);
		System.out.println("After the loading: " + lamp.print());
	}
}
