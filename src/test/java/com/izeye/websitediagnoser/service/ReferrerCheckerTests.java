package com.izeye.websitediagnoser.service;

import org.junit.Test;

/**
 * Created by izeye on 16. 3. 4..
 */
public class ReferrerCheckerTests {
	
	ReferrerChecker referrerChecker = new DefaultReferrerChecker();
	
	@Test
	public void testFindAllowedReferrerLengthWithFromLength() {
		String url = "http://www.google.com/";
		int fromLength = 1024;
		int allowedReferrerLength = referrerChecker.findAllowedReferrerLength(url, fromLength);
		System.out.println("Allowed referrer length: " + allowedReferrerLength);
	}

	@Test
	public void testFindAllowedReferrerLengthWithReferrer() {
		String url = "http://www.google.com/";
		String referrer = "http://www.google.com/";
		int allowedReferrerLength = referrerChecker.findAllowedReferrerLength(url, referrer);
		System.out.println("Allowed referrer length: " + allowedReferrerLength);
	}
	
}
