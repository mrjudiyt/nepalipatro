package r7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: AndroidAudioManager */
public class b implements MethodChannel.MethodCallHandler {

    /* renamed from: j  reason: collision with root package name */
    private static a f16378j;

    /* renamed from: h  reason: collision with root package name */
    private BinaryMessenger f16379h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public MethodChannel f16380i;

    /* compiled from: AndroidAudioManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f16381a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        private List<b> f16382b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private androidx.media.a f16383c;

        /* renamed from: d  reason: collision with root package name */
        private BroadcastReceiver f16384d;

        /* renamed from: e  reason: collision with root package name */
        private BroadcastReceiver f16385e;

        /* renamed from: f  reason: collision with root package name */
        private Context f16386f;

        /* renamed from: g  reason: collision with root package name */
        private AudioManager f16387g;

        /* renamed from: h  reason: collision with root package name */
        private Object f16388h;

        /* renamed from: i  reason: collision with root package name */
        private List<AudioDeviceInfo> f16389i = new ArrayList();

        /* renamed from: r7.b$a$a  reason: collision with other inner class name */
        /* compiled from: AndroidAudioManager */
        class C0272a extends AudioDeviceCallback {
            C0272a() {
            }

            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesAdded", a.f0(audioDeviceInfoArr));
            }

            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesRemoved", a.f0(audioDeviceInfoArr));
            }
        }

        /* renamed from: r7.b$a$b  reason: collision with other inner class name */
        /* compiled from: AndroidAudioManager */
        class C0273b extends BroadcastReceiver {
            C0273b() {
            }

            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    a.this.v0("onBecomingNoisy", new Object[0]);
                }
            }
        }

        /* compiled from: AndroidAudioManager */
        class c extends BroadcastReceiver {
            c() {
            }

            public void onReceive(Context context, Intent intent) {
                a.this.v0("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
            }
        }

        public a(Context context) {
            this.f16386f = context;
            this.f16387g = (AudioManager) context.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                u0();
            }
        }

        /* access modifiers changed from: private */
        public Object A0() {
            return Boolean.valueOf(this.f16387g.isMicrophoneMute());
        }

        /* access modifiers changed from: private */
        public Object B0() {
            return Boolean.valueOf(this.f16387g.isMusicActive());
        }

        /* access modifiers changed from: private */
        public Object C0() {
            return Boolean.valueOf(this.f16387g.isSpeakerphoneOn());
        }

        /* access modifiers changed from: private */
        public Object D0(int i10) {
            b.g(23);
            return Boolean.valueOf(this.f16387g.isStreamMute(i10));
        }

        /* access modifiers changed from: private */
        public Object E0() {
            b.g(21);
            return Boolean.valueOf(this.f16387g.isVolumeFixed());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void F0(int i10) {
            if (i10 == -1) {
                b();
            }
            v0("onAudioFocusChanged", Integer.valueOf(i10));
        }

        /* access modifiers changed from: private */
        public Object G0() {
            this.f16387g.loadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        public Object H0(int i10, Double d10) {
            if (d10 != null) {
                this.f16387g.playSoundEffect(i10, (float) d10.doubleValue());
                return null;
            }
            this.f16387g.playSoundEffect(i10);
            return null;
        }

        private void I0() {
            if (this.f16384d == null) {
                C0273b bVar = new C0273b();
                this.f16384d = bVar;
                this.f16386f.registerReceiver(bVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
        }

        private void J0() {
            if (this.f16385e == null) {
                c cVar = new c();
                this.f16385e = cVar;
                this.f16386f.registerReceiver(cVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }

        /* access modifiers changed from: private */
        public boolean L0(List<?> list) {
            boolean z10 = true;
            if (this.f16383c != null) {
                return true;
            }
            Map map = (Map) list.get(0);
            a.b bVar = new a.b(((Integer) map.get("gainType")).intValue());
            bVar.e(new a(this));
            if (map.get("audioAttributes") != null) {
                bVar.c(a0((Map) map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                bVar.g(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
            }
            androidx.media.a a10 = bVar.a();
            this.f16383c = a10;
            if (androidx.media.b.b(this.f16387g, a10) != 1) {
                z10 = false;
            }
            if (z10) {
                I0();
                J0();
            }
            return z10;
        }

        /* access modifiers changed from: private */
        public Object M0(int i10) {
            b.g(29);
            this.f16387g.setAllowedCapturePolicy(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object N0(boolean z10) {
            this.f16387g.setBluetoothScoOn(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public boolean O0(Integer num) {
            b.g(31);
            for (AudioDeviceInfo next : this.f16389i) {
                if (next.getId() == num.intValue()) {
                    return this.f16387g.setCommunicationDevice(next);
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public Object P0(boolean z10) {
            this.f16387g.setMicrophoneMute(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object Q0(int i10) {
            this.f16387g.setMode(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object R0(String str) {
            this.f16387g.setParameters(str);
            return null;
        }

        /* access modifiers changed from: private */
        public Object S0(int i10) {
            this.f16387g.setRingerMode(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object T0(boolean z10) {
            this.f16387g.setSpeakerphoneOn(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object U0(int i10, int i11, int i12) {
            this.f16387g.setStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object V0() {
            this.f16387g.startBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        public Object W(int i10, int i11, int i12) {
            this.f16387g.adjustStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object W0() {
            this.f16387g.stopBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        public Object X(int i10, int i11, int i12) {
            this.f16387g.adjustSuggestedStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object X0() {
            this.f16387g.unloadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        public Object Y(int i10, int i11) {
            this.f16387g.adjustVolume(i10, i11);
            return null;
        }

        private void Y0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f16384d;
            if (broadcastReceiver != null && (context = this.f16386f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f16384d = null;
            }
        }

        /* access modifiers changed from: private */
        public Object Z() {
            b.g(31);
            this.f16387g.clearCommunicationDevice();
            return null;
        }

        private void Z0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f16385e;
            if (broadcastReceiver != null && (context = this.f16386f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f16385e = null;
            }
        }

        private AudioAttributesCompat a0(Map<?, ?> map) {
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            if (map.get("contentType") != null) {
                aVar.b(((Integer) map.get("contentType")).intValue());
            }
            if (map.get("flags") != null) {
                aVar.c(((Integer) map.get("flags")).intValue());
            }
            if (map.get("usage") != null) {
                aVar.e(((Integer) map.get("usage")).intValue());
            }
            return aVar.a();
        }

        /* access modifiers changed from: private */
        public boolean b() {
            if (this.f16386f == null) {
                return false;
            }
            Y0();
            Z0();
            androidx.media.a aVar = this.f16383c;
            if (aVar == null) {
                return true;
            }
            int a10 = androidx.media.b.a(this.f16387g, aVar);
            this.f16383c = null;
            if (a10 == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public Object b0(Map<?, ?> map) {
            b.g(19);
            this.f16387g.dispatchMediaKeyEvent(new KeyEvent(b.d(map.get("downTime")).longValue(), b.d(map.get("eventTime")).longValue(), ((Integer) map.get(NativeProtocol.WEB_DIALOG_ACTION)).intValue(), ((Integer) map.get("code")).intValue(), ((Integer) map.get("repeat")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scancode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
            return null;
        }

        private void d0() {
            this.f16387g.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f16388h);
        }

        private static Map<String, Object> e0(AudioDeviceInfo audioDeviceInfo) {
            return b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), IntegrityManager.INTEGRITY_TYPE_ADDRESS, audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), ShareConstants.MEDIA_TYPE, Integer.valueOf(audioDeviceInfo.getType()));
        }

        /* access modifiers changed from: private */
        public static List<?> f0(AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e02 : audioDeviceInfoArr) {
                arrayList.add(e0(e02));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object g0() {
            b.g(21);
            return Integer.valueOf(this.f16387g.generateAudioSessionId());
        }

        /* access modifiers changed from: private */
        public Object h0() {
            b.g(29);
            return Integer.valueOf(this.f16387g.getAllowedCapturePolicy());
        }

        /* access modifiers changed from: private */
        public List<Map<String, Object>> i0() {
            b.g(31);
            this.f16389i = this.f16387g.getAvailableCommunicationDevices();
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e02 : this.f16389i) {
                arrayList.add(e0(e02));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Map<String, Object> j0() {
            b.g(31);
            return e0(this.f16387g.getCommunicationDevice());
        }

        /* access modifiers changed from: private */
        public Object k0(int i10) {
            b.g(23);
            ArrayList arrayList = new ArrayList();
            AudioDeviceInfo[] devices = this.f16387g.getDevices(i10);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                String str = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = audioDeviceInfo.getAddress();
                }
                arrayList.add(b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), IntegrityManager.INTEGRITY_TYPE_ADDRESS, str, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", b.e(audioDeviceInfo.getSampleRates()), "channelMasks", b.e(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", b.e(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", b.e(audioDeviceInfo.getChannelCounts()), "encodings", b.e(audioDeviceInfo.getEncodings()), ShareConstants.MEDIA_TYPE, Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object l0() {
            b.g(28);
            ArrayList arrayList = new ArrayList();
            for (MicrophoneInfo next : this.f16387g.getMicrophones()) {
                ArrayList arrayList2 = new ArrayList();
                for (Pair next2 : next.getFrequencyResponse()) {
                    arrayList2.add(new ArrayList(Arrays.asList(new Double[]{Double.valueOf((double) ((Float) next2.first).floatValue()), Double.valueOf((double) ((Float) next2.second).floatValue())})));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Pair next3 : next.getChannelMapping()) {
                    arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{(Integer) next3.first, (Integer) next3.second})));
                }
                arrayList.add(b.f("description", next.getDescription(), "id", Integer.valueOf(next.getId()), ShareConstants.MEDIA_TYPE, Integer.valueOf(next.getType()), IntegrityManager.INTEGRITY_TYPE_ADDRESS, next.getAddress(), FirebaseAnalytics.Param.LOCATION, Integer.valueOf(next.getLocation()), "group", Integer.valueOf(next.getGroup()), "indexInTheGroup", Integer.valueOf(next.getIndexInTheGroup()), "position", b.b(next.getPosition()), "orientation", b.b(next.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(next.getSensitivity()), "maxSpl", Float.valueOf(next.getMaxSpl()), "minSpl", Float.valueOf(next.getMinSpl()), "directionality", Integer.valueOf(next.getDirectionality())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object m0() {
            return Integer.valueOf(this.f16387g.getMode());
        }

        /* access modifiers changed from: private */
        public Object n0(String str) {
            return this.f16387g.getParameters(str);
        }

        /* access modifiers changed from: private */
        public Object o0(String str) {
            b.g(17);
            return this.f16387g.getProperty(str);
        }

        /* access modifiers changed from: private */
        public Object p0() {
            return Integer.valueOf(this.f16387g.getRingerMode());
        }

        /* access modifiers changed from: private */
        public Object q0(int i10) {
            return Integer.valueOf(this.f16387g.getStreamMaxVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object r0(int i10) {
            b.g(28);
            return Integer.valueOf(this.f16387g.getStreamMinVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object s0(int i10) {
            return Integer.valueOf(this.f16387g.getStreamVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object t0(int i10, int i11, int i12) {
            b.g(28);
            return Float.valueOf(this.f16387g.getStreamVolumeDb(i10, i11, i12));
        }

        private void u0() {
            C0272a aVar = new C0272a();
            this.f16388h = aVar;
            this.f16387g.registerAudioDeviceCallback(aVar, this.f16381a);
        }

        /* access modifiers changed from: private */
        public void v0(String str, Object... objArr) {
            for (b a10 : this.f16382b) {
                a10.f16380i.invokeMethod(str, new ArrayList(Arrays.asList(objArr)));
            }
        }

        /* access modifiers changed from: private */
        public Object w0() {
            return Boolean.valueOf(this.f16387g.isBluetoothScoAvailableOffCall());
        }

        /* access modifiers changed from: private */
        public Object x0() {
            return Boolean.valueOf(this.f16387g.isBluetoothScoOn());
        }

        /* access modifiers changed from: private */
        public Object z0() {
            b.g(29);
            return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
        }

        public void K0(b bVar) {
            this.f16382b.remove(bVar);
        }

        public void V(b bVar) {
            this.f16382b.add(bVar);
        }

        public void c0() {
            b();
            if (Build.VERSION.SDK_INT >= 23) {
                d0();
            }
            this.f16386f = null;
            this.f16387g = null;
        }

        public boolean y0() {
            return this.f16382b.size() == 0;
        }
    }

    public b(Context context, BinaryMessenger binaryMessenger) {
        if (f16378j == null) {
            f16378j = new a(context);
        }
        this.f16379h = binaryMessenger;
        this.f16380i = new MethodChannel(binaryMessenger, "com.ryanheise.android_audio_manager");
        f16378j.V(this);
        this.f16380i.setMethodCallHandler(this);
    }

    static ArrayList<Double> b(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf((double) coordinate3F.x));
        arrayList.add(Double.valueOf((double) coordinate3F.y));
        arrayList.add(Double.valueOf((double) coordinate3F.z));
        return arrayList;
    }

    static Long d(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    static ArrayList<Integer> e(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    static Map<String, Object> f(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    static void g(int i10) {
        if (Build.VERSION.SDK_INT < i10) {
            throw new RuntimeException("Requires API level " + i10);
        }
    }

    public void c() {
        this.f16380i.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        f16378j.K0(this);
        if (f16378j.y0()) {
            f16378j.c0();
            f16378j = null;
        }
        this.f16380i = null;
        this.f16379h = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            List list = (List) methodCall.arguments;
            String str = methodCall.method;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c10 = '(';
                        break;
                    }
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c10 = '*';
                        break;
                    }
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c10 = ')';
                        break;
                    }
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c10 = '%';
                        break;
                    }
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c10 = '#';
                        break;
                    }
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c10 = 23;
                        break;
                    }
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c10 = '\"';
                        break;
                    }
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c10 = '\'';
                        break;
                    }
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c10 = '&';
                        break;
                    }
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c10 = '$';
                        break;
                    }
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c10 = '!';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    result.success(Boolean.valueOf(f16378j.L0(list)));
                    return;
                case 1:
                    result.success(Boolean.valueOf(f16378j.b()));
                    return;
                case 2:
                    result.success(f16378j.b0((Map) list.get(0)));
                    return;
                case 3:
                    result.success(f16378j.E0());
                    return;
                case 4:
                    result.success(f16378j.W(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 5:
                    result.success(f16378j.Y(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue()));
                    return;
                case 6:
                    result.success(f16378j.X(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 7:
                    result.success(f16378j.p0());
                    return;
                case 8:
                    result.success(f16378j.q0(((Integer) list.get(0)).intValue()));
                    return;
                case 9:
                    result.success(f16378j.r0(((Integer) list.get(0)).intValue()));
                    return;
                case 10:
                    result.success(f16378j.s0(((Integer) list.get(0)).intValue()));
                    return;
                case 11:
                    result.success(f16378j.t0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 12:
                    result.success(f16378j.S0(((Integer) list.get(0)).intValue()));
                    return;
                case 13:
                    result.success(f16378j.U0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 14:
                    result.success(f16378j.D0(((Integer) list.get(0)).intValue()));
                    return;
                case 15:
                    result.success(f16378j.i0());
                    return;
                case 16:
                    result.success(Boolean.valueOf(f16378j.O0((Integer) list.get(0))));
                    return;
                case 17:
                    result.success(f16378j.j0());
                    return;
                case 18:
                    result.success(f16378j.Z());
                    return;
                case 19:
                    result.success(f16378j.T0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 20:
                    result.success(f16378j.C0());
                    return;
                case 21:
                    result.success(f16378j.M0(((Integer) list.get(0)).intValue()));
                    return;
                case 22:
                    result.success(f16378j.h0());
                    return;
                case 23:
                    result.success(f16378j.w0());
                    return;
                case 24:
                    result.success(f16378j.V0());
                    return;
                case 25:
                    result.success(f16378j.W0());
                    return;
                case 26:
                    result.success(f16378j.N0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 27:
                    result.success(f16378j.x0());
                    return;
                case 28:
                    result.success(f16378j.P0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 29:
                    result.success(f16378j.A0());
                    return;
                case 30:
                    result.success(f16378j.Q0(((Integer) list.get(0)).intValue()));
                    return;
                case 31:
                    result.success(f16378j.m0());
                    return;
                case ' ':
                    result.success(f16378j.B0());
                    return;
                case '!':
                    result.success(f16378j.g0());
                    return;
                case '\"':
                    result.success(f16378j.R0((String) list.get(0)));
                    return;
                case '#':
                    result.success(f16378j.n0((String) list.get(0)));
                    return;
                case '$':
                    result.success(f16378j.H0(((Integer) list.get(0)).intValue(), (Double) list.get(1)));
                    return;
                case '%':
                    result.success(f16378j.G0());
                    return;
                case '&':
                    result.success(f16378j.X0());
                    return;
                case '\'':
                    result.success(f16378j.o0((String) list.get(0)));
                    return;
                case '(':
                    result.success(f16378j.k0(((Integer) list.get(0)).intValue()));
                    return;
                case ')':
                    result.success(f16378j.l0());
                    return;
                case '*':
                    result.success(f16378j.z0());
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            result.error("Error: " + e10, (String) null, (Object) null);
        }
    }
}
