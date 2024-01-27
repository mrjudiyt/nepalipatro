package t7;

import a6.m0;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b6.z;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.x0;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.d;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import g4.d;
import g5.v;
import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import x4.a;
import x4.f;

/* compiled from: AudioPlayer */
public class d implements MethodChannel.MethodCallHandler, t0.e, f {
    private static Random O = new Random();
    private g4.d A;
    private l B;
    private i0 C;
    private List<Object> D;
    private List<AudioEffect> E = new ArrayList();
    private Map<String, AudioEffect> F = new HashMap();
    private int G = 0;
    private Map<String, Object> H;
    /* access modifiers changed from: private */
    public x0 I;
    private Integer J;
    private k K;
    private Integer L;
    /* access modifiers changed from: private */
    public final Handler M = new Handler(Looper.getMainLooper());
    private final Runnable N = new a();

    /* renamed from: h  reason: collision with root package name */
    private Boolean f16561h = Boolean.FALSE;

    /* renamed from: i  reason: collision with root package name */
    private final Context f16562i;

    /* renamed from: j  reason: collision with root package name */
    private final MethodChannel f16563j;

    /* renamed from: k  reason: collision with root package name */
    private final e f16564k;

    /* renamed from: l  reason: collision with root package name */
    private final e f16565l;

    /* renamed from: m  reason: collision with root package name */
    private c f16566m;

    /* renamed from: n  reason: collision with root package name */
    private long f16567n;

    /* renamed from: o  reason: collision with root package name */
    private long f16568o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f16569p;

    /* renamed from: q  reason: collision with root package name */
    private Long f16570q;

    /* renamed from: r  reason: collision with root package name */
    private long f16571r;

    /* renamed from: s  reason: collision with root package name */
    private Integer f16572s;

    /* renamed from: t  reason: collision with root package name */
    private MethodChannel.Result f16573t;

    /* renamed from: u  reason: collision with root package name */
    private MethodChannel.Result f16574u;

    /* renamed from: v  reason: collision with root package name */
    private MethodChannel.Result f16575v;

    /* renamed from: w  reason: collision with root package name */
    private Map<String, k> f16576w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    private b5.c f16577x;

    /* renamed from: y  reason: collision with root package name */
    private b5.b f16578y;

    /* renamed from: z  reason: collision with root package name */
    private int f16579z;

