package com.izeye.websitediagnoser.service;

/**
 * Created by izeye on 16. 3. 4..
 */
public class DefaultReferrerChecker implements ReferrerChecker {
	
	@Override
	public int findAllowedReferrerLength(String url, String referrer) {
		int fromLength = referrer.length();
		for (int i = 0; i < fromLength; i++) {
			int length = referrer.length();
			System.out.println("Trying referrer length: " + length);
			try {
				String response = HttpClientUtils.sendGetRequest(url, referrer);
				System.out.println(response);
				System.out.println("Successful referrer: " + referrer);
				return length;
			} catch (RuntimeException ex) {
				System.out.println(ex);
			}
			referrer = referrer.substring(0, length - 1);
		}
		return 0;
	}
	
}
