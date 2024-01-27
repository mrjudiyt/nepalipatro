package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat */
public abstract class d extends Service {

    /* renamed from: o  reason: collision with root package name */
    static final boolean f3619o = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: h  reason: collision with root package name */
    private g f3620h;

    /* renamed from: i  reason: collision with root package name */
    final f f3621i = new f("android.media.session.MediaController", -1, -1, (Bundle) null, (p) null);

    /* renamed from: j  reason: collision with root package name */
    final ArrayList<f> f3622j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f3623k = new androidx.collection.a<>();

    /* renamed from: l  reason: collision with root package name */
    f f3624l;

    /* renamed from: m  reason: collision with root package name */
    final r f3625m = new r();

    /* renamed from: n  reason: collision with root package name */
    MediaSessionCompat.Token f3626n;

    /* compiled from: MediaBrowserServiceCompat */
    class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f3627f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f3628g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Bundle f3629h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Bundle f3630i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3627f = fVar;
            this.f3628g = str;
            this.f3629h = bundle;
            this.f3630i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if (d.this.f3623k.get(this.f3627f.f3645f.asBinder()) == this.f3627f) {
                if ((b() & 1) != 0) {
                    list = d.this.b(list, this.f3629h);
                }
                try {
                    this.f3627f.f3645f.a(this.f3628g, list, this.f3629h, this.f3630i);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling onLoadChildren() failed for id=");
                    sb.append(this.f3628g);
                    sb.append(" package=");
                    sb.append(this.f3627f.f3640a);
                }
            } else if (d.f3619o) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                sb2.append(this.f3627f.f3640a);
                sb2.append(" id=");
                sb2.append(this.f3628g);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.b f3632f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj, c.b bVar) {
            super(obj);
            this.f3632f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((b() & 2) != 0) {
                this.f3632f.c(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3632f.c(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.b f3634f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Object obj, c.b bVar) {
            super(obj);
            this.f3634f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if ((b() & 4) != 0 || list == null) {
                this.f3634f.c(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3634f.c(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$d  reason: collision with other inner class name */
    /* compiled from: MediaBrowserServiceCompat */
    class C0062d extends m<Bundle> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.b f3636f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0062d(Object obj, c.b bVar) {
            super(obj);
            this.f3636f = bVar;
        }

        /* access modifiers changed from: package-private */
        public void d(Bundle bundle) {
            this.f3636f.c(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(Bundle bundle) {
            this.f3636f.c(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f3638a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f3639b;

        public e(String str, Bundle bundle) {
            if (str != null) {
                this.f3638a = str;
                this.f3639b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.f3639b;
        }

        public String d() {
            return this.f3638a;
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private class f implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f3640a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3641b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3642c;

        /* renamed from: d  reason: collision with root package name */
        public final e f3643d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3644e;

        /* renamed from: f  reason: collision with root package name */
        public final p f3645f;

        /* renamed from: g  reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.d<IBinder, Bundle>>> f3646g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public e f3647h;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {
            a() {
            }

            public void run() {
                f fVar = f.this;
                d.this.f3623k.remove(fVar.f3645f.asBinder());
            }
        }

        f(String str, int i10, int i11, Bundle bundle, p pVar) {
            this.f3640a = str;
            this.f3641b = i10;
            this.f3642c = i11;
            this.f3643d = new e(str, i10, i11);
            this.f3644e = bundle;
            this.f3645f = pVar;
        }

        public void binderDied() {
            d.this.f3625m.post(new a());
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    interface g {
        IBinder a(Intent intent);

        void b(String str, Bundle bundle);

        void c(MediaSessionCompat.Token token);

        void onCreate();
    }

    /* compiled from: MediaBrowserServiceCompat */
    class h implements g {

        /* renamed from: a  reason: collision with root package name */
        final List<Bundle> f3650a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        MediaBrowserService f3651b;

        /* renamed from: c  reason: collision with root package name */
        Messenger f3652c;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f3654h;

            a(MediaSessionCompat.Token token) {
                this.f3654h = token;
            }

            public void run() {
                h.this.i(this.f3654h);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f3656f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Object obj, n nVar) {
                super(obj);
                this.f3656f = nVar;
            }

            public void a() {
                this.f3656f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3656f.c(arrayList);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class c implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f3658h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Bundle f3659i;

            c(String str, Bundle bundle) {
                this.f3658h = str;
                this.f3659i = bundle;
            }

            public void run() {
                for (IBinder iBinder : d.this.f3623k.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = d.this.f3623k;
                    h.this.e(aVar.get(iBinder), this.f3658h, this.f3659i);
                }
            }
        }

        /* renamed from: androidx.media.d$h$d  reason: collision with other inner class name */
        /* compiled from: MediaBrowserServiceCompat */
        class C0063d extends MediaBrowserService {
            C0063d(Context context) {
                attachBaseContext(context);
            }

            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.a(bundle);
                h hVar = h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                e g10 = hVar.g(str, i10, bundle2);
                if (g10 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(g10.f3638a, g10.f3639b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.h(str, new n(result));
            }
        }

        h() {
        }

        public IBinder a(Intent intent) {
            return this.f3651b.onBind(intent);
        }

        public void b(String str, Bundle bundle) {
            f(str, bundle);
            d(str, bundle);
        }

        public void c(MediaSessionCompat.Token token) {
            d.this.f3625m.a(new a(token));
        }

        /* access modifiers changed from: package-private */
        public void d(String str, Bundle bundle) {
            d.this.f3625m.post(new c(str, bundle));
        }

        /* access modifiers changed from: package-private */
        public void e(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.d> list = fVar.f3646g.get(str);
            if (list != null) {
                for (androidx.core.util.d dVar : list) {
                    if (c.b(bundle, (Bundle) dVar.f2455b)) {
                        d.this.n(str, fVar, (Bundle) dVar.f2455b, bundle);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(String str, Bundle bundle) {
            this.f3651b.notifyChildrenChanged(str);
        }

        public e g(String str, int i10, Bundle bundle) {
            int i11;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i11 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f3652c = new Messenger(d.this.f3625m);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                androidx.core.app.f.b(bundle2, "extra_messenger", this.f3652c.getBinder());
                MediaSessionCompat.Token token = d.this.f3626n;
                if (token != null) {
                    android.support.v4.media.session.b e10 = token.e();
                    if (e10 == null) {
                        iBinder = null;
                    } else {
                        iBinder = e10.asBinder();
                    }
                    androidx.core.app.f.b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f3650a.add(bundle2);
                }
                int i12 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i11 = i12;
            }
            f fVar = new f(str, i11, i10, bundle, (p) null);
            d dVar = d.this;
            dVar.f3624l = fVar;
            e f10 = dVar.f(str, i10, bundle);
            d dVar2 = d.this;
            dVar2.f3624l = null;
            if (f10 == null) {
                return null;
            }
            if (this.f3652c != null) {
                dVar2.f3622j.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = f10.c();
            } else if (f10.c() != null) {
                bundle2.putAll(f10.c());
            }
            return new e(f10.d(), bundle2);
        }

        public void h(String str, n<List<Parcel>> nVar) {
            b bVar = new b(str, nVar);
            d dVar = d.this;
            dVar.f3624l = dVar.f3621i;
            dVar.g(str, bVar);
            d.this.f3624l = null;
        }

        /* access modifiers changed from: package-private */
        public void i(MediaSessionCompat.Token token) {
            if (!this.f3650a.isEmpty()) {
                android.support.v4.media.session.b e10 = token.e();
                if (e10 != null) {
                    for (Bundle b10 : this.f3650a) {
                        androidx.core.app.f.b(b10, "extra_session_binder", e10.asBinder());
                    }
                }
                this.f3650a.clear();
            }
            this.f3651b.setSessionToken((MediaSession.Token) token.g());
        }

        public void onCreate() {
            C0063d dVar = new C0063d(d.this);
            this.f3651b = dVar;
            dVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class i extends h {

        /* compiled from: MediaBrowserServiceCompat */
        class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f3663f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar) {
                super(obj);
                this.f3663f = nVar;
            }

            public void a() {
                this.f3663f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3663f.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f3663f.c(obtain);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends h.C0063d {
            b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.j(str, new n(result));
            }
        }

        i() {
            super();
        }

        public void j(String str, n<Parcel> nVar) {
            a aVar = new a(str, nVar);
            d dVar = d.this;
            dVar.f3624l = dVar.f3621i;
            dVar.i(str, aVar);
            d.this.f3624l = null;
        }

        public void onCreate() {
            b bVar = new b(d.this);
            this.f3651b = bVar;
            bVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class j extends i {

        /* compiled from: MediaBrowserServiceCompat */
        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f3667f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Bundle f3668g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar, Bundle bundle) {
                super(obj);
                this.f3667f = nVar;
                this.f3668g = bundle;
            }

            public void a() {
                this.f3667f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f3667f.c(null);
                    return;
                }
                if ((b() & 1) != 0) {
                    list = d.this.b(list, this.f3668g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f3667f.c(arrayList);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends i.b {
            b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                d dVar = d.this;
                dVar.f3624l = dVar.f3621i;
                jVar.k(str, new n(result), bundle);
                d.this.f3624l = null;
            }
        }

        j() {
            super();
        }

        /* access modifiers changed from: package-private */
        public void f(String str, Bundle bundle) {
            if (bundle != null) {
                this.f3651b.notifyChildrenChanged(str, bundle);
            } else {
                super.f(str, bundle);
            }
        }

        public void k(String str, n<List<Parcel>> nVar, Bundle bundle) {
            a aVar = new a(str, nVar, bundle);
            d dVar = d.this;
            dVar.f3624l = dVar.f3621i;
            dVar.h(str, aVar, bundle);
            d.this.f3624l = null;
        }

        public void onCreate() {
            b bVar = new b(d.this);
            this.f3651b = bVar;
            bVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class k extends j {
        k() {
            super();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class l implements g {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f3672a;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f3674h;

            a(MediaSessionCompat.Token token) {
                this.f3674h = token;
            }

            public void run() {
                Iterator<f> it = d.this.f3623k.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f3645f.c(next.f3647h.d(), this.f3674h, next.f3647h.c());
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection for ");
                        sb.append(next.f3640a);
                        sb.append(" is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f3676h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Bundle f3677i;

            b(String str, Bundle bundle) {
                this.f3676h = str;
                this.f3677i = bundle;
            }

            public void run() {
                for (IBinder iBinder : d.this.f3623k.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = d.this.f3623k;
                    l.this.d(aVar.get(iBinder), this.f3676h, this.f3677i);
                }
            }
        }

        l() {
        }

        public IBinder a(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3672a.getBinder();
            }
            return null;
        }

        public void b(String str, Bundle bundle) {
            d.this.f3625m.post(new b(str, bundle));
        }

        public void c(MediaSessionCompat.Token token) {
            d.this.f3625m.post(new a(token));
        }

        /* access modifiers changed from: package-private */
        public void d(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.d> list = fVar.f3646g.get(str);
            if (list != null) {
                for (androidx.core.util.d dVar : list) {
                    if (c.b(bundle, (Bundle) dVar.f2455b)) {
                        d.this.n(str, fVar, (Bundle) dVar.f2455b, bundle);
                    }
                }
            }
        }

        public void onCreate() {
            this.f3672a = new Messenger(d.this.f3625m);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    public static class m<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f3679a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3680b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3681c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3682d;

        /* renamed from: e  reason: collision with root package name */
        private int f3683e;

        m(Object obj) {
            this.f3679a = obj;
        }

        public void a() {
            if (this.f3680b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f3679a);
            } else if (this.f3681c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f3679a);
            } else if (!this.f3682d) {
                this.f3680b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f3679a);
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f3683e;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f3680b || this.f3681c || this.f3682d;
        }

        /* access modifiers changed from: package-private */
        public void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3679a);
        }

        /* access modifiers changed from: package-private */
        public void e(T t10) {
            throw null;
        }

        public void f(Bundle bundle) {
            if (this.f3681c || this.f3682d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3679a);
            }
            this.f3682d = true;
            d(bundle);
        }

        public void g(T t10) {
            if (this.f3681c || this.f3682d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3679a);
            }
            this.f3681c = true;
            e(t10);
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            this.f3683e = i10;
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    static class n<T> {

        /* renamed from: a  reason: collision with root package name */
        MediaBrowserService.Result f3684a;

        n(MediaBrowserService.Result result) {
            this.f3684a = result;
        }

        public void a() {
            this.f3684a.detach();
        }

        /* access modifiers changed from: package-private */
        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        public void c(T t10) {
            if (t10 instanceof List) {
                this.f3684a.sendResult(b((List) t10));
            } else if (t10 instanceof Parcel) {
                Parcel parcel = (Parcel) t10;
                parcel.setDataPosition(0);
                this.f3684a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f3684a.sendResult((Object) null);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private class o {

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3686h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3687i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f3688j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f3689k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ Bundle f3690l;

            a(p pVar, String str, int i10, int i11, Bundle bundle) {
                this.f3686h = pVar;
                this.f3687i = str;
                this.f3688j = i10;
                this.f3689k = i11;
                this.f3690l = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3686h.asBinder();
                d.this.f3623k.remove(asBinder);
                f fVar = new f(this.f3687i, this.f3688j, this.f3689k, this.f3690l, this.f3686h);
                d dVar = d.this;
                dVar.f3624l = fVar;
                e f10 = dVar.f(this.f3687i, this.f3689k, this.f3690l);
                fVar.f3647h = f10;
                d dVar2 = d.this;
                dVar2.f3624l = null;
                if (f10 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f3687i);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f3686h.b();
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f3687i);
                    }
                } else {
                    try {
                        dVar2.f3623k.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (d.this.f3626n != null) {
                            this.f3686h.c(fVar.f3647h.d(), d.this.f3626n, fVar.f3647h.c());
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb3.append(this.f3687i);
                        d.this.f3623k.remove(asBinder);
                    }
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3692h;

            b(p pVar) {
                this.f3692h = pVar;
            }

            public void run() {
                f remove = d.this.f3623k.remove(this.f3692h.asBinder());
                if (remove != null) {
                    remove.f3645f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class c implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3694h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3695i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ IBinder f3696j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ Bundle f3697k;

            c(p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f3694h = pVar;
                this.f3695i = str;
                this.f3696j = iBinder;
                this.f3697k = bundle;
            }

            public void run() {
                f fVar = d.this.f3623k.get(this.f3694h.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription for callback that isn't registered id=");
                    sb.append(this.f3695i);
                    return;
                }
                d.this.a(this.f3695i, fVar, this.f3696j, this.f3697k);
            }
        }

        /* renamed from: androidx.media.d$o$d  reason: collision with other inner class name */
        /* compiled from: MediaBrowserServiceCompat */
        class C0064d implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3699h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3700i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ IBinder f3701j;

            C0064d(p pVar, String str, IBinder iBinder) {
                this.f3699h = pVar;
                this.f3700i = str;
                this.f3701j = iBinder;
            }

            public void run() {
                f fVar = d.this.f3623k.get(this.f3699h.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f3700i);
                } else if (!d.this.q(this.f3700i, fVar, this.f3701j)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f3700i);
                    sb2.append(" which is not subscribed");
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class e implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3703h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3704i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c.b f3705j;

            e(p pVar, String str, c.b bVar) {
                this.f3703h = pVar;
                this.f3704i = str;
                this.f3705j = bVar;
            }

            public void run() {
                f fVar = d.this.f3623k.get(this.f3703h.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMediaItem for callback that isn't registered id=");
                    sb.append(this.f3704i);
                    return;
                }
                d.this.o(this.f3704i, fVar, this.f3705j);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class f implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3707h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f3708i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f3709j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f3710k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ Bundle f3711l;

            f(p pVar, int i10, String str, int i11, Bundle bundle) {
                this.f3707h = pVar;
                this.f3708i = i10;
                this.f3709j = str;
                this.f3710k = i11;
                this.f3711l = bundle;
            }

            public void run() {
                f fVar;
                IBinder asBinder = this.f3707h.asBinder();
                d.this.f3623k.remove(asBinder);
                Iterator<f> it = d.this.f3622j.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f3642c == this.f3708i) {
                        if (TextUtils.isEmpty(this.f3709j) || this.f3710k <= 0) {
                            fVar = new f(next.f3640a, next.f3641b, next.f3642c, this.f3711l, this.f3707h);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new f(this.f3709j, this.f3710k, this.f3708i, this.f3711l, this.f3707h);
                }
                d.this.f3623k.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class g implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3713h;

            g(p pVar) {
                this.f3713h = pVar;
            }

            public void run() {
                IBinder asBinder = this.f3713h.asBinder();
                f remove = d.this.f3623k.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class h implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3715h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3716i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Bundle f3717j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ c.b f3718k;

            h(p pVar, String str, Bundle bundle, c.b bVar) {
                this.f3715h = pVar;
                this.f3716i = str;
                this.f3717j = bundle;
                this.f3718k = bVar;
            }

            public void run() {
                f fVar = d.this.f3623k.get(this.f3715h.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("search for callback that isn't registered query=");
                    sb.append(this.f3716i);
                    return;
                }
                d.this.p(this.f3716i, this.f3717j, fVar, this.f3718k);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class i implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f3720h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f3721i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Bundle f3722j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ c.b f3723k;

            i(p pVar, String str, Bundle bundle, c.b bVar) {
                this.f3720h = pVar;
                this.f3721i = str;
                this.f3722j = bundle;
                this.f3723k = bVar;
            }

            public void run() {
                f fVar = d.this.f3623k.get(this.f3720h.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendCustomAction for callback that isn't registered action=");
                    sb.append(this.f3721i);
                    sb.append(", extras=");
                    sb.append(this.f3722j);
                    return;
                }
                d.this.m(this.f3721i, this.f3722j, fVar, this.f3723k);
            }
        }

        o() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
            d.this.f3625m.a(new c(pVar, str, iBinder, bundle));
        }

        public void b(String str, int i10, int i11, Bundle bundle, p pVar) {
            if (d.this.c(str, i11)) {
                d.this.f3625m.a(new a(pVar, str, i10, i11, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + str);
        }

        public void c(p pVar) {
            d.this.f3625m.a(new b(pVar));
        }

        public void d(String str, c.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f3625m.a(new e(pVar, str, bVar));
            }
        }

        public void e(p pVar, String str, int i10, int i11, Bundle bundle) {
            d.this.f3625m.a(new f(pVar, i11, str, i10, bundle));
        }

        public void f(String str, IBinder iBinder, p pVar) {
            d.this.f3625m.a(new C0064d(pVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, c.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f3625m.a(new h(pVar, str, bundle, bVar));
            }
        }

        public void h(String str, Bundle bundle, c.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f3625m.a(new i(pVar, str, bundle, bVar));
            }
        }

        public void i(p pVar) {
            d.this.f3625m.a(new g(pVar));
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private interface p {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();

        void b();

        void c(String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* compiled from: MediaBrowserServiceCompat */
    private static class q implements p {

        /* renamed from: a  reason: collision with root package name */
        final Messenger f3725a;

        q(Messenger messenger) {
            this.f3725a = messenger;
        }

        private void d(int i10, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3725a.send(obtain);
        }

        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f3725a.getBinder();
        }

        public void b() {
            d(2, (Bundle) null);
        }

        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private final class r extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final o f3726a;

        r() {
            this.f3726a = new o();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    this.f3726a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new q(message.replyTo));
                    return;
                case 2:
                    this.f3726a.c(new q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    this.f3726a.a(data.getString("data_media_item_id"), androidx.core.app.f.a(data, "data_callback_token"), bundle2, new q(message.replyTo));
                    return;
                case 4:
                    this.f3726a.f(data.getString("data_media_item_id"), androidx.core.app.f.a(data, "data_callback_token"), new q(message.replyTo));
                    return;
                case 5:
                    this.f3726a.d(data.getString("data_media_item_id"), (c.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    o oVar = this.f3726a;
                    q qVar = new q(message.replyTo);
                    oVar.e(qVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f3726a.i(new q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    this.f3726a.g(data.getString("data_search_query"), bundle4, (c.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    this.f3726a.h(data.getString("data_custom_action"), bundle5, (c.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.d> list = fVar.f3646g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (androidx.core.util.d dVar : list) {
            if (iBinder == dVar.f2454a && c.a(bundle, (Bundle) dVar.f2455b)) {
                return;
            }
        }
        list.add(new androidx.core.util.d(iBinder, bundle));
        fVar.f3646g.put(str, list);
        n(str, fVar, bundle, (Bundle) null);
        this.f3624l = fVar;
        k(str, bundle);
        this.f3624l = null;
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i10 == -1 && i11 == -1) {
            return list;
        }
        int i12 = i11 * i10;
        int i13 = i12 + i11;
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.emptyList();
        }
        if (i13 > list.size()) {
            i13 = list.size();
        }
        return list.subList(i12, i13);
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i10)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(String str) {
        if (str != null) {
            this.f3620h.b(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void e(String str, Bundle bundle, m<Bundle> mVar) {
        mVar.f((Bundle) null);
    }

    public abstract e f(String str, int i10, Bundle bundle);

    public abstract void g(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void h(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.h(1);
        g(str, mVar);
    }

    public void i(String str, m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.h(2);
        mVar.g(null);
    }

    public void j(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.h(4);
        mVar.g(null);
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(String str) {
    }

    /* access modifiers changed from: package-private */
    public void m(String str, Bundle bundle, f fVar, c.b bVar) {
        C0062d dVar = new C0062d(str, bVar);
        this.f3624l = fVar;
        e(str, bundle, dVar);
        this.f3624l = null;
        if (!dVar.c()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f3624l = fVar;
        if (bundle == null) {
            g(str, aVar);
        } else {
            h(str, aVar, bundle);
        }
        this.f3624l = null;
        if (!aVar.c()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f3640a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(String str, f fVar, c.b bVar) {
        b bVar2 = new b(str, bVar);
        this.f3624l = fVar;
        i(str, bVar2);
        this.f3624l = null;
        if (!bVar2.c()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3620h.a(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f3620h = new k();
        } else if (i10 >= 26) {
            this.f3620h = new j();
        } else if (i10 >= 23) {
            this.f3620h = new i();
        } else if (i10 >= 21) {
            this.f3620h = new h();
        } else {
            this.f3620h = new l();
        }
        this.f3620h.onCreate();
    }

    /* access modifiers changed from: package-private */
    public void p(String str, Bundle bundle, f fVar, c.b bVar) {
        c cVar = new c(str, bVar);
        this.f3624l = fVar;
        j(str, bundle, cVar);
        this.f3624l = null;
        if (!cVar.c()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(String str, f fVar, IBinder iBinder) {
        boolean z10 = true;
        boolean z11 = false;
        if (iBinder == null) {
            try {
                if (fVar.f3646g.remove(str) == null) {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f3624l = fVar;
                l(str);
                this.f3624l = null;
            }
        } else {
            List list = fVar.f3646g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((androidx.core.util.d) it.next()).f2454a) {
                        it.remove();
                        z11 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f3646g.remove(str);
                }
            }
            this.f3624l = fVar;
            l(str);
            this.f3624l = null;
            return z11;
        }
    }

    public void r(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.f3626n == null) {
            this.f3626n = token;
            this.f3620h.c(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }
}
