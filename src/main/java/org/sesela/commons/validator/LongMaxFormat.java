package org.sesela.commons.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.commons.validator.impl.LongMaxFormatValidator;

/**
 * Double型最大値指定書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = LongMaxFormatValidator.class)
@Documented
public @interface LongMaxFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.LongMaxFormat.message}"です。
	 * @return エラーメッセージコード
	 */
	String message() default "{org.sesela.commons.validation.LongMaxFormat.message}";

	/**
	 * 最大値。
	 * @return 最大値
	 */
	long max();
	
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
