package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

public class UnrecognizedInputFormatException extends ParserException {

    /* renamed from: j  reason: collision with root package name */
    public final Uri f7095j;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, (Throwable) null, false, 1);
        this.f7095j = uri;
    }
}
