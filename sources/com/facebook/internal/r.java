package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ r f6089a = new r();

    private /* synthetic */ r() {
    }

    public final boolean accept(File file, String str) {
        return Utility.m106refreshBestGuessNumberOfCPUCores$lambda4(file, str);
    }
}
