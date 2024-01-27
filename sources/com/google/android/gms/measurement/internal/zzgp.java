package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.f;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.zzih;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzgp extends zzmo implements zzah {
    final f<String, zzb> zza = new zzgv(this, 20);
    final zzv zzb = new zzgu(this);
    /* access modifiers changed from: private */
    public final Map<String, Map<String, String>> zzc = new a();
    private final Map<String, Set<String>> zzd = new a();
    private final Map<String, Map<String, Boolean>> zze = new a();
    private final Map<String, Map<String, Boolean>> zzg = new a();
    private final Map<String, zzfc.zzd> zzh = new a();
    private final Map<String, Map<String, Integer>> zzi = new a();
    private final Map<String, String> zzj = new a();
    private final Map<String, String> zzk = new a();
    private final Map<String, String> zzl = new a();

    zzgp(zzmp zzmp) {
        super(zzmp);
    }

    private final void zzv(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzaq zze2 = zzh().zze(str);
            if (zze2 == null) {
                this.zzc.put(str, (Object) null);
                this.zze.put(str, (Object) null);
                this.zzd.put(str, (Object) null);
                this.zzg.put(str, (Object) null);
                this.zzh.put(str, (Object) null);
                this.zzj.put(str, (Object) null);
                this.zzk.put(str, (Object) null);
                this.zzl.put(str, (Object) null);
                this.zzi.put(str, (Object) null);
                return;
            }
            zzfc.zzd.zza zza2 = (zzfc.zzd.zza) zza(str, zze2.zza).zzby();
            zza(str, zza2);
            this.zzc.put(str, zza((zzfc.zzd) ((zzix) zza2.zzab())));
            this.zzh.put(str, (zzfc.zzd) ((zzix) zza2.zzab()));
            zza(str, (zzfc.zzd) ((zzix) zza2.zzab()));
            this.zzj.put(str, zza2.zzc());
            this.zzk.put(str, zze2.zzb);
            this.zzl.put(str, zze2.zzc);
        }
    }

    public final /* bridge */ /* synthetic */ zzmz g_() {
        return super.g_();
    }

    /* access modifiers changed from: package-private */
    public final long zza(String str) {
        String zza2 = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza2)) {
            return 0;
        }
        try {
            return Long.parseLong(zza2);
        } catch (NumberFormatException e10) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzfr.zza(str), e10);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzv(str);
        Map map = this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public final zzfc.zzd zzc(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
        return this.zzh.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
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

    /* access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
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
    public final boolean zzu(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(AccessToken.USER_ID_KEY);
    }

    /* access modifiers changed from: protected */
    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    /* access modifiers changed from: protected */
    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String zzf(String str) {
        zzt();
        zzv(str);
        return this.zzj.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    /* access modifiers changed from: package-private */
    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza zzb2 = zzb(str);
        if (zzb2 == null) {
            return treeSet;
        }
        for (zzfc.zza.zzf zzb3 : zzb2.zzc()) {
            treeSet.add(zzb3.zzb());
        }
        return treeSet;
    }

    /* access modifiers changed from: protected */
    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzk(String str) {
        zzt();
        zzfc.zzd zzc2 = zzc(str);
        if (zzc2 == null) {
            return false;
        }
        return zzc2.zzp();
    }

    public final boolean zzl(String str) {
        zzfc.zzd zzd2;
        if (TextUtils.isEmpty(str) || (zzd2 = this.zzh.get(str)) == null || zzd2.zza() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzm(String str) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfc.zza zzb2 = zzb(str);
        if (zzb2 != null && zzb2.zzg() && !zzb2.zzf()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzo(String str) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzr(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzs(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzt(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zznd.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zznd.zzh(str2)) {
            return true;
        }
        Map map = this.zze.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.zzg.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* access modifiers changed from: package-private */
    public final zzfc.zza zzb(String str) {
        zzt();
        zzv(str);
        zzfc.zzd zzc2 = zzc(str);
        if (zzc2 == null || !zzc2.zzq()) {
            return null;
        }
        return zzc2.zzd();
    }

    static /* synthetic */ zzb zza(zzgp zzgp, String str) {
        zzgp.zzak();
        Preconditions.checkNotEmpty(str);
        if (!zzgp.zzl(str)) {
            return null;
        }
        if (!zzgp.zzh.containsKey(str) || zzgp.zzh.get(str) == null) {
            zzgp.zzv(str);
        } else {
            zzgp.zza(str, zzgp.zzh.get(str));
        }
        return zzgp.zza.snapshot().get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(String str, zzih.zza zza2) {
        zzt();
        zzv(str);
        zzfc.zza zzb2 = zzb(str);
        if (zzb2 == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = zzb2.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (zza2 == zza(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final zzih.zza zza(String str, zzih.zza zza2) {
        zzt();
        zzv(str);
        zzfc.zza zzb2 = zzb(str);
        if (zzb2 == null) {
            return null;
        }
        for (zzfc.zza.zzc next : zzb2.zze()) {
            if (zza2 == zza(next.zzc())) {
                return zza(next.zzb());
            }
        }
        return null;
    }

    private static zzih.zza zza(zzfc.zza.zze zze2) {
        int i10 = zzgw.zzb[zze2.ordinal()];
        if (i10 == 1) {
            return zzih.zza.AD_STORAGE;
        }
        if (i10 == 2) {
            return zzih.zza.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return zzih.zza.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return zzih.zza.AD_PERSONALIZATION;
    }

    private final zzfc.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzd2 = (zzfc.zzd) ((zzix) ((zzfc.zzd.zza) zzmz.zza(zzfc.zzd.zze(), bArr)).zzab());
            zzft zzp = zzj().zzp();
            String str2 = null;
            Long valueOf = zzd2.zzs() ? Long.valueOf(zzd2.zzc()) : null;
            if (zzd2.zzr()) {
                str2 = zzd2.zzh();
            }
            zzp.zza("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzd2;
        } catch (zzji e10) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(str), e10);
            return zzfc.zzd.zzg();
        } catch (RuntimeException e11) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(str), e11);
            return zzfc.zzd.zzg();
        }
    }

    public final String zza(String str, String str2) {
        zzt();
        zzv(str);
        Map map = this.zzc.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfc.zzd zzd2) {
        a aVar = new a();
        if (zzd2 != null) {
            for (zzfc.zzg next : zzd2.zzo()) {
                aVar.put(next.zzb(), next.zzc());
            }
        }
        return aVar;
    }

    private final void zza(String str, zzfc.zzd.zza zza2) {
        HashSet hashSet = new HashSet();
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zza2 != null) {
            for (zzfc.zzb zzb2 : zza2.zze()) {
                hashSet.add(zzb2.zzb());
            }
            for (int i10 = 0; i10 < zza2.zza(); i10++) {
                zzfc.zzc.zza zza3 = (zzfc.zzc.zza) zza2.zza(i10).zzby();
                if (zza3.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb3 = zza3.zzb();
                    String zzb4 = zzii.zzb(zza3.zzb());
                    if (!TextUtils.isEmpty(zzb4)) {
                        zza3 = zza3.zza(zzb4);
                        zza2.zza(i10, zza3);
                    }
                    if (zza3.zze() && zza3.zzc()) {
                        aVar.put(zzb3, Boolean.TRUE);
                    }
                    if (zza3.zzf() && zza3.zzd()) {
                        aVar2.put(zza3.zzb(), Boolean.TRUE);
                    }
                    if (zza3.zzg()) {
                        if (zza3.zza() < 2 || zza3.zza() > 65535) {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zza3.zzb(), Integer.valueOf(zza3.zza()));
                        } else {
                            aVar3.put(zza3.zzb(), Integer.valueOf(zza3.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, aVar);
        this.zzg.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    private final void zza(String str, zzfc.zzd zzd2) {
        if (zzd2.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzd2.zza()));
        zzfp.zzc zzc2 = zzd2.zzn().get(0);
        try {
            zzb zzb2 = new zzb();
            zzb2.zza("internal.remoteConfig", new zzgq(this, str));
            zzb2.zza("internal.appMetadata", new zzgt(this, str));
            zzb2.zza("internal.logger", new zzgs(this));
            zzb2.zza(zzc2);
            this.zza.put(str, zzb2);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzc2.zza().zza()));
            for (zzfp.zzb zzb3 : zzc2.zza().zzd()) {
                zzj().zzp().zza("EES program activity", zzb3.zzb());
            }
        } catch (zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfc.zzd.zza zza2 = (zzfc.zzd.zza) zza(str, bArr).zzby();
        if (zza2 == null) {
            return false;
        }
        zza(str, zza2);
        zza(str, (zzfc.zzd) ((zzix) zza2.zzab()));
        this.zzh.put(str, (zzfc.zzd) ((zzix) zza2.zzab()));
        this.zzj.put(str, zza2.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfc.zzd) ((zzix) zza2.zzab())));
        zzh().zza(str, (List<zzew.zza>) new ArrayList(zza2.zzd()));
        try {
            zza2.zzb();
            bArr = ((zzfc.zzd) ((zzix) zza2.zzab())).zzbv();
        } catch (RuntimeException e10) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfr.zza(str), e10);
        }
        zzao zzh2 = zzh();
        Preconditions.checkNotEmpty(str);
        zzh2.zzt();
        zzh2.zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) zzh2.e_().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzh2.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfr.zza(str));
            }
        } catch (SQLiteException e11) {
            zzh2.zzj().zzg().zza("Error storing remote config. appId", zzfr.zza(str), e11);
        }
        this.zzh.put(str, (zzfc.zzd) ((zzix) zza2.zzab()));
        return true;
    }
}
