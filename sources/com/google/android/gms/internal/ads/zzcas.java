package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcas {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static boolean zzc = false;
    private static boolean zzd = false;
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));
    private final List zzg;

    public zzcas() {
        this((String) null);
    }

    static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(ShareConstants.MEDIA_URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void zzb(int i10, Map map, JsonWriter jsonWriter) {
        jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i10);
        jsonWriter.endObject();
        zzr(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcat.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z10) {
        synchronized (zzb) {
            zzc = true;
            zzd = z10;
        }
    }

    public static boolean zzk() {
        boolean z10;
        synchronized (zzb) {
            z10 = false;
            if (zzc && zzd) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzl() {
        boolean z10;
        synchronized (zzb) {
            z10 = zzc;
        }
        return z10;
    }

    private static synchronized void zzm(String str) {
        synchronized (zzcas.class) {
            zzcat.zzi("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                zzcat.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzcat.zzi("GMA Debug FINISH");
        }
    }

    private final void zzn(String str, zzcar zzcar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(Constants.TIMESTAMP).value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.zzg) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzcar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzcat.zzh("unable to log", e10);
        }
        zzm(stringWriter.toString());
    }

    private final void zzo(String str) {
        zzn("onNetworkRequestError", new zzcap(str));
    }

    private final void zzp(String str, String str2, Map map, byte[] bArr) {
        zzn("onNetworkRequest", new zzcan(str, str2, map, bArr));
    }

    private final void zzq(Map map, int i10) {
        zzn("onNetworkResponse", new zzcaq(i10, map));
    }

    private static void zzr(JsonWriter jsonWriter, Map map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!zzf.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            zzcat.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (zzk()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            zzp(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzk()) {
            zzp(str, "GET", map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        HashMap hashMap;
        if (zzk()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            zzq(hashMap, i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    zzcat.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                zzo(str);
            }
        }
    }

    public final void zzf(Map map, int i10) {
        if (zzk()) {
            zzq(map, i10);
            if (i10 < 200 || i10 >= 300) {
                zzo((String) null);
            }
        }
    }

    public final void zzg(String str) {
        if (zzk() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(byte[] bArr) {
        zzn("onNetworkResponseBody", new zzcao(bArr));
    }

    public zzcas(String str) {
        List list;
        if (!zzk()) {
            list = new ArrayList();
        } else {
            list = Arrays.asList(new String[]{"network_request_".concat(String.valueOf(UUID.randomUUID().toString()))});
        }
        this.zzg = list;
    }
}
