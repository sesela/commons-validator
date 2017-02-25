package org.sesela.commons.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.UrlFormat;

/**
 * URL書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class UrlFormatValidator implements
		ConstraintValidator<UrlFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isLong(obj);
	}

	@Override
	public void initialize(final UrlFormat arg) {
	}

}