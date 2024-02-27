package bai71;

public class DiscountRate {
	   private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
	    private static final double SERVICE_DISCOUNT_GOLD = 0.15;
	    private static final double SERVICE_DISCOUNT_SILVER = 0.1;
	    private static final double PRODUCT_DISCOUNT_PREMIUM = 0.1;
	    private static final double PRODUCT_DISCOUNT_GOLD = 0.1;
	    private static final double PRODUCT_DISCOUNT_SILVER = 0.1;

	    public static double getServiceDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	                return SERVICE_DISCOUNT_PREMIUM;
	            case "Gold":
	                return SERVICE_DISCOUNT_GOLD;
	            case "Silver":
	                return SERVICE_DISCOUNT_SILVER;
	            default:
	                return 0.0;
	        }
	    }

	    public static double getProductDiscountRate(String type) {
	        switch (type) {
	            case "Premium":
	            case "Gold":
	            case "Silver":
	                return 0.1;
	            default:
	                return 0.0;
	        }
	    }
	}


