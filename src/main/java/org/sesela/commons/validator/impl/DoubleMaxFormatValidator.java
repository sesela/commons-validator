package org.sesela.commons.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.DoubleMaxFormat;

/**
 * Double型最大値書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class DoubleMaxFormatValidator implements
		ConstraintValidator<DoubleMaxFormat, String> {

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
		return GenericValidator.maxValue(val, max);
	}

	@Override
	public void initialize(final DoubleMaxFormat arg) {
		max = arg.max();
	}

}