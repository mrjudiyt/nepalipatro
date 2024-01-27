package com.facebook.appevents.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;

/* compiled from: HashUtils.kt */
public final class HashUtils$computeChecksumWithPackageManager$listener$1 implements InvocationHandler {
    final /* synthetic */ Object $TYPE_WHOLE_MD5;
    final /* synthetic */ Condition $checksumReady;
    final /* synthetic */ ReentrantLock $lock;
    final /* synthetic */ y<String> $resultChecksum;

    HashUtils$computeChecksumWithPackageManager$listener$1(Object obj, y<String> yVar, ReentrantLock reentrantLock, Condition condition) {
        this.$TYPE_WHOLE_MD5 = obj;
        this.$resultChecksum = yVar;
        this.$lock = reentrantLock;
        this.$checksumReady = condition;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        m.f(method, "method");
        m.f(objArr, "objects");
        try {
            if (m.a(method.getName(), "onChecksumsReady") && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object next : objArr[0]) {
                    if (next != null) {
                        Method method2 = next.getClass().getMethod("getSplitName", new Class[0]);
                        m.e(method2, "c.javaClass.getMethod(\"getSplitName\")");
                        Method method3 = next.getClass().getMethod("getType", new Class[0]);
                        m.e(method3, "c.javaClass.getMethod(\"getType\")");
                        if (method2.invoke(next, new Object[0]) == null && m.a(method3.invoke(next, new Object[0]), this.$TYPE_WHOLE_MD5)) {
                            Method method4 = next.getClass().getMethod("getValue", new Class[0]);
                            m.e(method4, "c.javaClass.getMethod(\"getValue\")");
                            Object invoke = method4.invoke(next, new Object[0]);
                            if (invoke != null) {
                                this.$resultChecksum.f15575h = new BigInteger(1, (byte[]) invoke).toString(16);
                                this.$lock.lock();
                                this.$checksumReady.signalAll();
                                this.$lock.unlock();
                                return null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            String unused2 = HashUtils.TAG;
        }
        return null;
    }
}
