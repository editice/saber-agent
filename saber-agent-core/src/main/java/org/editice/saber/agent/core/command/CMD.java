package org.editice.saber.agent.core.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author tinglang
 * @date 2018/10/23.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CMD {

    String name();

    String summary();

    String[] eg();

    /**
     * used for help show
     */
    int priority();
}
