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
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.LongMinFormat.message}"です。
	 * @return エラーメッセージコード
	 */
	String message() default "{org.sesela.commons.validation.LongMinFormat.message}";

	/**
	 * 最小値。
	 * @return 最小値
	 */
	long min();
	
	/**
	 * 制約に対するバリデーションが属するグループ。
	 * @return グループ
	 */
	Class<?>[] groups() default { };

	/**
	 * ペイロード
	 * @return ペイロード
	 */
	Class<? extends Payload>[] payload() default { };


}
