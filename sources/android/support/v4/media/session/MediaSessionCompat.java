package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {

    /* renamed from: d  reason: collision with root package name */
    public static final int f385d = (androidx.core.os.a.b() ? 33554432 : 0);

    /* renamed from: e  reason: collision with root package name */
    static int f386e;

    /* renamed from: a  reason: collision with root package name */
    private final c f387a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaControllerCompat f388b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<k> f389c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        private final MediaDescriptionCompat f390h;

        /* renamed from: i  reason: collision with root package name */
        private final long f391i;

        /* renamed from: j  reason: collision with root package name */
        private MediaSession.QueueItem f392j;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this((MediaSession.QueueItem) null, mediaDescriptionCompat, j10);
        }

        public static QueueItem b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.b(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> c(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b10 : list) {
                arrayList.add(b(b10));
            }
            return arrayList;
        }

        public MediaDescriptionCompat d() {
            return this.f390h;
        }

        public int describeContents() {
            return 0;
        }

        public long e() {
            return this.f391i;
        }

        public Object f() {
            MediaSession.QueueItem queueItem = this.f392j;
            if (queueItem != null || Build.VERSION.SDK_INT < 21) {
                return queueItem;
            }
            MediaSession.QueueItem a10 = b.a((MediaDescription) this.f390h.f(), this.f391i);
            this.f392j = a10;
            return a10;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f390h + ", Id=" + this.f391i + " }";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f390h.writeToParcel(parcel, i10);
            parcel.writeLong(this.f391i);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j10 != -1) {
                this.f390h = mediaDescriptionCompat;
                this.f391i = j10;
                this.f392j = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f390h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f391i = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        ResultReceiver f393h;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f393h = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f393h.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        private final Object f394h;

        /* renamed from: i  reason: collision with root package name */
        private final Object f395i;

        /* renamed from: j  reason: collision with root package name */
        private b f396j;

        /* renamed from: k  reason: collision with root package name */
        private j1.b f397k;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (j1.b) null);
        }

        public static Token b(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            b z02 = b.a.z0(androidx.core.app.f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            j1.b b10 = j1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f395i, z02, b10);
        }

        public static Token c(Object obj) {
            return d(obj, (b) null);
        }

        public static Token d(Object obj, b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public int describeContents() {
            return 0;
        }

        public b e() {
            b bVar;
            synchronized (this.f394h) {
                bVar = this.f396j;
            }
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f395i;
            if (obj2 != null) {
                Object obj3 = token.f395i;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f395i == null) {
                return true;
            } else {
                return false;
            }
        }

        public j1.b f() {
            j1.b bVar;
            synchronized (this.f394h) {
                bVar = this.f397k;
            }
            return bVar;
        }

        public Object g() {
            return this.f395i;
        }

        public void h(b bVar) {
            synchronized (this.f394h) {
                this.f396j = bVar;
            }
        }

        public int hashCode() {
            Object obj = this.f395i;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void i(j1.b bVar) {
            synchronized (this.f394h) {
                this.f397k = bVar;
            }
        }

        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f394h) {
                b bVar = this.f396j;
                if (bVar != null) {
                    androidx.core.app.f.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                }
                j1.b bVar2 = this.f397k;
                if (bVar2 != null) {
                    j1.a.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", bVar2);
                }
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f395i, i10);
            } else {
                parcel.writeStrongBinder((IBinder) this.f395i);
            }
        }

        Token(Object obj, b bVar) {
            this(obj, bVar, (j1.b) null);
        }

        Token(Object obj, b bVar, j1.b bVar2) {
            this.f394h = new Object();
            this.f395i = obj;
            this.f396j = bVar;
            this.f397k = bVar2;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f399a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final MediaSession.Callback f400b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f401c;

        /* renamed from: d  reason: collision with root package name */
        WeakReference<c> f402d;

        /* renamed from: e  reason: collision with root package name */
        a f403e;

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f399a) {
                        cVar = (c) b.this.f402d.get();
                        bVar = b.this;
                        aVar = bVar.f403e;
                    }
                    if (cVar != null && bVar == cVar.h() && aVar != null) {
                        cVar.m((androidx.media.e) message.obj);
                        b.this.a(cVar, aVar);
                        cVar.m((androidx.media.e) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b  reason: collision with other inner class name */
        private class C0004b extends MediaSession.Callback {
            C0004b() {
            }

            private void a(c cVar) {
                cVar.m((androidx.media.e) null);
            }

            private f b() {
                f fVar;
                synchronized (b.this.f399a) {
                    fVar = (f) b.this.f402d.get();
                }
                if (fVar == null || b.this != fVar.h()) {
                    return null;
                }
                return fVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String e10 = cVar.e();
                    if (TextUtils.isEmpty(e10)) {
                        e10 = "android.media.session.MediaController";
                    }
                    cVar.m(new androidx.media.e(e10, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$f r0 = r5.b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.v4.media.session.MediaSessionCompat.a(r7)
                    r5.c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b7 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b7 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.c()     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.session.b r1 = r7.e()     // Catch:{ BadParcelableException -> 0x00b7 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b7 }
                L_0x002c:
                    androidx.core.app.f.b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b7 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    j1.b r7 = r7.f()     // Catch:{ BadParcelableException -> 0x00b7 }
                    j1.a.c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b7 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b7 }
                    goto L_0x00b7
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b7 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b7 }
                    r6.b(r7)     // Catch:{ BadParcelableException -> 0x00b7 }
                    goto L_0x00b7
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b7 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b7 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b7 }
                    r6.c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b7 }
                    goto L_0x00b7
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b7 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b7 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b7 }
                    goto L_0x00b7
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b7 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f415h     // Catch:{ BadParcelableException -> 0x00b7 }
                    if (r6 == 0) goto L_0x00b7
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b7 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f415h     // Catch:{ BadParcelableException -> 0x00b7 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b7 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f415h     // Catch:{ BadParcelableException -> 0x00b7 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b7 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b7 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00b7
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b7 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.d()     // Catch:{ BadParcelableException -> 0x00b7 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b7 }
                    goto L_0x00b7
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b7 }
                    r1.d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b7 }
                L_0x00b7:
                    r5.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.b.C0004b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle2);
                            b.this.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            b.this.m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle3);
                            b.this.n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle4);
                            b.this.o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle5);
                            b.this.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle6);
                            b.this.w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            b.this.e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                    }
                    a(b10);
                }
            }

            public void onFastForward() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.f();
                    a(b10);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                f b10 = b();
                if (b10 == null) {
                    return false;
                }
                c(b10);
                boolean g10 = b.this.g(intent);
                a(b10);
                if (g10 || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.h();
                    a(b10);
                }
            }

            public void onPlay() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.i();
                    a(b10);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.j(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.k(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.l(uri, bundle);
                    a(b10);
                }
            }

            public void onPrepare() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.m();
                    a(b10);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.n(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.o(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.p(uri, bundle);
                    a(b10);
                }
            }

            public void onRewind() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.r();
                    a(b10);
                }
            }

            public void onSeekTo(long j10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.s(j10);
                    a(b10);
                }
            }

            public void onSetPlaybackSpeed(float f10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.u(f10);
                    a(b10);
                }
            }

            public void onSetRating(Rating rating) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.v(RatingCompat.b(rating));
                    a(b10);
                }
            }

            public void onSkipToNext() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.z();
                    a(b10);
                }
            }

            public void onSkipToPrevious() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.A();
                    a(b10);
                }
            }

            public void onSkipToQueueItem(long j10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.B(j10);
                    a(b10);
                }
            }

            public void onStop() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.C();
                    a(b10);
                }
            }
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f400b = new C0004b();
            } else {
                this.f400b = null;
            }
            this.f402d = new WeakReference<>((Object) null);
        }

        public void A() {
        }

        public void B(long j10) {
        }

        public void C() {
        }

        /* access modifiers changed from: package-private */
        public void D(c cVar, Handler handler) {
            synchronized (this.f399a) {
                this.f402d = new WeakReference<>(cVar);
                a aVar = this.f403e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                }
                this.f403e = aVar2;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar, Handler handler) {
            long j10;
            if (this.f401c) {
                boolean z10 = false;
                this.f401c = false;
                handler.removeMessages(1);
                PlaybackStateCompat b10 = cVar.b();
                if (b10 == null) {
                    j10 = 0;
                } else {
                    j10 = b10.c();
                }
                boolean z11 = b10 != null && b10.i() == 3;
                boolean z12 = (516 & j10) != 0;
                if ((j10 & 514) != 0) {
                    z10 = true;
                }
                if (z11 && z10) {
                    h();
                } else if (!z11 && z12) {
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            long j10;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f399a) {
                cVar = (c) this.f402d.get();
                aVar = this.f403e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.e o10 = cVar.o();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    a(cVar, aVar);
                } else if (this.f401c) {
                    aVar.removeMessages(1);
                    this.f401c = false;
                    PlaybackStateCompat b10 = cVar.b();
                    if (b10 == null) {
                        j10 = 0;
                    } else {
                        j10 = b10.c();
                    }
                    if ((j10 & 32) != 0) {
                        z();
                    }
                } else {
                    this.f401c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, o10), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a(cVar, aVar);
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j10) {
        }

        public void t(boolean z10) {
        }

        public void u(float f10) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i10) {
        }

        public void y(int i10) {
        }

        public void z() {
        }
    }

    interface c {
        boolean a();

        PlaybackStateCompat b();

        Token c();

        void d(int i10);

        String e();

        void f(PendingIntent pendingIntent);

        void g(b bVar, Handler handler);

        b h();

        void i(MediaMetadataCompat mediaMetadataCompat);

        void j(PendingIntent pendingIntent);

        void k(List<QueueItem> list);

        void l(boolean z10);

        void m(androidx.media.e eVar);

        void n(PlaybackStateCompat playbackStateCompat);

        androidx.media.e o();

        void release();
    }

    static class d extends j {
        private static boolean G = true;

        class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            public void onPlaybackPositionUpdate(long j10) {
                d.this.u(18, -1, -1, Long.valueOf(j10), (Bundle) null);
            }
        }

        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, j1.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* access modifiers changed from: package-private */
        public void A(PlaybackStateCompat playbackStateCompat) {
            long h10 = playbackStateCompat.h();
            float f10 = playbackStateCompat.f();
            long e10 = playbackStateCompat.e();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.i() == 3) {
                long j10 = 0;
                if (h10 > 0) {
                    if (e10 > 0) {
                        j10 = elapsedRealtime - e10;
                        if (f10 > 0.0f && f10 != 1.0f) {
                            j10 = (long) (((float) j10) * f10);
                        }
                    }
                    h10 += j10;
                }
            }
            this.f433j.setPlaybackState(s(playbackStateCompat.i()), h10, f10);
        }

        /* access modifiers changed from: package-private */
        public void C(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                this.f432i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.C(pendingIntent, componentName);
            }
        }

        public void g(b bVar, Handler handler) {
            super.g(bVar, handler);
            if (bVar == null) {
                this.f433j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f433j.setPlaybackPositionUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public int t(long j10) {
            int t10 = super.t(j10);
            return (j10 & 256) != 0 ? t10 | UserVerificationMethods.USER_VERIFY_HANDPRINT : t10;
        }

        /* access modifiers changed from: package-private */
        public void v(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                try {
                    this.f432i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    G = false;
                }
            }
            if (!G) {
                super.v(pendingIntent, componentName);
            }
        }
    }

    static class e extends d {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            public void onMetadataUpdate(int i10, Object obj) {
                if (i10 == 268435457 && (obj instanceof Rating)) {
                    e.this.u(19, -1, -1, RatingCompat.b(obj), (Bundle) null);
                }
            }
        }

        e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, j1.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        public void g(b bVar, Handler handler) {
            super.g(bVar, handler);
            if (bVar == null) {
                this.f433j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f433j.setMetadataUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor q(Bundle bundle) {
            RemoteControlClient.MetadataEditor q10 = super.q(bundle);
            PlaybackStateCompat playbackStateCompat = this.f443t;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.c()) & 128) != 0) {
                q10.addEditableKey(268435457);
            }
            if (bundle == null) {
                return q10;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                q10.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                q10.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                q10.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return q10;
        }

        /* access modifiers changed from: package-private */
        public int t(long j10) {
            int t10 = super.t(j10);
            return (j10 & 128) != 0 ? t10 | 512 : t10;
        }
    }

    static class f implements c {

        /* renamed from: a  reason: collision with root package name */
        final MediaSession f408a;

        /* renamed from: b  reason: collision with root package name */
        final Token f409b;

        /* renamed from: c  reason: collision with root package name */
        final Object f410c = new Object();

        /* renamed from: d  reason: collision with root package name */
        Bundle f411d;

        /* renamed from: e  reason: collision with root package name */
        boolean f412e = false;

        /* renamed from: f  reason: collision with root package name */
        final RemoteCallbackList<a> f413f = new RemoteCallbackList<>();

        /* renamed from: g  reason: collision with root package name */
        PlaybackStateCompat f414g;

        /* renamed from: h  reason: collision with root package name */
        List<QueueItem> f415h;

        /* renamed from: i  reason: collision with root package name */
        MediaMetadataCompat f416i;

        /* renamed from: j  reason: collision with root package name */
        int f417j;

        /* renamed from: k  reason: collision with root package name */
        boolean f418k;

        /* renamed from: l  reason: collision with root package name */
        int f419l;

        /* renamed from: m  reason: collision with root package name */
        int f420m;

        /* renamed from: n  reason: collision with root package name */
        b f421n;

        /* renamed from: o  reason: collision with root package name */
        androidx.media.e f422o;

        class a extends b.a {
            a() {
            }

            public void A(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public Bundle B() {
                if (f.this.f411d == null) {
                    return null;
                }
                return new Bundle(f.this.f411d);
            }

            public void C(a aVar) {
                f.this.f413f.unregister(aVar);
            }

            public void F(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void G(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void H() {
                throw new AssertionError();
            }

            public void I(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void J(long j10) {
                throw new AssertionError();
            }

            public void N(float f10) {
                throw new AssertionError();
            }

            public boolean O(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void T(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public void V(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public void X(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            public void Z(boolean z10) {
                throw new AssertionError();
            }

            public String a() {
                throw new AssertionError();
            }

            public PlaybackStateCompat b() {
                f fVar = f.this;
                return MediaSessionCompat.d(fVar.f414g, fVar.f416i);
            }

            public int b0() {
                return f.this.f420m;
            }

            public void c() {
                throw new AssertionError();
            }

            public void d0(int i10) {
                throw new AssertionError();
            }

            public void e() {
                throw new AssertionError();
            }

            public boolean e0() {
                return f.this.f418k;
            }

            public List<QueueItem> f() {
                return null;
            }

            public int g() {
                return f.this.f419l;
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            public void h(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void h0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public void i(a aVar) {
                if (!f.this.f412e) {
                    f.this.f413f.register(aVar, new androidx.media.e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public boolean j() {
                return false;
            }

            public void j0(int i10) {
                throw new AssertionError();
            }

            public void k(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public void k0() {
                throw new AssertionError();
            }

            public void l(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public long l0() {
                throw new AssertionError();
            }

            public void m(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void m0(long j10) {
                throw new AssertionError();
            }

            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void n0(boolean z10) {
            }

            public void next() {
                throw new AssertionError();
            }

            public boolean o() {
                throw new AssertionError();
            }

            public ParcelableVolumeInfo o0() {
                throw new AssertionError();
            }

            public void p(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void pause() {
                throw new AssertionError();
            }

            public void previous() {
                throw new AssertionError();
            }

            public PendingIntent q() {
                throw new AssertionError();
            }

            public int r() {
                return f.this.f417j;
            }

            public void r0(int i10) {
                throw new AssertionError();
            }

            public void stop() {
                throw new AssertionError();
            }

            public void t(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public String u0() {
                throw new AssertionError();
            }

            public CharSequence y() {
                throw new AssertionError();
            }
        }

        f(Context context, String str, j1.b bVar, Bundle bundle) {
            MediaSession p10 = p(context, str, bundle);
            this.f408a = p10;
            this.f409b = new Token(p10.getSessionToken(), new a(), bVar);
            this.f411d = bundle;
            d(3);
        }

        public boolean a() {
            return this.f408a.isActive();
        }

        public PlaybackStateCompat b() {
            return this.f414g;
        }

        public Token c() {
            return this.f409b;
        }

        @SuppressLint({"WrongConstant"})
        public void d(int i10) {
            this.f408a.setFlags(i10 | 1 | 2);
        }

        public String e() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f408a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f408a, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        public void f(PendingIntent pendingIntent) {
            this.f408a.setSessionActivity(pendingIntent);
        }

        public void g(b bVar, Handler handler) {
            synchronized (this.f410c) {
                this.f421n = bVar;
                this.f408a.setCallback(bVar == null ? null : bVar.f400b, handler);
                if (bVar != null) {
                    bVar.D(this, handler);
                }
            }
        }

        public b h() {
            b bVar;
            synchronized (this.f410c) {
                bVar = this.f421n;
            }
            return bVar;
        }

        public void i(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f416i = mediaMetadataCompat;
            MediaSession mediaSession = this.f408a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.h();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        public void j(PendingIntent pendingIntent) {
            this.f408a.setMediaButtonReceiver(pendingIntent);
        }

        public void k(List<QueueItem> list) {
            this.f415h = list;
            if (list == null) {
                this.f408a.setQueue((List) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (QueueItem f10 : list) {
                arrayList.add((MediaSession.QueueItem) f10.f());
            }
            this.f408a.setQueue(arrayList);
        }

        public void l(boolean z10) {
            this.f408a.setActive(z10);
        }

        public void m(androidx.media.e eVar) {
            synchronized (this.f410c) {
                this.f422o = eVar;
            }
        }

        public void n(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f414g = playbackStateCompat;
            for (int beginBroadcast = this.f413f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f413f.getBroadcastItem(beginBroadcast).w0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f413f.finishBroadcast();
            MediaSession mediaSession = this.f408a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.g();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        public androidx.media.e o() {
            androidx.media.e eVar;
            synchronized (this.f410c) {
                eVar = this.f422o;
            }
            return eVar;
        }

        public MediaSession p(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public void release() {
            this.f412e = true;
            this.f413f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f408a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f408a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception unused) {
                }
            }
            this.f408a.setCallback((MediaSession.Callback) null);
            this.f408a.release();
        }
    }

    static class g extends f {
        g(Context context, String str, j1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }
    }

    static class h extends g {
        h(Context context, String str, j1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public void m(androidx.media.e eVar) {
        }

        public final androidx.media.e o() {
            return new androidx.media.e(this.f408a.getCurrentControllerInfo());
        }
    }

    static class i extends h {
        i(Context context, String str, j1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public MediaSession p(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    static class j implements c {
        int A;
        Bundle B;
        int C;
        int D;
        l E;
        private l.a F = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Context f424a;

        /* renamed from: b  reason: collision with root package name */
        private final ComponentName f425b;

        /* renamed from: c  reason: collision with root package name */
        private final PendingIntent f426c;

        /* renamed from: d  reason: collision with root package name */
        private final c f427d;

        /* renamed from: e  reason: collision with root package name */
        private final Token f428e;

        /* renamed from: f  reason: collision with root package name */
        final String f429f;

        /* renamed from: g  reason: collision with root package name */
        final Bundle f430g;

        /* renamed from: h  reason: collision with root package name */
        final String f431h;

        /* renamed from: i  reason: collision with root package name */
        final AudioManager f432i;

        /* renamed from: j  reason: collision with root package name */
        final RemoteControlClient f433j;

        /* renamed from: k  reason: collision with root package name */
        final Object f434k = new Object();

        /* renamed from: l  reason: collision with root package name */
        final RemoteCallbackList<a> f435l = new RemoteCallbackList<>();

        /* renamed from: m  reason: collision with root package name */
        private d f436m;

        /* renamed from: n  reason: collision with root package name */
        boolean f437n = false;

        /* renamed from: o  reason: collision with root package name */
        boolean f438o = false;

        /* renamed from: p  reason: collision with root package name */
        volatile b f439p;

        /* renamed from: q  reason: collision with root package name */
        private androidx.media.e f440q;

        /* renamed from: r  reason: collision with root package name */
        int f441r = 3;

        /* renamed from: s  reason: collision with root package name */
        MediaMetadataCompat f442s;

        /* renamed from: t  reason: collision with root package name */
        PlaybackStateCompat f443t;

        /* renamed from: u  reason: collision with root package name */
        PendingIntent f444u;

        /* renamed from: v  reason: collision with root package name */
        List<QueueItem> f445v;

        /* renamed from: w  reason: collision with root package name */
        CharSequence f446w;

        /* renamed from: x  reason: collision with root package name */
        int f447x;

        /* renamed from: y  reason: collision with root package name */
        boolean f448y;

        /* renamed from: z  reason: collision with root package name */
        int f449z;

        class a extends l.a {
            a() {
            }
        }

        private static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final String f451a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f452b;

            /* renamed from: c  reason: collision with root package name */
            public final ResultReceiver f453c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f451a = str;
                this.f452b = bundle;
                this.f453c = resultReceiver;
            }
        }

        class c extends b.a {
            c() {
            }

            public void A(String str, Bundle bundle) {
                F0(4, str, bundle);
            }

            public Bundle B() {
                if (j.this.f430g == null) {
                    return null;
                }
                return new Bundle(j.this.f430g);
            }

            /* access modifiers changed from: package-private */
            public void B0(int i10) {
                j.this.u(i10, 0, 0, (Object) null, (Bundle) null);
            }

            public void C(a aVar) {
                j.this.f435l.unregister(aVar);
            }

            /* access modifiers changed from: package-private */
            public void C0(int i10, int i11) {
                j.this.u(i10, i11, 0, (Object) null, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void D0(int i10, Object obj) {
                j.this.u(i10, 0, 0, obj, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void E0(int i10, Object obj, int i11) {
                j.this.u(i10, i11, 0, obj, (Bundle) null);
            }

            public void F(String str, Bundle bundle) {
                F0(8, str, bundle);
            }

            /* access modifiers changed from: package-private */
            public void F0(int i10, Object obj, Bundle bundle) {
                j.this.u(i10, 0, 0, obj, bundle);
            }

            public void G(String str, Bundle bundle) {
                F0(9, str, bundle);
            }

            public void H() {
                B0(16);
            }

            public void I(Uri uri, Bundle bundle) {
                F0(10, uri, bundle);
            }

            public void J(long j10) {
                D0(18, Long.valueOf(j10));
            }

            public void N(float f10) {
                D0(32, Float.valueOf(f10));
            }

            public boolean O(KeyEvent keyEvent) {
                D0(21, keyEvent);
                return true;
            }

            public void T(int i10, int i11, String str) {
                j.this.p(i10, i11);
            }

            public void V(RatingCompat ratingCompat, Bundle bundle) {
                F0(31, ratingCompat, bundle);
            }

            public void X(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                E0(26, mediaDescriptionCompat, i10);
            }

            public void Z(boolean z10) {
                D0(29, Boolean.valueOf(z10));
            }

            public String a() {
                return j.this.f431h;
            }

            public PlaybackStateCompat b() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f434k) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f443t;
                    mediaMetadataCompat = jVar.f442s;
                }
                return MediaSessionCompat.d(playbackStateCompat, mediaMetadataCompat);
            }

            public int b0() {
                return j.this.A;
            }

            public void c() {
                B0(3);
            }

            public void d0(int i10) {
                C0(28, i10);
            }

            public void e() {
                B0(7);
            }

            public boolean e0() {
                return j.this.f448y;
            }

            public List<QueueItem> f() {
                List<QueueItem> list;
                synchronized (j.this.f434k) {
                    list = j.this.f445v;
                }
                return list;
            }

            public int g() {
                return j.this.f449z;
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.f434k) {
                    bundle = j.this.B;
                }
                return bundle;
            }

            public MediaMetadataCompat getMetadata() {
                return j.this.f442s;
            }

            public void h(String str, Bundle bundle) {
                F0(20, str, bundle);
            }

            public void h0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f393h;
                }
                D0(1, new b(str, bundle, resultReceiver));
            }

            public void i(a aVar) {
                if (j.this.f437n) {
                    try {
                        aVar.W();
                    } catch (Exception unused) {
                    }
                } else {
                    j.this.f435l.register(aVar, new androidx.media.e(j.this.r(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public boolean j() {
                return false;
            }

            public void j0(int i10) {
                C0(23, i10);
            }

            public void k(RatingCompat ratingCompat) {
                D0(19, ratingCompat);
            }

            public void k0() {
                B0(17);
            }

            public void l(int i10, int i11, String str) {
                j.this.B(i10, i11);
            }

            public long l0() {
                long j10;
                synchronized (j.this.f434k) {
                    j10 = (long) j.this.f441r;
                }
                return j10;
            }

            public void m(Uri uri, Bundle bundle) {
                F0(6, uri, bundle);
            }

            public void m0(long j10) {
                D0(11, Long.valueOf(j10));
            }

            public void n(MediaDescriptionCompat mediaDescriptionCompat) {
                D0(27, mediaDescriptionCompat);
            }

            public void n0(boolean z10) {
            }

            public void next() {
                B0(14);
            }

            public boolean o() {
                return true;
            }

            public ParcelableVolumeInfo o0() {
                int i10;
                int i11;
                int streamMaxVolume;
                int streamVolume;
                synchronized (j.this.f434k) {
                    j jVar = j.this;
                    i10 = jVar.C;
                    i11 = jVar.D;
                    l lVar = jVar.E;
                    if (i10 != 2) {
                        streamMaxVolume = jVar.f432i.getStreamMaxVolume(i11);
                        streamVolume = j.this.f432i.getStreamVolume(i11);
                    } else {
                        throw null;
                    }
                }
                return new ParcelableVolumeInfo(i10, i11, 2, streamMaxVolume, streamVolume);
            }

            public void p(MediaDescriptionCompat mediaDescriptionCompat) {
                D0(25, mediaDescriptionCompat);
            }

            public void pause() {
                B0(12);
            }

            public void previous() {
                B0(15);
            }

            public PendingIntent q() {
                PendingIntent pendingIntent;
                synchronized (j.this.f434k) {
                    pendingIntent = j.this.f444u;
                }
                return pendingIntent;
            }

            public int r() {
                return j.this.f447x;
            }

            public void r0(int i10) {
                C0(30, i10);
            }

            public void stop() {
                B0(13);
            }

            public void t(String str, Bundle bundle) {
                F0(5, str, bundle);
            }

            public String u0() {
                return j.this.f429f;
            }

            public CharSequence y() {
                return j.this.f446w;
            }
        }

        class d extends Handler {
            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, b bVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.f443t;
                    long c10 = playbackStateCompat == null ? 0 : playbackStateCompat.c();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((c10 & 1) != 0) {
                                        bVar.C();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((c10 & 32) != 0) {
                                        bVar.z();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((c10 & 16) != 0) {
                                        bVar.A();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((c10 & 8) != 0) {
                                        bVar.r();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((c10 & 64) != 0) {
                                        bVar.f();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((c10 & 2) != 0) {
                            bVar.h();
                        }
                    } else if ((c10 & 4) != 0) {
                        bVar.i();
                    }
                }
            }

            public void handleMessage(Message message) {
                b bVar = j.this.f439p;
                if (bVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    j.this.m(new androidx.media.e(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.a(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                b bVar2 = (b) message.obj;
                                bVar.d(bVar2.f451a, bVar2.f452b, bVar2.f453c);
                                break;
                            case 2:
                                j.this.p(message.arg1, 0);
                                break;
                            case 3:
                                bVar.m();
                                break;
                            case 4:
                                bVar.n((String) message.obj, bundle);
                                break;
                            case 5:
                                bVar.o((String) message.obj, bundle);
                                break;
                            case 6:
                                bVar.p((Uri) message.obj, bundle);
                                break;
                            case 7:
                                bVar.i();
                                break;
                            case 8:
                                bVar.j((String) message.obj, bundle);
                                break;
                            case 9:
                                bVar.k((String) message.obj, bundle);
                                break;
                            case 10:
                                bVar.l((Uri) message.obj, bundle);
                                break;
                            case 11:
                                bVar.B(((Long) message.obj).longValue());
                                break;
                            case 12:
                                bVar.h();
                                break;
                            case 13:
                                bVar.C();
                                break;
                            case 14:
                                bVar.z();
                                break;
                            case 15:
                                bVar.A();
                                break;
                            case 16:
                                bVar.f();
                                break;
                            case 17:
                                bVar.r();
                                break;
                            case 18:
                                bVar.s(((Long) message.obj).longValue());
                                break;
                            case 19:
                                bVar.v((RatingCompat) message.obj);
                                break;
                            case 20:
                                bVar.e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!bVar.g(intent)) {
                                    a(keyEvent, bVar);
                                    break;
                                }
                                break;
                            case 22:
                                j.this.B(message.arg1, 0);
                                break;
                            case 23:
                                bVar.x(message.arg1);
                                break;
                            case 25:
                                bVar.b((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                bVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                bVar.q((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = j.this.f445v;
                                if (list != null) {
                                    int i10 = message.arg1;
                                    QueueItem queueItem = (i10 < 0 || i10 >= list.size()) ? null : j.this.f445v.get(message.arg1);
                                    if (queueItem != null) {
                                        bVar.q(queueItem.d());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                bVar.t(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                bVar.y(message.arg1);
                                break;
                            case 31:
                                bVar.w((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                bVar.u(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        j.this.m((androidx.media.e) null);
                    }
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, j1.b bVar, Bundle bundle) {
            if (componentName != null) {
                this.f424a = context;
                this.f429f = context.getPackageName();
                this.f430g = bundle;
                this.f432i = (AudioManager) context.getSystemService("audio");
                this.f431h = str;
                this.f425b = componentName;
                this.f426c = pendingIntent;
                c cVar = new c();
                this.f427d = cVar;
                this.f428e = new Token(cVar, (b) null, bVar);
                this.f447x = 0;
                this.C = 1;
                this.D = 3;
                this.f433j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        private void w(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f435l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f435l.getBroadcastItem(beginBroadcast).Y(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f435l.finishBroadcast();
        }

        private void x(List<QueueItem> list) {
            for (int beginBroadcast = this.f435l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f435l.getBroadcastItem(beginBroadcast).w(list);
                } catch (RemoteException unused) {
                }
            }
            this.f435l.finishBroadcast();
        }

        private void y() {
            for (int beginBroadcast = this.f435l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f435l.getBroadcastItem(beginBroadcast).W();
                } catch (RemoteException unused) {
                }
            }
            this.f435l.finishBroadcast();
            this.f435l.kill();
        }

        private void z(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f435l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f435l.getBroadcastItem(beginBroadcast).w0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f435l.finishBroadcast();
        }

        /* access modifiers changed from: package-private */
        public void A(PlaybackStateCompat playbackStateCompat) {
            this.f433j.setPlaybackState(s(playbackStateCompat.i()));
        }

        /* access modifiers changed from: package-private */
        public void B(int i10, int i11) {
            if (this.C != 2) {
                this.f432i.setStreamVolume(this.D, i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(PendingIntent pendingIntent, ComponentName componentName) {
            this.f432i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public void D() {
            if (this.f438o) {
                v(this.f426c, this.f425b);
                this.f432i.registerRemoteControlClient(this.f433j);
                i(this.f442s);
                n(this.f443t);
                return;
            }
            C(this.f426c, this.f425b);
            this.f433j.setPlaybackState(0);
            this.f432i.unregisterRemoteControlClient(this.f433j);
        }

        public boolean a() {
            return this.f438o;
        }

        public PlaybackStateCompat b() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f434k) {
                playbackStateCompat = this.f443t;
            }
            return playbackStateCompat;
        }

        public Token c() {
            return this.f428e;
        }

        public void d(int i10) {
            synchronized (this.f434k) {
                this.f441r = i10 | 1 | 2;
            }
        }

        public String e() {
            return null;
        }

        public void f(PendingIntent pendingIntent) {
            synchronized (this.f434k) {
                this.f444u = pendingIntent;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.support.v4.media.session.MediaSessionCompat.b r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f434k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = r4.f436m     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = new android.support.v4.media.session.MediaSessionCompat$j$d     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f436m = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f439p     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f439p     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f439p     // Catch:{ all -> 0x0037 }
                r1.D(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f439p = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f439p     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f439p     // Catch:{ all -> 0x0037 }
                r5.D(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.g(android.support.v4.media.session.MediaSessionCompat$b, android.os.Handler):void");
        }

        public b h() {
            b bVar;
            synchronized (this.f434k) {
                bVar = this.f439p;
            }
            return bVar;
        }

        public void i(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.f386e).a();
            }
            synchronized (this.f434k) {
                this.f442s = mediaMetadataCompat;
            }
            w(mediaMetadataCompat);
            if (this.f438o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.e();
                }
                q(bundle).apply();
            }
        }

        public void j(PendingIntent pendingIntent) {
        }

        public void k(List<QueueItem> list) {
            this.f445v = list;
            x(list);
        }

        public void l(boolean z10) {
            if (z10 != this.f438o) {
                this.f438o = z10;
                D();
            }
        }

        public void m(androidx.media.e eVar) {
            synchronized (this.f434k) {
                this.f440q = eVar;
            }
        }

        public void n(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f434k) {
                this.f443t = playbackStateCompat;
            }
            z(playbackStateCompat);
            if (this.f438o) {
                if (playbackStateCompat == null) {
                    this.f433j.setPlaybackState(0);
                    this.f433j.setTransportControlFlags(0);
                    return;
                }
                A(playbackStateCompat);
                this.f433j.setTransportControlFlags(t(playbackStateCompat.c()));
            }
        }

        public androidx.media.e o() {
            androidx.media.e eVar;
            synchronized (this.f434k) {
                eVar = this.f440q;
            }
            return eVar;
        }

        /* access modifiers changed from: package-private */
        public void p(int i10, int i11) {
            if (this.C != 2) {
                this.f432i.adjustStreamVolume(this.D, i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor q(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f433j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        public String r(int i10) {
            String nameForUid = this.f424a.getPackageManager().getNameForUid(i10);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public void release() {
            this.f438o = false;
            this.f437n = true;
            D();
            y();
            g((b) null, (Handler) null);
        }

        /* access modifiers changed from: package-private */
        public int s(int i10) {
            switch (i10) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        public int t(long j10) {
            int i10 = (1 & j10) != 0 ? 32 : 0;
            if ((2 & j10) != 0) {
                i10 |= 16;
            }
            if ((4 & j10) != 0) {
                i10 |= 4;
            }
            if ((8 & j10) != 0) {
                i10 |= 2;
            }
            if ((16 & j10) != 0) {
                i10 |= 1;
            }
            if ((32 & j10) != 0) {
                i10 |= 128;
            }
            if ((64 & j10) != 0) {
                i10 |= 64;
            }
            return (j10 & 512) != 0 ? i10 | 8 : i10;
        }

        /* access modifiers changed from: package-private */
        public void u(int i10, int i11, int i12, Object obj, Bundle bundle) {
            synchronized (this.f434k) {
                d dVar = this.f436m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i10, i11, i12, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", r(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(PendingIntent pendingIntent, ComponentName componentName) {
            this.f432i.registerMediaButtonEventReceiver(componentName);
        }
    }

    public interface k {
        void a();
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j10 = -1;
        if (playbackStateCompat.h() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.i() != 3 && playbackStateCompat.i() != 4 && playbackStateCompat.i() != 5) {
            return playbackStateCompat;
        }
        long e10 = playbackStateCompat.e();
        if (e10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long f10 = ((long) (playbackStateCompat.f() * ((float) (elapsedRealtime - e10)))) + playbackStateCompat.h();
        if (mediaMetadataCompat != null && mediaMetadataCompat.b("android.media.metadata.DURATION")) {
            j10 = mediaMetadataCompat.g("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.d(playbackStateCompat).d(playbackStateCompat.i(), (j10 < 0 || f10 <= j10) ? f10 < 0 ? 0 : f10 : j10, playbackStateCompat.f(), elapsedRealtime).a();
    }

    public static Bundle p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.f388b;
    }

    public Token c() {
        return this.f387a.c();
    }

    public boolean e() {
        return this.f387a.a();
    }

    public void f() {
        this.f387a.release();
    }

    public void g(boolean z10) {
        this.f387a.l(z10);
        Iterator<k> it = this.f389c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void h(b bVar) {
        i(bVar, (Handler) null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.f387a.g((b) null, (Handler) null);
            return;
        }
        c cVar = this.f387a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.g(bVar, handler);
    }

    public void j(int i10) {
        this.f387a.d(i10);
    }

    public void k(PendingIntent pendingIntent) {
        this.f387a.j(pendingIntent);
    }

    public void l(MediaMetadataCompat mediaMetadataCompat) {
        this.f387a.i(mediaMetadataCompat);
    }

    public void m(PlaybackStateCompat playbackStateCompat) {
        this.f387a.n(playbackStateCompat);
    }

    public void n(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem next : list) {
                if (next != null) {
                    if (hashSet.contains(Long.valueOf(next.e()))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found duplicate queue id: ");
                        sb.append(next.e());
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(next.e()));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        this.f387a.k(list);
    }

    public void o(PendingIntent pendingIntent) {
        this.f387a.f(pendingIntent);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (j1.b) null);
    }

    @SuppressLint({"WrongConstant"})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, j1.b bVar) {
        this.f389c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            ComponentName a10 = componentName == null ? r0.a.a(context) : componentName;
            if (a10 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(a10);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, f385d);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                if (i10 >= 29) {
                    this.f387a = new i(context, str, bVar, bundle);
                } else if (i10 >= 28) {
                    this.f387a = new h(context, str, bVar, bundle);
                } else if (i10 >= 22) {
                    this.f387a = new g(context, str, bVar, bundle);
                } else {
                    this.f387a = new f(context, str, bVar, bundle);
                }
                i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f387a.j(pendingIntent2);
            } else if (i10 >= 19) {
                this.f387a = new e(context, str, a10, pendingIntent2, bVar, bundle);
            } else if (i10 >= 18) {
                this.f387a = new d(context, str, a10, pendingIntent2, bVar, bundle);
            } else {
                this.f387a = new j(context, str, a10, pendingIntent2, bVar, bundle);
            }
            this.f388b = new MediaControllerCompat(context, this);
            if (f386e == 0) {
                f386e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
