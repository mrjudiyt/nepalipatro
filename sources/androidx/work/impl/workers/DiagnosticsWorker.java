package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.i;
import v1.g;
import v1.h;
import v1.k;
import v1.p;
import v1.q;
import v1.t;

public class DiagnosticsWorker extends Worker {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4908a = m.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f12255a, pVar.f12257c, num, pVar.f12256b.name(), str, str2});
    }

    private static String c(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (p next : list) {
            Integer num = null;
            g b10 = hVar.b(next.f12255a);
            if (b10 != null) {
                num = Integer.valueOf(b10.f12233b);
            }
            sb.append(a(next, TextUtils.join(",", kVar.b(next.f12255a)), num, TextUtils.join(",", tVar.a(next.f12255a))));
        }
        return sb.toString();
    }

    public ListenableWorker.a doWork() {
        WorkDatabase q10 = i.m(getApplicationContext()).q();
        q B = q10.B();
        k z10 = q10.z();
        t C = q10.C();
        h y10 = q10.y();
        List<p> e10 = B.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<p> i10 = B.i();
        List<p> t10 = B.t(200);
        if (e10 != null && !e10.isEmpty()) {
            m c10 = m.c();
            String str = f4908a;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            m.c().d(str, c(z10, C, y10, e10), new Throwable[0]);
        }
        if (i10 != null && !i10.isEmpty()) {
            m c11 = m.c();
            String str2 = f4908a;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            m.c().d(str2, c(z10, C, y10, i10), new Throwable[0]);
        }
        if (t10 != null && !t10.isEmpty()) {
            m c12 = m.c();
            String str3 = f4908a;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            m.c().d(str3, c(z10, C, y10, t10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
