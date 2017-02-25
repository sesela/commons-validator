package org.sesela.commons.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.PatternFormat;

/**
 * パターン書式バリデーションクラスです。
 * 
 * @author sesela
 * 
 */
public class PatternFormatValidator implements
		ConstraintValidator<PatternFormat, String> {

	/** 正規表現 */
	private String regex;
	
	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		return GenericValidator.matchRegexp(obj, regex);
	}

	@Override
	public void initialize(final PatternFormat arg) {
		regex = arg.regex();
	}

}