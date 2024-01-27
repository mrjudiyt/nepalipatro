package w1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.m;

/* compiled from: PackageManagerHelper */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12609a = m.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            m c10 = m.c();
            String str3 = f12609a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c10.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            m c11 = m.c();
            String str4 = f12609a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c11.a(str4, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
