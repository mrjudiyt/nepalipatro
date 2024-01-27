package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AggregateException.kt */
public final class AggregateException extends Exception {
    public static final Companion Companion = new Companion((g) null);
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    /* compiled from: AggregateException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : (Throwable) list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? p.e() : list);
        m.e(unmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    public void printStackTrace(PrintStream printStream) {
        m.f(printStream, "err");
        super.printStackTrace(printStream);
        int i10 = -1;
        for (Throwable next : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i10++;
            printStream.append(String.valueOf(i10));
            printStream.append(": ");
            if (next != null) {
                next.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        m.f(printWriter, "err");
        super.printStackTrace(printWriter);
        int i10 = -1;
        for (Throwable next : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i10++;
            printWriter.append(String.valueOf(i10));
            printWriter.append(": ");
            if (next != null) {
                next.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
