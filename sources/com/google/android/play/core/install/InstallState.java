package com.google.android.play.core.install;

import android.content.Intent;
import f6.s;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public abstract class InstallState {
    public static InstallState f(Intent intent, s sVar) {
        Intent intent2 = intent;
        s sVar2 = sVar;
        sVar2.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        sVar2.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        sVar2.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        return new a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
    }

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract String d();

    public abstract long e();
}
