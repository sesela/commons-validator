package org.sesela.common.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.common.validator.impl.LongRangeFormatValidator;

/**
 * Double型範囲指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = LongRangeFormatValidator.class)
@Documented
public @interface LongRangeFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.common.validation.LongSRangeFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.common.validation.LongRangeFormat.message}";

	/**
	 * 最小値。
	 * 
	 */
	long min();

	/**
	 * 最大値。
	 * 
	 */
	long max();
	
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
