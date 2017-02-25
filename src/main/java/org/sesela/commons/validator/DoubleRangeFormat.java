package org.sesela.commons.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.commons.validator.impl.DoubleRangeFormatValidator;

/**
 * Double型範囲指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DoubleRangeFormatValidator.class)
@Documented
public @interface DoubleRangeFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.DoubleRangeFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.commons.validation.DoubleRangeFormat.message}";

	/**
	 * 最小値。
	 * 
	 */
	double min();

	/**
	 * 最大値。
	 * 
	 */
	double max();
	
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
