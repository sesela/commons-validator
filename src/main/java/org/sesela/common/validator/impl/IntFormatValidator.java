package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.IntFormat;

/**
 * Int書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class IntFormatValidator implements
		ConstraintValidator<IntFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isInt(obj);
	}

	@Override
	public void initialize(final IntFormat arg) {
	}

}