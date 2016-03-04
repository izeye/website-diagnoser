package com.izeye.websitediagnoser.service;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by izeye on 16. 3. 4..
 */
public interface ReferrerChecker {
	
	default int findAllowedReferrerLength(String url, int fromLength) {
		String referrer = RandomStringUtils.randomAlphabetic(fromLength);
		System.out.println("Generated referrer: " + referrer);
		return findAllowedReferrerLength(url, referrer);
	}

	int findAllowedReferrerLength(String url, String referrer);
	
}
