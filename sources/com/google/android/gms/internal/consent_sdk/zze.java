package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzf[] zzc;

    public /* synthetic */ zze(String str, String str2, zzf[] zzfArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzfArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.zza;
        String str2 = this.zzb;
        zzf[] zzfArr = this.zzc;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Action[");
                    sb.append(lowerCase);
                    sb.append("]: failed to parse args: ");
                    sb.append(str2);
                    return;
                }
            }
            String obj = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Action[");
            sb2.append(lowerCase);
            sb2.append("]: ");
            sb2.append(obj);
            int length = zzfArr.length;
            int i10 = 0;
            while (i10 < length) {
                zzf zzf = zzfArr[i10];
                FutureTask futureTask = new FutureTask(new zzd(zzf, lowerCase, jSONObject));
                zzf.zza().execute(futureTask);
                try {
                    if (!((Boolean) futureTask.get()).booleanValue()) {
                        i10++;
                    } else {
                        return;
                    }
                } catch (ExecutionException e10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to run Action[");
                    sb3.append(lowerCase);
                    sb3.append("]: ");
                    e10.getCause();
                } catch (InterruptedException unused2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Thread interrupted for Action[");
                    sb4.append(lowerCase);
                    sb4.append("]: ");
                }
            }
        }
    }
}
