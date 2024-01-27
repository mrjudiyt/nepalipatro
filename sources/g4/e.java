package g4;

import a6.m0;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.google.common.collect.x;
import java.util.Arrays;
import n6.d;

/* compiled from: AudioCapabilities */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f8857c = new e(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final e f8858d = new e(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f8859e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f8860a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8861b;

    /* compiled from: AudioCapabilities */
    private static final class a {
        public static int[] a() {
            x.a l10 = x.l();
            for (int i10 : e.f8859e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    l10.f(Integer.valueOf(i10));
                }
            }
            l10.f(2);
            return d.k(l10.h());
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8860a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f8860a = new int[0];
        }
        this.f8861b = i10;
    }

    private static boolean b() {
        if (m0.f205a >= 17) {
            String str = m0.f207c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static e c(Context context) {
        return d(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static e d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f8858d;
        }
        if (m0.f205a >= 29 && m0.m0(context)) {
            return new e(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f8857c;
        }
        return new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int e() {
        return this.f8861b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Arrays.equals(this.f8860a, eVar.f8860a) || this.f8861b != eVar.f8861b) {
            return false;
        }
        return true;
    }

    public boolean f(int i10) {
        return Arrays.binarySearch(this.f8860a, i10) >= 0;
    }

    public int hashCode() {
        return this.f8861b + (Arrays.hashCode(this.f8860a) * 31);
    }

    public String toString() {
        int i10 = this.f8861b;
        String arrays = Arrays.toString(this.f8860a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i10);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
