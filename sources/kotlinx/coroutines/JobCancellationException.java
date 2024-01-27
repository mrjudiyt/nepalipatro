package kotlinx.coroutines;

import i9.e0;
import i9.p0;
import i9.u1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;

/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException implements e0<JobCancellationException> {

    /* renamed from: h  reason: collision with root package name */
    public final transient u1 f15578h;

    public JobCancellationException(String str, Throwable th, u1 u1Var) {
        super(str);
        this.f15578h = u1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public JobCancellationException a() {
        if (!p0.c()) {
            return null;
        }
        String message = getMessage();
        m.c(message);
        return new JobCancellationException(message, this, this.f15578h);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!m.a(jobCancellationException.getMessage(), getMessage()) || !m.a(jobCancellationException.f15578h, this.f15578h) || !m.a(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (p0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        m.c(message);
        int hashCode = ((message.hashCode() * 31) + this.f15578h.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f15578h;
    }
}
