package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.LongFormat;

/**
 * Long書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class LongFormatValidator implements
		ConstraintValidator<LongFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isLong(obj);
	}

	@Override
	public void initialize(final LongFormat arg) {
	}

}