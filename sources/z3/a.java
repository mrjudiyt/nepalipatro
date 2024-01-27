package z3;

import a4.d;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import s3.p;

/* compiled from: AlarmManagerScheduler */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13138a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13139b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f13140c;

    /* renamed from: d  reason: collision with root package name */
    private final g f13141d;

    /* renamed from: e  reason: collision with root package name */
    private final c4.a f13142e;

    public a(Context context, d dVar, c4.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    public void a(p pVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(d4.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.f13138a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (z10 || !c(intent)) {
            long D0 = this.f13139b.D0(pVar);
            long g10 = this.f13141d.g(pVar.d(), D0, i10);
            w3.a.c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(g10), Long.valueOf(D0), Integer.valueOf(i10));
            this.f13140c.set(3, this.f13142e.a() + g10, PendingIntent.getBroadcast(this.f13138a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        w3.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    public void b(p pVar, int i10) {
        a(pVar, i10, false);
    }

    /* access modifiers changed from: package-private */
    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f13138a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    a(Context context, d dVar, AlarmManager alarmManager, c4.a aVar, g gVar) {
        this.f13138a = context;
        this.f13139b = dVar;
        this.f13140c = alarmManager;
        this.f13142e = aVar;
        this.f13141d = gVar;
    }
}
