package org.sesela.commons.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.DoubleRangeFormat;

/**
 * Double型範囲指定書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class DoubleRangeFormatValidator implements
		ConstraintValidator<DoubleRangeFormat, String> {

	double min;
	double max;
	
	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		
		double val;
		try {
            val = Double.valueOf(obj);
        } catch (NumberFormatException e) {
            return true;
        }
		return GenericValidator.isInRange(val, min, max);
	}

	@Override
	public void initialize(final DoubleRangeFormat arg) {
		min = arg.min();
		max = arg.max();
	}

}