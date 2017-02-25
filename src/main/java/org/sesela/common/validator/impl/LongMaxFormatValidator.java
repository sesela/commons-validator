package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.LongMaxFormat;

/**
 * Long型最大値書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class LongMaxFormatValidator implements
		ConstraintValidator<LongMaxFormat, String> {

	long max;
	
	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		
		long val;
		try {
            val = Long.valueOf(obj);
        } catch (NumberFormatException e) {
            return true;
        }
		return GenericValidator.maxValue(val, max);
	}

	@Override
	public void initialize(final LongMaxFormat arg) {
		max = arg.max();
	}

}