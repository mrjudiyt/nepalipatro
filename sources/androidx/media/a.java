package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* compiled from: AudioFocusRequestCompat */
public class a {

    /* renamed from: g  reason: collision with root package name */
    static final AudioAttributesCompat f3601g = new AudioAttributesCompat.a().e(1).a();

    /* renamed from: a  reason: collision with root package name */
    private final int f3602a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f3603b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3604c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioAttributesCompat f3605d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3606e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3607f;

    /* renamed from: androidx.media.a$a  reason: collision with other inner class name */
    /* compiled from: AudioFocusRequestCompat */
    private static class C0061a {
        static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* compiled from: AudioFocusRequestCompat */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f3608a;

        /* renamed from: b  reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f3609b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f3610c;

        /* renamed from: d  reason: collision with root package name */
        private AudioAttributesCompat f3611d = a.f3601g;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3612e;

        public b(int i10) {
            d(i10);
        }

        private static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public a a() {
            if (this.f3609b != null) {
                return new a(this.f3608a, this.f3609b, this.f3610c, this.f3611d, this.f3612e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.f3611d = audioAttributesCompat;
            return this;
        }

        public b d(int i10) {
            if (b(i10)) {
                if (Build.VERSION.SDK_INT < 19 && i10 == 4) {
                    i10 = 2;
                }
                this.f3608a = i10;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i10);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            } else if (handler != null) {
                this.f3609b = onAudioFocusChangeListener;
                this.f3610c = handler;
                return this;
            } else {
                throw new IllegalArgumentException("Handler must not be null");
            }
        }

        public b g(boolean z10) {
            this.f3612e = z10;
            return this;
        }
    }

    /* compiled from: AudioFocusRequestCompat */
    private static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: h  reason: collision with root package name */
        private final Handler f3613h;

        /* renamed from: i  reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f3614i;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f3614i = onAudioFocusChangeListener;
            this.f3613h = new Handler(handler.getLooper(), this);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f3614i.onAudioFocusChange(message.arg1);
            return true;
        }

        public void onAudioFocusChange(int i10) {
            Handler handler = this.f3613h;
            handler.sendMessage(Message.obtain(handler, 2782386, i10, 0));
        }
    }

    a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f3602a = i10;
        this.f3604c = handler;
        this.f3605d = audioAttributesCompat;
        this.f3606e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f3603b = onAudioFocusChangeListener;
        } else {
            this.f3603b = new c(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f3607f = C0061a.a(i10, a(), z10, this.f3603b, handler);
        } else {
            this.f3607f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f3605d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.f3605d;
    }

    /* access modifiers changed from: package-private */
    public AudioFocusRequest c() {
        return (AudioFocusRequest) this.f3607f;
    }

    public int d() {
        return this.f3602a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.f3603b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3602a != aVar.f3602a || this.f3606e != aVar.f3606e || !androidx.core.util.c.a(this.f3603b, aVar.f3603b) || !androidx.core.util.c.a(this.f3604c, aVar.f3604c) || !androidx.core.util.c.a(this.f3605d, aVar.f3605d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return androidx.core.util.c.b(Integer.valueOf(this.f3602a), this.f3603b, this.f3604c, this.f3605d, Boolean.valueOf(this.f3606e));
    }
}
