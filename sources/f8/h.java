package f8;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: FlutterTtsPlugin.kt */
public final class h implements MethodChannel.MethodCallHandler, FlutterPlugin {
    public static final a G = new a((g) null);
    /* access modifiers changed from: private */
    public String A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public int C;
    private final UtteranceProgressListener D = new b(this);
    private final TextToSpeech.OnInitListener E = new b(this);
    private final TextToSpeech.OnInitListener F = new a(this);

    /* renamed from: h  reason: collision with root package name */
    private Handler f14639h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f14640i;

    /* renamed from: j  reason: collision with root package name */
    private MethodChannel.Result f14641j;

    /* renamed from: k  reason: collision with root package name */
    private MethodChannel.Result f14642k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f14643l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f14644m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f14645n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f14646o;

    /* renamed from: p  reason: collision with root package name */
    private Context f14647p;

    /* renamed from: q  reason: collision with root package name */
    private TextToSpeech f14648q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final String f14649r = "TTS";

    /* renamed from: s  reason: collision with root package name */
    private final String f14650s = "com.google.android.tts";

    /* renamed from: t  reason: collision with root package name */
    private boolean f14651t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList<Runnable> f14652u = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final HashMap<String, String> f14653v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    private Bundle f14654w;

    /* renamed from: x  reason: collision with root package name */
    private int f14655x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public int f14656y;

    /* renamed from: z  reason: collision with root package name */
    private String f14657z;

    /* compiled from: FlutterTtsPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final void A(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        hashMap.put("min", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put("normal", "0.5");
        hashMap.put("max", "1.5");
        hashMap.put("platform", "android");
        result.success(hashMap);
    }

    private final void B(MethodChannel.Result result) {
        ArrayList arrayList = new ArrayList();
        try {
            TextToSpeech textToSpeech = this.f14648q;
            m.c(textToSpeech);
            for (Voice next : textToSpeech.getVoices()) {
                HashMap hashMap = new HashMap();
                String name = next.getName();
                m.e(name, "voice.name");
                hashMap.put("name", name);
                String languageTag = next.getLocale().toLanguageTag();
                m.e(languageTag, "voice.locale.toLanguageTag()");
                hashMap.put("locale", languageTag);
                arrayList.add(hashMap);
            }
            result.success(arrayList);
        } catch (NullPointerException e10) {
            String str = this.f14649r;
            Log.d(str, "getVoices: " + e10.getMessage());
            result.success((Object) null);
        }
    }

    private final void C(BinaryMessenger binaryMessenger, Context context) {
        this.f14647p = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter_tts");
        this.f14640i = methodChannel;
        m.c(methodChannel);
        methodChannel.setMethodCallHandler(this);
        this.f14639h = new Handler(Looper.getMainLooper());
        this.f14654w = new Bundle();
        this.f14648q = new TextToSpeech(context, this.F, this.f14650s);
    }

    /* access modifiers changed from: private */
    public final void D(String str, Object obj) {
        Handler handler = this.f14639h;
        m.c(handler);
        handler.post(new g(this, str, obj));
    }

    /* access modifiers changed from: private */
    public static final void E(h hVar, String str, Object obj) {
        m.f(hVar, "this$0");
        m.f(str, "$method");
        m.f(obj, "$arguments");
        MethodChannel methodChannel = hVar.f14640i;
        if (methodChannel != null) {
            m.c(methodChannel);
            methodChannel.invokeMethod(str, obj);
        }
    }

    private final boolean F(Locale locale) {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        return textToSpeech.isLanguageAvailable(locale) >= 0;
    }

