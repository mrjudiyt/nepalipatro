package com.bumptech.glide.load.engine;

import e2.e;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: n  reason: collision with root package name */
    private static final StackTraceElement[] f5643n = new StackTraceElement[0];

    /* renamed from: h  reason: collision with root package name */
    private final List<Throwable> f5644h;

    /* renamed from: i  reason: collision with root package name */
    private e f5645i;

    /* renamed from: j  reason: collision with root package name */
    private e2.a f5646j;

    /* renamed from: k  reason: collision with root package name */
    private Class<?> f5647k;

    /* renamed from: l  reason: collision with root package name */
    private String f5648l;

    /* renamed from: m  reason: collision with root package name */
    private Exception f5649m;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a10 : ((GlideException) th).e()) {
                a(a10, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f5644h;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Throwable th = f10.get(i10);
            i10 = i11;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f5648l);
        String str3 = "";
        if (this.f5647k != null) {
            str = ", " + this.f5647k;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f5646j != null) {
            str2 = ", " + this.f5646j;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f5645i != null) {
            str3 = ", " + this.f5645i;
        }
        sb.append(str3);
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb.toString();
        }
        if (f10.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f10.size());
            sb.append(" causes:");
        }
        for (Throwable next : f10) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void i(e eVar, e2.a aVar) {
        j(eVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    public void j(e eVar, e2.a aVar, Class<?> cls) {
        this.f5645i = eVar;
        this.f5646j = aVar;
        this.f5647k = cls;
    }

    public void k(Exception exc) {
        this.f5649m = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f5648l = str;
        setStackTrace(f5643n);
        this.f5644h = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: h  reason: collision with root package name */
        private final Appendable f5650h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f5651i = true;

        a(Appendable appendable) {
            this.f5650h = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c10) {
            boolean z10 = false;
            if (this.f5651i) {
                this.f5651i = false;
                this.f5650h.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f5651i = z10;
            this.f5650h.append(c10);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f5651i) {
                this.f5651i = false;
                this.f5650h.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f5651i = z10;
            this.f5650h.append(a10, i10, i11);
            return this;
        }
    }
}
