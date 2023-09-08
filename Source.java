package com.java;


class Product{
	String name;
	double price;
	String coupon;
	
	public Product(String name, double price, String coupon) {
		this.name = name;
		this.price = price;
		this.coupon = coupon;
	}
}

class Validator{
	public String validateCoupon(Product p1) throws InvalidCouponException{
		String coupon = p1.coupon;
		String[] couponSplit = coupon.split("-");
		double discount = Double.parseDouble(couponSplit[1]);
		 
		if(couponSplit[0].equals(p1.name)&&(discount>=10&&discount<=25)) {
			return "Valid Coupon";
		}
		
		else {
			throw new InvalidCouponException("Invalid Coupon");
		}
	}
	
	public double netPrice(Product p1) {
		double discount = 0;
		try {
			if(validateCoupon(p1)=="Valid Coupon") {
				String coupon = p1.coupon;
				String[] couponSplit = coupon.split("-");
				discount = Double.parseDouble(couponSplit[1]);
			}
		}
		catch(InvalidCouponException e){
			discount = p1.price;
		}
		return p1.price-(p1.price*(discount/100));
	}
}

class InvalidCouponException extends Exception{
	public InvalidCouponException(String message) {
		super(message);
	}
}

public class Source {
	public static void main(String[] args) throws Exception {
		
		Product obj = new Product("IPhone",25000,"IPhone-10");
		Validator val = new Validator();
		String valCop = val.validateCoupon(obj);
		double price = val.netPrice(obj);
		
		System.out.println("valCop=" + valCop);
		System.out.println("price=" + price);
		
	}
}
