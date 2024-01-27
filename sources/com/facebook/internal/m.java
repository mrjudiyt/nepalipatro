package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ m f6078a = new m();

    private /* synthetic */ m() {
    }

    public final boolean accept(File file, String str) {
        return FileLruCache.BufferFile.m100filterExcludeBufferFiles$lambda0(file, str);
    }
}
