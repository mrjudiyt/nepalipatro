package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ l f6077a = new l();

    private /* synthetic */ l() {
    }

    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m101filterExcludeNonBufferFiles$lambda1(file, str);
    }
}
