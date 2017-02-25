package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.FloatFormat;

/**
 * Double書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class FloatFormatValidator implements
		ConstraintValidator<FloatFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isFloat(obj);
	}

	@Override
	public void initialize(final FloatFormat arg) {
	}

}