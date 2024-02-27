package bai71;

import java.util.Date;

public class TestDiscountSystem {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Alice");
		customer1.setMember(true);
		customer1.setMemberType("Premium");

		Visit visit1 = new Visit("Alice", new Date());
		visit1.setServiceExpense(100);
		visit1.setProductExpense(50);

		System.out.println(customer1);
		System.out.println(visit1);
		System.out.println("Service discount rate: " + DiscountRate.getServiceDiscountRate(customer1.getMemberType()));
		System.out.println("Product discount rate: " + DiscountRate.getProductDiscountRate(customer1.getMemberType()));
	}
}
