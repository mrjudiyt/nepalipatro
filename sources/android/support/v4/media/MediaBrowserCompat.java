package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    static final boolean f285b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a  reason: collision with root package name */
    private final d f286a;

    private static class CustomActionResultReceiver extends c.b {
        /* access modifiers changed from: protected */
        public void b(int i10, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends c.b {
        /* access modifiers changed from: protected */
        public void b(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.p(bundle);
            }
            if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends c.b {
        /* access modifiers changed from: protected */
        public void b(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.p(bundle);
            }
            if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a {
        static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<i> f289a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Messenger> f290b;

        b(i iVar) {
            this.f289a = new WeakReference<>(iVar);
        }

        /* access modifiers changed from: package-private */
        public void a(Messenger messenger) {
            this.f290b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f290b;
            if (weakReference != null && weakReference.get() != null && this.f289a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                i iVar = (i) this.f289a.get();
                Messenger messenger = (Messenger) this.f290b.get();
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle);
                        iVar.a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i10 == 2) {
                        iVar.g(messenger);
                    } else if (i10 != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unhandled message: ");
                        sb.append(message);
                        sb.append("\n  Client version: ");
                        sb.append(1);
                        sb.append("\n  Service version: ");
                        sb.append(message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.a(bundle3);
                        iVar.b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        iVar.g(messenger);
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f291a;

        /* renamed from: b  reason: collision with root package name */
        b f292b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            public void onConnected() {
                b bVar = c.this.f292b;
                if (bVar != null) {
                    bVar.h();
                }
                c.this.a();
            }

            public void onConnectionFailed() {
                b bVar = c.this.f292b;
                if (bVar != null) {
                    bVar.i();
                }
                c.this.b();
            }

            public void onConnectionSuspended() {
                b bVar = c.this.f292b;
                if (bVar != null) {
                    bVar.d();
                }
                c.this.c();
            }
        }

        interface b {
            void d();

            void h();

            void i();
        }

        public c() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f291a = new a();
            } else {
                this.f291a = null;
            }
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d(b bVar) {
            this.f292b = bVar;
        }
    }

    interface d {
        MediaSessionCompat.Token c();

        void disconnect();

        void e();

        void f(String str, Bundle bundle, l lVar);

        void j(String str, l lVar);
    }

    static class e implements d, i, c.b {

        /* renamed from: a  reason: collision with root package name */
        final Context f294a;

        /* renamed from: b  reason: collision with root package name */
        protected final MediaBrowser f295b;

        /* renamed from: c  reason: collision with root package name */
        protected final Bundle f296c;

        /* renamed from: d  reason: collision with root package name */
        protected final b f297d = new b(this);

        /* renamed from: e  reason: collision with root package name */
        private final androidx.collection.a<String, k> f298e = new androidx.collection.a<>();

        /* renamed from: f  reason: collision with root package name */
        protected int f299f;

        /* renamed from: g  reason: collision with root package name */
        protected j f300g;

        /* renamed from: h  reason: collision with root package name */
        protected Messenger f301h;

        /* renamed from: i  reason: collision with root package name */
        private MediaSessionCompat.Token f302i;

        /* renamed from: j  reason: collision with root package name */
        private Bundle f303j;

        e(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f294a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f296c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.d(this);
            this.f295b = new MediaBrowser(context, componentName, cVar.f291a, bundle2);
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f301h == messenger) {
                k kVar = this.f298e.get(str);
                if (kVar != null) {
                    l a10 = kVar.a(bundle);
                    if (a10 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a10.c(str);
                            return;
                        }
                        this.f303j = bundle2;
                        a10.a(str, list);
                        this.f303j = null;
                    } else if (list == null) {
                        a10.d(str, bundle);
                    } else {
                        this.f303j = bundle2;
                        a10.b(str, list, bundle);
                        this.f303j = null;
                    }
                } else if (MediaBrowserCompat.f285b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                }
            }
        }

        public MediaSessionCompat.Token c() {
            if (this.f302i == null) {
                this.f302i = MediaSessionCompat.Token.c(this.f295b.getSessionToken());
            }
            return this.f302i;
        }

        public void d() {
            this.f300g = null;
            this.f301h = null;
            this.f302i = null;
            this.f297d.a((Messenger) null);
        }

        public void disconnect() {
            Messenger messenger;
            j jVar = this.f300g;
            if (!(jVar == null || (messenger = this.f301h) == null)) {
                try {
                    jVar.g(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f295b.disconnect();
        }

        public void e() {
            this.f295b.connect();
        }

        public void f(String str, Bundle bundle, l lVar) {
            Bundle bundle2;
            k kVar = this.f298e.get(str);
            if (kVar == null) {
                kVar = new k();
                this.f298e.put(str, kVar);
            }
            lVar.e(kVar);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            kVar.e(bundle2, lVar);
            j jVar = this.f300g;
            if (jVar == null) {
                this.f295b.subscribe(str, lVar.f330a);
                return;
            }
            try {
                jVar.a(str, lVar.f331b, bundle2, this.f301h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        public void g(Messenger messenger) {
        }

        public void h() {
            try {
                Bundle extras = this.f295b.getExtras();
                if (extras != null) {
                    this.f299f = extras.getInt("extra_service_version", 0);
                    IBinder a10 = androidx.core.app.f.a(extras, "extra_messenger");
                    if (a10 != null) {
                        this.f300g = new j(a10, this.f296c);
                        Messenger messenger = new Messenger(this.f297d);
                        this.f301h = messenger;
                        this.f297d.a(messenger);
                        try {
                            this.f300g.d(this.f294a, this.f301h);
                        } catch (RemoteException unused) {
                        }
                    }
                    android.support.v4.media.session.b z02 = b.a.z0(androidx.core.app.f.a(extras, "extra_session_binder"));
                    if (z02 != null) {
                        this.f302i = MediaSessionCompat.Token.d(this.f295b.getSessionToken(), z02);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        public void i() {
        }

        public void j(String str, l lVar) {
            k kVar = this.f298e.get(str);
            if (kVar != null) {
                j jVar = this.f300g;
                if (jVar == null) {
                    if (lVar == null) {
                        this.f295b.unsubscribe(str);
                    } else {
                        List<l> b10 = kVar.b();
                        List<Bundle> c10 = kVar.c();
                        for (int size = b10.size() - 1; size >= 0; size--) {
                            if (b10.get(size) == lVar) {
                                b10.remove(size);
                                c10.remove(size);
                            }
                        }
                        if (b10.size() == 0) {
                            this.f295b.unsubscribe(str);
                        }
                    }
                } else if (lVar == null) {
                    try {
                        jVar.e(str, (IBinder) null, this.f301h);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                    }
                } else {
                    List<l> b11 = kVar.b();
                    List<Bundle> c11 = kVar.c();
                    for (int size2 = b11.size() - 1; size2 >= 0; size2--) {
                        if (b11.get(size2) == lVar) {
                            this.f300g.e(str, lVar.f331b, this.f301h);
                            b11.remove(size2);
                            c11.remove(size2);
                        }
                    }
                }
                if (kVar.d() || lVar == null) {
                    this.f298e.remove(str);
                }
            }
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }

        public void f(String str, Bundle bundle, l lVar) {
            if (this.f300g != null && this.f299f >= 2) {
                super.f(str, bundle, lVar);
            } else if (bundle == null) {
                this.f295b.subscribe(str, lVar.f330a);
            } else {
                this.f295b.subscribe(str, bundle, lVar.f330a);
            }
        }

        public void j(String str, l lVar) {
            if (this.f300g != null && this.f299f >= 2) {
                super.j(str, lVar);
            } else if (lVar == null) {
                this.f295b.unsubscribe(str);
            } else {
                this.f295b.unsubscribe(str, lVar.f330a);
            }
        }
    }

    static class h implements d, i {

        /* renamed from: a  reason: collision with root package name */
        final Context f304a;

        /* renamed from: b  reason: collision with root package name */
        final ComponentName f305b;

        /* renamed from: c  reason: collision with root package name */
        final c f306c;

        /* renamed from: d  reason: collision with root package name */
        final Bundle f307d;

        /* renamed from: e  reason: collision with root package name */
        final b f308e = new b(this);

        /* renamed from: f  reason: collision with root package name */
        private final androidx.collection.a<String, k> f309f = new androidx.collection.a<>();

        /* renamed from: g  reason: collision with root package name */
        int f310g = 1;

        /* renamed from: h  reason: collision with root package name */
        c f311h;

        /* renamed from: i  reason: collision with root package name */
        j f312i;

        /* renamed from: j  reason: collision with root package name */
        Messenger f313j;

        /* renamed from: k  reason: collision with root package name */
        private String f314k;

        /* renamed from: l  reason: collision with root package name */
        private MediaSessionCompat.Token f315l;

        /* renamed from: m  reason: collision with root package name */
        private Bundle f316m;

        /* renamed from: n  reason: collision with root package name */
        private Bundle f317n;

        class a implements Runnable {
            a() {
            }

            public void run() {
                h hVar = h.this;
                if (hVar.f310g != 0) {
                    hVar.f310g = 2;
                    if (MediaBrowserCompat.f285b && hVar.f311h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + h.this.f311h);
                    } else if (hVar.f312i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + h.this.f312i);
                    } else if (hVar.f313j == null) {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(h.this.f305b);
                        h hVar2 = h.this;
                        hVar2.f311h = new c();
                        boolean z10 = false;
                        try {
                            h hVar3 = h.this;
                            z10 = hVar3.f304a.bindService(intent, hVar3.f311h, 1);
                        } catch (Exception unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed binding to service ");
                            sb.append(h.this.f305b);
                        }
                        if (!z10) {
                            h.this.h();
                            h.this.f306c.b();
                        }
                        if (MediaBrowserCompat.f285b) {
                            h.this.d();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + h.this.f313j);
                    }
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                h hVar = h.this;
                Messenger messenger = hVar.f313j;
                if (messenger != null) {
                    try {
                        hVar.f312i.c(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("RemoteException during connect for ");
                        sb.append(h.this.f305b);
                    }
                }
                h hVar2 = h.this;
                int i10 = hVar2.f310g;
                hVar2.h();
                if (i10 != 0) {
                    h.this.f310g = i10;
                }
                if (MediaBrowserCompat.f285b) {
                    h.this.d();
                }
            }
        }

        private class c implements ServiceConnection {

            class a implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ ComponentName f321h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ IBinder f322i;

                a(ComponentName componentName, IBinder iBinder) {
                    this.f321h = componentName;
                    this.f322i = iBinder;
                }

                public void run() {
                    boolean z10 = MediaBrowserCompat.f285b;
                    if (z10) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceConnected name=");
                        sb.append(this.f321h);
                        sb.append(" binder=");
                        sb.append(this.f322i);
                        h.this.d();
                    }
                    if (c.this.a("onServiceConnected")) {
                        h hVar = h.this;
                        hVar.f312i = new j(this.f322i, hVar.f307d);
                        h.this.f313j = new Messenger(h.this.f308e);
                        h hVar2 = h.this;
                        hVar2.f308e.a(hVar2.f313j);
                        h.this.f310g = 2;
                        if (z10) {
                            try {
                                h.this.d();
                            } catch (RemoteException unused) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("RemoteException during connect for ");
                                sb2.append(h.this.f305b);
                                if (MediaBrowserCompat.f285b) {
                                    h.this.d();
                                    return;
                                }
                                return;
                            }
                        }
                        h hVar3 = h.this;
                        hVar3.f312i.b(hVar3.f304a, hVar3.f313j);
                    }
                }
            }

            class b implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ ComponentName f324h;

                b(ComponentName componentName) {
                    this.f324h = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f285b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MediaServiceConnection.onServiceDisconnected name=");
                        sb.append(this.f324h);
                        sb.append(" this=");
                        sb.append(this);
                        sb.append(" mServiceConnection=");
                        sb.append(h.this.f311h);
                        h.this.d();
                    }
                    if (c.this.a("onServiceDisconnected")) {
                        h hVar = h.this;
                        hVar.f312i = null;
                        hVar.f313j = null;
                        hVar.f308e.a((Messenger) null);
                        h hVar2 = h.this;
                        hVar2.f310g = 4;
                        hVar2.f306c.c();
                    }
                }
            }

            c() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == h.this.f308e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.f308e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a(String str) {
                int i10;
                h hVar = h.this;
                if (hVar.f311h == this && (i10 = hVar.f310g) != 0 && i10 != 1) {
                    return true;
                }
                int i11 = hVar.f310g;
                if (i11 == 0 || i11 == 1) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(h.this.f305b);
                sb.append(" with mServiceConnection=");
                sb.append(h.this.f311h);
                sb.append(" this=");
                sb.append(this);
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public h(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (cVar != null) {
                this.f304a = context;
                this.f305b = componentName;
                this.f306c = cVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f307d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String i(int i10) {
            if (i10 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i10 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i10 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i10 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i10;
        }

        private boolean l(Messenger messenger, String str) {
            int i10;
            if (this.f313j == messenger && (i10 = this.f310g) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.f310g;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" for ");
            sb.append(this.f305b);
            sb.append(" with mCallbacksMessenger=");
            sb.append(this.f313j);
            sb.append(" this=");
            sb.append(this);
            return false;
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (l(messenger, "onConnect")) {
                if (this.f310g != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(i(this.f310g));
                    sb.append("... ignoring");
                    return;
                }
                this.f314k = str;
                this.f315l = token;
                this.f316m = bundle;
                this.f310g = 3;
                if (MediaBrowserCompat.f285b) {
                    d();
                }
                this.f306c.a();
                try {
                    for (Map.Entry next : this.f309f.entrySet()) {
                        String str2 = (String) next.getKey();
                        k kVar = (k) next.getValue();
                        List<l> b10 = kVar.b();
                        List<Bundle> c10 = kVar.c();
                        for (int i10 = 0; i10 < b10.size(); i10++) {
                            this.f312i.a(str2, b10.get(i10).f331b, c10.get(i10), this.f313j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (l(messenger, "onLoadChildren")) {
                boolean z10 = MediaBrowserCompat.f285b;
                if (z10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f305b);
                    sb.append(" id=");
                    sb.append(str);
                }
                k kVar = this.f309f.get(str);
                if (kVar != null) {
                    l a10 = kVar.a(bundle);
                    if (a10 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a10.c(str);
                            return;
                        }
                        this.f317n = bundle2;
                        a10.a(str, list);
                        this.f317n = null;
                    } else if (list == null) {
                        a10.d(str, bundle);
                    } else {
                        this.f317n = bundle2;
                        a10.b(str, list, bundle);
                        this.f317n = null;
                    }
                } else if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onLoadChildren for id that isn't subscribed id=");
                    sb2.append(str);
                }
            }
        }

        public MediaSessionCompat.Token c() {
            if (k()) {
                return this.f315l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f310g + ")");
        }

        /* access modifiers changed from: package-private */
        public void d() {
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f305b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.f306c);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.f307d);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(i(this.f310g));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.f311h);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.f312i);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.f313j);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f314k);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.f315l);
        }

        public void disconnect() {
            this.f310g = 0;
            this.f308e.post(new b());
        }

        public void e() {
            int i10 = this.f310g;
            if (i10 == 0 || i10 == 1) {
                this.f310g = 2;
                this.f308e.post(new a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + i(this.f310g) + ")");
        }

        public void f(String str, Bundle bundle, l lVar) {
            Bundle bundle2;
            k kVar = this.f309f.get(str);
            if (kVar == null) {
                kVar = new k();
                this.f309f.put(str, kVar);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            kVar.e(bundle2, lVar);
            if (k()) {
                try {
                    this.f312i.a(str, lVar.f331b, bundle2, this.f313j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            }
        }

        public void g(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f305b);
            if (l(messenger, "onConnectFailed")) {
                if (this.f310g != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(i(this.f310g));
                    sb2.append("... ignoring");
                    return;
                }
                h();
                this.f306c.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            c cVar = this.f311h;
            if (cVar != null) {
                this.f304a.unbindService(cVar);
            }
            this.f310g = 1;
            this.f311h = null;
            this.f312i = null;
            this.f313j = null;
            this.f308e.a((Messenger) null);
            this.f314k = null;
            this.f315l = null;
        }

        public void j(String str, l lVar) {
            k kVar = this.f309f.get(str);
            if (kVar != null) {
                if (lVar == null) {
                    try {
                        if (k()) {
                            this.f312i.e(str, (IBinder) null, this.f313j);
                        }
                    } catch (RemoteException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription failed with RemoteException parentId=");
                        sb.append(str);
                    }
                } else {
                    List<l> b10 = kVar.b();
                    List<Bundle> c10 = kVar.c();
                    for (int size = b10.size() - 1; size >= 0; size--) {
                        if (b10.get(size) == lVar) {
                            if (k()) {
                                this.f312i.e(str, lVar.f331b, this.f313j);
                            }
                            b10.remove(size);
                            c10.remove(size);
                        }
                    }
                }
                if (kVar.d() || lVar == null) {
                    this.f309f.remove(str);
                }
            }
        }

        public boolean k() {
            return this.f310g == 3;
        }
    }

    interface i {
        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void g(Messenger messenger);
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f326a;

        /* renamed from: b  reason: collision with root package name */
        private Bundle f327b;

        public j(IBinder iBinder, Bundle bundle) {
            this.f326a = new Messenger(iBinder);
            this.f327b = bundle;
        }

        private void f(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f326a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.f.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            f(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f327b);
            f(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void c(Messenger messenger) {
            f(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        public void d(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f327b);
            f(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void e(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            androidx.core.app.f.b(bundle, "data_callback_token", iBinder);
            f(4, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void g(Messenger messenger) {
            f(7, (Bundle) null, messenger);
        }
    }

    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private final List<l> f328a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<Bundle> f329b = new ArrayList();

        public l a(Bundle bundle) {
            for (int i10 = 0; i10 < this.f329b.size(); i10++) {
                if (androidx.media.c.a(this.f329b.get(i10), bundle)) {
                    return this.f328a.get(i10);
                }
            }
            return null;
        }

        public List<l> b() {
            return this.f328a;
        }

        public List<Bundle> c() {
            return this.f329b;
        }

        public boolean d() {
            return this.f328a.isEmpty();
        }

        public void e(Bundle bundle, l lVar) {
            for (int i10 = 0; i10 < this.f329b.size(); i10++) {
                if (androidx.media.c.a(this.f329b.get(i10), bundle)) {
                    this.f328a.set(i10, lVar);
                    return;
                }
            }
            this.f328a.add(lVar);
            this.f329b.add(bundle);
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        final MediaBrowser.SubscriptionCallback f330a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f331b = new Binder();

        /* renamed from: c  reason: collision with root package name */
        WeakReference<k> f332c;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            /* access modifiers changed from: package-private */
            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
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

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<k> weakReference = l.this.f332c;
                k kVar = weakReference == null ? null : (k) weakReference.get();
                if (kVar == null) {
                    l.this.a(str, MediaItem.c(list));
                    return;
                }
                List<MediaItem> c10 = MediaItem.c(list);
                List<l> b10 = kVar.b();
                List<Bundle> c11 = kVar.c();
                for (int i10 = 0; i10 < b10.size(); i10++) {
                    Bundle bundle = c11.get(i10);
                    if (bundle == null) {
                        l.this.a(str, c10);
                    } else {
                        l.this.b(str, a(c10, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                l.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.b(str, MediaItem.c(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.d(str, bundle);
            }
        }

        public l() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                this.f330a = new b();
            } else if (i10 >= 21) {
                this.f330a = new a();
            } else {
                this.f330a = null;
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }

        /* access modifiers changed from: package-private */
        public void e(k kVar) {
            this.f332c = new WeakReference<>(kVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f286a = new g(context, componentName, cVar, bundle);
        } else if (i10 >= 23) {
            this.f286a = new f(context, componentName, cVar, bundle);
        } else if (i10 >= 21) {
            this.f286a = new e(context, componentName, cVar, bundle);
        } else {
            this.f286a = new h(context, componentName, cVar, bundle);
        }
    }

    public void a() {
        this.f286a.e();
    }

    public void b() {
        this.f286a.disconnect();
    }

    public MediaSessionCompat.Token c() {
        return this.f286a.c();
    }

    public void d(String str, l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (lVar != null) {
            this.f286a.f(str, (Bundle) null, lVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f286a.j(str, (l) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        private final int f287h;

        /* renamed from: i  reason: collision with root package name */
        private final MediaDescriptionCompat f288i;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.g())) {
                this.f287h = i10;
                this.f288i = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.b(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> c(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object b10 : list) {
                arrayList.add(b(b10));
            }
            return arrayList;
        }

        public MediaDescriptionCompat d() {
            return this.f288i;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f287h + ", mDescription=" + this.f288i + '}';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f287h);
            this.f288i.writeToParcel(parcel, i10);
        }

        MediaItem(Parcel parcel) {
            this.f287h = parcel.readInt();
            this.f288i = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
