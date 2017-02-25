package org.sesela.commons.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.commons.validator.impl.FloatFormatValidator;

/**
 * Float書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = FloatFormatValidator.class)
@Documented
public @interface FloatFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.FloatFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.commons.validation.FloatFormat.message}";
	
	/**
	 * 制約に対するバリデーションが属するグループ。
	 * 
	 */
	Class<?>[] groups() default { };

	/**
	 * ペイロード
	 */
	Class<? extends Payload>[] payload() default { };


}
