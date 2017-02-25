package org.sesela.commons.validator.impl;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.sesela.commons.validator.EmailFormat;

/**
 * メール書式バリデーションクラスです。
 * Commons(Apache)のチェックメソッドをラッピングして処理します。
 *
 * @author sesela
 *
 */
public class EmailFormatValidator implements
		ConstraintValidator<EmailFormat, String> {

	@Override
	public boolean isValid(final String obj, final ConstraintValidatorContext arg1) {
		if (StringUtils.isEmpty(obj)) {
			return true;
		}
		// JavaMailで使用可能か否かのフォーマットチェック
		try {
			new InternetAddress(obj, true);
		} catch (AddressException e) {
			return false;
		}
		// ApacheCommonのEmailフォーマットチェック
		return GenericValidator.isEmail(obj);
	}

	@Override
	public void initialize(final EmailFormat arg) {
	}

}
