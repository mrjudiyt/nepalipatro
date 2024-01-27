package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.e;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbju implements zzbjj {
    private final zzb zza;
    private final zzdso zzb;
    private final zzfib zzc;
    private final zzcay zzd;
    private final zzbrs zze;
    private final zzedo zzf;
    private final zzcou zzg;
    private zzx zzh = null;
    private final zzgad zzi = zzcbg.zzf;

    public zzbju(zzb zzb2, zzbrs zzbrs, zzedo zzedo, zzdso zzdso, zzfib zzfib, zzcou zzcou) {
        this.zza = zzb2;
        this.zze = zzbrs;
        this.zzf = zzedo;
        this.zzb = zzdso;
        this.zzc = zzfib;
        this.zzd = new zzcay((String) null);
        this.zzg = zzcou;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzaro zzaro, Uri uri, View view, Activity activity) {
        if (zzaro == null) {
            return uri;
        }
        try {
            if (zzaro.zze(uri)) {
                return zzaro.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzarp unused) {
            return uri;
        } catch (Exception e10) {
            zzt.zzo().zzu(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzcat.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("custom_close"));
    }

    /* access modifiers changed from: private */
    public final void zzh(String str, zza zza2, Map map, String str2) {
        String str3;
        boolean z10;
        HashMap hashMap;
        boolean z11;
        Object obj;
        zza zza3 = zza2;
        Map map2 = map;
        String str4 = str2;
        zzcgb zzcgb = (zzcgb) zza3;
        zzfcr zzD = zzcgb.zzD();
        zzfcv zzP = zzcgb.zzP();
        boolean z12 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z10 = false;
        } else {
            String str5 = zzP.zzb;
            z10 = zzD.zzak;
            str3 = str5;
        }
        boolean z13 = !((Boolean) zzba.zzc().zzb(zzbci.zzjS)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        if ("expand".equalsIgnoreCase(str4)) {
            if (zzcgb.zzaA()) {
                zzcat.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzchg) zza3).zzaF(zzf(map), zzb(map), z13);
        } else if ("webapp".equalsIgnoreCase(str4)) {
            zzk(false);
            boolean z14 = ((Boolean) zzba.zzc().zzb(zzbci.zzkQ)).booleanValue() && ((obj = map2.get("is_allowed_for_lock_screen")) == AppEventsConstants.EVENT_PARAM_VALUE_YES || (obj != null && obj.equals(AppEventsConstants.EVENT_PARAM_VALUE_YES)));
            if (str != null) {
                ((zzchg) zza3).zzaH(zzf(map), zzb(map), str, z13, z14);
            } else {
                ((zzchg) zza3).zzaG(zzf(map), zzb(map), (String) map2.get("html"), (String) map2.get("baseurl"), z13);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str4)) {
            Context context = zzcgb.getContext();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzes)).booleanValue()) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzey)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) zzba.zzc().zzb(zzbci.zzew)).booleanValue()) {
                        z12 = true;
                    } else {
                        String str6 = (String) zzba.zzc().zzb(zzbci.zzex);
                        if (!str6.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzftj.zzc(zzfsh.zzc(';')).zzd(str6).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((String) it.next()).equals(packageName)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            boolean zzg2 = zzbdj.zzg(zzcgb.getContext());
            if (z12) {
                if (!zzg2) {
                    zzm(4);
                } else {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcat.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd2 = zzd(zzc(zzcgb.getContext(), zzcgb.zzI(), Uri.parse(str), zzcgb.zzF(), zzcgb.zzi()));
                    if (!z10 || this.zzf == null || !zzl(zza3, zzcgb.getContext(), zzd2.toString(), str3)) {
                        this.zzh = new zzbjr(this);
                        ((zzchg) zza3).zzaD(new zzc((String) null, zzd2.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (Intent) null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z13);
                        return;
                    }
                    return;
                }
            }
            map2.put("use_first_package", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            map2.put("use_running_process", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzj(zza2, map, z10, str3, z13);
        } else if ("app".equalsIgnoreCase(str4) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map2.get("system_browser"))) {
            zzj(zza2, map, z10, str3, z13);
        } else if ("open_app".equalsIgnoreCase(str4)) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhY)).booleanValue()) {
                zzk(true);
                String str7 = (String) map2.get("p");
                if (str7 == null) {
                    zzcat.zzj("Package name missing from open app action.");
                } else if (!z10 || this.zzf == null || !zzl(zza3, zzcgb.getContext(), str7, str3)) {
                    PackageManager packageManager = zzcgb.getContext().getPackageManager();
                    if (packageManager == null) {
                        zzcat.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str7);
                    if (launchIntentForPackage != null) {
                        ((zzchg) zza3).zzaD(new zzc(launchIntentForPackage, this.zzh), z13);
                    }
                }
            }
        } else {
            zzk(true);
            String str8 = (String) map2.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str8)) {
                try {
                    intent = Intent.parseUri(str8, 0);
                } catch (URISyntaxException e10) {
                    zzcat.zzh("Error parsing the url: ".concat(String.valueOf(str8)), e10);
                }
            }
            Intent intent2 = intent;
            if (!(intent2 == null || intent2.getData() == null)) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd3 = zzd(zzc(zzcgb.getContext(), zzcgb.zzI(), data, zzcgb.zzF(), zzcgb.zzi()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzhZ)).booleanValue()) {
                            intent2.setDataAndType(zzd3, intent2.getType());
                        }
                    }
                    intent2.setData(zzd3);
                }
            }
            boolean z15 = ((Boolean) zzba.zzc().zzb(zzbci.zzin)).booleanValue() && "intent_async".equalsIgnoreCase(str4) && map2.containsKey("event_id");
            HashMap hashMap2 = new HashMap();
            if (z15) {
                hashMap = hashMap2;
                zzbjs zzbjs = r1;
                zzbjs zzbjs2 = new zzbjs(this, z13, zza2, hashMap2, map);
                this.zzh = zzbjs;
                z11 = false;
            } else {
                hashMap = hashMap2;
                z11 = z13;
            }
            if (intent2 == null) {
                HashMap hashMap3 = hashMap;
                String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcgb.getContext(), zzcgb.zzI(), Uri.parse(str), zzcgb.zzF(), zzcgb.zzi())).toString() : str;
                if (!z10 || this.zzf == null || !zzl(zza3, zzcgb.getContext(), uri, str3)) {
                    ((zzchg) zza3).zzaD(new zzc((String) map2.get("i"), uri, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzh), z11);
                } else if (z15) {
                    hashMap3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbmd) zza3).zzd("openIntentAsync", hashMap3);
                }
            } else if (!z10 || this.zzf == null || !zzl(zza3, zzcgb.getContext(), intent2.getData().toString(), str3)) {
                ((zzchg) zza3).zzaD(new zzc(intent2, this.zzh), z11);
            } else if (z15) {
                HashMap hashMap4 = hashMap;
                hashMap4.put((String) map2.get("event_id"), Boolean.TRUE);
                ((zzbmd) zza3).zzd("openIntentAsync", hashMap4);
            }
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdso zzdso = this.zzb;
        if (zzdso != null) {
            zzedz.zzc(context, zzdso, this.zzc, this.zzf, str, "dialog_not_shown", zzfvv.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00df, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 1
            r1.zzk(r3)
            r4 = r0
            com.google.android.gms.internal.ads.zzcgb r4 = (com.google.android.gms.internal.ads.zzcgb) r4
            android.content.Context r5 = r4.getContext()
            com.google.android.gms.internal.ads.zzaro r6 = r4.zzI()
            android.view.View r7 = r4.zzF()
            java.lang.String r8 = "activity"
            java.lang.Object r8 = r5.getSystemService(r8)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            java.lang.String r9 = "u"
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 == 0) goto L_0x0032
            goto L_0x0134
        L_0x0032:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri r9 = zzc(r5, r6, r9, r7, r11)
            android.net.Uri r9 = zzd(r9)
            java.lang.String r10 = "use_first_package"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.String r12 = "use_running_process"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            java.lang.String r13 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzeq
            com.google.android.gms.internal.ads.zzbcg r14 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r14.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.String r2 = r9.getScheme()
            java.lang.String r14 = "http"
            boolean r2 = r14.equalsIgnoreCase(r2)
            java.lang.String r15 = "https"
            if (r2 == 0) goto L_0x0093
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r11 = r2.build()
            goto L_0x00a9
        L_0x0093:
            java.lang.String r2 = r9.getScheme()
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a9
            android.net.Uri$Builder r2 = r9.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r14)
            android.net.Uri r11 = r2.build()
        L_0x00a9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r9 = com.google.android.gms.internal.ads.zzbjt.zza(r9, r5, r6, r7)
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbjt.zza(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00c4
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzo(r5, r9)
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzo(r5, r11)
        L_0x00c4:
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbjt.zzd(r9, r2, r5, r6, r7)
            if (r3 == 0) goto L_0x00cf
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbjt.zzb(r9, r3, r5, r6, r7)
            goto L_0x0134
        L_0x00cf:
            if (r11 == 0) goto L_0x00e1
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbjt.zzc(r11, r5, r6, r7)
            if (r3 == 0) goto L_0x00e1
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbjt.zzb(r9, r3, r5, r6, r7)
            android.content.pm.ResolveInfo r3 = com.google.android.gms.internal.ads.zzbjt.zzc(r11, r5, r6, r7)
            if (r3 != 0) goto L_0x0134
        L_0x00e1:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00e8
            goto L_0x0133
        L_0x00e8:
            if (r12 == 0) goto L_0x0125
            if (r8 == 0) goto L_0x0125
            java.util.List r3 = r8.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0125
            int r8 = r2.size()
            r11 = 0
        L_0x00f7:
            if (r11 >= r8) goto L_0x0125
            java.lang.Object r12 = r2.get(r11)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r14 = r3.iterator()
        L_0x0103:
            boolean r15 = r14.hasNext()
            int r16 = r11 + 1
            if (r15 == 0) goto L_0x0122
            java.lang.Object r15 = r14.next()
            android.app.ActivityManager$RunningAppProcessInfo r15 = (android.app.ActivityManager.RunningAppProcessInfo) r15
            java.lang.String r15 = r15.processName
            android.content.pm.ActivityInfo r13 = r12.activityInfo
            java.lang.String r13 = r13.packageName
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0103
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbjt.zzb(r9, r12, r5, r6, r7)
            goto L_0x0134
        L_0x0122:
            r11 = r16
            goto L_0x00f7
        L_0x0125:
            if (r10 == 0) goto L_0x0133
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r11 = com.google.android.gms.internal.ads.zzbjt.zzb(r9, r2, r5, r6, r7)
            goto L_0x0134
        L_0x0133:
            r11 = r9
        L_0x0134:
            if (r20 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.zzedo r2 = r1.zzf
            if (r2 == 0) goto L_0x0152
            if (r11 == 0) goto L_0x0152
            android.content.Context r2 = r4.getContext()
            android.net.Uri r3 = r11.getData()
            java.lang.String r3 = r3.toString()
            r4 = r21
            boolean r2 = r1.zzl(r0, r2, r3, r4)
            if (r2 != 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            return
        L_0x0152:
            com.google.android.gms.internal.ads.zzchg r0 = (com.google.android.gms.internal.ads.zzchg) r0     // Catch:{ ActivityNotFoundException -> 0x0161 }
            com.google.android.gms.ads.internal.overlay.zzc r2 = new com.google.android.gms.ads.internal.overlay.zzc     // Catch:{ ActivityNotFoundException -> 0x0161 }
            com.google.android.gms.ads.internal.overlay.zzx r3 = r1.zzh     // Catch:{ ActivityNotFoundException -> 0x0161 }
            r2.<init>(r11, r3)     // Catch:{ ActivityNotFoundException -> 0x0161 }
            r3 = r22
            r0.zzaD(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0161 }
            return
        L_0x0161:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.ads.zzcat.zzj(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbju.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbrs zzbrs = this.zze;
        if (zzbrs != null) {
            zzbrs.zza(z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r2 != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzdso r1 = r8.zzb
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzfib r2 = r8.zzc
            com.google.android.gms.internal.ads.zzedo r3 = r8.zzf
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r5 = "offline_open"
            r0 = r10
            r4 = r12
            com.google.android.gms.internal.ads.zzedz.zzc(r0, r1, r2, r3, r4, r5, r6)
        L_0x0014:
            com.google.android.gms.internal.ads.zzcac r0 = com.google.android.gms.ads.internal.zzt.zzo()
            boolean r0 = r0.zzx(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.zzedo r9 = r8.zzf
            com.google.android.gms.internal.ads.zzcay r10 = r8.zzd
            r9.zzh(r10, r12)
            return r1
        L_0x0027:
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzbt r0 = com.google.android.gms.ads.internal.util.zzt.zzy(r10)
            com.google.android.gms.ads.internal.zzt.zzp()
            androidx.core.app.o r2 = androidx.core.app.o.b(r10)
            boolean r2 = r2.a()
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzt.zzq()
            java.lang.String r4 = "offline_notification_channel"
            boolean r3 = r3.zzi(r10, r4)
            r4 = r9
            com.google.android.gms.internal.ads.zzcgb r4 = (com.google.android.gms.internal.ads.zzcgb) r4
            com.google.android.gms.ads.internal.overlay.zzl r5 = r4.zzL()
            r6 = 1
            if (r5 == 0) goto L_0x0055
            android.app.Activity r5 = r4.zzi()
            if (r5 != 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x0096
            com.google.android.gms.ads.internal.zzt.zzp()
            androidx.core.app.o r2 = androidx.core.app.o.b(r10)
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0066
            goto L_0x0090
        L_0x0066:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r2 >= r7) goto L_0x007d
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzij
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r7.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x008d
        L_0x007d:
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzii
            com.google.android.gms.internal.ads.zzbcg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r7.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
        L_0x008d:
            if (r2 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            java.lang.String r9 = "notifications_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x0096:
            if (r3 == 0) goto L_0x009e
            java.lang.String r9 = "notification_channel_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x009e:
            if (r0 != 0) goto L_0x00a6
            java.lang.String r9 = "work_manager_unavailable"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00a6:
            if (r5 == 0) goto L_0x00ae
            java.lang.String r9 = "ad_no_activity"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00ae:
            com.google.android.gms.internal.ads.zzbca r0 = com.google.android.gms.internal.ads.zzbci.zzig
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c6
            java.lang.String r9 = "notification_flow_disabled"
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00c6:
            com.google.android.gms.ads.internal.overlay.zzl r0 = r4.zzL()
            if (r0 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.zzeea r0 = com.google.android.gms.internal.ads.zzeeb.zze()
            android.app.Activity r2 = r4.zzi()
            r0.zza(r2)
            r2 = 0
            r0.zzb(r2)
            r0.zzc(r12)
            r0.zzd(r11)
            com.google.android.gms.internal.ads.zzeeb r11 = r0.zze()
            com.google.android.gms.ads.internal.overlay.zzl r0 = r4.zzL()     // Catch:{ Exception -> 0x00ed }
            r0.zzf(r11)     // Catch:{ Exception -> 0x00ed }
            goto L_0x00fe
        L_0x00ed:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            r8.zzi(r10, r12, r9)
            return r1
        L_0x00f6:
            r10 = r9
            com.google.android.gms.internal.ads.zzchg r10 = (com.google.android.gms.internal.ads.zzchg) r10
            r0 = 14
            r10.zzaE(r12, r11, r0)
        L_0x00fe:
            r9.onAdClicked()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbju.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void zzm(int i10) {
        if (this.zzb != null) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                zzfib zzfib = this.zzc;
                String zza2 = zzbdi.zza(i10);
                zzfia zzb2 = zzfia.zzb("cct_action");
                zzb2.zza("cct_open_status", zza2);
                zzfib.zzb(zzb2);
                return;
            }
            zzdsn zza3 = this.zzb.zza();
            zza3.zzb(NativeProtocol.WEB_DIALOG_ACTION, "cct_action");
            zza3.zzb("cct_open_status", zzbdi.zza(i10));
            zza3.zzg();
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        e eVar;
        zzcou zzcou;
        zza zza2 = (zza) obj;
        String zzc2 = zzbza.zzc((String) map.get("u"), ((zzcgb) zza2).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcat.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb2 = this.zza;
        if (zzb2 == null || zzb2.zzc()) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzju)).booleanValue() || (zzcou = this.zzg) == null) {
                eVar = zzfzt.zzh(zzc2);
            } else {
                eVar = zzcou.zzc(zzc2, zzay.zze());
            }
            zzfzt.zzr(eVar, new zzbjq(this, zza2, map, str), this.zzi);
            return;
        }
        zzb2.zzb(zzc2);
    }
}
