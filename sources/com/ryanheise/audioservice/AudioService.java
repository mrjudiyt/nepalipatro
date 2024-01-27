package com.ryanheise.audioservice;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.view.KeyEvent;
import androidx.core.app.l;
import androidx.media.d;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AudioService extends androidx.media.d {
    private static boolean A;
    /* access modifiers changed from: private */
    public static d B;
    static String C;
    static String D;
    static Integer E;
    static String F;
    static boolean G;
    static boolean H;
    static boolean I;
    static boolean J;
    private static List<MediaSessionCompat.QueueItem> K = new ArrayList();
    private static int L = -1;
    private static Map<String, MediaMetadataCompat> M = new HashMap();
    private static Set<String> N = new HashSet();
    private static LruCache<String, Bitmap> O;
    private static s7.c P;
    private static boolean Q = false;
    private static s7.a R = s7.a.none;
    private static int S;
    private static int T;
    private static boolean U;

    /* renamed from: x  reason: collision with root package name */
    private static volatile boolean f14100x;

    /* renamed from: y  reason: collision with root package name */
    static AudioService f14101y;

    /* renamed from: z  reason: collision with root package name */
    private static PendingIntent f14102z;

    /* renamed from: p  reason: collision with root package name */
    private PowerManager.WakeLock f14103p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public MediaSessionCompat f14104q;

    /* renamed from: r  reason: collision with root package name */
    private c f14105r;

    /* renamed from: s  reason: collision with root package name */
    private List<l.a> f14106s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private int[] f14107t;

    /* renamed from: u  reason: collision with root package name */
    private MediaMetadataCompat f14108u;

    /* renamed from: v  reason: collision with root package name */
    private String f14109v;

    /* renamed from: w  reason: collision with root package name */
    private Handler f14110w = new Handler(Looper.getMainLooper());

    class a extends LruCache<String, Bitmap> {
        a(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14111a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                s7.a[] r0 = s7.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14111a = r0
                s7.a r1 = s7.a.none     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x001d }
                s7.a r1 = s7.a.connecting     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s7.a r1 = s7.a.ready     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s7.a r1 = s7.a.buffering     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x003e }
                s7.a r1 = s7.a.fastForwarding     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0049 }
                s7.a r1 = s7.a.rewinding     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0054 }
                s7.a r1 = s7.a.skippingToPrevious     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0060 }
                s7.a r1 = s7.a.skippingToNext     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x006c }
                s7.a r1 = s7.a.skippingToQueueItem     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0078 }
                s7.a r1 = s7.a.completed     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0084 }
                s7.a r1 = s7.a.stopped     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f14111a     // Catch:{ NoSuchFieldError -> 0x0090 }
                s7.a r1 = s7.a.error     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.b.<clinit>():void");
        }
    }

    public class c extends MediaSessionCompat.b {
        public c() {
        }

        private s7.b E(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                return s7.b.f16457h;
            }
            if (keyCode == 87) {
                return s7.b.next;
            }
            if (keyCode != 88) {
                return s7.b.f16457h;
            }
            return s7.b.previous;
        }

        public void A() {
            if (AudioService.B != null) {
                AudioService.B.m();
            }
        }

        public void B(long j10) {
            if (AudioService.B != null) {
                AudioService.B.i(j10);
            }
        }

        public void C() {
            if (AudioService.B != null) {
                AudioService.B.onStop();
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.B != null) {
                AudioService.B.h(AudioService.G(mediaDescriptionCompat.g()));
            }
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (AudioService.B != null) {
                AudioService.B.q(AudioService.G(mediaDescriptionCompat.g()), i10);
            }
        }

        public void f() {
            if (AudioService.B != null) {
                AudioService.B.s();
            }
        }

        public boolean g(Intent intent) {
            if (AudioService.B == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    h();
                    return true;
                } else if (!(keyCode == 126 || keyCode == 127)) {
                    switch (keyCode) {
                        case 85:
                        case 87:
                        case 88:
                            break;
                        case 86:
                            C();
                            return true;
                        case 89:
                            r();
                            return true;
                        case 90:
                            f();
                            return true;
                        case 91:
                            i();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.this.f14104q.b();
            AudioService.B.l(E(keyEvent));
            return true;
        }

        public void h() {
            if (AudioService.B != null) {
                AudioService.B.onPause();
            }
        }

        public void i() {
            if (AudioService.B != null) {
                AudioService.B.k();
            }
        }

        public void j(String str, Bundle bundle) {
            if (AudioService.B != null) {
                AudioService.B.c(str);
            }
        }

        public void m() {
            if (AudioService.B != null) {
                if (!AudioService.this.f14104q.e()) {
                    AudioService.this.f14104q.g(true);
                }
                AudioService.B.o();
            }
        }

        public void n(String str, Bundle bundle) {
            if (AudioService.B != null) {
                if (!AudioService.this.f14104q.e()) {
                    AudioService.this.f14104q.g(true);
                }
                AudioService.B.r(str);
            }
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.B != null) {
                AudioService.B.n(AudioService.G(mediaDescriptionCompat.g()));
            }
        }

        public void r() {
            if (AudioService.B != null) {
                AudioService.B.e();
            }
        }

        public void s(long j10) {
            if (AudioService.B != null) {
                AudioService.B.t(j10);
            }
        }

        public void v(RatingCompat ratingCompat) {
            if (AudioService.B != null) {
                AudioService.B.p(ratingCompat);
            }
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.B != null) {
                AudioService.B.j(ratingCompat, bundle);
            }
        }

        public void x(int i10) {
            if (AudioService.B != null) {
                AudioService.B.a(i10);
            }
        }

        public void y(int i10) {
            if (AudioService.B != null) {
                AudioService.B.b(i10);
            }
        }

        public void z() {
            if (AudioService.B != null) {
                AudioService.B.d();
            }
        }
    }

    public interface d {
        void a(int i10);

        void b(int i10);

        void c(String str);

        void d();

        void e();

        void f(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar);

        void g();

        void h(MediaMetadataCompat mediaMetadataCompat);

        void i(long j10);

        void j(RatingCompat ratingCompat, Bundle bundle);

        void k();

        void l(s7.b bVar);

        void m();

        void n(MediaMetadataCompat mediaMetadataCompat);

        void o();

        void onClose();

        void onDestroy();

        void onPause();

        void onStop();

        void p(RatingCompat ratingCompat);

        void q(MediaMetadataCompat mediaMetadataCompat, int i10);

        void r(String str);

        void s();

        void t(long j10);
    }

    private void A() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager.getNotificationChannel(this.f14109v) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(this.f14109v, C, 2);
            notificationChannel.setShowBadge(G);
            String str = D;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    static MediaMetadataCompat B(String str, String str2, String str3, String str4, String str5, Long l10, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map<?, ?> map) {
        Bitmap S2;
        MediaMetadataCompat.b e10 = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", str).e("android.media.metadata.ALBUM", str2).e("android.media.metadata.TITLE", str3);
        if (str4 != null) {
            e10.e("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            e10.e("android.media.metadata.GENRE", str5);
        }
        if (l10 != null) {
            e10.c("android.media.metadata.DURATION", l10.longValue());
        }
        if (str6 != null) {
            e10.e("android.media.metadata.DISPLAY_ICON_URI", str6);
            String str10 = null;
            if (map != null) {
                str10 = (String) map.get("artCacheFile");
            }
            if (!(str10 == null || (S2 = S(str10)) == null)) {
                e10.b("android.media.metadata.ALBUM_ART", S2);
                e10.b("android.media.metadata.DISPLAY_ICON", S2);
            }
        }
        if (bool != null) {
            e10.c("playable_long", bool.booleanValue() ? 1 : 0);
        }
        if (str7 != null) {
            e10.e("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            e10.e("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            e10.e("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        if (ratingCompat != null) {
            e10.d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            Iterator<?> it = map.keySet().iterator();
            while (it.hasNext()) {
                String str11 = (String) it.next();
                Object obj = map.get(str11);
                if (obj instanceof Long) {
                    e10.c("extra_long_" + str11, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    e10.c("extra_long_" + str11, (long) ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    e10.e("extra_string_" + str11, (String) obj);
                } else if (obj instanceof Boolean) {
                    e10.c("extra_boolean_" + str11, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof Double) {
                    e10.e("extra_double_" + str11, obj.toString());
                }
            }
        }
        MediaMetadataCompat a10 = e10.a();
        M.put(str, a10);
        return a10;
    }

    private boolean D() {
        startService(new Intent(this, AudioService.class));
        if (!this.f14104q.e()) {
            this.f14104q.g(true);
        }
        u();
        this.f14104q.o(f14102z);
        P();
        return true;
    }

    private void E() {
        stopForeground(false);
        T();
    }

    private void F() {
        if (J) {
            E();
        }
    }

    static MediaMetadataCompat G(String str) {
        return M.get(str);
    }

    private l.e H() {
        if (Build.VERSION.SDK_INT >= 26) {
            A();
        }
        return new l.e(this, this.f14109v).J(L(F)).P(1).I(false).v(w());
    }

    public static s7.a J() {
        return R;
    }

    public static int K() {
        return S;
    }

    public static int M() {
        return T;
    }

    public static void O(Activity activity, boolean z10, String str, String str2, String str3, Integer num, String str4, boolean z11, boolean z12, boolean z13, boolean z14, s7.c cVar, d dVar) {
        if (!f14100x) {
            f14100x = true;
            Context applicationContext = activity.getApplicationContext();
            Intent intent = new Intent(applicationContext, activity.getClass());
            intent.setAction(str3);
            f14102z = PendingIntent.getActivity(applicationContext, 1000, intent, 67108864);
            B = dVar;
            A = z10;
            C = str;
            D = str2;
            E = num;
            F = str4;
            G = z11;
            H = z12;
            I = z13;
            J = z14;
            P = cVar;
            U = false;
            Q = false;
            R = s7.a.none;
            S = 0;
            T = 0;
            O = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
            return;
        }
        throw new IllegalStateException("AudioService already running");
    }

    private void P() {
        startForeground(1124, y());
        U = true;
    }

    public static boolean Q() {
        return Q;
    }

    public static boolean R() {
        return f14100x;
    }

    static Bitmap S(String str) {
        Bitmap bitmap;
        Bitmap bitmap2 = O.get(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        try {
            if (P != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                s7.c cVar = P;
                options.inSampleSize = z(options, cVar.f16461a, cVar.f16462b);
                options.inJustDecodeBounds = false;
                bitmap = BitmapFactory.decodeFile(str, options);
            } else {
                bitmap = BitmapFactory.decodeFile(str);
            }
            O.put(str, bitmap);
            return bitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void T() {
        if (this.f14103p.isHeld()) {
            this.f14103p.release();
        }
    }

    public static int Y(long j10) {
        if (j10 == 4) {
            return 91;
        }
        if (j10 == 2) {
            return 130;
        }
        return PlaybackStateCompat.j(j10);
    }

    private void Z() {
        if (U) {
            ((NotificationManager) getSystemService("notification")).notify(1124, y());
        }
    }

    private void u() {
        if (!this.f14103p.isHeld()) {
            this.f14103p.acquire();
        }
    }

    private Notification y() {
        int[] iArr = this.f14107t;
        if (iArr == null) {
            int min = Math.min(3, this.f14106s.size());
            int[] iArr2 = new int[min];
            for (int i10 = 0; i10 < min; i10++) {
                iArr2[i10] = i10;
            }
            iArr = iArr2;
        }
        l.e H2 = H();
        MediaMetadataCompat mediaMetadataCompat = this.f14108u;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat f10 = mediaMetadataCompat.f();
            if (f10.i() != null) {
                H2.r(f10.i());
            }
            if (f10.h() != null) {
                H2.q(f10.h());
            }
            if (f10.c() != null) {
                H2.M(f10.c());
            }
            if (f10.d() != null) {
                H2.B(f10.d());
            }
        }
        if (H) {
            H2.p(this.f14104q.b().e());
        }
        Integer num = E;
        if (num != null) {
            H2.n(num.intValue());
        }
        for (l.a b10 : this.f14106s) {
            H2.b(b10);
        }
        H2.L(new androidx.media.app.c().x(this.f14104q.c()).y(iArr).z(true).w(x(1)));
        if (I) {
            H2.F(true);
        }
        return H2.c();
    }

    private static int z(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.f14104q.j(7);
    }

    public int I() {
        switch (b.f14111a[R.ordinal()]) {
            case 2:
                return 8;
            case 3:
                if (Q) {
                    return 3;
                }
                return 2;
            case 4:
                return 6;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                if (Q) {
                    return 3;
                }
                return 2;
            case 11:
                return 1;
            case 12:
                return 7;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public int L(String str) {
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    public void N() {
        d dVar = B;
        if (dVar != null) {
            dVar.onClose();
        }
    }

    /* access modifiers changed from: package-private */
    public void U(MediaMetadataCompat mediaMetadataCompat) {
        this.f14108u = mediaMetadataCompat;
        this.f14104q.l(mediaMetadataCompat);
        Z();
    }

    /* access modifiers changed from: package-private */
    public void V(List<MediaSessionCompat.QueueItem> list) {
        K = list;
        this.f14104q.n(list);
    }

    /* access modifiers changed from: package-private */
    public void W(List<l.a> list, int i10, int[] iArr, s7.a aVar, boolean z10, long j10, long j11, float f10, long j12, int i11, int i12) {
        this.f14106s = list;
        this.f14107t = iArr;
        boolean z11 = Q;
        R = aVar;
        Q = z10;
        S = i11;
        T = i12;
        this.f14104q.m(new PlaybackStateCompat.d().b(((long) i10) | 512).d(I(), j10, f10, j12).c(j11).a());
        if (f14100x) {
            if (!z11 && z10) {
                D();
            } else if (z11 && !z10) {
                F();
            }
            Z();
        }
    }

    public void X() {
        f14100x = false;
        this.f14108u = null;
        A = false;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        P = null;
        K.clear();
        L = -1;
        M.clear();
        this.f14106s.clear();
        O.evictAll();
        this.f14107t = null;
        this.f14104q.n(K);
        this.f14104q.g(false);
        T();
        stopForeground(true);
        stopSelf();
        U = false;
    }

    public d.e f(String str, int i10, Bundle bundle) {
        return new d.e("root", (Bundle) null);
    }

    public void g(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        d dVar = B;
        if (dVar == null) {
            mVar.g(new ArrayList());
        } else {
            dVar.f(str, mVar);
        }
    }

    public void onCreate() {
        super.onCreate();
        f14101y = this;
        this.f14109v = getApplication().getPackageName() + ".channel";
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "media-session");
        this.f14104q = mediaSessionCompat;
        mediaSessionCompat.k((PendingIntent) null);
        this.f14104q.j(3);
        this.f14104q.m(new PlaybackStateCompat.d().b(4).a());
        MediaSessionCompat mediaSessionCompat2 = this.f14104q;
        c cVar = new c();
        this.f14105r = cVar;
        mediaSessionCompat2.h(cVar);
        r(this.f14104q.c());
        this.f14104q.n(K);
        this.f14103p = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
    }

    public void onDestroy() {
        super.onDestroy();
        d dVar = B;
        if (dVar != null) {
            dVar.onDestroy();
        }
        this.f14104q.f();
        f14101y = null;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        r0.a.c(this.f14104q, intent);
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        d dVar = B;
        if (dVar != null) {
            dVar.g();
        }
        super.onTaskRemoved(intent);
    }

    /* access modifiers changed from: package-private */
    public l.a v(String str, String str2, long j10) {
        return new l.a(L(str), (CharSequence) str2, x(j10));
    }

    /* access modifiers changed from: package-private */
    public PendingIntent w() {
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast(this, 0, intent, 67108864);
    }

    /* access modifiers changed from: package-private */
    public PendingIntent x(long j10) {
        int Y = Y(j10);
        if (Y == 0) {
            return null;
        }
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, Y));
        return PendingIntent.getBroadcast(this, Y, intent, 67108864);
    }
}
