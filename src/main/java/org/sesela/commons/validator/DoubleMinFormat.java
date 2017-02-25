package org.sesela.commons.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.commons.validator.impl.DoubleMinFormatValidator;

/**
 * Double型最小値指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DoubleMinFormatValidator.class)
@Documented
public @interface DoubleMinFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.DoubleMinFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.commons.validation.DoubleMinFormat.message}";

	/**
	 * 最小値。
	 * 
	 */
	double min();
	
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
