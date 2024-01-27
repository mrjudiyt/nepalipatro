package com.google.firebase.sessions.settings;

import i9.l0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.y;
import o8.m;
import o8.q;
import org.json.JSONObject;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
/* compiled from: RemoteSettingsFetcher.kt */
final class RemoteSettingsFetcher$doConfigFetch$2 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ p<String, d<? super q>, Object> $onFailure;
    final /* synthetic */ p<JSONObject, d<? super q>, Object> $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, p<? super JSONObject, ? super d<? super q>, ? extends Object> pVar, p<? super String, ? super d<? super q>, ? extends Object> pVar2, d<? super RemoteSettingsFetcher$doConfigFetch$2> dVar) {
        super(2, dVar);
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map;
        this.$onSuccess = pVar;
        this.$onFailure = pVar2;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            URLConnection openConnection = this.this$0.settingsUrl().openConnection();
            kotlin.jvm.internal.m.d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry next : this.$headerOptions.entrySet()) {
                httpsURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                y yVar = new y();
                while (true) {
                    T readLine = bufferedReader.readLine();
                    yVar.f15575h = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                p<JSONObject, d<? super q>, Object> pVar = this.$onSuccess;
                this.label = 1;
                if (pVar.invoke(jSONObject, this) == c10) {
                    return c10;
                }
            } else {
                p<String, d<? super q>, Object> pVar2 = this.$onFailure;
                String str = "Bad response code: " + responseCode;
                this.label = 2;
                if (pVar2.invoke(str, this) == c10) {
                    return c10;
                }
            }
        } else if (i10 == 1 || i10 == 2) {
            try {
                m.b(obj);
            } catch (Exception e10) {
                p<String, d<? super q>, Object> pVar3 = this.$onFailure;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.label = 3;
                if (pVar3.invoke(message, this) == c10) {
                    return c10;
                }
            }
        } else if (i10 == 3) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f16189a;
    }
}
