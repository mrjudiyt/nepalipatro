package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfcv {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfct zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final String zzo;
    public final int zzp;

    zzfcv(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        int i10 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        zzfct zzfct = null;
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        int i12 = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str8 = str;
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzbw.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (!((Boolean) zzba.zzc().zzb(zzbci.zzib)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    JsonReader jsonReader2 = jsonReader;
                    if ("bidding_data".equals(nextName)) {
                        str4 = jsonReader.nextString();
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzjC)).booleanValue() && zzfcu.zza(nextName, "topics_should_record_observation")) {
                            jsonReader.nextBoolean();
                        } else if ("adapter_response_replacement_key".equals(nextName)) {
                            str8 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(nextName)) {
                            if (((Boolean) zzba.zzc().zzb(zzbci.zzgM)).booleanValue()) {
                                try {
                                    Bundle zza2 = zzbw.zza(zzbw.zzh(jsonReader));
                                    if (zza2 != null) {
                                        bundle = zza2;
                                    }
                                } catch (IOException | JSONException unused) {
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(nextName)) {
                            if (((Boolean) zzba.zzc().zzb(zzbci.zziY)).booleanValue()) {
                                str6 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(nextName)) {
                            if (((Boolean) zzba.zzc().zzb(zzbci.zziY)).booleanValue()) {
                                str5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            zzbca zzbca = zzbci.zziZ;
                            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue() && zzfcu.zza(nextName, "adResponseBody")) {
                                str7 = jsonReader.nextString();
                            } else if (!((Boolean) zzba.zzc().zzb(zzbca)).booleanValue() || !zzfcu.zza(nextName, "adResponseHeaders")) {
                                if (zzfcu.zza(nextName, "max_parallel_renderers")) {
                                    i12 = Math.max(1, jsonReader.nextInt());
                                } else {
                                    jsonReader.skipValue();
                                }
                                jSONObject = jSONObject2;
                                str = str8;
                            } else {
                                jSONObject = zzbw.zzh(jsonReader);
                            }
                        }
                        jSONObject = jSONObject2;
                        str = str8;
                    }
                } else {
                    zzfct = new zzfct(jsonReader);
                }
                jSONObject = jSONObject2;
            }
            str = str8;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        this.zzb = str2;
        this.zzd = str3;
        this.zze = i11;
        this.zzf = j10;
        this.zzi = zzfct;
        this.zzg = z10;
        this.zzh = str4;
        this.zzj = bundle;
        this.zzk = str5;
        this.zzl = str6;
        this.zzm = str7;
        this.zzn = jSONObject;
        this.zzo = str;
        zzbdn zzbdn = zzbeg.zza;
        this.zzp = ((Long) zzbdn.zze()).longValue() > 0 ? ((Long) zzbdn.zze()).intValue() : i12;
    }
}
