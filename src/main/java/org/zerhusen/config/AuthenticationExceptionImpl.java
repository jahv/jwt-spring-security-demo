package org.zerhusen.config;


import org.springframework.security.core.AuthenticationException;

/**
 * Created by ahernandez on 11/23/16.
 */
public class AuthenticationExceptionImpl extends AuthenticationException {
    public AuthenticationExceptionImpl(String msg, Throwable t) {
        super(msg, t);
    }

    public AuthenticationExceptionImpl(String msg) {
        super(msg);
    }
}
