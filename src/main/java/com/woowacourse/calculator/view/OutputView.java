package com.woowacourse.calculator.view;

public class OutputView {
	public void printCalculateResult(final Double calculateResult) {
		System.out.println("계산 결과: " + calculateResult);
	}

	public void printExceptionMessage(final String exceptionMessage) {
		System.out.println(exceptionMessage);
	}
}
