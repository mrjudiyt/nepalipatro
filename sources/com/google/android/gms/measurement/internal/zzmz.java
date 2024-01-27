package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.zzih;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzmz extends zzmo {
    zzmz(zzmp zzmp) {
        super(zzmp);
    }

    static int zza(zzfi.zzj.zza zza, String str) {
        if (zza == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zza.zzb(); i10++) {
            if (str.equals(zza.zzj(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzmz g_() {
        return super.g_();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(String str) {
        Preconditions.checkNotNull(str);
        zzh zzd = zzh().zzd(str);
        if (zzd != null && zzf().zzn() && zzd.zzaj() && zzm().zzk(str)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzao zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ zzgp zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzls zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzmn zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> zzu() {
        Map<String, String> zza = zzbi.zza(this.zzf.zza());
        if (zza == null || zza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbi.zzap.zza(null).intValue();
        Iterator<Map.Entry<String, String>> it = zza.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().zzu().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().zzu().zza("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    static Object zzb(zzfi.zze zze, String str) {
        zzfi.zzg zza = zza(zze, str);
        if (zza == null) {
            return null;
        }
        if (zza.zzn()) {
            return zza.zzh();
        }
        if (zza.zzl()) {
            return Long.valueOf(zza.zzd());
        }
        if (zza.zzj()) {
            return Double.valueOf(zza.zza());
        }
        if (zza.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> zzi = zza.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfi.zzg next : zzi) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzfi.zzg next2 : next.zzi()) {
                    if (next2.zzn()) {
                        bundle.putString(next2.zzg(), next2.zzh());
                    } else if (next2.zzl()) {
                        bundle.putLong(next2.zzg(), next2.zzd());
                    } else if (next2.zzj()) {
                        bundle.putDouble(next2.zzg(), next2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return zza(str.getBytes(Charset.forName("UTF-8")));
    }

    /* access modifiers changed from: package-private */
    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest zzu = zznd.zzu();
        if (zzu != null) {
            return zznd.zza(zzu.digest(bArr));
        }
        zzj().zzg().zza("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzc(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            zzj().zzg().zza("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final Bundle zza(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(zza((Map<String, Object>) (Map) obj2, false));
                }
                bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static boolean zzb(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().zzg().zza("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzj().zzg().zza("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T zza(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.zzfr r5 = r4.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmz.zza(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzbg zza(com.google.android.gms.internal.measurement.zzad r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.zzc()
            r1 = 1
            android.os.Bundle r0 = r8.zza((java.util.Map<java.lang.String, java.lang.Object>) r0, (boolean) r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.zzb()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzii.zzb(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.zzb()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzbg r1 = new com.google.android.gms.measurement.internal.zzbg
            com.google.android.gms.measurement.internal.zzbb r4 = new com.google.android.gms.measurement.internal.zzbb
            r4.<init>(r0)
            long r6 = r9.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmz.zza(com.google.android.gms.internal.measurement.zzad):com.google.android.gms.measurement.internal.zzbg");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02a9  */
    @android.annotation.TargetApi(30)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzmh zza(java.lang.String r12, com.google.android.gms.internal.measurement.zzfi.zzj r13, com.google.android.gms.internal.measurement.zzfi.zze.zza r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r0 == 0) goto L_0x02c1
            com.google.android.gms.measurement.internal.zzaf r0 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzbi.zzcf
            boolean r0 = r0.zze(r12, r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x02c1
        L_0x0014:
            com.google.android.gms.common.util.Clock r0 = r11.zzb()
            long r0 = r0.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzaf r2 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r3 = com.google.android.gms.measurement.internal.zzbi.zzbb
            java.lang.String r2 = r2.zzd(r12, r3)
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.HashSet r3 = new java.util.HashSet
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x0035:
            if (r6 >= r4) goto L_0x0059
            r7 = r2[r6]
            r7.getClass()
            boolean r8 = r3.add(r7)
            if (r8 == 0) goto L_0x0045
            int r6 = r6 + 1
            goto L_0x0035
        L_0x0045:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "duplicate element: "
            r13.<init>(r14)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0059:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r3)
            com.google.android.gms.measurement.internal.zzmn r3 = r11.zzo()
            com.google.android.gms.measurement.internal.zzgp r4 = r3.zzm()
            java.lang.String r4 = r4.zzf(r12)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            com.google.android.gms.measurement.internal.zzaf r7 = r3.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r8 = com.google.android.gms.measurement.internal.zzbi.zzav
            java.lang.String r7 = r7.zzd(r12, r8)
            r6.scheme(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r8 = "."
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.zzaf r7 = r3.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r9 = com.google.android.gms.measurement.internal.zzbi.zzaw
            java.lang.String r7 = r7.zzd(r12, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            r6.authority(r4)
            goto L_0x00b0
        L_0x00a3:
            com.google.android.gms.measurement.internal.zzaf r4 = r3.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r7 = com.google.android.gms.measurement.internal.zzbi.zzaw
            java.lang.String r4 = r4.zzd(r12, r7)
            r6.authority(r4)
        L_0x00b0:
            com.google.android.gms.measurement.internal.zzaf r3 = r3.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r4 = com.google.android.gms.measurement.internal.zzbi.zzax
            java.lang.String r3 = r3.zzd(r12, r4)
            r6.path(r3)
            java.lang.String r3 = r13.zzah()
            java.lang.String r4 = "gmp_app_id"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = "gmp_version"
            java.lang.String r4 = "82001"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r3, (java.lang.String) r4, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = r13.zzy()
            com.google.android.gms.measurement.internal.zzaf r4 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzci
            boolean r4 = r4.zze(r12, r7)
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzgp r4 = r11.zzm()
            boolean r4 = r4.zzp(r12)
            if (r4 == 0) goto L_0x00ea
            r3 = r9
        L_0x00ea:
            java.lang.String r4 = "app_instance_id"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = r13.zzal()
            java.lang.String r4 = "rdid"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = r13.zzx()
            java.lang.String r4 = "bundle_id"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = r14.zze()
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzii.zza(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x0110
            r3 = r4
        L_0x0110:
            java.lang.String r4 = "app_event_name"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            int r3 = r13.zzb()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_version"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = r13.zzaj()
            com.google.android.gms.measurement.internal.zzaf r4 = r11.zze()
            boolean r4 = r4.zze(r12, r7)
            if (r4 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.zzgp r4 = r11.zzm()
            boolean r4 = r4.zzt(r12)
            if (r4 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.zzaf r4 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzbi.zzbv
            boolean r4 = r4.zze(r12, r7)
            if (r4 == 0) goto L_0x0158
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0157
            int r4 = r3.indexOf(r8)
            r7 = -1
            if (r4 == r7) goto L_0x0157
            java.lang.String r3 = r3.substring(r5, r4)
        L_0x0157:
            r9 = r3
        L_0x0158:
            java.lang.String r3 = "os_version"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r3, (java.lang.String) r9, (java.util.Set<java.lang.String>) r2)
            long r3 = r14.zzc()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "timestamp"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r4, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            boolean r3 = r13.zzat()
            java.lang.String r4 = "1"
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "lat"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r3, (java.lang.String) r4, (java.util.Set<java.lang.String>) r2)
        L_0x0177:
            int r3 = r13.zza()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "privacy_sandbox_version"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r5, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = "trigger_uri_source"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r3, (java.lang.String) r4, (java.util.Set<java.lang.String>) r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "trigger_uri_timestamp"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r5, (java.lang.String) r3, (java.util.Set<java.lang.String>) r2)
            if (r15 == 0) goto L_0x0199
            java.lang.String r3 = "request_uuid"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r3, (java.lang.String) r15, (java.util.Set<java.lang.String>) r2)
        L_0x0199:
            java.util.List r14 = r14.zzf()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x01a6:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01fa
            java.lang.Object r3 = r14.next()
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3
            java.lang.String r5 = r3.zzg()
            boolean r7 = r3.zzj()
            if (r7 == 0) goto L_0x01c8
            double r7 = r3.zza()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01c8:
            boolean r7 = r3.zzk()
            if (r7 == 0) goto L_0x01da
            float r3 = r3.zzb()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01da:
            boolean r7 = r3.zzn()
            if (r7 == 0) goto L_0x01e8
            java.lang.String r3 = r3.zzh()
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01e8:
            boolean r7 = r3.zzl()
            if (r7 == 0) goto L_0x01a6
            long r7 = r3.zzd()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01fa:
            com.google.android.gms.measurement.internal.zzaf r14 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r3 = com.google.android.gms.measurement.internal.zzbi.zzba
            java.lang.String r14 = r14.zzd(r12, r3)
            java.lang.String r3 = "\\|"
            java.lang.String[] r14 = r14.split(r3)
            zza((android.net.Uri.Builder) r6, (java.lang.String[]) r14, (android.os.Bundle) r15, (java.util.Set<java.lang.String>) r2)
            java.util.List r14 = r13.zzaq()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x021a:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x026e
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.measurement.zzfi$zzn r5 = (com.google.android.gms.internal.measurement.zzfi.zzn) r5
            java.lang.String r7 = r5.zzg()
            boolean r8 = r5.zzi()
            if (r8 == 0) goto L_0x023c
            double r8 = r5.zza()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x023c:
            boolean r8 = r5.zzj()
            if (r8 == 0) goto L_0x024e
            float r5 = r5.zzb()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x024e:
            boolean r8 = r5.zzm()
            if (r8 == 0) goto L_0x025c
            java.lang.String r5 = r5.zzh()
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x025c:
            boolean r8 = r5.zzk()
            if (r8 == 0) goto L_0x021a
            long r8 = r5.zzc()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x026e:
            com.google.android.gms.measurement.internal.zzaf r14 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.String> r5 = com.google.android.gms.measurement.internal.zzbi.zzaz
            java.lang.String r12 = r14.zzd(r12, r5)
            java.lang.String[] r12 = r12.split(r3)
            zza((android.net.Uri.Builder) r6, (java.lang.String[]) r12, (android.os.Bundle) r15, (java.util.Set<java.lang.String>) r2)
            boolean r12 = com.google.android.gms.internal.measurement.zznp.zza()
            if (r12 == 0) goto L_0x02b2
            com.google.android.gms.measurement.internal.zzaf r12 = r11.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzbi.zzcm
            boolean r12 = r12.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r14)
            if (r12 == 0) goto L_0x02b2
            boolean r12 = r13.zzas()
            if (r12 == 0) goto L_0x0298
            goto L_0x029a
        L_0x0298:
            java.lang.String r4 = "0"
        L_0x029a:
            java.lang.String r12 = "dma"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r12, (java.lang.String) r4, (java.util.Set<java.lang.String>) r2)
            java.lang.String r12 = r13.zzad()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x02b2
            java.lang.String r12 = r13.zzad()
            java.lang.String r13 = "dma_cps"
            zza((android.net.Uri.Builder) r6, (java.lang.String) r13, (java.lang.String) r12, (java.util.Set<java.lang.String>) r2)
        L_0x02b2:
            com.google.android.gms.measurement.internal.zzmh r12 = new com.google.android.gms.measurement.internal.zzmh
            android.net.Uri r13 = r6.build()
            java.lang.String r13 = r13.toString()
            r14 = 1
            r12.<init>(r13, r0, r14)
            return r12
        L_0x02c1:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmz.zza(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.zzmh");
    }

    /* access modifiers changed from: package-private */
    public final zzfi.zze zza(zzaz zzaz) {
        zzfi.zze.zza zza = zzfi.zze.zze().zza(zzaz.zzd);
        Iterator<String> it = zzaz.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
            Object zzc = zzaz.zze.zzc(next);
            Preconditions.checkNotNull(zzc);
            zza(zza2, zzc);
            zza.zza(zza2);
        }
        return (zzfi.zze) ((zzix) zza.zzab());
    }

    static zzfi.zzg zza(zzfi.zze zze, String str) {
        for (zzfi.zzg next : zze.zzh()) {
            if (next.zzg().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <BuilderT extends zzkm> BuilderT zza(BuilderT buildert, byte[] bArr) {
        zzik zza = zzik.zza();
        if (zza != null) {
            return buildert.zza(bArr, zza);
        }
        return buildert.zza(bArr);
    }

    /* access modifiers changed from: package-private */
    public final String zza(zzfi.zzi zzi) {
        zzfi.zzb zzt;
        if (zzi == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzfi.zzj next : zzi.zzd()) {
            if (next != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (next.zzbk()) {
                    zza(sb, 1, "protocol_version", (Object) Integer.valueOf(next.zze()));
                }
                if (zzps.zza() && zze().zze(next.zzx(), zzbi.zzbt) && next.zzbn()) {
                    zza(sb, 1, "session_stitching_token", (Object) next.zzam());
                }
                zza(sb, 1, "platform", (Object) next.zzak());
                if (next.zzbf()) {
                    zza(sb, 1, "gmp_version", (Object) Long.valueOf(next.zzm()));
                }
                if (next.zzbs()) {
                    zza(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(next.zzs()));
                }
                if (next.zzbd()) {
                    zza(sb, 1, "dynamite_version", (Object) Long.valueOf(next.zzk()));
                }
                if (next.zzay()) {
                    zza(sb, 1, "config_version", (Object) Long.valueOf(next.zzi()));
                }
                zza(sb, 1, "gmp_app_id", (Object) next.zzah());
                zza(sb, 1, "admob_app_id", (Object) next.zzw());
                zza(sb, 1, "app_id", (Object) next.zzx());
                zza(sb, 1, "app_version", (Object) next.zzaa());
                if (next.zzav()) {
                    zza(sb, 1, "app_version_major", (Object) Integer.valueOf(next.zzb()));
                }
                zza(sb, 1, "firebase_instance_id", (Object) next.zzag());
                if (next.zzbc()) {
                    zza(sb, 1, "dev_cert_hash", (Object) Long.valueOf(next.zzj()));
                }
                zza(sb, 1, "app_store", (Object) next.zzz());
                if (next.zzbr()) {
                    zza(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(next.zzr()));
                }
                if (next.zzbo()) {
                    zza(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(next.zzp()));
                }
                if (next.zzbe()) {
                    zza(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(next.zzl()));
                }
                if (next.zzbj()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(next.zzo()));
                }
                if (next.zzbi()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(next.zzn()));
                }
                zza(sb, 1, "app_instance_id", (Object) next.zzy());
                zza(sb, 1, "resettable_device_id", (Object) next.zzal());
                zza(sb, 1, "ds_id", (Object) next.zzaf());
                if (next.zzbh()) {
                    zza(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(next.zzat()));
                }
                zza(sb, 1, "os_version", (Object) next.zzaj());
                zza(sb, 1, "device_model", (Object) next.zzae());
                zza(sb, 1, "user_default_language", (Object) next.zzan());
                if (next.zzbq()) {
                    zza(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(next.zzg()));
                }
                if (next.zzax()) {
                    zza(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(next.zzc()));
                }
                if (next.zzbm()) {
                    zza(sb, 1, "service_upload", (Object) Boolean.valueOf(next.zzau()));
                }
                zza(sb, 1, "health_monitor", (Object) next.zzai());
                if (next.zzbl()) {
                    zza(sb, 1, "retry_counter", (Object) Integer.valueOf(next.zzf()));
                }
                if (next.zzba()) {
                    zza(sb, 1, "consent_signals", (Object) next.zzac());
                }
                if (next.zzbg()) {
                    zza(sb, 1, "is_dma_region", (Object) Boolean.valueOf(next.zzas()));
                }
                if (next.zzbb()) {
                    zza(sb, 1, "core_platform_services", (Object) next.zzad());
                }
                if (next.zzaz()) {
                    zza(sb, 1, "consent_diagnostics", (Object) next.zzab());
                }
                if (next.zzbp()) {
                    zza(sb, 1, "target_os_version", (Object) Long.valueOf(next.zzq()));
                }
                if (zzpg.zza() && zze().zze(next.zzx(), zzbi.zzcf)) {
                    zza(sb, 1, "ad_services_version", (Object) Integer.valueOf(next.zza()));
                    if (next.zzaw() && (zzt = next.zzt()) != null) {
                        zza(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zza(sb, 2, "eligible", (Object) Boolean.valueOf(zzt.zzf()));
                        zza(sb, 2, "no_access_adservices_attribution_permission", (Object) Boolean.valueOf(zzt.zzh()));
                        zza(sb, 2, "pre_r", (Object) Boolean.valueOf(zzt.zzi()));
                        zza(sb, 2, "r_extensions_too_old", (Object) Boolean.valueOf(zzt.zzj()));
                        zza(sb, 2, "adservices_extension_too_old", (Object) Boolean.valueOf(zzt.zze()));
                        zza(sb, 2, "ad_storage_not_allowed", (Object) Boolean.valueOf(zzt.zzd()));
                        zza(sb, 2, "measurement_manager_disabled", (Object) Boolean.valueOf(zzt.zzg()));
                        zza(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<zzfi.zzn> zzaq = next.zzaq();
                if (zzaq != null) {
                    for (zzfi.zzn next2 : zzaq) {
                        if (next2 != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            Double d10 = null;
                            zza(sb, 2, "set_timestamp_millis", (Object) next2.zzl() ? Long.valueOf(next2.zzd()) : null);
                            zza(sb, 2, "name", (Object) zzi().zzc(next2.zzg()));
                            zza(sb, 2, "string_value", (Object) next2.zzh());
                            zza(sb, 2, "int_value", (Object) next2.zzk() ? Long.valueOf(next2.zzc()) : null);
                            if (next2.zzi()) {
                                d10 = Double.valueOf(next2.zza());
                            }
                            zza(sb, 2, "double_value", (Object) d10);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> zzao = next.zzao();
                next.zzx();
                if (zzao != null) {
                    for (zzfi.zzc next3 : zzao) {
                        if (next3 != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.zzg()) {
                                zza(sb, 2, "audience_id", (Object) Integer.valueOf(next3.zza()));
                            }
                            if (next3.zzh()) {
                                zza(sb, 2, "new_audience", (Object) Boolean.valueOf(next3.zzf()));
                            }
                            zza(sb, 2, "current_data", next3.zzd());
                            if (next3.zzi()) {
                                zza(sb, 2, "previous_data", next3.zze());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> zzap = next.zzap();
                if (zzap != null) {
                    for (zzfi.zze next4 : zzap) {
                        if (next4 != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, "name", (Object) zzi().zza(next4.zzg()));
                            if (next4.zzk()) {
                                zza(sb, 2, "timestamp_millis", (Object) Long.valueOf(next4.zzd()));
                            }
                            if (next4.zzj()) {
                                zza(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(next4.zzc()));
                            }
                            if (next4.zzi()) {
                                zza(sb, 2, "count", (Object) Integer.valueOf(next4.zza()));
                            }
                            if (next4.zzb() != 0) {
                                zza(sb, 2, next4.zzh());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zza(zzew.zzb zzb) {
        if (zzb == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzb.zzl()) {
            zza(sb, 0, "filter_id", (Object) Integer.valueOf(zzb.zzb()));
        }
        zza(sb, 0, "event_name", (Object) zzi().zza(zzb.zzf()));
        String zza = zza(zzb.zzh(), zzb.zzi(), zzb.zzj());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", (Object) zza);
        }
        if (zzb.zzk()) {
            zza(sb, 1, "event_count_filter", zzb.zze());
        }
        if (zzb.zza() > 0) {
            sb.append("  filters {\n");
            for (zzew.zzc zza2 : zzb.zzg()) {
                zza(sb, 2, zza2);
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    private static String zza(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("Dynamic ");
        }
        if (z11) {
            sb.append("Sequence ");
        }
        if (z12) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zza(zzew.zze zze) {
        if (zze == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zze.zzi()) {
            zza(sb, 0, "filter_id", (Object) Integer.valueOf(zze.zza()));
        }
        zza(sb, 0, "property_name", (Object) zzi().zzc(zze.zze()));
        String zza = zza(zze.zzf(), zze.zzg(), zze.zzh());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", (Object) zza);
        }
        zza(sb, 1, zze.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                zzj().zzu().zza("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().zzu().zza("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Object> zza(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zza((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zza((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zza((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    static void zza(zzfi.zze.zza zza, String str, Object obj) {
        List<zzfi.zzg> zzf = zza.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zza2.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza2.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza2.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zza.zza(i10, zza2);
        } else {
            zza.zza(zza2);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                zza(builder, str2, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb, int i10, String str, zzfi.zzl zzl) {
        if (zzl != null) {
            zza(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzl.zzb() != 0) {
                zza(sb, 4);
                sb.append("results: ");
                int i11 = 0;
                for (Long next : zzl.zzi()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i11 = i12;
                }
                sb.append(10);
            }
            if (zzl.zzd() != 0) {
                zza(sb, 4);
                sb.append("status: ");
                int i13 = 0;
                for (Long next2 : zzl.zzk()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i13 = i14;
                }
                sb.append(10);
            }
            if (zzl.zza() != 0) {
                zza(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (zzfi.zzd next3 : zzl.zzh()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.zzf() ? Integer.valueOf(next3.zza()) : null);
                    sb.append(CertificateUtil.DELIMITER);
                    sb.append(next3.zze() ? Long.valueOf(next3.zzb()) : null);
                    i15 = i16;
                }
                sb.append("}\n");
            }
            if (zzl.zzc() != 0) {
                zza(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (zzfi.zzm next4 : zzl.zzj()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.zzf() ? Integer.valueOf(next4.zzb()) : null);
                    sb.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.zze()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i19 = i20;
                    }
                    sb.append("]");
                    i17 = i18;
                }
                sb.append("}\n");
            }
            zza(sb, 3);
            sb.append("}\n");
        }
    }

    private final void zza(StringBuilder sb, int i10, List<zzfi.zzg> list) {
        if (list != null) {
            int i11 = i10 + 1;
            for (zzfi.zzg next : list) {
                if (next != null) {
                    zza(sb, i11);
                    sb.append("param {\n");
                    Double d10 = null;
                    zza(sb, i11, "name", (Object) next.zzm() ? zzi().zzb(next.zzg()) : null);
                    zza(sb, i11, "string_value", (Object) next.zzn() ? next.zzh() : null);
                    zza(sb, i11, "int_value", (Object) next.zzl() ? Long.valueOf(next.zzd()) : null);
                    if (next.zzj()) {
                        d10 = Double.valueOf(next.zza());
                    }
                    zza(sb, i11, "double_value", (Object) d10);
                    if (next.zzc() > 0) {
                        zza(sb, i11, next.zzi());
                    }
                    zza(sb, i11);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void zza(StringBuilder sb, int i10, zzew.zzc zzc) {
        if (zzc != null) {
            zza(sb, i10);
            sb.append("filter {\n");
            if (zzc.zzg()) {
                zza(sb, i10, "complement", (Object) Boolean.valueOf(zzc.zzf()));
            }
            if (zzc.zzi()) {
                zza(sb, i10, "param_name", (Object) zzi().zzb(zzc.zze()));
            }
            if (zzc.zzj()) {
                int i11 = i10 + 1;
                zzew.zzf zzd = zzc.zzd();
                if (zzd != null) {
                    zza(sb, i11);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (zzd.zzj()) {
                        zza(sb, i11, "match_type", (Object) zzd.zzb().name());
                    }
                    if (zzd.zzi()) {
                        zza(sb, i11, "expression", (Object) zzd.zze());
                    }
                    if (zzd.zzh()) {
                        zza(sb, i11, "case_sensitive", (Object) Boolean.valueOf(zzd.zzg()));
                    }
                    if (zzd.zza() > 0) {
                        zza(sb, i11 + 1);
                        sb.append("expression_list {\n");
                        for (String append : zzd.zzf()) {
                            zza(sb, i11 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    zza(sb, i11);
                    sb.append("}\n");
                }
            }
            if (zzc.zzh()) {
                zza(sb, i10 + 1, "number_filter", zzc.zzc());
            }
            zza(sb, i10);
            sb.append("}\n");
        }
    }

    private static void zza(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i10, String str, zzew.zzd zzd) {
        if (zzd != null) {
            zza(sb, i10);
            sb.append(str);
            sb.append(" {\n");
            if (zzd.zzh()) {
                zza(sb, i10, "comparison_type", (Object) zzd.zza().name());
            }
            if (zzd.zzj()) {
                zza(sb, i10, "match_as_float", (Object) Boolean.valueOf(zzd.zzg()));
            }
            if (zzd.zzi()) {
                zza(sb, i10, "comparison_value", (Object) zzd.zzd());
            }
            if (zzd.zzl()) {
                zza(sb, i10, "min_comparison_value", (Object) zzd.zzf());
            }
            if (zzd.zzk()) {
                zza(sb, i10, "max_comparison_value", (Object) zzd.zze());
            }
            zza(sb, i10);
            sb.append("}\n");
        }
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void zza(StringBuilder sb, int i10, String str, Object obj) {
        if (obj != null) {
            zza(sb, i10 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzfi.zzj.zza zza) {
        zzj().zzp().zza("Checking account type status for ad personalization signals");
        if (zzc(zza.zzr())) {
            zzj().zzc().zza("Turning off ad personalization due to account type");
            zzfi.zzn zzn = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(zzf().zzc()).zza(1).zzab());
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= zza.zzb()) {
                    break;
                } else if ("_npa".equals(zza.zzj(i10).zzg())) {
                    zza.zza(i10, zzn);
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                zza.zza(zzn);
            }
            if (zznp.zza() && zze().zza(zzbi.zzcm)) {
                zzak zza2 = zzak.zza(zza.zzs());
                zza2.zza(zzih.zza.AD_PERSONALIZATION, zzaj.CHILD_ACCOUNT);
                zza.zzf(zza2.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzfi.zzg.zza zza, Object obj) {
        Preconditions.checkNotNull(obj);
        zza.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfi.zzg.zza zze = zzfi.zzg.zze();
                    for (String str : bundle.keySet()) {
                        zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza2.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza2.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza2.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfi.zzg) ((zzix) zze.zzab()));
                    }
                }
            }
            zza.zza((Iterable<? extends zzfi.zzg>) arrayList);
        } else {
            zzj().zzg().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzfi.zzn.zza zza, Object obj) {
        Preconditions.checkNotNull(obj);
        zza.zzc().zzb().zza();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    static boolean zza(zzbg zzbg, zzo zzo) {
        Preconditions.checkNotNull(zzbg);
        Preconditions.checkNotNull(zzo);
        return !TextUtils.isEmpty(zzo.zzb) || !TextUtils.isEmpty(zzo.zzp);
    }

    static boolean zza(List<Long> list, int i10) {
        if (i10 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().currentTimeMillis() - j10) > j11;
    }
}
