package com.ryanheise.audioservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.d;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.Constants;
import com.ryanheise.audioservice.AudioService;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.FlutterMain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AudioServicePlugin */
public class a implements FlutterPlugin, ActivityAware {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static PluginRegistry.PluginRegistrantCallback f14113l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static Set<c> f14114m = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static c f14115n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static b f14116o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static FlutterEngine f14117p;

    /* renamed from: q  reason: collision with root package name */
    private static int f14118q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static List<String> f14119r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private static Map<String, Integer> f14120s = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static volatile MethodChannel.Result f14121t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static volatile MethodChannel.Result f14122u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static volatile MethodChannel.Result f14123v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static String f14124w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static long f14125x = (System.currentTimeMillis() - SystemClock.elapsedRealtime());

    /* renamed from: h  reason: collision with root package name */
    private FlutterPlugin.FlutterPluginBinding f14126h;

    /* renamed from: i  reason: collision with root package name */
    private ActivityPluginBinding f14127i;

    /* renamed from: j  reason: collision with root package name */
    private PluginRegistry.NewIntentListener f14128j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public c f14129k;

    /* renamed from: com.ryanheise.audioservice.a$a  reason: collision with other inner class name */
    /* compiled from: AudioServicePlugin */
    class C0242a implements PluginRegistry.NewIntentListener {
        C0242a() {
        }

        public boolean onNewIntent(Intent intent) {
            a.this.f14129k.f14140i.setIntent(intent);
            return true;
        }
    }

    /* compiled from: AudioServicePlugin */
    private static class b implements MethodChannel.MethodCallHandler, AudioService.d {

        /* renamed from: h  reason: collision with root package name */
        private long f14131h;

        /* renamed from: i  reason: collision with root package name */
        private String f14132i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f14133j;

        /* renamed from: k  reason: collision with root package name */
        public MethodChannel f14134k;

        /* renamed from: l  reason: collision with root package name */
        private AudioTrack f14135l;

        /* renamed from: m  reason: collision with root package name */
        private byte[] f14136m;

        /* renamed from: com.ryanheise.audioservice.a$b$a  reason: collision with other inner class name */
        /* compiled from: AudioServicePlugin */
        class C0243a implements MethodChannel.Result {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.m f14137a;

            C0243a(d.m mVar) {
                this.f14137a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f14137a.f(new Bundle());
            }

            public void notImplemented() {
                this.f14137a.f(new Bundle());
            }

            public void success(Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Map map : (List) obj) {
                    arrayList.add(new MediaBrowserCompat.MediaItem(a.C(map).f(), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1));
                }
                this.f14137a.g(arrayList);
            }
        }

        public b(long j10, String str, boolean z10) {
            this.f14131h = j10;
            this.f14132i = str;
            this.f14133j = z10;
        }

        private void u() {
            AudioService.f14101y.X();
            AudioTrack audioTrack = this.f14135l;
            if (audioTrack != null) {
                audioTrack.release();
            }
            if (!(a.f14115n == null || a.f14115n.f14140i == null)) {
                a.f14115n.f14140i.setIntent(new Intent("android.intent.action.MAIN"));
            }
            AudioService.f14101y.W(new ArrayList(), 0, new int[0], s7.a.none, false, 0, 0, 0.0f, 0, 0, 0);
            for (c g10 : a.f14114m) {
                g10.g("onStopped", new Object[0]);
            }
            a.f14117p.destroy();
            FlutterEngine unused = a.f14117p = null;
            b unused2 = a.f14116o = null;
        }

        public void a(int i10) {
            y("onSetRepeatMode", Integer.valueOf(i10));
        }

        public void b(int i10) {
            y("onSetShuffleMode", Integer.valueOf(i10));
        }

        public void c(String str) {
            y("onPlayFromMediaId", str);
        }

        public void d() {
            y("onSkipToNext", new Object[0]);
        }

        public void e() {
            y("onRewind", new Object[0]);
        }

        public void f(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (a.f14116o != null) {
                a.f14116o.f14134k.invokeMethod("onLoadChildren", arrayList, new C0243a(mVar));
            }
            mVar.a();
        }

        public void g() {
            y("onTaskRemoved", new Object[0]);
        }

        public void h(MediaMetadataCompat mediaMetadataCompat) {
            y("onAddQueueItem", a.H(mediaMetadataCompat));
        }

