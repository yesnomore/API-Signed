package cn.oever.signature.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotation indicates that the field is a appId
 */
@Target({ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SignedAppId {
}
