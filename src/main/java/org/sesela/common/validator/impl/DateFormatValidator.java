package org.sesela.common.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.common.validator.DateFormat;

/**
 * 日時書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class DateFormatValidator implements
		ConstraintValidator<DateFormat, String> {

	/** 日時パターント */
	private String pattern;

	/** 厳密フラグ */
	private boolean strict;
	
	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.isDate(obj, pattern, strict);
	}

	@Override
	public void initialize(final DateFormat arg) {
		pattern = arg.pattern();
		strict = arg.strict();
	}

}