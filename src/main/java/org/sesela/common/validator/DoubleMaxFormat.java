package org.sesela.common.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.common.validator.impl.DoubleMaxFormatValidator;

/**
 * Double型最大値指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DoubleMaxFormatValidator.class)
@Documented
public @interface DoubleMaxFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.common.validation.DoubleMaxFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.common.validation.DoubleMaxFormat.message}";

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
