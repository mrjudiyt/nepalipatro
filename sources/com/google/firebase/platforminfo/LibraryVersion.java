package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class LibraryVersion {
    LibraryVersion() {
    }

    /* access modifiers changed from: package-private */
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}
