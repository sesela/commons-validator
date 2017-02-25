package org.sesela.common.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.common.validator.impl.DateFormatValidator;

/**
 * 日時書式バリデーション用のアノテーションです。
 * 
 * @author sesela
 * 
 */
@Target({ FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DateFormatValidator.class)
@Documented
public @interface DateFormat {

	/**
	 * エラーメッセージコード。デフォルト"{org.sesela.common.validation.DateFormat.message}"です。
	 * 
	 */
	String message() default "{org.sesela.common.validation.DateFormat.message}";

	/**
	 * チェックする日時パターン。デフォルト"yyyy/MM/dd"です。
	 * 
	 */
	String pattern() default "yyyy/MM/dd";

	/** 
	 * 厳密チェックフラグ。デフォルトtrue。
	 */
	boolean strict() default true;

	
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
