package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.view.KeyEvent;
import androidx.core.app.f;
import androidx.media.AudioAttributesCompat;
import androidx.media.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    private final b f363a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaSessionCompat.Token f364b;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<a, Boolean> f365c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a  reason: collision with root package name */
        protected final MediaController f366a;

        /* renamed from: b  reason: collision with root package name */
        final Object f367b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final List<a> f368c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private HashMap<a, a> f369d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        final MediaSessionCompat.Token f370e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: h  reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f371h;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f371h = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f371h.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f367b) {
                        mediaControllerImplApi21.f370e.h(b.a.z0(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f370e.i(j1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.g();
                    }
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            public void R(CharSequence charSequence) {
                throw new AssertionError();
            }

            public void W() {
                throw new AssertionError();
            }

            public void Y(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public void v(Bundle bundle) {
                throw new AssertionError();
            }

            public void w(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            public void y0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f370e = token;
            this.f366a = new MediaController(context, (MediaSession.Token) token.g());
            if (token.e() == null) {
                h();
            }
        }

        private void h() {
            i("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        static void j(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.f().g()) : null);
        }

        public final void a(a aVar) {
            this.f366a.unregisterCallback(aVar.f372a);
            synchronized (this.f367b) {
                if (this.f370e.e() != null) {
                    try {
                        a remove = this.f369d.remove(aVar);
                        if (remove != null) {
                            aVar.f374c = null;
                            this.f370e.e().C(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f368c.remove(aVar);
                }
            }
        }

        public PlaybackStateCompat b() {
            if (this.f370e.e() != null) {
                try {
                    return this.f370e.e().b();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.f366a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.b(playbackState);
            }
            return null;
        }

        public boolean c(KeyEvent keyEvent) {
            return this.f366a.dispatchMediaButtonEvent(keyEvent);
        }

        public PendingIntent d() {
            return this.f366a.getSessionActivity();
        }

        public final void e(a aVar, Handler handler) {
            this.f366a.registerCallback(aVar.f372a, handler);
            synchronized (this.f367b) {
                if (this.f370e.e() != null) {
                    a aVar2 = new a(aVar);
                    this.f369d.put(aVar, aVar2);
                    aVar.f374c = aVar2;
                    try {
                        this.f370e.e().i(aVar2);
                        aVar.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    aVar.f374c = null;
                    this.f368c.add(aVar);
                }
            }
        }

        public List<MediaSessionCompat.QueueItem> f() {
            List<MediaSession.QueueItem> queue = this.f366a.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.c(queue);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (this.f370e.e() != null) {
                for (a next : this.f368c) {
                    a aVar = new a(next);
                    this.f369d.put(next, aVar);
                    next.f374c = aVar;
                    try {
                        this.f370e.e().i(aVar);
                        next.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f368c.clear();
            }
        }

        public MediaMetadataCompat getMetadata() {
            MediaMetadata metadata = this.f366a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.c(metadata);
            }
            return null;
        }

        public void i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f366a.sendCommand(str, bundle, resultReceiver);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        final MediaController.Callback f372a;

        /* renamed from: b  reason: collision with root package name */
        b f373b;

        /* renamed from: c  reason: collision with root package name */
        a f374c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        private static class C0003a extends MediaController.Callback {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f375a;

            C0003a(a aVar) {
                this.f375a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.a(new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.c(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.f375a.get();
                if (aVar != null && aVar.f374c == null) {
                    aVar.e(PlaybackStateCompat.b(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.c(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                a aVar = (a) this.f375a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f375a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f374c == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.j(str, bundle);
                }
            }
        }

        private class b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            boolean f376a = false;

            b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f376a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            a.this.j((String) message.obj, data);
                            return;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a.this.a((e) message.obj);
                            return;
                        case 5:
                            a.this.f((List) message.obj);
                            return;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            a.this.c(bundle);
                            return;
                        case 8:
                            a.this.i();
                            return;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            a.this.k();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        private static class c extends a.C0005a {

            /* renamed from: h  reason: collision with root package name */
            private final WeakReference<a> f378h;

            c(a aVar) {
                this.f378h = new WeakReference<>(aVar);
            }

            public void K(boolean z10) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z10), (Bundle) null);
                }
            }

            public void P(boolean z10) {
            }

            public void R(CharSequence charSequence) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(6, charSequence, (Bundle) null);
                }
            }

            public void W() {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            }

            public void Y(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void d(int i10) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void g0(int i10) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void onEvent(String str, Bundle bundle) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            public void u() {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(13, (Object) null, (Bundle) null);
                }
            }

            public void v(Bundle bundle) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(7, bundle, (Bundle) null);
                }
            }

            public void w(List<MediaSessionCompat.QueueItem> list) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(5, list, (Bundle) null);
                }
            }

            public void w0(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void y0(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = (a) this.f378h.get();
                if (aVar != null) {
                    aVar.m(4, parcelableVolumeInfo != null ? new e(parcelableVolumeInfo.f456h, parcelableVolumeInfo.f457i, parcelableVolumeInfo.f458j, parcelableVolumeInfo.f459k, parcelableVolumeInfo.f460l) : null, (Bundle) null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f372a = new C0003a(this);
                return;
            }
            this.f372a = null;
            this.f374c = new c(this);
        }

        public void a(e eVar) {
        }

        public void b(boolean z10) {
        }

        public void binderDied() {
            m(8, (Object) null, (Bundle) null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i10) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i10) {
        }

        /* access modifiers changed from: package-private */
        public void m(int i10, Object obj, Bundle bundle) {
            b bVar = this.f373b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void n(Handler handler) {
            if (handler == null) {
                b bVar = this.f373b;
                if (bVar != null) {
                    bVar.f376a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.f373b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.f373b = bVar2;
            bVar2.f376a = true;
        }
    }

    interface b {
        void a(a aVar);

        PlaybackStateCompat b();

        boolean c(KeyEvent keyEvent);

        PendingIntent d();

        void e(a aVar, Handler handler);

        List<MediaSessionCompat.QueueItem> f();

        MediaMetadataCompat getMetadata();
    }

    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private b f379a;

        d(MediaSessionCompat.Token token) {
            this.f379a = b.a.z0((IBinder) token.g());
        }

        public void a(a aVar) {
            if (aVar != null) {
                try {
                    this.f379a.C(aVar.f374c);
                    this.f379a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException unused) {
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public PlaybackStateCompat b() {
            try {
                return this.f379a.b();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public boolean c(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f379a.O(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        public PendingIntent d() {
            try {
                return this.f379a.q();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public void e(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f379a.asBinder().linkToDeath(aVar, 0);
                    this.f379a.i(aVar.f374c);
                    aVar.m(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public List<MediaSessionCompat.QueueItem> f() {
            try {
                return this.f379a.f();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public MediaMetadataCompat getMetadata() {
            try {
                return this.f379a.getMetadata();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f380a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioAttributesCompat f381b;

        /* renamed from: c  reason: collision with root package name */
        private final int f382c;

        /* renamed from: d  reason: collision with root package name */
        private final int f383d;

        /* renamed from: e  reason: collision with root package name */
        private final int f384e;

        e(int i10, int i11, int i12, int i13, int i14) {
            this(i10, new AudioAttributesCompat.a().d(i11).a(), i12, i13, i14);
        }

        e(int i10, AudioAttributesCompat audioAttributesCompat, int i11, int i12, int i13) {
            this.f380a = i10;
            this.f381b = audioAttributesCompat;
            this.f382c = i11;
            this.f383d = i12;
            this.f384e = i13;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token c10 = mediaSessionCompat.c();
            this.f364b = c10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.f363a = new c(context, c10);
            } else if (i10 >= 21) {
                this.f363a = new MediaControllerImplApi21(context, c10);
            } else {
                this.f363a = new d(c10);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    public static void i(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(i.f3737e, mediaControllerCompat);
        if (Build.VERSION.SDK_INT >= 21) {
            MediaControllerImplApi21.j(activity, mediaControllerCompat);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f363a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaMetadataCompat b() {
        return this.f363a.getMetadata();
    }

    public PlaybackStateCompat c() {
        return this.f363a.b();
    }

    public List<MediaSessionCompat.QueueItem> d() {
        return this.f363a.f();
    }

    public PendingIntent e() {
        return this.f363a.d();
    }

    public MediaSessionCompat.Token f() {
        return this.f364b;
    }

    public void g(a aVar) {
        h(aVar, (Handler) null);
    }

    public void h(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f365c.putIfAbsent(aVar, Boolean.TRUE) == null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.n(handler);
            this.f363a.e(aVar, handler);
        }
    }

    public void j(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f365c.remove(aVar) != null) {
            try {
                this.f363a.a(aVar);
            } finally {
                aVar.n((Handler) null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f364b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f363a = new MediaControllerImplApi21(context, token);
            } else {
                this.f363a = new d(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