    private final boolean G(String str) {
        m.c(str);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        m.e(forLanguageTag, "forLanguageTag(language!!)");
        if (!F(forLanguageTag)) {
            return false;
        }
        Voice voice = null;
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        Iterator<Voice> it = textToSpeech.getVoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Voice next = it.next();
            if (m.a(next.getLocale(), forLanguageTag) && !next.isNetworkConnectionRequired()) {
                voice = next;
                break;
            }
        }
        if (voice == null) {
            return false;
        }
        Set<String> features = voice.getFeatures();
        m.e(features, "voiceToCheck.features");
        return !features.contains("notInstalled");
    }

    private final boolean H(TextToSpeech textToSpeech) {
        boolean z10;
        IllegalArgumentException e10;
        boolean z11;
        IllegalAccessException e11;
        boolean z12;
        Exception e12;
        if (textToSpeech == null) {
            return false;
        }
        Field[] declaredFields = textToSpeech.getClass().getDeclaredFields();
        m.e(declaredFields, "tts.javaClass.declaredFields");
        int length = declaredFields.length;
        boolean z13 = true;
        for (int i10 = 0; i10 < length; i10++) {
            declaredFields[i10].setAccessible(true);
            if (m.a("mServiceConnection", declaredFields[i10].getName()) && m.a("android.speech.tts.TextToSpeech$Connection", declaredFields[i10].getType().getName())) {
                try {
                    if (declaredFields[i10].get(textToSpeech) == null) {
                        try {
                            Log.e(this.f14649r, "*******TTS -> mServiceConnection == null*******");
                            z13 = false;
                        } catch (IllegalArgumentException e13) {
                            e10 = e13;
                            z11 = false;
                            e10.printStackTrace();
                            z13 = z10;
                        } catch (IllegalAccessException e14) {
                            e11 = e14;
                            z12 = false;
                            e11.printStackTrace();
                            z13 = z10;
                        } catch (Exception e15) {
                            e12 = e15;
                            z10 = false;
                            e12.printStackTrace();
                            z13 = z10;
                        }
                    }
                } catch (IllegalArgumentException e16) {
                    IllegalArgumentException illegalArgumentException = e16;
                    z11 = z13;
                    e10 = illegalArgumentException;
                    e10.printStackTrace();
                    z13 = z10;
                } catch (IllegalAccessException e17) {
                    IllegalAccessException illegalAccessException = e17;
                    z12 = z13;
                    e11 = illegalAccessException;
                    e11.printStackTrace();
                    z13 = z10;
                } catch (Exception e18) {
                    Exception exc = e18;
                    z10 = z13;
                    e12 = exc;
                    e12.printStackTrace();
                    z13 = z10;
                }
            }
        }
        return z13;
    }

    /* access modifiers changed from: private */
    public static final void I(h hVar, int i10) {
        m.f(hVar, "this$0");
        if (i10 == 0) {
            TextToSpeech textToSpeech = hVar.f14648q;
            m.c(textToSpeech);
            textToSpeech.setOnUtteranceProgressListener(hVar.D);
            try {
                TextToSpeech textToSpeech2 = hVar.f14648q;
                m.c(textToSpeech2);
                Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                m.e(locale, "tts!!.defaultVoice.locale");
                if (hVar.F(locale)) {
                    TextToSpeech textToSpeech3 = hVar.f14648q;
                    m.c(textToSpeech3);
                    textToSpeech3.setLanguage(locale);
                }
            } catch (NullPointerException e10) {
                String str = hVar.f14649r;
                Log.e(str, "getDefaultLocale: " + e10.getMessage());
            } catch (IllegalArgumentException e11) {
                String str2 = hVar.f14649r;
                Log.e(str2, "getDefaultLocale: " + e11.getMessage());
            }
            hVar.f14651t = true;
            Iterator<Runnable> it = hVar.f14652u.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            hVar.D("tts.init", Boolean.valueOf(hVar.f14651t));
            return;
        }
        String str3 = hVar.f14649r;
        Log.e(str3, "Failed to initialize TextToSpeech with status: " + i10);
        hVar.D("tts.init", Boolean.valueOf(hVar.f14651t));
    }

    /* access modifiers changed from: private */
    public static final void J(h hVar, MethodCall methodCall, MethodChannel.Result result) {
        m.f(hVar, "this$0");
        m.f(methodCall, "$call");
        m.f(result, "$result");
        hVar.onMethodCall(methodCall, result);
    }

    /* access modifiers changed from: private */
    public static final void K(h hVar, MethodCall methodCall, MethodChannel.Result result) {
        m.f(hVar, "this$0");
        m.f(methodCall, "$call");
        m.f(result, "$result");
        hVar.onMethodCall(methodCall, result);
    }

    private final void L(String str, MethodChannel.Result result) {
        this.f14648q = new TextToSpeech(this.f14647p, this.E, str);
        this.f14651t = false;
        result.success(1);
    }

    private final void M(String str, MethodChannel.Result result) {
        m.c(str);
        Locale forLanguageTag = Locale.forLanguageTag(str);
        m.e(forLanguageTag, "forLanguageTag(language!!)");
        if (F(forLanguageTag)) {
            TextToSpeech textToSpeech = this.f14648q;
            m.c(textToSpeech);
            textToSpeech.setLanguage(forLanguageTag);
            result.success(1);
            return;
        }
        result.success(0);
    }

    private final void N(float f10, MethodChannel.Result result) {
        if (0.5f <= f10 && f10 <= 2.0f) {
            TextToSpeech textToSpeech = this.f14648q;
            m.c(textToSpeech);
            textToSpeech.setPitch(f10);
            result.success(1);
            return;
        }
        String str = this.f14649r;
        Log.d(str, "Invalid pitch " + f10 + " value - Range is from 0.5 to 2.0");
        result.success(0);
    }

    private final void O(float f10) {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        textToSpeech.setSpeechRate(f10);
    }

    private final void P(HashMap<String, String> hashMap, MethodChannel.Result result) {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        for (Voice next : textToSpeech.getVoices()) {
            if (m.a(next.getName(), hashMap.get("name")) && m.a(next.getLocale().toLanguageTag(), hashMap.get("locale"))) {
                TextToSpeech textToSpeech2 = this.f14648q;
                m.c(textToSpeech2);
                textToSpeech2.setVoice(next);
                result.success(1);
                return;
            }
        }
        String str = this.f14649r;
        Log.d(str, "Voice name not found: " + hashMap);
        result.success(0);
    }

    private final void Q(float f10, MethodChannel.Result result) {
        if (0.0f <= f10 && f10 <= 1.0f) {
            Bundle bundle = this.f14654w;
            m.c(bundle);
            bundle.putFloat("volume", f10);
            result.success(1);
            return;
        }
        String str = this.f14649r;
        Log.d(str, "Invalid volume " + f10 + " value - Range is from 0.0 to 1.0");
        result.success(0);
    }

    private final boolean R(String str) {
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        this.f14653v.put(uuid, str);
        if (!H(this.f14648q)) {
            this.f14651t = false;
            this.f14648q = new TextToSpeech(this.f14647p, this.E, this.f14650s);
        } else if (this.f14655x > 0) {
            TextToSpeech textToSpeech = this.f14648q;
            m.c(textToSpeech);
            textToSpeech.playSilentUtterance((long) this.f14655x, 0, "SIL_" + uuid);
            TextToSpeech textToSpeech2 = this.f14648q;
            m.c(textToSpeech2);
            if (textToSpeech2.speak(str, 1, this.f14654w, uuid) == 0) {
                return true;
            }
        } else {
            TextToSpeech textToSpeech3 = this.f14648q;
            m.c(textToSpeech3);
            if (textToSpeech3.speak(str, this.C, this.f14654w, uuid) == 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void T(h hVar, int i10) {
        m.f(hVar, "this$0");
        MethodChannel.Result result = hVar.f14641j;
        if (result != null) {
            result.success(Integer.valueOf(i10));
        }
    }

    private final void U() {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        textToSpeech.stop();
    }

    /* access modifiers changed from: private */
    public static final void W(h hVar, int i10) {
        m.f(hVar, "this$0");
        MethodChannel.Result result = hVar.f14642k;
        if (result != null) {
            result.success(Integer.valueOf(i10));
        }
    }

    private final void X(String str, String str2) {
        Context context = this.f14647p;
        m.c(context);
        File file = new File(context.getExternalFilesDir((String) null), str2);
        String uuid = UUID.randomUUID().toString();
        m.e(uuid, "randomUUID().toString()");
        Bundle bundle = this.f14654w;
        m.c(bundle);
        bundle.putString("utteranceId", "STF_" + uuid);
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        Bundle bundle2 = this.f14654w;
        if (textToSpeech.synthesizeToFile(str, bundle2, file, "STF_" + uuid) == 0) {
            String str3 = this.f14649r;
            Log.d(str3, "Successfully created file : " + file.getPath());
            return;
        }
        String str4 = this.f14649r;
        Log.d(str4, "Failed creating file : " + file.getPath());
    }

    private final Map<String, Boolean> t(List<String> list) {
        HashMap hashMap = new HashMap();
        for (String next : list) {
            hashMap.put(next, Boolean.valueOf(G(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static final void u(h hVar, int i10) {
        m.f(hVar, "this$0");
        if (i10 == 0) {
            TextToSpeech textToSpeech = hVar.f14648q;
            m.c(textToSpeech);
            textToSpeech.setOnUtteranceProgressListener(hVar.D);
            try {
                TextToSpeech textToSpeech2 = hVar.f14648q;
                m.c(textToSpeech2);
                Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                m.e(locale, "tts!!.defaultVoice.locale");
                if (hVar.F(locale)) {
                    TextToSpeech textToSpeech3 = hVar.f14648q;
                    m.c(textToSpeech3);
                    textToSpeech3.setLanguage(locale);
                }
            } catch (NullPointerException e10) {
                String str = hVar.f14649r;
                Log.e(str, "getDefaultLocale: " + e10.getMessage());
            } catch (IllegalArgumentException e11) {
                String str2 = hVar.f14649r;
                Log.e(str2, "getDefaultLocale: " + e11.getMessage());
            }
            hVar.f14651t = true;
            Iterator<Runnable> it = hVar.f14652u.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        String str3 = hVar.f14649r;
        Log.e(str3, "Failed to initialize TextToSpeech with status: " + i10);
    }

    private final void v(MethodChannel.Result result) {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        String defaultEngine = textToSpeech.getDefaultEngine();
        m.e(defaultEngine, "tts!!.defaultEngine");
        result.success(defaultEngine);
    }

    private final void w(MethodChannel.Result result) {
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        Voice defaultVoice = textToSpeech.getDefaultVoice();
        HashMap hashMap = new HashMap();
        if (defaultVoice != null) {
            String name = defaultVoice.getName();
            m.e(name, "defaultVoice.name");
            hashMap.put("name", name);
            String languageTag = defaultVoice.getLocale().toLanguageTag();
            m.e(languageTag, "defaultVoice.locale.toLanguageTag()");
            hashMap.put("locale", languageTag);
        }
        result.success(hashMap);
    }

    private final void x(MethodChannel.Result result) {
        ArrayList arrayList = new ArrayList();
        try {
            TextToSpeech textToSpeech = this.f14648q;
            m.c(textToSpeech);
            for (TextToSpeech.EngineInfo engineInfo : textToSpeech.getEngines()) {
                arrayList.add(engineInfo.name);
            }
        } catch (Exception e10) {
            String str = this.f14649r;
            Log.d(str, "getEngines: " + e10.getMessage());
        }
        result.success(arrayList);
    }

    private final void y(MethodChannel.Result result) {
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                TextToSpeech textToSpeech = this.f14648q;
                m.c(textToSpeech);
                for (Locale languageTag : textToSpeech.getAvailableLanguages()) {
                    arrayList.add(languageTag.toLanguageTag());
                }
            } else {
                Locale[] availableLocales = Locale.getAvailableLocales();
                m.e(availableLocales, "getAvailableLocales()");
                for (Locale locale : availableLocales) {
                    String variant = locale.getVariant();
                    m.e(variant, "locale.variant");
                    if ((variant.length() == 0) && F(locale)) {
                        arrayList.add(locale.toLanguageTag());
                    }
                }
            }
        } catch (MissingResourceException e10) {
            Log.d(this.f14649r, "getLanguages: " + e10.getMessage());
        } catch (NullPointerException e11) {
            Log.d(this.f14649r, "getLanguages: " + e11.getMessage());
        }
        result.success(arrayList);
    }

    private final int z() {
        return TextToSpeech.getMaxSpeechInputLength();
    }

    public final void S(int i10) {
        this.f14644m = false;
        Handler handler = this.f14639h;
        m.c(handler);
        handler.post(new c(this, i10));
    }

    public final void V(int i10) {
        this.f14646o = false;
        Handler handler = this.f14639h;
        m.c(handler);
        handler.post(new d(this, i10));
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        m.e(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        m.e(applicationContext, "binding.applicationContext");
        C(binaryMessenger, applicationContext);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        U();
        TextToSpeech textToSpeech = this.f14648q;
        m.c(textToSpeech);
        textToSpeech.shutdown();
        this.f14647p = null;
        MethodChannel methodChannel = this.f14640i;
        m.c(methodChannel);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f14640i = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        if (!this.f14651t) {
            this.f14652u.add(new e(this, methodCall, result));
            return;
        }
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1360770792:
                    if (str.equals("awaitSpeakCompletion")) {
                        this.f14643l = Boolean.parseBoolean(methodCall.arguments.toString());
                        result.success(1);
                        return;
                    }
                    break;
                case -1228785901:
                    if (str.equals("areLanguagesInstalled")) {
                        List list = (List) methodCall.arguments();
                        m.c(list);
                        result.success(t(list));
                        return;
                    }
                    break;
                case -1153981156:
                    if (str.equals("setSharedInstance")) {
                        result.success(1);
                        return;
                    }
                    break;
                case -707999742:
                    if (str.equals("awaitSynthCompletion")) {
                        this.f14645n = Boolean.parseBoolean(methodCall.arguments.toString());
                        result.success(1);
                        return;
                    }
                    break;
                case -566982085:
                    if (str.equals("getEngines")) {
                        x(result);
                        return;
                    }
                    break;
                case -550697939:
                    if (str.equals("getDefaultEngine")) {
                        v(result);
                        return;
                    }
                    break;
                case -200275950:
                    if (str.equals("setQueueMode")) {
                        this.C = Integer.parseInt(methodCall.arguments.toString());
                        result.success(1);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        this.B = false;
                        this.A = null;
                        U();
                        this.f14656y = 0;
                        result.success(1);
                        MethodChannel.Result result2 = this.f14641j;
                        if (result2 != null) {
                            m.c(result2);
                            result2.success(0);
                            this.f14641j = null;
                            return;
                        }
                        return;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        this.B = true;
                        String str2 = this.A;
                        if (str2 != null) {
                            m.c(str2);
                            String substring = str2.substring(this.f14656y);
                            m.e(substring, "this as java.lang.String).substring(startIndex)");
                            this.A = substring;
                        }
                        U();
                        result.success(1);
                        MethodChannel.Result result3 = this.f14641j;
                        if (result3 != null) {
                            m.c(result3);
                            result3.success(0);
                            this.f14641j = null;
                            return;
                        }
                        return;
                    }
                    break;
                case 109641682:
                    if (str.equals("speak")) {
                        String obj = methodCall.arguments.toString();
                        if (this.A == null) {
                            this.A = obj;
                            m.c(obj);
                            this.f14657z = obj;
                        }
                        if (this.B) {
                            if (m.a(this.f14657z, obj)) {
                                obj = this.A;
                                m.c(obj);
                            } else {
                                this.A = obj;
                                m.c(obj);
                                this.f14657z = obj;
                                this.f14656y = 0;
                            }
                        }
                        if (this.f14644m && this.C == 0) {
                            result.success(0);
                            return;
                        } else if (!R(obj)) {
                            this.f14652u.add(new f(this, methodCall, result));
                            return;
                        } else if (!this.f14643l || this.C != 0) {
                            result.success(1);
                            return;
                        } else {
                            this.f14644m = true;
                            this.f14641j = result;
                            return;
                        }
                    }
                    break;
                case 182735172:
                    if (str.equals("setEngine")) {
                        L(methodCall.arguments.toString(), result);
                        return;
                    }
                    break;
                case 277104199:
                    if (str.equals("isLanguageAvailable")) {
                        Locale forLanguageTag = Locale.forLanguageTag(methodCall.arguments.toString());
                        m.e(forLanguageTag, "forLanguageTag(language)");
                        result.success(Boolean.valueOf(F(forLanguageTag)));
                        return;
                    }
                    break;
                case 375730650:
                    if (str.equals("setLanguage")) {
                        M(methodCall.arguments.toString(), result);
                        return;
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Q(Float.parseFloat(methodCall.arguments.toString()), result);
                        return;
                    }
                    break;
                case 771325407:
                    if (str.equals("setSilence")) {
                        this.f14655x = Integer.parseInt(methodCall.arguments.toString());
                        return;
                    }
                    break;
                case 885024887:
                    if (str.equals("getVoices")) {
                        B(result);
                        return;
                    }
                    break;
                case 967798247:
                    if (str.equals("getDefaultVoice")) {
                        w(result);
                        return;
                    }
                    break;
                case 971982233:
                    if (str.equals("getSpeechRateValidRange")) {
                        A(result);
                        return;
                    }
                    break;
                case 1040052984:
                    if (str.equals("isLanguageInstalled")) {
                        result.success(Boolean.valueOf(G(methodCall.arguments.toString())));
                        return;
                    }
                    break;
                case 1087344356:
                    if (str.equals("setSpeechRate")) {
                        O(Float.parseFloat(methodCall.arguments.toString()) * 2.0f);
                        result.success(1);
                        return;
                    }
                    break;
                case 1326839649:
                    if (str.equals("synthesizeToFile")) {
                        String str3 = (String) methodCall.argument(ViewHierarchyConstants.TEXT_KEY);
                        if (this.f14646o) {
                            result.success(0);
                            return;
                        }
                        String str4 = (String) methodCall.argument("fileName");
                        m.c(str3);
                        m.c(str4);
                        X(str3, str4);
                        if (this.f14645n) {
                            this.f14646o = true;
                            this.f14642k = result;
                            return;
                        }
                        result.success(1);
                        return;
                    }
                    break;
                case 1401390078:
                    if (str.equals("setPitch")) {
                        N(Float.parseFloat(methodCall.arguments.toString()), result);
                        return;
                    }
                    break;
                case 1407099376:
                    if (str.equals("setVoice")) {
                        HashMap hashMap = (HashMap) methodCall.arguments();
                        m.c(hashMap);
                        P(hashMap, result);
                        return;
                    }
                    break;
                case 1508723045:
                    if (str.equals("getLanguages")) {
                        y(result);
                        return;
                    }
                    break;
                case 1742137472:
                    if (str.equals("getMaxSpeechInputLength")) {
                        result.success(Integer.valueOf(z()));
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    /* compiled from: FlutterTtsPlugin.kt */
    public static final class b extends UtteranceProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f14658a;

        b(h hVar) {
            this.f14658a = hVar;
        }

        private final void a(String str, int i10, int i11) {
            if (str != null && !p.v(str, "STF_", false, 2, (Object) null)) {
                String str2 = (String) this.f14658a.f14653v.get(str);
                HashMap hashMap = new HashMap();
                hashMap.put(ViewHierarchyConstants.TEXT_KEY, str2);
                hashMap.put("start", String.valueOf(i10));
                hashMap.put("end", String.valueOf(i11));
                m.c(str2);
                String substring = str2.substring(i10, i11);
                m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                hashMap.put("word", substring);
                this.f14658a.D("speak.onProgress", hashMap);
            }
        }

        public void onDone(String str) {
            m.f(str, "utteranceId");
            if (!p.v(str, "SIL_", false, 2, (Object) null)) {
                if (p.v(str, "STF_", false, 2, (Object) null)) {
                    String k10 = this.f14658a.f14649r;
                    Log.d(k10, "Utterance ID has completed: " + str);
                    if (this.f14658a.f14645n) {
                        this.f14658a.V(1);
                    }
                    this.f14658a.D("synth.onComplete", Boolean.TRUE);
                } else {
                    String k11 = this.f14658a.f14649r;
                    Log.d(k11, "Utterance ID has completed: " + str);
                    if (this.f14658a.f14643l && this.f14658a.C == 0) {
                        this.f14658a.S(1);
                    }
                    this.f14658a.D("speak.onComplete", Boolean.TRUE);
                }
                this.f14658a.f14656y = 0;
                this.f14658a.A = null;
                this.f14658a.f14653v.remove(str);
            }
        }

        public void onError(String str) {
            m.f(str, "utteranceId");
            if (p.v(str, "STF_", false, 2, (Object) null)) {
                if (this.f14658a.f14645n) {
                    this.f14658a.f14646o = false;
                }
                this.f14658a.D("synth.onError", "Error from TextToSpeech (synth)");
                return;
            }
            if (this.f14658a.f14643l) {
                this.f14658a.f14644m = false;
            }
            this.f14658a.D("speak.onError", "Error from TextToSpeech (speak)");
        }

        public void onRangeStart(String str, int i10, int i11, int i12) {
            m.f(str, "utteranceId");
            if (!p.v(str, "STF_", false, 2, (Object) null)) {
                this.f14658a.f14656y = i10;
                super.onRangeStart(str, i10, i11, i12);
                a(str, i10, i11);
            }
        }

        public void onStart(String str) {
            m.f(str, "utteranceId");
            if (p.v(str, "STF_", false, 2, (Object) null)) {
                this.f14658a.D("synth.onStart", Boolean.TRUE);
            } else if (this.f14658a.B) {
                this.f14658a.D("speak.onContinue", Boolean.TRUE);
                this.f14658a.B = false;
            } else {
                String k10 = this.f14658a.f14649r;
                Log.d(k10, "Utterance ID has started: " + str);
                this.f14658a.D("speak.onStart", Boolean.TRUE);
            }
            if (Build.VERSION.SDK_INT < 26) {
                Object obj = this.f14658a.f14653v.get(str);
                m.c(obj);
                a(str, 0, ((String) obj).length());
            }
        }

        public void onStop(String str, boolean z10) {
            m.f(str, "utteranceId");
            String k10 = this.f14658a.f14649r;
            Log.d(k10, "Utterance ID has been stopped: " + str + ". Interrupted: " + z10);
            if (this.f14658a.f14643l) {
                this.f14658a.f14644m = false;
            }
            if (this.f14658a.B) {
                this.f14658a.D("speak.onPause", Boolean.TRUE);
            } else {
                this.f14658a.D("speak.onCancel", Boolean.TRUE);
            }
        }

        public void onError(String str, int i10) {
            m.f(str, "utteranceId");
            if (p.v(str, "STF_", false, 2, (Object) null)) {
                if (this.f14658a.f14645n) {
                    this.f14658a.f14646o = false;
                }
                h hVar = this.f14658a;
                hVar.D("synth.onError", "Error from TextToSpeech (synth) - " + i10);
                return;
            }
            if (this.f14658a.f14643l) {
                this.f14658a.f14644m = false;
            }
            h hVar2 = this.f14658a;
            hVar2.D("speak.onError", "Error from TextToSpeech (speak) - " + i10);
        }
    }
}
