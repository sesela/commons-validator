package org.sesela.commons.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.DoubleFormat;

/**
 * Double書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class DoubleFormatValidator implements
		ConstraintValidator<DoubleFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isDouble(obj);
	}

	@Override
	public void initialize(final DoubleFormat arg) {
	}

}