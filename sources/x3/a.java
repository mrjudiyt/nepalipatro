package x3;

import java.lang.Throwable;

/* compiled from: Function */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput);
}
