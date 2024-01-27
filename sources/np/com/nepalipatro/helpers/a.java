package np.com.nepalipatro.helpers;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.EventChannel;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.e;

/* compiled from: AppIntentHandler.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterEngine f15912a;

    /* renamed from: np.com.nepalipatro.helpers.a$a  reason: collision with other inner class name */
    /* compiled from: AppIntentHandler.kt */
    public static final class C0266a implements EventChannel.StreamHandler {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f15913h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ HashMap<String, String> f15914i;

        C0266a(String str, HashMap<String, String> hashMap) {
            this.f15913h = str;
            this.f15914i = hashMap;
        }

        public void onCancel(Object obj) {
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            String str = this.f15913h;
            if (str != null) {
                if (eventSink != null) {
                    eventSink.success(str);
                }
            } else if (eventSink != null) {
                eventSink.success(this.f15914i);
            }
        }
    }

    public a(Intent intent, FlutterEngine flutterEngine) {
        String str;
        String string;
        m.f(flutterEngine, "flutterEngine");
        this.f15912a = flutterEngine;
        HashMap hashMap = new HashMap();
        if (!(intent == null || intent.getExtras() == null)) {
            if (intent.hasExtra("data")) {
                Serializable serializableExtra = intent.getSerializableExtra("data");
                m.d(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                HashMap hashMap2 = (HashMap) serializableExtra;
                e.a aVar = e.f15961a;
                String str2 = (String) hashMap2.get(aVar.g());
                str2 = str2 == null ? AppEventsConstants.EVENT_PARAM_VALUE_NO : str2;
                String str3 = (String) hashMap2.get(aVar.t());
                String str4 = "";
                str3 = str3 == null ? str4 : str3;
                String str5 = (String) hashMap2.get(aVar.q());
                str5 = str5 == null ? str4 : str5;
                String str6 = (String) hashMap2.get(aVar.d());
                str6 = str6 == null ? aVar.f() : str6;
                String str7 = (String) hashMap2.get(aVar.u());
                str7 = str7 == null ? str4 : str7;
                String str8 = (String) hashMap2.get(aVar.h());
                str8 = str8 == null ? str4 : str8;
                String str9 = (String) hashMap2.get(aVar.r());
                str9 = str9 == null ? str4 : str9;
                Bundle extras = intent.getExtras();
                String str10 = (extras == null || (str10 = extras.getString(aVar.g())) == null) ? str4 : str10;
                Bundle extras2 = intent.getExtras();
                if (!(extras2 == null || (string = extras2.getString(aVar.u())) == null)) {
                    str4 = string;
                }
                PrintStream printStream = System.out;
                printStream.print("INTENTDATAID->" + str10 + " \n");
                PrintStream printStream2 = System.out;
                printStream2.print("INTENTDATATITLE->" + str3 + " \n");
                PrintStream printStream3 = System.out;
                printStream3.print("INTENTDATAMESSAGE->" + str5 + " \n");
                PrintStream printStream4 = System.out;
                printStream4.print("INTENTDATAACTION->" + str6 + " \n");
                PrintStream printStream5 = System.out;
                printStream5.print("INTENTDATATYPE->" + str7 + " \n");
                PrintStream printStream6 = System.out;
                printStream6.print("INTENTDATATYPE2->" + str4 + " \n");
                PrintStream printStream7 = System.out;
                printStream7.print("INTENTDATALINK->" + str8 + " \n");
                PrintStream printStream8 = System.out;
                printStream8.print("INTENTDATAOPTIONS->" + str9 + " \n");
                String str11 = (String) hashMap.put(aVar.g(), str2);
                String str12 = (String) hashMap.put(aVar.t(), str3);
                String str13 = (String) hashMap.put(aVar.q(), str5);
                String str14 = (String) hashMap.put(aVar.d(), str6);
                String str15 = (String) hashMap.put(aVar.u(), str7);
                String str16 = (String) hashMap.put(aVar.h(), str8);
                String str17 = (String) hashMap.put(aVar.r(), str9);
            } else if (intent.getStringExtra("news_widget") != null) {
                str = intent.getStringExtra("news_widget");
                a(str, hashMap);
            } else {
                return;
            }
        }
        str = null;
        a(str, hashMap);
    }

    private final void a(String str, HashMap<String, String> hashMap) {
        new EventChannel(this.f15912a.getDartExecutor().getBinaryMessenger(), c.f15921a.K()).setStreamHandler(new C0266a(str, hashMap));
    }
}
