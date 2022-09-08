package com.tih.lambda;

import java.util.Arrays;
import java.util.List;

public class GetOddNumber {

	public static void main(String[] args) {
		Integer[] tihNumbers = {11,12,22,15,86,55,33,64};
		List<Integer> numberList = Arrays.asList(tihNumbers);

		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
	}

}
