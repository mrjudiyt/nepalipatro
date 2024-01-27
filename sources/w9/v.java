package w9;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.Html;
import android.widget.Toast;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;
import kotlin.jvm.internal.m;

/* compiled from: TTSHelper.kt */
public final class v extends UtteranceProgressListener implements TextToSpeech.OnInitListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public TextToSpeech f17080a;

    /* renamed from: b  reason: collision with root package name */
    private b f17081b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f17082c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f17083d;

    /* renamed from: e  reason: collision with root package name */
    private final String f17084e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f17085f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<String> f17086g;

    /* renamed from: h  reason: collision with root package name */
    private int f17087h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17088i;

    /* renamed from: j  reason: collision with root package name */
    private String f17089j;

    /* renamed from: k  reason: collision with root package name */
    private String f17090k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17091l;

    /* renamed from: m  reason: collision with root package name */
    private final int f17092m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public a f17093n;

    /* renamed from: o  reason: collision with root package name */
    private Runnable f17094o;

    /* compiled from: TTSHelper.kt */
    public enum a {
        PLAYING,
        STOPPED,
        INIT
    }

    /* compiled from: TTSHelper.kt */
    public interface b {
        void a();

        void b(TextToSpeech textToSpeech);
    }

    /* compiled from: TTSHelper.kt */
    public interface c {
        void a();

        void b();

        void onCompleted();

        void onError();
    }

    /* compiled from: TTSHelper.kt */
    public static final class d implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f17099h;

        d(v vVar) {
            this.f17099h = vVar;
        }

        public void run() {
            a aVar;
            if (this.f17099h.f17080a != null) {
                v vVar = this.f17099h;
                TextToSpeech w10 = vVar.f17080a;
                m.c(w10);
                if (w10.isSpeaking()) {
                    c v10 = this.f17099h.f17085f;
                    if (v10 != null) {
                        v10.b();
                    }
                    aVar = a.PLAYING;
                } else {
                    c v11 = this.f17099h.f17085f;
                    if (v11 != null) {
                        v11.a();
                    }
                    aVar = a.STOPPED;
                }
                vVar.f17093n = aVar;
            }
            Handler u10 = this.f17099h.f17083d;
            if (u10 != null) {
                u10.postDelayed(this, 1000);
            }
        }
    }

    public v() {
        this.f17084e = "com.google.android.tts";
        this.f17089j = "";
        this.f17090k = "";
        this.f17092m = 12345;
        this.f17093n = a.INIT;
        this.f17094o = new d(this);
    }

    private final boolean A() {
        TextToSpeech textToSpeech = this.f17080a;
        m.c(textToSpeech);
        for (TextToSpeech.EngineInfo engineInfo : textToSpeech.getEngines()) {
            if (m.a(engineInfo.name, this.f17084e)) {
                return true;
            }
        }
        return false;
    }

    private final void B() {
        Intent intent = new Intent("android.speech.tts.engine.INSTALL_TTS_DATA");
        intent.addFlags(268435456);
        intent.setPackage("com.google.android.tts");
        try {
            Activity activity = this.f17082c;
            m.c(activity);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void C(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void D() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.android.settings.TTS_SETTINGS");
            intent.setFlags(268435456);
            Activity activity = this.f17082c;
            m.c(activity);
            activity.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void F() {
        if (!this.f17091l) {
            c cVar = this.f17085f;
            if (cVar != null) {
                m.c(cVar);
                cVar.onError();
            }
            new AlertDialog.Builder(this.f17082c).setTitle("No Specified Language Found.").setMessage("Would you like to download a language?\\n To Download a language \\n\n    1. Click yes.\\n 2. Scroll down to nepali language. \\n 3. Click on it and you will find a download button.\n    \\n \\n Note: If you could not find nepali language in the list,please update your Google Text To Speech Service from playstore.").setCancelable(false).setPositiveButton("Yes", new j(this)).setNegativeButton("No", t.f17078h).setNeutralButton("Open PlayStore.", new o(this)).create().show();
        }
    }

    /* access modifiers changed from: private */
    public static final void G(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.B();
    }

    /* access modifiers changed from: private */
    public static final void H(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.s();
    }

    private final void J() {
        c cVar = this.f17085f;
        if (cVar != null) {
            m.c(cVar);
            cVar.onError();
        }
        new AlertDialog.Builder(this.f17082c).setTitle("No TTS Service found to use this feature").setMessage("Would you like to download a service to read out news?").setCancelable(false).setPositiveButton("Yes", new n(this)).setNegativeButton("No", r.f17076h).create().show();
    }

    /* access modifiers changed from: private */
    public static final void K(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.z();
    }

    /* access modifiers changed from: private */
    public static final void L(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void M() {
        new AlertDialog.Builder(this.f17082c).setTitle("Required TTS service not selected.").setMessage("Google Tts is not selected as Default TTS service.Please click \\'Open Setting\\' and select Google-Text-to-speech as Default").setCancelable(false).setPositiveButton("Open Setting", new q(this)).setNegativeButton("No", k.f17067h).setNeutralButton("Open PlayStore.", new p(this)).create().show();
    }

    /* access modifiers changed from: private */
    public static final void N(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void O(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.s();
    }

    /* access modifiers changed from: private */
    public static final void P(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.D();
    }

    private final void Q(String str) {
        if (str.length() == 0) {
            try {
                Toast.makeText(this.f17082c, "Something went wrong", 0).show();
                c cVar = this.f17085f;
                m.c(cVar);
                cVar.onError();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            int nextInt = new Random().nextInt();
            HashMap hashMap = new HashMap();
            hashMap.put("utteranceId", String.valueOf(nextInt));
            TextToSpeech textToSpeech = this.f17080a;
            m.c(textToSpeech);
            textToSpeech.speak(str, 0, hashMap);
        }
    }

    private final LinkedList<String> T(String str) {
        int i10 = 0;
        String substring = str.substring(0, str.length());
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LinkedList<String> linkedList = new LinkedList<>();
        int i11 = 2500;
        while (true) {
            try {
                String substring2 = substring.substring(i10, i11);
                m.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                System.out.println("Data: " + substring2);
                linkedList.add(substring2);
                i10 += 2500;
                i11 += 2500;
            } catch (Exception unused) {
                String substring3 = substring.substring(i10);
                m.e(substring3, "this as java.lang.String).substring(startIndex)");
                linkedList.add(substring3);
                return linkedList;
            }
        }
    }

    private final void m(Locale locale, String str) {
        if (!this.f17088i) {
            this.f17088i = true;
            new Handler().postDelayed(new l(this, locale, str), 700);
        }
    }

    /* access modifiers changed from: private */
    public static final void n(v vVar, Locale locale, String str) {
        m.f(vVar, "this$0");
        m.f(locale, "$locale");
        m.f(str, "$textToSpeak");
        vVar.f17088i = false;
        TextToSpeech textToSpeech = vVar.f17080a;
        m.c(textToSpeech);
        if (textToSpeech.isLanguageAvailable(locale) == 0) {
            vVar.t(locale, str);
        } else if (vVar.y()) {
            vVar.F();
        } else if (vVar.A()) {
            vVar.M();
        } else {
            vVar.J();
        }
    }

    private final void p() {
        if (!this.f17091l) {
            new AlertDialog.Builder(this.f17082c).setTitle("No TTS Service found to use this feature").setMessage("Would you like to download a service to read out news?").setCancelable(false).setPositiveButton("Yes", new m(this)).setNegativeButton("No", u.f17079h).create().show();
        }
    }

    /* access modifiers changed from: private */
    public static final void q(v vVar, DialogInterface dialogInterface, int i10) {
        m.f(vVar, "this$0");
        vVar.s();
    }

    /* access modifiers changed from: private */
    public static final void r(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void s() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://market.android.com/details?id=com.google.android.tts"));
            Activity activity = this.f17082c;
            m.c(activity);
            activity.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void t(Locale locale, String str) {
        TextToSpeech textToSpeech = this.f17080a;
        m.c(textToSpeech);
        textToSpeech.setLanguage(locale);
        String S = S(str);
        if (S.length() > 3999) {
            LinkedList<String> T = T(S);
            this.f17086g = T;
            this.f17087h = 0;
            m.c(T);
            String str2 = T.get(0);
            m.e(str2, "chunks!![0]");
            Q(str2);
            return;
        }
        this.f17086g = null;
        Q(S);
    }

    private final boolean y() {
        TextToSpeech textToSpeech = this.f17080a;
        m.c(textToSpeech);
        return p.m(textToSpeech.getDefaultEngine(), this.f17084e, true);
    }

    private final void z() {
        TextToSpeech textToSpeech = this.f17080a;
        m.c(textToSpeech);
        if (!p.m(textToSpeech.getDefaultEngine(), this.f17084e, true)) {
            s();
        } else {
            B();
        }
    }

    public final void E(String str, Locale locale, String str2, String str3, c cVar) {
        this.f17085f = cVar;
        m.c(str2);
        this.f17089j = str2;
        m.c(str3);
        this.f17090k = str3;
        TextToSpeech textToSpeech = this.f17080a;
        m.c(textToSpeech);
        textToSpeech.setOnUtteranceProgressListener(this);
        a aVar = this.f17093n;
        if (aVar == a.STOPPED) {
            if (locale != null && str != null) {
                m(locale, str);
            }
        } else if (aVar == a.INIT) {
            if (locale != null && str != null) {
                m(locale, str);
            }
        } else if (aVar == a.PLAYING) {
            R();
        }
    }

    public final void R() {
        try {
            TextToSpeech textToSpeech = this.f17080a;
            if (textToSpeech != null) {
                m.c(textToSpeech);
                if (textToSpeech.isSpeaking()) {
                    TextToSpeech textToSpeech2 = this.f17080a;
                    m.c(textToSpeech2);
                    textToSpeech2.stop();
                } else {
                    TextToSpeech textToSpeech3 = this.f17080a;
                    m.c(textToSpeech3);
                    textToSpeech3.stop();
                }
                c cVar = this.f17085f;
                m.c(cVar);
                cVar.a();
                this.f17093n = a.STOPPED;
                Handler handler = this.f17083d;
                m.c(handler);
                handler.removeCallbacks(this.f17094o);
                this.f17088i = false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String S(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0).toString();
        }
        return Html.fromHtml(str).toString();
    }

    public final void U(int i10, int i11) {
        TextToSpeech textToSpeech = this.f17080a;
        if (textToSpeech != null) {
            b bVar = this.f17081b;
            if (bVar != null) {
                bVar.b(textToSpeech);
            }
        } else if (i10 != this.f17092m) {
        } else {
            if (i11 == 1) {
                TextToSpeech textToSpeech2 = new TextToSpeech(this.f17082c, this, this.f17084e);
                this.f17080a = textToSpeech2;
                b bVar2 = this.f17081b;
                if (bVar2 != null) {
                    bVar2.b(textToSpeech2);
                    return;
                }
                return;
            }
            b bVar3 = this.f17081b;
            if (bVar3 != null) {
                bVar3.a();
            }
            p();
        }
    }

    public final void o(b bVar) {
        m.f(bVar, "callback");
        this.f17081b = bVar;
        TextToSpeech textToSpeech = this.f17080a;
        if (textToSpeech == null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.speech.tts.engine.CHECK_TTS_DATA");
                Activity activity = this.f17082c;
                m.c(activity);
                activity.startActivityForResult(intent, this.f17092m);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        } else {
            if (textToSpeech != null) {
                textToSpeech.shutdown();
            }
            TextToSpeech textToSpeech2 = new TextToSpeech(this.f17082c, this, this.f17084e);
            this.f17080a = textToSpeech2;
            bVar.b(textToSpeech2);
        }
    }

    public void onDone(String str) {
        LinkedList<String> linkedList = this.f17086g;
        if (linkedList != null) {
            this.f17087h++;
            m.c(linkedList);
            String str2 = linkedList.get(this.f17087h);
            m.e(str2, "chunks!![chunkIndex]");
            Q(str2);
            return;
        }
        this.f17093n = a.STOPPED;
        Handler handler = this.f17083d;
        m.c(handler);
        handler.removeCallbacks(this.f17094o);
        c cVar = this.f17085f;
        m.c(cVar);
        cVar.onCompleted();
    }

    public void onError(String str) {
        new AlertDialog.Builder(this.f17082c).setTitle("Error in TTS service!").setMessage("Could not play TTS at the moment.Please try again later.").setCancelable(false).setPositiveButton("Ok", s.f17077h).create().show();
        Handler handler = this.f17083d;
        m.c(handler);
        handler.removeCallbacks(this.f17094o);
        c cVar = this.f17085f;
        m.c(cVar);
        cVar.onError();
    }

    public void onInit(int i10) {
        b bVar;
        if (i10 == -1 && (bVar = this.f17081b) != null) {
            bVar.a();
        }
    }

    public void onStart(String str) {
        Handler handler = this.f17083d;
        if (handler != null) {
            handler.postDelayed(this.f17094o, 1000);
        }
    }

    public v(Activity activity) {
        this();
        this.f17082c = activity;
        this.f17083d = new Handler();
    }
}
