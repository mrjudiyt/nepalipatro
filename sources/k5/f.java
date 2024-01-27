package k5;

import com.google.firebase.sessions.settings.RemoteSettings;
import z4.a;

/* compiled from: EventStream */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a[] f9673a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f9674b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9675c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9676d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9677e;

    public f(String str, String str2, long j10, long[] jArr, a[] aVarArr) {
        this.f9675c = str;
        this.f9676d = str2;
        this.f9677e = j10;
        this.f9674b = jArr;
        this.f9673a = aVarArr;
    }

    public String a() {
        String str = this.f9675c;
        String str2 = this.f9676d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(str2);
        return sb.toString();
    }
}
