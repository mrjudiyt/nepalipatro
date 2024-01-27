package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RouteException extends Exception {

    /* renamed from: i  reason: collision with root package name */
    private static final Method f14154i;

    /* renamed from: h  reason: collision with root package name */
    private IOException f14155h;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f14154i = method;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.f14155h = iOException;
    }

    private void b(IOException iOException, IOException iOException2) {
        Method method = f14154i;
        if (method != null) {
            try {
                method.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void a(IOException iOException) {
        b(iOException, this.f14155h);
        this.f14155h = iOException;
    }

    public IOException c() {
        return this.f14155h;
    }
}
