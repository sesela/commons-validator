package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.CreditCardFormat;

/**
 * クレジットカード書式バリデーションクラスです。
 *
 * @author sesela
 *
 */
public class CreditCardValidator implements
		ConstraintValidator<CreditCardFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isCreditCard(obj);
	}

	@Override
	public void initialize(final CreditCardFormat arg) {
	}

}
