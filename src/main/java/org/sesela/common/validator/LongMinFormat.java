package org.sesela.common.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.common.validator.impl.DoubleMinFormatValidator;

/**
 * Long型最小値指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DoubleMinFormatValidator.class)
@Documented
public @interface LongMinFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.common.validation.LongMinFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.common.validation.LongMinFormat.message}";

	/**
	 * 最小値。
	 * 
	 */
	long min();
	
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
