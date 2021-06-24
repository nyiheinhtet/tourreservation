package jp.co.nttdata.example.tour.app.common.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = { MultiFieldDateValidator.class })
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface MultiFieldDate {

	/**
	 * 入力値が当日より前の日付になっているかの日付チェックを行うことを示す定数
	 */
	public static final int BEFORE_TODAY = -1;

	/**
	 * 入力値が当日より後の日付になっているかの日付チェックを行うことを示す定数
	 */
	public static final int AFTER_TODAY = 1;

	/**
	 * 入力値が当日より後の日付になっているかの日付チェックを行うことを示す定数
	 */
	public static final int NONE_CHECK = 0;

	String message() default "{jp.co.nttdata.example.tour.app.common.validation.MultiFieldDate.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	public @interface List {
		MultiFieldDate[] value();
	}

	String year();

	String month();

	String day();

	int check() default NONE_CHECK;
}