        public void i(long j10) {
            y("onSkipToQueueItem", (String) a.f14119r.get((int) j10));
        }

        public void j(RatingCompat ratingCompat, Bundle bundle) {
            y("onSetRating", a.K(ratingCompat), bundle.getSerializable("extrasMap"));
        }

        public void k() {
            if (a.f14117p == null) {
                w();
            } else {
                y("onPlay", new Object[0]);
            }
        }

        public void l(s7.b bVar) {
            y("onClick", Integer.valueOf(bVar.ordinal()));
        }

        public void m() {
            y("onSkipToPrevious", new Object[0]);
        }

        public void n(MediaMetadataCompat mediaMetadataCompat) {
            y("onRemoveQueueItem", a.H(mediaMetadataCompat));
        }

        public void o() {
            y("onPrepare", new Object[0]);
        }

        public void onClose() {
            y("onClose", new Object[0]);
        }

        public void onDestroy() {
            u();
        }

        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            int[] iArr;
            MethodCall methodCall2 = methodCall;
            MethodChannel.Result result2 = result;
            AudioService audioService = AudioService.f14101y;
            String str = methodCall2.method;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1897185151:
                    if (str.equals("started")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1884319283:
                    if (str.equals("stopped")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -615448875:
                    if (str.equals("setMediaItem")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -3300612:
                    if (str.equals("androidForceEnableMediaButtons")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 108386723:
                    if (str.equals("ready")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1402657231:
                    if (str.equals("setQueue")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1404470607:
                    if (str.equals("setState")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1742026028:
                    if (str.equals("notifyChildrenChanged")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a.P(true);
                    if (a.f14124w != null) {
                        AudioService.f14101y.d(a.f14124w);
                    }
                    result2.success(Boolean.TRUE);
                    return;
                case 1:
                    u();
                    result2.success(Boolean.TRUE);
                    a.Q(true);
                    return;
                case 2:
                    AudioService.f14101y.U(a.C((Map) methodCall2.arguments));
                    result2.success(Boolean.TRUE);
                    return;
                case 3:
                    if (this.f14135l == null) {
                        this.f14136m = new byte[2048];
                        AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, this.f14136m.length, 0);
                        this.f14135l = audioTrack;
                        byte[] bArr = this.f14136m;
                        audioTrack.write(bArr, 0, bArr.length);
                    }
                    this.f14135l.reloadStaticData();
                    this.f14135l.play();
                    result2.success(Boolean.TRUE);
                    return;
                case 4:
                    HashMap hashMap = new HashMap();
                    hashMap.put("fastForwardInterval", Long.valueOf(a.f14115n.f14143l));
                    hashMap.put("rewindInterval", Long.valueOf(a.f14115n.f14144m));
                    hashMap.put(NativeProtocol.WEB_DIALOG_PARAMS, a.f14115n.f14145n);
                    result2.success(hashMap);
                    return;
                case 5:
                    AudioService.f14101y.V(a.L((List) methodCall2.arguments));
                    result2.success(Boolean.TRUE);
                    return;
                case 6:
                    List list = (List) methodCall2.arguments;
                    List<Map> list2 = (List) list.get(0);
                    List<Integer> list3 = (List) list.get(1);
                    s7.a aVar = s7.a.values()[((Integer) list.get(2)).intValue()];
                    boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
                    long longValue = a.F(list.get(4)).longValue();
                    long longValue2 = a.F(list.get(5)).longValue();
                    float doubleValue = (float) ((Double) list.get(6)).doubleValue();
                    long currentTimeMillis = list.get(7) == null ? System.currentTimeMillis() : a.F(list.get(7)).longValue();
                    List list4 = (List) list.get(8);
                    int intValue = ((Integer) list.get(9)).intValue();
                    int intValue2 = ((Integer) list.get(10)).intValue();
                    long y10 = currentTimeMillis - a.f14125x;
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    for (Map map : list2) {
                        int intValue3 = 1 << ((Integer) map.get(NativeProtocol.WEB_DIALOG_ACTION)).intValue();
                        i10 |= intValue3;
                        arrayList.add(AudioService.f14101y.v((String) map.get("androidIcon"), (String) map.get(Constants.ScionAnalytics.PARAM_LABEL), (long) intValue3));
                    }
                    for (Integer intValue4 : list3) {
                        i10 |= 1 << intValue4.intValue();
                    }
                    if (list4 != null) {
                        int min = Math.min(3, list4.size());
                        int[] iArr2 = new int[min];
                        for (int i11 = 0; i11 < min; i11++) {
                            iArr2[i11] = ((Integer) list4.get(i11)).intValue();
                        }
                        iArr = iArr2;
                    } else {
                        iArr = null;
                    }
                    AudioService.f14101y.W(arrayList, i10, iArr, aVar, booleanValue, longValue, longValue2, doubleValue, y10, intValue, intValue2);
                    result2.success(Boolean.TRUE);
                    return;
                case 7:
                    AudioService.f14101y.d((String) methodCall2.arguments);
                    result2.success(Boolean.TRUE);
                    return;
                default:
                    return;
            }
        }

        public void onPause() {
            y("onPause", new Object[0]);
        }

        public void onStop() {
            y("onStop", new Object[0]);
        }

        public void p(RatingCompat ratingCompat) {
            y("onSetRating", a.K(ratingCompat), null);
        }

        public void q(MediaMetadataCompat mediaMetadataCompat, int i10) {
            y("onAddQueueItemAt", a.H(mediaMetadataCompat), Integer.valueOf(i10));
        }

        public void r(String str) {
            y("onPrepareFromMediaId", str);
        }

        public void s() {
            y("onFastForward", new Object[0]);
        }

        public void t(long j10) {
            y("onSeekTo", Long.valueOf(j10));
        }

        public void v(BinaryMessenger binaryMessenger) {
            if (this.f14134k == null) {
                MethodChannel methodChannel = new MethodChannel(binaryMessenger, "ryanheise.com/audioServiceBackground");
                this.f14134k = methodChannel;
                methodChannel.setMethodCallHandler(this);
            }
        }

        public void w() {
            AudioService audioService = AudioService.f14101y;
            FlutterEngine unused = a.f14117p = new FlutterEngine(audioService.getApplicationContext());
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f14131h);
            if (lookupCallbackInformation == null || this.f14132i == null) {
                a.P(false);
                return;
            }
            if (this.f14133j) {
                AudioService.f14101y.C();
            }
            if (a.f14113l != null) {
                a.f14113l.registerWith(new ShimPluginRegistry(a.f14117p));
            }
            DartExecutor dartExecutor = a.f14117p.getDartExecutor();
            v(dartExecutor);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(audioService.getAssets(), this.f14132i, lookupCallbackInformation));
        }

        public void x(MethodChannel.Result result, String str, Object... objArr) {
            this.f14134k.invokeMethod(str, new ArrayList(Arrays.asList(objArr)), result);
        }

        public void y(String str, Object... objArr) {
            this.f14134k.invokeMethod(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    /* compiled from: AudioServicePlugin */
    private static class c implements MethodChannel.MethodCallHandler {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Context f14139h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public Activity f14140i;

        /* renamed from: j  reason: collision with root package name */
        private MethodChannel f14141j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f14142k;

        /* renamed from: l  reason: collision with root package name */
        public long f14143l;

        /* renamed from: m  reason: collision with root package name */
        public long f14144m;

        /* renamed from: n  reason: collision with root package name */
        public Map<String, Object> f14145n;

        /* renamed from: o  reason: collision with root package name */
        public MediaBrowserCompat f14146o;

        /* renamed from: p  reason: collision with root package name */
        public MediaControllerCompat f14147p;

        /* renamed from: q  reason: collision with root package name */
        public MediaControllerCompat.a f14148q = new C0244a();

        /* renamed from: r  reason: collision with root package name */
        private final MediaBrowserCompat.l f14149r = new b();

        /* renamed from: s  reason: collision with root package name */
        private final MediaBrowserCompat.c f14150s = new C0245c();

        /* renamed from: com.ryanheise.audioservice.a$c$a  reason: collision with other inner class name */
        /* compiled from: AudioServicePlugin */
        class C0244a extends MediaControllerCompat.a {
            C0244a() {
            }

            public void d(MediaMetadataCompat mediaMetadataCompat) {
                c.this.g("onMediaChanged", a.H(mediaMetadataCompat));
            }

            public void e(PlaybackStateCompat playbackStateCompat) {
                long y10 = a.f14125x + playbackStateCompat.e();
                c.this.g("onPlaybackStateChanged", Integer.valueOf(AudioService.J().ordinal()), Boolean.valueOf(AudioService.Q()), Long.valueOf(playbackStateCompat.c()), Long.valueOf(playbackStateCompat.h()), Long.valueOf(playbackStateCompat.d()), Float.valueOf(playbackStateCompat.f()), Long.valueOf(y10), Integer.valueOf(AudioService.K()), Integer.valueOf(AudioService.M()));
            }

            public void f(List<MediaSessionCompat.QueueItem> list) {
                c.this.g("onQueueChanged", a.J(list));
            }
        }

        /* compiled from: AudioServicePlugin */
        class b extends MediaBrowserCompat.l {
            b() {
            }

            public void a(String str, List<MediaBrowserCompat.MediaItem> list) {
                c.this.g("onChildrenLoaded", a.G(list));
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$c  reason: collision with other inner class name */
        /* compiled from: AudioServicePlugin */
        class C0245c extends MediaBrowserCompat.c {
            C0245c() {
            }

            public void a() {
                try {
                    if (c.this.f14139h != null) {
                        MediaSessionCompat.Token c10 = c.this.f14146o.c();
                        c cVar = c.this;
                        cVar.f14147p = new MediaControllerCompat(cVar.f14139h, c10);
                        if (c.this.f14140i != null) {
                            MediaControllerCompat.i(c.this.f14140i, c.this.f14147p);
                        }
                        c cVar2 = c.this;
                        cVar2.f14147p.g(cVar2.f14148q);
                        c.this.f14148q.e(c.this.f14147p.c());
                        MediaMetadataCompat b10 = c.this.f14147p.b();
                        c cVar3 = c.this;
                        cVar3.f14148q.f(cVar3.f14147p.d());
                        c.this.f14148q.d(b10);
                        synchronized (this) {
                            if (c.this.f14142k) {
                                a.f14116o.w();
                                boolean unused = c.this.f14142k = false;
                            }
                        }
                        a.O(true);
                        return;
                    }
                    a.O(false);
                } catch (Exception e10) {
                    a.O(false);
                    throw new RuntimeException(e10);
                }
            }

            public void b() {
                a.O(false);
            }

            public void c() {
            }
        }

        public c(BinaryMessenger binaryMessenger) {
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "ryanheise.com/audioService");
            this.f14141j = methodChannel;
            methodChannel.setMethodCallHandler(this);
        }

        /* access modifiers changed from: private */
        public void h(Activity activity) {
            this.f14140i = activity;
        }

        /* access modifiers changed from: private */
        public void i(Context context) {
            this.f14139h = context;
        }

        public void g(String str, Object... objArr) {
            this.f14141j.invokeMethod(str, new ArrayList(Arrays.asList(objArr)));
        }

        /* access modifiers changed from: protected */
        public boolean j() {
            return (this.f14140i.getIntent().getFlags() & 1048576) == 1048576;
        }

        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            long j10;
            s7.c cVar;
            MethodCall methodCall2 = methodCall;
            MethodChannel.Result result2 = result;
            try {
                String str = methodCall2.method;
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1987605894:
                        if (str.equals("setShuffleMode")) {
                            c10 = 25;
                            break;
                        }
                        break;
                    case -1877679069:
                        if (str.equals("addQueueItem")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -1660702351:
                        if (str.equals("skipToPrevious")) {
                            c10 = 21;
                            break;
                        }
                        break;
                    case -1383039602:
                        if (str.equals("prepareFromMediaId")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case -949320114:
                        if (str.equals("updateMediaItem")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case -934318917:
                        if (str.equals("rewind")) {
                            c10 = 23;
                            break;
                        }
                        break;
                    case -906224877:
                        if (str.equals("seekTo")) {
                            c10 = 19;
                            break;
                        }
                        break;
                    case -896175415:
                        if (str.equals("fastForward")) {
                            c10 = 22;
                            break;
                        }
                        break;
                    case -849612662:
                        if (str.equals("skipToQueueItem")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case -586349112:
                        if (str.equals("updateQueue")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case -563318858:
                        if (str.equals("addQueueItemAt")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -318370553:
                        if (str.equals("prepare")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case -300227454:
                        if (str.equals("setBrowseMediaParent")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3443508:
                        if (str.equals("play")) {
                            c10 = 13;
                            break;
                        }
                        break;
                    case 3540994:
                        if (str.equals("stop")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case 94750088:
                        if (str.equals("click")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 189124205:
                        if (str.equals("skipToNext")) {
                            c10 = 20;
                            break;
                        }
                        break;
                    case 250676859:
                        if (str.equals("seekBackward")) {
                            c10 = 29;
                            break;
                        }
                        break;
                    case 371823520:
                        if (str.equals("removeQueueItem")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 530405532:
                        if (str.equals("disconnect")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 543295647:
                        if (str.equals("setRating")) {
                            c10 = 26;
                            break;
                        }
                        break;
                    case 951351530:
                        if (str.equals("connect")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 971005237:
                        if (str.equals("isRunning")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 994136385:
                        if (str.equals("playFromMediaId")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 1404354821:
                        if (str.equals("setSpeed")) {
                            c10 = 27;
                            break;
                        }
                        break;
                    case 1635752928:
                        if (str.equals("setRepeatMode")) {
                            c10 = 24;
                            break;
                        }
                        break;
                    case 1756341549:
                        if (str.equals("seekForward")) {
                            c10 = 28;
                            break;
                        }
                        break;
                    case 1889844291:
                        if (str.equals("playMediaItem")) {
                            c10 = 15;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        result2.success(Boolean.valueOf(AudioService.R()));
                        return;
                    case 1:
                        if (a.f14122u != null) {
                            a.P(false);
                            return;
                        }
                        MethodChannel.Result unused = a.f14122u = result;
                        if (!AudioService.R()) {
                            if (a.f14116o == null) {
                                if (this.f14140i == null) {
                                    System.out.println("AudioService can only be started from an activity");
                                    a.P(false);
                                    return;
                                }
                                Map map = (Map) methodCall2.arguments;
                                long longValue = a.F(map.get("callbackHandle")).longValue();
                                this.f14145n = (Map) map.get(NativeProtocol.WEB_DIALOG_PARAMS);
                                boolean booleanValue = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                                boolean booleanValue2 = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                                boolean booleanValue3 = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                                String str2 = (String) map.get("androidNotificationChannelName");
                                String str3 = (String) map.get("androidNotificationChannelDescription");
                                Integer E = map.get("androidNotificationColor") == null ? null : a.E(map.get("androidNotificationColor"));
                                String str4 = (String) map.get("androidNotificationIcon");
                                boolean booleanValue4 = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                                boolean booleanValue5 = ((Boolean) map.get("androidEnableQueue")).booleanValue();
                                boolean booleanValue6 = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                                Map map2 = (Map) map.get("androidArtDownscaleSize");
                                if (map2 == null) {
                                    cVar = null;
                                    j10 = longValue;
                                } else {
                                    j10 = longValue;
                                    cVar = new s7.c((int) Math.round(((Double) map2.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)).doubleValue()), (int) Math.round(((Double) map2.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)).doubleValue()));
                                }
                                this.f14143l = a.F(map.get("fastForwardInterval")).longValue();
                                this.f14144m = a.F(map.get("rewindInterval")).longValue();
                                b unused2 = a.f14116o = new b(j10, FlutterMain.findAppBundlePath(this.f14139h.getApplicationContext()), booleanValue5);
                                AudioService.O(this.f14140i, booleanValue3, str2, str3, "com.ryanheise.audioservice.NOTIFICATION_CLICK", E, str4, booleanValue4, booleanValue, booleanValue2, booleanValue6, cVar, a.f14116o);
                                synchronized (this.f14150s) {
                                    if (this.f14147p != null) {
                                        a.f14116o.w();
                                    } else {
                                        this.f14142k = true;
                                    }
                                }
                                return;
                            }
                        }
                        a.P(false);
                        return;
                    case 2:
                        if (a.f14121t != null) {
                            result2.success(Boolean.FALSE);
                            return;
                        }
                        if (this.f14140i != null) {
                            if (j()) {
                                this.f14140i.setIntent(new Intent("android.intent.action.MAIN"));
                            }
                            if (this.f14140i.getIntent().getAction() != null) {
                                g("notificationClicked", Boolean.valueOf(this.f14140i.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK")));
                            }
                        }
                        if (this.f14146o == null) {
                            MethodChannel.Result unused3 = a.f14121t = result;
                            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f14139h, new ComponentName(this.f14139h, AudioService.class), this.f14150s, (Bundle) null);
                            this.f14146o = mediaBrowserCompat;
                            mediaBrowserCompat.a();
                            return;
                        }
                        result2.success(Boolean.TRUE);
                        return;
                    case 3:
                        this.f14140i.setIntent(new Intent("android.intent.action.MAIN"));
                        MediaControllerCompat mediaControllerCompat = this.f14147p;
                        if (mediaControllerCompat != null) {
                            mediaControllerCompat.j(this.f14148q);
                            this.f14147p = null;
                        }
                        if (a.f14124w != null) {
                            this.f14146o.e(a.f14124w);
                            String unused4 = a.f14124w = null;
                        }
                        MediaBrowserCompat mediaBrowserCompat2 = this.f14146o;
                        if (mediaBrowserCompat2 != null) {
                            mediaBrowserCompat2.b();
                            this.f14146o = null;
                        }
                        result2.success(Boolean.TRUE);
                        return;
                    case 4:
                        String str5 = (String) methodCall2.arguments;
                        if (a.f14124w != null && !a.f14124w.equals(str5)) {
                            this.f14146o.e(a.f14124w);
                            String unused5 = a.f14124w = null;
                        }
                        if (a.f14124w == null && str5 != null) {
                            String unused6 = a.f14124w = str5;
                            this.f14146o.d(str5, this.f14149r);
                        }
                        if (a.f14124w == null) {
                            this.f14149r.a(a.f14124w, new ArrayList());
                        }
                        result2.success(Boolean.TRUE);
                        return;
                    case 5:
                        MediaMetadataCompat unused7 = a.C((Map) methodCall2.arguments);
                        a.B().x(result2, "onAddQueueItem", methodCall2.arguments);
                        return;
                    case 6:
                        List list = (List) methodCall2.arguments;
                        Map map3 = (Map) list.get(0);
                        int intValue = ((Integer) list.get(1)).intValue();
                        MediaMetadataCompat unused8 = a.C(map3);
                        a.B().x(result2, "onAddQueueItemAt", map3, Integer.valueOf(intValue));
                        return;
                    case 7:
                        MediaMetadataCompat unused9 = a.C((Map) methodCall2.arguments);
                        a.B().x(result2, "onRemoveQueueItem", methodCall2.arguments);
                        return;
                    case 8:
                        a.B().x(result2, "onUpdateQueue", methodCall2.arguments);
                        return;
                    case 9:
                        try {
                            AudioService.f14101y.U(a.C((Map) methodCall2.arguments));
                        } catch (Exception e10) {
                            e10.getMessage();
                        }
                        a.B().x(result2, "onUpdateMediaItem", methodCall2.arguments);
                        return;
                    case 10:
                        a.B().x(result2, "onClick", Integer.valueOf(((Integer) methodCall2.arguments).intValue()));
                        return;
                    case 11:
                        a.B().x(result2, "onPrepare", new Object[0]);
                        return;
                    case 12:
                        a.B().x(result2, "onPrepareFromMediaId", (String) methodCall2.arguments);
                        return;
                    case 13:
                        a.B().x(result2, "onPlay", new Object[0]);
                        return;
                    case 14:
                        a.B().x(result2, "onPlayFromMediaId", (String) methodCall2.arguments);
                        return;
                    case 15:
                        MediaMetadataCompat unused10 = a.C((Map) methodCall2.arguments);
                        a.B().x(result2, "onPlayMediaItem", methodCall2.arguments);
                        return;
                    case 16:
                        a.B().x(result2, "onSkipToQueueItem", (String) methodCall2.arguments);
                        return;
                    case 17:
                        a.B().x(result2, "onPause", new Object[0]);
                        return;
                    case 18:
                        if (a.f14123v != null) {
                            result2.success(Boolean.FALSE);
                            return;
                        } else if (a.f14116o == null) {
                            result2.success(Boolean.FALSE);
                            return;
                        } else {
                            MethodChannel.Result unused11 = a.f14123v = result;
                            a.f14116o.y("onStop", new Object[0]);
                            return;
                        }
                    case 19:
                        a.B().x(result2, "onSeekTo", Integer.valueOf(((Integer) methodCall2.arguments).intValue()));
                        return;
                    case 20:
                        a.B().x(result2, "onSkipToNext", new Object[0]);
                        return;
                    case 21:
                        a.B().x(result2, "onSkipToPrevious", new Object[0]);
                        return;
                    case 22:
                        a.B().x(result2, "onFastForward", new Object[0]);
                        return;
                    case 23:
                        a.B().x(result2, "onRewind", new Object[0]);
                        return;
                    case 24:
                        a.B().x(result2, "onSetRepeatMode", Integer.valueOf(((Integer) methodCall2.arguments).intValue()));
                        return;
                    case 25:
                        a.B().x(result2, "onSetShuffleMode", Integer.valueOf(((Integer) methodCall2.arguments).intValue()));
                        return;
                    case 26:
                        HashMap hashMap = (HashMap) methodCall2.arguments;
                        a.B().x(result2, "onSetRating", hashMap.get("rating"), hashMap.get(AppLinks.KEY_NAME_EXTRAS));
                        return;
                    case 27:
                        a.B().x(result2, "onSetSpeed", Float.valueOf((float) ((Double) methodCall2.arguments).doubleValue()));
                        return;
                    case 28:
                        a.B().x(result2, "onSeekForward", Boolean.valueOf(((Boolean) methodCall2.arguments).booleanValue()));
                        return;
                    case 29:
                        a.B().x(result2, "onSeekBackward", Boolean.valueOf(((Boolean) methodCall2.arguments).booleanValue()));
                        return;
                    default:
                        a.B().f14134k.invokeMethod(methodCall2.method, methodCall2.arguments, result2);
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                result2.error(e11.getMessage(), (String) null, (Object) null);
            }
            e11.printStackTrace();
            result2.error(e11.getMessage(), (String) null, (Object) null);
        }
    }

    static b B() {
        b bVar = f14116o;
        if (bVar != null) {
            return bVar;
        }
        throw new Exception("Background audio task not running");
    }

    /* access modifiers changed from: private */
    public static MediaMetadataCompat C(Map<?, ?> map) {
        return AudioService.B((String) map.get("id"), (String) map.get("album"), (String) map.get(ShareConstants.WEB_DIALOG_PARAM_TITLE), (String) map.get("artist"), (String) map.get("genre"), F(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), M((Map) map.get("rating")), (Map) map.get(AppLinks.KEY_NAME_EXTRAS));
    }

    private static synchronized int D(String str) {
        int i10;
        synchronized (a.class) {
            f14119r.add(str);
            f14120s.put(str, Integer.valueOf(f14118q));
            i10 = f14118q;
            f14118q = i10 + 1;
        }
        return i10;
    }

    public static Integer E(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : new Integer((int) ((Long) obj).longValue());
    }

    public static Long F(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : new Long((long) ((Integer) obj).intValue());
    }

    /* access modifiers changed from: private */
    public static List<Map<?, ?>> G(List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaBrowserCompat.MediaItem d10 : list) {
            arrayList.add(H(AudioService.G(d10.d().g())));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static Map<?, ?> H(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat f10 = mediaMetadataCompat.f();
        HashMap hashMap = new HashMap();
        hashMap.put("id", f10.g());
        hashMap.put("album", I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        hashMap.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        if (f10.e() != null) {
            hashMap.put("artUri", f10.e().toString());
        }
        hashMap.put("artist", I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.b("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.g("android.media.metadata.DURATION")));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.g("playable_long") != 0));
        hashMap.put("displayTitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.b("android.media.metadata.RATING")) {
            hashMap.put("rating", K(mediaMetadataCompat.i("android.media.metadata.RATING")));
        }
        HashMap hashMap2 = new HashMap();
        for (String next : mediaMetadataCompat.l()) {
            if (next.startsWith("extra_long_")) {
                hashMap2.put(next.substring(11), Long.valueOf(mediaMetadataCompat.g(next)));
            } else if (next.startsWith("extra_string_")) {
                hashMap2.put(next.substring(13), mediaMetadataCompat.j(next));
            } else if (next.startsWith("extra_boolean_")) {
                hashMap2.put(next.substring(14), Boolean.valueOf(mediaMetadataCompat.g(next) != 0));
            } else if (next.startsWith("extra_double_")) {
                hashMap2.put(next.substring(13), new Double(mediaMetadataCompat.j(next)));
            }
        }
        if (hashMap2.size() > 0) {
            hashMap.put(AppLinks.KEY_NAME_EXTRAS, hashMap2);
        }
        return hashMap;
    }

    private static String I(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence k10 = mediaMetadataCompat.k(str);
        if (k10 == null || k10.length() <= 0) {
            return null;
        }
        return k10.toString();
    }

    /* access modifiers changed from: private */
    public static List<Map<?, ?>> J(List<MediaSessionCompat.QueueItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaSessionCompat.QueueItem d10 : list) {
            arrayList.add(H(AudioService.G(d10.d().g())));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static HashMap<String, Object> K(RatingCompat ratingCompat) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(ShareConstants.MEDIA_TYPE, Integer.valueOf(ratingCompat.e()));
        if (ratingCompat.h()) {
            switch (ratingCompat.e()) {
                case 0:
                    hashMap.put("value", (Object) null);
                    break;
                case 1:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.g()));
                    break;
                case 2:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.i()));
                    break;
                case 3:
                case 4:
                case 5:
                    hashMap.put("value", Float.valueOf(ratingCompat.f()));
                    break;
                case 6:
                    hashMap.put("value", Float.valueOf(ratingCompat.c()));
                    break;
            }
        } else {
            hashMap.put("value", (Object) null);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static List<MediaSessionCompat.QueueItem> L(List<Map<?, ?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<?, ?> C : list) {
            MediaDescriptionCompat f10 = C(C).f();
            arrayList.add(new MediaSessionCompat.QueueItem(f10, (long) D(f10.g())));
        }
        return arrayList;
    }

    private static RatingCompat M(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get(ShareConstants.MEDIA_TYPE);
        Object obj = map.get("value");
        if (obj == null) {
            return RatingCompat.n(num.intValue());
        }
        switch (num.intValue()) {
            case 1:
                return RatingCompat.j(((Boolean) obj).booleanValue());
            case 2:
                return RatingCompat.m(((Boolean) obj).booleanValue());
            case 3:
            case 4:
            case 5:
                return RatingCompat.l(num.intValue(), (float) ((Integer) obj).intValue());
            case 6:
                return RatingCompat.k(((Float) obj).floatValue());
            default:
                return RatingCompat.n(num.intValue());
        }
    }

    private void N() {
        ActivityPluginBinding activityPluginBinding = this.f14127i;
        C0242a aVar = new C0242a();
        this.f14128j = aVar;
        activityPluginBinding.addOnNewIntentListener(aVar);
    }

    /* access modifiers changed from: private */
    public static void O(boolean z10) {
        if (f14121t != null) {
            f14121t.success(Boolean.valueOf(z10));
            f14121t = null;
        }
    }

    /* access modifiers changed from: private */
    public static void P(boolean z10) {
        if (f14122u != null) {
            f14122u.success(Boolean.valueOf(z10));
            f14122u = null;
        }
    }

    /* access modifiers changed from: private */
    public static void Q(boolean z10) {
        if (f14123v != null) {
            f14123v.success(Boolean.valueOf(z10));
            f14123v = null;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f14127i = activityPluginBinding;
        this.f14129k.h(activityPluginBinding.getActivity());
        this.f14129k.i(activityPluginBinding.getActivity());
        f14115n = this.f14129k;
        N();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f14126h = flutterPluginBinding;
        c cVar = new c(flutterPluginBinding.getBinaryMessenger());
        this.f14129k = cVar;
        cVar.i(this.f14126h.getApplicationContext());
        f14114m.add(this.f14129k);
    }

    public void onDetachedFromActivity() {
        this.f14127i.removeOnNewIntentListener(this.f14128j);
        this.f14128j = null;
        this.f14127i = null;
        this.f14129k.h((Activity) null);
        this.f14129k.i(this.f14126h.getApplicationContext());
        if (this.f14129k == f14115n) {
            f14115n = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f14127i.removeOnNewIntentListener(this.f14128j);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        f14114m.remove(this.f14129k);
        this.f14129k.i((Context) null);
        this.f14126h = null;
        this.f14129k = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f14127i = activityPluginBinding;
        this.f14129k.h(activityPluginBinding.getActivity());
        this.f14129k.i(activityPluginBinding.getActivity());
        N();
    }
}
