package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.LongMinFormat;

/**
 * Long型最小値書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class LongMinFormatValidator implements
		ConstraintValidator<LongMinFormat, String> {

	long min;
	
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
		return GenericValidator.minValue(val, min);
	}

	@Override
	public void initialize(final LongMinFormat arg) {
		min = arg.min();
	}

}