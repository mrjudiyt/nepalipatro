package b8;

import android.content.SharedPreferences;
import kotlin.jvm.internal.m;

/* compiled from: Preferences.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f13329a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.Editor f13330b;

    public b(SharedPreferences sharedPreferences) {
        m.f(sharedPreferences, "sharedPreferences");
        this.f13329a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        m.e(edit, "sharedPreferences.edit()");
        this.f13330b = edit;
    }

    public final Boolean a(String str) {
        m.f(str, "id");
        if (this.f13329a.contains(str)) {
            return Boolean.valueOf(this.f13329a.getBoolean(str, false));
        }
        return null;
    }

    public final Integer b(String str) {
        m.f(str, "id");
        if (this.f13329a.contains(str)) {
            return Integer.valueOf(this.f13329a.getInt(str, 0));
        }
        return null;
    }

    public final Long c(String str) {
        m.f(str, "id");
        if (this.f13329a.contains(str)) {
            return Long.valueOf(this.f13329a.getLong(str, 0));
        }
        return null;
    }

    public final String d(String str) {
        m.f(str, "id");
        return this.f13329a.getString(str, (String) null);
    }

    public final boolean e(String str) {
        m.f(str, "id");
        this.f13330b.remove(str);
        return this.f13330b.commit();
    }

    public final boolean f(String str, boolean z10) {
        m.f(str, "id");
        this.f13330b.putBoolean(str, z10);
        return this.f13330b.commit();
    }

    public final boolean g(String str, int i10) {
        m.f(str, "id");
        this.f13330b.putInt(str, i10);
        return this.f13330b.commit();
    }

    public final boolean h(String str, long j10) {
        m.f(str, "id");
        this.f13330b.putLong(str, j10);
        return this.f13330b.commit();
    }

    public final boolean i(String str, String str2) {
        m.f(str, "id");
        m.f(str2, "value");
        this.f13330b.putString(str, str2);
        return this.f13330b.commit();
    }
}
