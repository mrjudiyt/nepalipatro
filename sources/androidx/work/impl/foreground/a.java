package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o1.i;
import r1.c;
import r1.d;
import v1.p;

/* compiled from: SystemForegroundDispatcher */
public class a implements c, o1.b {

    /* renamed from: r  reason: collision with root package name */
    static final String f4850r = m.f("SystemFgDispatcher");

    /* renamed from: h  reason: collision with root package name */
    private Context f4851h;

    /* renamed from: i  reason: collision with root package name */
    private i f4852i;

    /* renamed from: j  reason: collision with root package name */
    private final x1.a f4853j;

    /* renamed from: k  reason: collision with root package name */
    final Object f4854k = new Object();

    /* renamed from: l  reason: collision with root package name */
    String f4855l;

    /* renamed from: m  reason: collision with root package name */
    final Map<String, g> f4856m;

    /* renamed from: n  reason: collision with root package name */
    final Map<String, p> f4857n;

    /* renamed from: o  reason: collision with root package name */
    final Set<p> f4858o;

    /* renamed from: p  reason: collision with root package name */
    final d f4859p;

    /* renamed from: q  reason: collision with root package name */
    private b f4860q;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* compiled from: SystemForegroundDispatcher */
    class C0085a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f4861h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f4862i;

        C0085a(WorkDatabase workDatabase, String str) {
            this.f4861h = workDatabase;
            this.f4862i = str;
        }

        public void run() {
            p n10 = this.f4861h.B().n(this.f4862i);
            if (n10 != null && n10.b()) {
                synchronized (a.this.f4854k) {
                    a.this.f4857n.put(this.f4862i, n10);
                    a.this.f4858o.add(n10);
                    a aVar = a.this;
                    aVar.f4859p.d(aVar.f4858o);
                }
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher */
    interface b {
        void b(int i10, int i11, Notification notification);

        void c(int i10, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f4851h = context;
        i m10 = i.m(context);
        this.f4852i = m10;
        x1.a r10 = m10.r();
        this.f4853j = r10;
        this.f4855l = null;
        this.f4856m = new LinkedHashMap();
        this.f4858o = new HashSet();
        this.f4857n = new HashMap();
        this.f4859p = new d(this.f4851h, r10, this);
        this.f4852i.o().d(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        m.c().d(f4850r, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f4852i.h(UUID.fromString(stringExtra));
        }
    }

    private void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m.c().a(f4850r, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f4860q != null) {
            this.f4856m.put(stringExtra, new g(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f4855l)) {
                this.f4855l = stringExtra;
                this.f4860q.b(intExtra, intExtra2, notification);
                return;
            }
            this.f4860q.c(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, g> value : this.f4856m.entrySet()) {
                    i10 |= ((g) value.getValue()).a();
                }
                g gVar = this.f4856m.get(this.f4855l);
                if (gVar != null) {
                    this.f4860q.b(gVar.c(), i10, gVar.b());
                }
            }
        }
    }

    private void i(Intent intent) {
        m.c().d(f4850r, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f4853j.b(new C0085a(this.f4852i.q(), stringExtra));
    }

    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                m.c().a(f4850r, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f4852i.y(next);
            }
        }
    }

    public void c(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f4854k) {
            p remove = this.f4857n.remove(str);
            if (remove != null ? this.f4858o.remove(remove) : false) {
                this.f4859p.d(this.f4858o);
            }
        }
        g remove2 = this.f4856m.remove(str);
        if (str.equals(this.f4855l) && this.f4856m.size() > 0) {
            Iterator it = this.f4856m.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f4855l = (String) entry.getKey();
            if (this.f4860q != null) {
                g gVar = (g) entry.getValue();
                this.f4860q.b(gVar.c(), gVar.a(), gVar.b());
                this.f4860q.d(gVar.c());
            }
        }
        b bVar = this.f4860q;
        if (remove2 != null && bVar != null) {
            m.c().a(f4850r, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())}), new Throwable[0]);
            bVar.d(remove2.c());
        }
    }

    public void e(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void j(Intent intent) {
        m.c().d(f4850r, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f4860q;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f4860q = null;
        synchronized (this.f4854k) {
            this.f4859p.e();
        }
        this.f4852i.o().i(this);
    }

    /* access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f4860q != null) {
            m.c().b(f4850r, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4860q = bVar;
        }
    }
}
