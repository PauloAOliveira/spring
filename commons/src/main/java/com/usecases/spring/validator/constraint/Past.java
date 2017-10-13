package com.usecases.spring.validator.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = PastValidator.class)
@Documented
public @interface Past {
    String message() default "must be in the past";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
