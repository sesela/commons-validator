package org.sesela.commons.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.sesela.commons.validator.impl.DateFormatValidator;

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
	 * エラーメッセージコード。デフォルト"{org.sesela.commons.validation.DateFormat.message}"です。
	 * @return エラーメッセージコード
	 */
	String message() default "{org.sesela.commons.validation.DateFormat.message}";

	/**
	 * チェックする日時パターン。デフォルト"yyyy/MM/dd"です。
	 * @return 日時パターン
	 */
	String pattern() default "yyyy/MM/dd";

	/** 
	 * 厳密チェックフラグ。デフォルトtrue。
	 * @return 厳密チェックフラグ
	 */
	boolean strict() default true;

	
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
