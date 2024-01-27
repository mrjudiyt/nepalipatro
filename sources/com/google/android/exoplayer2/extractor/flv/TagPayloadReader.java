package com.google.android.exoplayer2.extractor.flv;

import a6.y;
import com.google.android.exoplayer2.ParserException;
import k4.b0;

abstract class TagPayloadReader {

    /* renamed from: a  reason: collision with root package name */
    protected final b0 f6624a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected TagPayloadReader(b0 b0Var) {
        this.f6624a = b0Var;
    }

    public final boolean a(y yVar, long j10) {
        return b(yVar) && c(yVar, j10);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(y yVar);

    /* access modifiers changed from: protected */
    public abstract boolean c(y yVar, long j10);
}
