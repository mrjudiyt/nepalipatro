package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcep implements zzfpm {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzcep(String str) {
        this.zza = str;
    }

    public final URLConnection zza() {
        int i10 = zzceq.zzd;
        zzt.zzw();
        int intValue = ((Integer) zzba.zzc().zzb(zzbci.zzz)).intValue();
        URL url = new URL(this.zza);
        int i11 = 0;
        while (true) {
            i11++;
            if (i11 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    zzcas zzcas = new zzcas((String) null);
                    zzcas.zzc(httpURLConnection, (byte[]) null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzcas.zze(httpURLConnection, responseCode);
                    if (responseCode / 100 != 3) {
                        return httpURLConnection;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            throw new IOException("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            zzcat.zze("Redirecting to ".concat(headerField));
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            throw new IOException("Unsupported scheme: ".concat(protocol));
                        }
                    } else {
                        throw new IOException("Missing Location header in redirect");
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