    /* compiled from: AudioPlayer */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (d.this.I != null) {
                if (d.this.I.r0() != d.this.f16569p) {
                    d.this.C();
                }
                int w02 = d.this.I.w0();
                if (w02 == 2) {
                    d.this.M.postDelayed(this, 200);
                } else if (w02 == 3) {
                    if (d.this.I.t0()) {
                        d.this.M.postDelayed(this, 500);
                    } else {
                        d.this.M.postDelayed(this, 1000);
                    }
                }
            }
        }
    }

    /* compiled from: AudioPlayer */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16581a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                t7.d$c[] r0 = t7.d.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16581a = r0
                t7.d$c r1 = t7.d.c.none     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16581a     // Catch:{ NoSuchFieldError -> 0x001d }
                t7.d$c r1 = t7.d.c.loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t7.d.b.<clinit>():void");
        }
    }

    /* compiled from: AudioPlayer */
    enum c {
        none,
        loading,
        buffering,
        ready,
        completed
    }

    public d(Context context, BinaryMessenger binaryMessenger, String str, Map<?, ?> map, List<Object> list) {
        this.f16562i = context;
        this.D = list;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.just_audio.methods." + str);
        this.f16563j = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f16564k = new e(binaryMessenger, "com.ryanheise.just_audio.events." + str);
        this.f16565l = new e(binaryMessenger, "com.ryanheise.just_audio.data." + str);
        this.f16566m = c.none;
        if (map != null) {
            Map map2 = (Map) map.get("androidLoadControl");
            if (map2 != null) {
                d.a b10 = new d.a().c((int) (l0(map2.get("minBufferDuration")).longValue() / 1000), (int) (l0(map2.get("maxBufferDuration")).longValue() / 1000), (int) (l0(map2.get("bufferForPlaybackDuration")).longValue() / 1000), (int) (l0(map2.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000)).d(((Boolean) map2.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int) (l0(map2.get("backBufferDuration")).longValue() / 1000), false);
                if (map2.get("targetBufferBytes") != null) {
                    b10.e(((Integer) map2.get("targetBufferBytes")).intValue());
                }
                this.B = b10.a();
            }
            Map map3 = (Map) map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.C = new f.b().c((float) ((Double) map3.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float) ((Double) map3.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(l0(map3.get("minUpdateInterval")).longValue() / 1000).g((float) ((Double) map3.get("proportionalControlFactor")).doubleValue()).d(l0(map3.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000).h(l0(map3.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000).e((float) ((Double) map3.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    private void A(String str, boolean z10) {
        this.F.get(str).setEnabled(z10);
    }

    /* access modifiers changed from: private */
    public void C() {
        Y();
        E();
    }

    private void D0(Object obj) {
        Map map = (Map) obj;
        k kVar = this.f16576w.get((String) s0(map, "id"));
        if (kVar != null) {
            String str = (String) s0(map, ShareConstants.MEDIA_TYPE);
            str.hashCode();
            if (str.equals("concatenating")) {
                ((com.google.android.exoplayer2.source.d) kVar).q0(S((List) s0(map, "shuffleOrder")));
                for (Object D0 : (List) s0(map, "children")) {
                    D0(D0);
                }
            } else if (str.equals("looping")) {
                D0(s0(map, "child"));
            }
        }
    }

    private void E() {
        Map<String, Object> map = this.H;
        if (map != null) {
            this.f16564k.success(map);
            this.H = null;
        }
    }

    private a.C0119a F() {
        return new com.google.android.exoplayer2.upstream.d(this.f16562i, new e.b().d(m0.f0(this.f16562i, "just_audio")).c(true));
    }

    private void G() {
        Iterator<AudioEffect> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().release();
            it.remove();
        }
        this.F.clear();
    }

    private void H0() {
        this.M.removeCallbacks(this.N);
        this.M.post(this.N);
    }

    private Map<String, Object> I() {
        HashMap hashMap = new HashMap();
        if (this.f16577x != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, this.f16577x.f5006i);
            hashMap2.put("url", this.f16577x.f5007j);
            hashMap.put("info", hashMap2);
        }
        if (this.f16578y != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("bitrate", Integer.valueOf(this.f16578y.f4999h));
            hashMap3.put("genre", this.f16578y.f5000i);
            hashMap3.put("name", this.f16578y.f5001j);
            hashMap3.put("metadataInterval", Integer.valueOf(this.f16578y.f5004m));
            hashMap3.put("url", this.f16578y.f5002k);
            hashMap3.put("isPublic", Boolean.valueOf(this.f16578y.f5003l));
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }

    private boolean I0() {
        Integer valueOf = Integer.valueOf(this.I.h());
        if (valueOf.equals(this.L)) {
            return false;
        }
        this.L = valueOf;
        return true;
    }

    private void J0() {
        this.f16567n = i0();
        this.f16568o = System.currentTimeMillis();
    }

    private void K() {
        this.f16570q = null;
        this.f16575v.success(new HashMap());
        this.f16575v = null;
    }

    private boolean K0() {
        if (i0() == this.f16567n) {
            return false;
        }
        this.f16567n = i0();
        this.f16568o = System.currentTimeMillis();
        return true;
    }

    private com.google.android.exoplayer2.source.d L(Object obj) {
        return (com.google.android.exoplayer2.source.d) this.f16576w.get((String) obj);
    }

    private Map<String, Object> N() {
        HashMap hashMap = new HashMap();
        Long valueOf = k0() == -9223372036854775807L ? null : Long.valueOf(k0() * 1000);
        x0 x0Var = this.I;
        this.f16569p = x0Var != null ? x0Var.r0() : 0;
        hashMap.put("processingState", Integer.valueOf(this.f16566m.ordinal()));
        hashMap.put("updatePosition", Long.valueOf(this.f16567n * 1000));
        hashMap.put("updateTime", Long.valueOf(this.f16568o));
        hashMap.put("bufferedPosition", Long.valueOf(Math.max(this.f16567n, this.f16569p) * 1000));
        hashMap.put("icyMetadata", I());
        hashMap.put("duration", valueOf);
        hashMap.put("currentIndex", this.L);
        hashMap.put("androidAudioSessionId", this.J);
        return hashMap;
    }

    private AudioEffect P(Object obj, int i10) {
        Map map = (Map) obj;
        String str = (String) map.get(ShareConstants.MEDIA_TYPE);
        str.hashCode();
        if (str.equals("AndroidEqualizer")) {
            return new Equalizer(0, i10);
        }
        if (!str.equals("AndroidLoudnessEnhancer")) {
            throw new IllegalArgumentException("Unknown AudioEffect type: " + map.get(ShareConstants.MEDIA_TYPE));
        } else if (Build.VERSION.SDK_INT >= 19) {
            int round = (int) Math.round(((Double) map.get("targetGain")).doubleValue() * 1000.0d);
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(i10);
            loudnessEnhancer.setTargetGain(round);
            return loudnessEnhancer;
        } else {
            throw new RuntimeException("AndroidLoudnessEnhancer requires minSdkVersion >= 19");
        }
    }

    private k R(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        String str2 = (String) map.get(ShareConstants.MEDIA_TYPE);
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case -445916622:
                if (str2.equals("concatenating")) {
                    c10 = 0;
                    break;
                }
                break;
            case 103407:
                if (str2.equals("hls")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3075986:
                if (str2.equals("dash")) {
                    c10 = 2;
                    break;
                }
                break;
            case 349937342:
                if (str2.equals("looping")) {
                    c10 = 3;
                    break;
                }
                break;
            case 918617282:
                if (str2.equals("clipping")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1131547531:
                if (str2.equals("progressive")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092627105:
                if (str2.equals("silence")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new com.google.android.exoplayer2.source.d(false, ((Boolean) map.get("useLazyPreparation")).booleanValue(), S((List) s0(map, "shuffleOrder")), h0(map.get("children")));
            case 1:
                return new HlsMediaSource.Factory(F()).a(new j0.c().h(Uri.parse((String) map.get(ShareConstants.MEDIA_URI))).e("application/x-mpegURL").a());
            case 2:
                return new DashMediaSource.Factory(F()).a(new j0.c().h(Uri.parse((String) map.get(ShareConstants.MEDIA_URI))).e("application/dash+xml").g(str).a());
            case 3:
                k d02 = d0(map.get("child"));
                int intValue = ((Integer) map.get("count")).intValue();
                k[] kVarArr = new k[intValue];
                for (int i10 = 0; i10 < intValue; i10++) {
                    kVarArr[i10] = d02;
                }
                return new com.google.android.exoplayer2.source.d(kVarArr);
            case 4:
                Long l02 = l0(map.get("start"));
                Long l03 = l0(map.get("end"));
                return new ClippingMediaSource(d0(map.get("child")), l02 != null ? l02.longValue() : 0, l03 != null ? l03.longValue() : Long.MIN_VALUE);
            case 5:
                return new r.b(F()).b(new j0.c().h(Uri.parse((String) map.get(ShareConstants.MEDIA_URI))).g(str).a());
            case 6:
                return new x.b().b(l0(map.get("duration")).longValue()).c(str).a();
            default:
                throw new IllegalArgumentException("Unknown AudioSource type: " + map.get(ShareConstants.MEDIA_TYPE));
        }
    }

    private w S(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return new w.a(iArr, O.nextLong());
    }

    private void Y() {
        new HashMap();
        this.H = N();
    }

    private void Z() {
        if (this.I == null) {
            x0.b bVar = new x0.b(this.f16562i);
            l lVar = this.B;
            if (lVar != null) {
                bVar.B(lVar);
            }
            i0 i0Var = this.C;
            if (i0Var != null) {
                bVar.A(i0Var);
            }
            x0 z10 = bVar.z();
            this.I = z10;
            z0(z10.q0());
            this.I.j0(this);
        }
    }

    private Map<String, Object> a0() {
        Equalizer equalizer = (Equalizer) this.F.get("AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s10 = 0; s10 < equalizer.getNumberOfBands(); s10 = (short) (s10 + 1)) {
            arrayList.add(t0(FirebaseAnalytics.Param.INDEX, Short.valueOf(s10), "lowerFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s10)[0]) / 1000.0d), "upperFrequency", Double.valueOf(((double) equalizer.getBandFreqRange(s10)[1]) / 1000.0d), "centerFrequency", Double.valueOf(((double) equalizer.getCenterFreq(s10)) / 1000.0d), "gain", Double.valueOf(((double) equalizer.getBandLevel(s10)) / 1000.0d)));
        }
        return t0("parameters", t0("minDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 1000.0d), "maxDecibels", Double.valueOf(((double) equalizer.getBandLevelRange()[1]) / 1000.0d), "bands", arrayList));
    }

    private void b0(int i10, double d10) {
        ((Equalizer) this.F.get("AndroidEqualizer")).setBandLevel((short) i10, (short) ((int) Math.round(d10 * 1000.0d)));
    }

    private k d0(Object obj) {
        Map map = (Map) obj;
        String str = (String) map.get("id");
        k kVar = this.f16576w.get(str);
        if (kVar != null) {
            return kVar;
        }
        k R = R(map);
        this.f16576w.put(str, R);
        return R;
    }

    private List<k> g0(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(d0(list.get(i10)));
            }
            return arrayList;
        }
        throw new RuntimeException("List expected: " + obj);
    }

    private k[] h0(Object obj) {
        List<k> g02 = g0(obj);
        k[] kVarArr = new k[g02.size()];
        g02.toArray(kVarArr);
        return kVarArr;
    }

    private long i0() {
        long j10 = this.f16571r;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        c cVar = this.f16566m;
        if (cVar == c.none || cVar == c.loading) {
            long m10 = this.I.m();
            if (m10 < 0) {
                return 0;
            }
            return m10;
        }
        Long l10 = this.f16570q;
        if (l10 == null || l10.longValue() == -9223372036854775807L) {
            return this.I.m();
        }
        return this.f16570q.longValue();
    }

    private long k0() {
        c cVar = this.f16566m;
        if (cVar == c.none || cVar == c.loading) {
            return -9223372036854775807L;
        }
        return this.I.s0();
    }

    private void l() {
        x0("abort", "Connection aborted");
    }

    public static Long l0(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : new Long((long) ((Integer) obj).intValue());
    }

    private void n() {
        MethodChannel.Result result = this.f16575v;
        if (result != null) {
            try {
                result.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f16575v = null;
            this.f16570q = null;
        }
    }

    private void q0(k kVar, long j10, Integer num, MethodChannel.Result result) {
        this.f16571r = j10;
        this.f16572s = num;
        this.L = Integer.valueOf(num != null ? num.intValue() : 0);
        int i10 = b.f16581a[this.f16566m.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                this.I.A();
            } else {
                l();
                this.I.A();
            }
        }
        this.f16579z = 0;
        this.f16573t = result;
        J0();
        this.f16566m = c.loading;
        Y();
        this.K = kVar;
        this.I.G0(kVar);
        this.I.A0();
    }

    private void r0(double d10) {
        ((LoudnessEnhancer) this.F.get("AndroidLoudnessEnhancer")).setTargetGain((int) Math.round(d10 * 1000.0d));
    }

    static <T> T s0(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    static Map<String, Object> t0(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    private void x0(String str, String str2) {
        MethodChannel.Result result = this.f16573t;
        if (result != null) {
            result.error(str, str2, (Object) null);
            this.f16573t = null;
        }
        this.f16564k.error(str, str2, (Object) null);
    }

    private void y0(int i10, int i11, int i12) {
        d.b bVar = new d.b();
        bVar.b(i10);
        bVar.c(i11);
        bVar.d(i12);
        g4.d a10 = bVar.a();
        if (this.f16566m == c.loading) {
            this.A = a10;
        } else {
            this.I.F0(a10, false);
        }
    }

    private void z0(int i10) {
        if (i10 == 0) {
            this.J = null;
        } else {
            this.J = Integer.valueOf(i10);
        }
        G();
        if (this.J != null) {
            for (Object next : this.D) {
                Map map = (Map) next;
                AudioEffect P = P(next, this.J.intValue());
                if (((Boolean) map.get("enabled")).booleanValue()) {
                    P.setEnabled(true);
                }
                this.E.add(P);
                this.F.put((String) map.get(ShareConstants.MEDIA_TYPE), P);
            }
        }
        Y();
    }

    public void A0(int i10) {
        this.I.J0(i10);
    }

    public void B(g5.w wVar, y5.l lVar) {
        for (int i10 = 0; i10 < wVar.f8924h; i10++) {
            v b10 = wVar.b(i10);
            for (int i11 = 0; i11 < b10.f8920h; i11++) {
                x4.a aVar = b10.b(i11).f8094q;
                if (aVar != null) {
                    for (int i12 = 0; i12 < aVar.e(); i12++) {
                        a.b d10 = aVar.d(i12);
                        if (d10 instanceof b5.b) {
                            this.f16578y = (b5.b) d10;
                            C();
                        }
                    }
                }
            }
        }
    }

    public void B0(float f10) {
        m v02 = this.I.v0();
        if (v02.f8135b != f10) {
            this.I.I0(new m(v02.f8134a, f10));
            Y();
        }
    }

    public void C0(boolean z10) {
        this.I.K0(z10);
    }

    public /* synthetic */ void D(k0 k0Var) {
        o.j(this, k0Var);
    }

    public void E0(boolean z10) {
        this.I.L0(z10);
    }

    public void F0(float f10) {
        m v02 = this.I.v0();
        if (v02.f8134a != f10) {
            this.I.I0(new m(f10, v02.f8135b));
            if (this.I.t0()) {
                J0();
            }
            Y();
        }
    }

    public void G0(float f10) {
        this.I.O0(f10);
    }

    public /* synthetic */ void H(boolean z10) {
        o.q(this, z10);
    }

    public /* synthetic */ void J(t0 t0Var, t0.d dVar) {
        o.f(this, t0Var, dVar);
    }

    public /* synthetic */ void M(int i10, boolean z10) {
        o.e(this, i10, z10);
    }

    public /* synthetic */ void O(boolean z10, int i10) {
        n.k(this, z10, i10);
    }

    public /* synthetic */ void Q(int i10, int i11, int i12, float f10) {
        b6.k.a(this, i10, i11, i12, f10);
    }

    public /* synthetic */ void T(g4.d dVar) {
        o.a(this, dVar);
    }

    public /* synthetic */ void U() {
        o.o(this);
    }

    public /* synthetic */ void V(j0 j0Var, int i10) {
        o.i(this, j0Var, i10);
    }

    public void W() {
        if (this.f16566m == c.loading) {
            l();
        }
        MethodChannel.Result result = this.f16574u;
        if (result != null) {
            result.success(new HashMap());
            this.f16574u = null;
        }
        this.f16576w.clear();
        this.K = null;
        G();
        x0 x0Var = this.I;
        if (x0Var != null) {
            x0Var.B0();
            this.I = null;
            this.f16566m = c.none;
            C();
        }
        this.f16564k.endOfStream();
        this.f16565l.endOfStream();
    }

    public /* synthetic */ void X(List list) {
        o.c(this, list);
    }

    public /* synthetic */ void a(boolean z10) {
        o.r(this, z10);
    }

    public /* synthetic */ void b(m mVar) {
        o.l(this, mVar);
    }

    public /* synthetic */ void c0(boolean z10, int i10) {
        o.k(this, z10, i10);
    }

    public /* synthetic */ void d(int i10) {
        o.p(this, i10);
    }

    public /* synthetic */ void e(z zVar) {
        o.t(this, zVar);
    }

    public /* synthetic */ void e0(i4.a aVar) {
        o.d(this, aVar);
    }

    public void f(t0.f fVar, t0.f fVar2, int i10) {
        J0();
        if (i10 == 0 || i10 == 1) {
            I0();
        }
        C();
    }

    public /* synthetic */ void f0(int i10, int i11) {
        o.s(this, i10, i11);
    }

    public /* synthetic */ void g(int i10) {
        o.m(this, i10);
    }

    public /* synthetic */ void h(boolean z10) {
        n.d(this, z10);
    }

    public /* synthetic */ void i(int i10) {
        n.l(this, i10);
    }

    public /* synthetic */ void j0(PlaybackException playbackException) {
        o.n(this, playbackException);
    }

    public /* synthetic */ void m(List list) {
        n.q(this, list);
    }

    public /* synthetic */ void o0(boolean z10) {
        o.h(this, z10);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MethodCall methodCall2 = methodCall;
        MethodChannel.Result result2 = result;
        Z();
        try {
            String str = methodCall2.method;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2058172951:
                    if (str.equals("androidEqualizerBandSetGain")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -1987605894:
                    if (str.equals("setShuffleMode")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -1875704736:
                    if (str.equals("setSkipSilence")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1540835818:
                    if (str.equals("concatenatingInsertAll")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case -1484304041:
                    if (str.equals("setShuffleOrder")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -704119678:
                    if (str.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -345307082:
                    if (str.equals("androidLoudnessEnhancerSetTargetGain")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -104999328:
                    if (str.equals("setAndroidAudioAttributes")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case -48357143:
                    if (str.equals("setLoopMode")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3526264:
                    if (str.equals("seek")) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 845471111:
                    if (str.equals("concatenatingRemoveRange")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 986980643:
                    if (str.equals("concatenatingMove")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 1401390078:
                    if (str.equals("setPitch")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1404354821:
                    if (str.equals("setSpeed")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1454606831:
                    if (str.equals("setPreferredPeakBitRate")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1624925565:
                    if (str.equals("androidEqualizerGetParameters")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case 1631191096:
                    if (str.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 2117606630:
                    if (str.equals("audioEffectSetEnabled")) {
                        c10 = 18;
                        break;
                    }
                    break;
            }
            long j10 = -9223372036854775807L;
            switch (c10) {
                case 0:
                    Long l02 = l0(methodCall2.argument("initialPosition"));
                    Integer num = (Integer) methodCall2.argument("initialIndex");
                    k d02 = d0(methodCall2.argument("audioSource"));
                    if (l02 != null) {
                        j10 = l02.longValue() / 1000;
                    }
                    q0(d02, j10, num, result);
                    break;
                case 1:
                    v0(result2);
                    break;
                case 2:
                    u0();
                    result2.success(new HashMap());
                    break;
                case 3:
                    G0((float) ((Double) methodCall2.argument("volume")).doubleValue());
                    result2.success(new HashMap());
                    break;
                case 4:
                    F0((float) ((Double) methodCall2.argument("speed")).doubleValue());
                    result2.success(new HashMap());
                    break;
                case 5:
                    B0((float) ((Double) methodCall2.argument("pitch")).doubleValue());
                    result2.success(new HashMap());
                    break;
                case 6:
                    E0(((Boolean) methodCall2.argument("enabled")).booleanValue());
                    result2.success(new HashMap());
                    break;
                case 7:
                    A0(((Integer) methodCall2.argument("loopMode")).intValue());
                    result2.success(new HashMap());
                    break;
                case 8:
                    C0(((Integer) methodCall2.argument("shuffleMode")).intValue() == 1);
                    result2.success(new HashMap());
                    break;
                case 9:
                    D0(methodCall2.argument("audioSource"));
                    result2.success(new HashMap());
                    break;
                case 10:
                    result2.success(new HashMap());
                    break;
                case 11:
                    result2.success(new HashMap());
                    break;
                case 12:
                    result2.success(new HashMap());
                    break;
                case 13:
                    Long l03 = l0(methodCall2.argument("position"));
                    Integer num2 = (Integer) methodCall2.argument(FirebaseAnalytics.Param.INDEX);
                    if (l03 != null) {
                        j10 = l03.longValue() / 1000;
                    }
                    w0(j10, num2, result2);
                    break;
                case 14:
                    L(methodCall2.argument("id")).O(((Integer) methodCall2.argument(FirebaseAnalytics.Param.INDEX)).intValue(), g0(methodCall2.argument("children")), this.M, new b(result2));
                    L(methodCall2.argument("id")).q0(S((List) methodCall2.argument("shuffleOrder")));
                    break;
                case 15:
                    L(methodCall2.argument("id")).l0(((Integer) methodCall2.argument(SpellCheckPlugin.START_INDEX_KEY)).intValue(), ((Integer) methodCall2.argument(SpellCheckPlugin.END_INDEX_KEY)).intValue(), this.M, new c(result2));
                    L(methodCall2.argument("id")).q0(S((List) methodCall2.argument("shuffleOrder")));
                    break;
                case 16:
                    L(methodCall2.argument("id")).g0(((Integer) methodCall2.argument("currentIndex")).intValue(), ((Integer) methodCall2.argument("newIndex")).intValue(), this.M, new a(result2));
                    L(methodCall2.argument("id")).q0(S((List) methodCall2.argument("shuffleOrder")));
                    break;
                case 17:
                    y0(((Integer) methodCall2.argument("contentType")).intValue(), ((Integer) methodCall2.argument("flags")).intValue(), ((Integer) methodCall2.argument("usage")).intValue());
                    result2.success(new HashMap());
                    break;
                case 18:
                    A((String) methodCall2.argument(ShareConstants.MEDIA_TYPE), ((Boolean) methodCall2.argument("enabled")).booleanValue());
                    result2.success(new HashMap());
                    break;
                case 19:
                    r0(((Double) methodCall2.argument("targetGain")).doubleValue());
                    result2.success(new HashMap());
                    break;
                case 20:
                    result2.success(a0());
                    break;
                case 21:
                    b0(((Integer) methodCall2.argument("bandIndex")).intValue(), ((Double) methodCall2.argument("gain")).doubleValue());
                    result2.success(new HashMap());
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        } catch (IllegalStateException e10) {
            IllegalStateException illegalStateException = e10;
            illegalStateException.printStackTrace();
            result2.error("Illegal state: " + illegalStateException.getMessage(), (String) null, (Object) null);
        } catch (Exception e11) {
            Exception exc = e11;
            exc.printStackTrace();
            result2.error("Error: " + exc, (String) null, (Object) null);
        } catch (Throwable th) {
            Throwable th2 = th;
            E();
            throw th2;
        }
        E();
    }

    public void p(x4.a aVar) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof b5.c) {
                this.f16577x = (b5.c) d10;
                C();
            }
        }
    }

    public /* synthetic */ void q(boolean z10) {
        o.g(this, z10);
    }

    public /* synthetic */ void r() {
        n.o(this);
    }

    public void s(PlaybackException playbackException) {
        this.f16561h = Boolean.TRUE;
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            int i10 = exoPlaybackException.f6211k;
            if (i10 == 0) {
                Log.e("AudioPlayer", "TYPE_SOURCE: " + exoPlaybackException.h().getMessage());
            } else if (i10 == 1) {
                Log.e("AudioPlayer", "TYPE_RENDERER: " + exoPlaybackException.g().getMessage());
            } else if (i10 != 2) {
                Log.e("AudioPlayer", "default ExoPlaybackException: " + exoPlaybackException.i().getMessage());
            } else {
                Log.e("AudioPlayer", "TYPE_UNEXPECTED: " + exoPlaybackException.i().getMessage());
            }
            x0(String.valueOf(exoPlaybackException.f6211k), exoPlaybackException.getMessage());
        } else {
            Log.e("AudioPlayer", "default PlaybackException: " + playbackException.getMessage());
            x0(String.valueOf(playbackException.f6225h), playbackException.getMessage());
        }
        this.f16579z++;
    }

    public /* synthetic */ void t(t0.b bVar) {
        o.b(this, bVar);
    }

    public void u0() {
        if (this.I.t0()) {
            this.I.H0(false);
            J0();
            MethodChannel.Result result = this.f16574u;
            if (result != null) {
                result.success(new HashMap());
                this.f16574u = null;
            }
        }
    }

    public void v(a1 a1Var, int i10) {
        if (!(this.f16571r == -9223372036854775807L && this.f16572s == null)) {
            Integer num = this.f16572s;
            this.I.c(num != null ? num.intValue() : 0, this.f16571r);
            this.f16572s = null;
            this.f16571r = -9223372036854775807L;
        }
        if (I0()) {
            C();
        }
        if (this.I.w0() == 4) {
            try {
                if (this.I.t0()) {
                    if (this.I.t()) {
                        this.I.z();
                    } else if (this.G == 0 && this.I.p() > 0) {
                        this.I.c(0, 0);
                    }
                } else if (this.I.h() < this.I.p()) {
                    x0 x0Var = this.I;
                    x0Var.c(x0Var.h(), 0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.G = this.I.p();
    }

    public void v0(MethodChannel.Result result) {
        MethodChannel.Result result2;
        if (this.I.t0()) {
            result.success(new HashMap());
            return;
        }
        MethodChannel.Result result3 = this.f16574u;
        if (result3 != null) {
            result3.success(new HashMap());
        }
        this.f16574u = result;
        this.I.H0(true);
        J0();
        if (this.f16566m == c.completed && (result2 = this.f16574u) != null) {
            result2.success(new HashMap());
            this.f16574u = null;
        }
    }

    public /* synthetic */ void w(float f10) {
        o.u(this, f10);
    }

    public void w0(long j10, Integer num, MethodChannel.Result result) {
        int i10;
        c cVar = this.f16566m;
        if (cVar == c.none || cVar == c.loading) {
            result.success(new HashMap());
            return;
        }
        n();
        this.f16570q = Long.valueOf(j10);
        this.f16575v = result;
        if (num != null) {
            try {
                i10 = num.intValue();
            } catch (RuntimeException e10) {
                this.f16575v = null;
                this.f16570q = null;
                throw e10;
            }
        } else {
            i10 = this.I.h();
        }
        if (this.f16561h.booleanValue()) {
            this.I.G0(this.K);
            this.I.A0();
            this.f16561h = Boolean.FALSE;
            this.I.H0(true);
            C();
        }
        this.I.c(i10, j10);
    }

    public void x(int i10) {
        if (i10 == 2) {
            K0();
            c cVar = this.f16566m;
            c cVar2 = c.buffering;
            if (!(cVar == cVar2 || cVar == c.loading)) {
                this.f16566m = cVar2;
                C();
            }
            H0();
        } else if (i10 == 3) {
            if (this.I.t0()) {
                J0();
            }
            this.f16566m = c.ready;
            C();
            if (this.f16573t != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("duration", k0() == -9223372036854775807L ? null : Long.valueOf(k0() * 1000));
                this.f16573t.success(hashMap);
                this.f16573t = null;
                g4.d dVar = this.A;
                if (dVar != null) {
                    this.I.F0(dVar, false);
                    this.A = null;
                }
            }
            if (this.f16575v != null) {
                K();
            }
        } else if (i10 == 4) {
            c cVar3 = this.f16566m;
            c cVar4 = c.completed;
            if (cVar3 != cVar4) {
                J0();
                this.f16566m = cVar4;
                C();
            }
            if (this.f16573t != null) {
                this.f16573t.success(new HashMap());
                this.f16573t = null;
                g4.d dVar2 = this.A;
                if (dVar2 != null) {
                    this.I.F0(dVar2, false);
                    this.A = null;
                }
            }
            MethodChannel.Result result = this.f16574u;
            if (result != null) {
                result.success(new HashMap());
                this.f16574u = null;
            }
        }
    }
}
