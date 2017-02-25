package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.DoubleMinFormat;

/**
 * Double型最小値書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class DoubleMinFormatValidator implements
		ConstraintValidator<DoubleMinFormat, String> {

	double min;
	
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
		return GenericValidator.minValue(val, min);
	}

	@Override
	public void initialize(final DoubleMinFormat arg) {
		min = arg.min();
	}

}