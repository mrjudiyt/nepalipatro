package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.a;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.android.gms.measurement.internal.zzih;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public class zzmp implements zzif {
    private static volatile zzmp zza;
    private List<Long> zzaa;
    private long zzab;
    private final Map<String, zzih> zzac;
    private final Map<String, zzay> zzad;
    private final Map<String, zzb> zzae;
    private zzki zzaf;
    private String zzag;
    private final zznf zzah;
    private zzgp zzb;
    private zzfy zzc;
    private zzao zzd;
    private zzgb zze;
    private zzmj zzf;
    private zzt zzg;
    private final zzmz zzh;
    private zzkg zzi;
    private zzls zzj;
    private final zzmn zzk;
    private zzgm zzl;
    /* access modifiers changed from: private */
    public final zzhf zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;
    private List<Runnable> zzq;
    private final Set<String> zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List<Long> zzz;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    private class zza implements zzas {
        zzfi.zzj zza;
        List<Long> zzb;
        List<zzfi.zze> zzc;
        private long zzd;

        private zza() {
        }

        private static long zza(zzfi.zze zze2) {
            return ((zze2.zzd() / 1000) / 60) / 60;
        }

        public final void zza(zzfi.zzj zzj) {
            Preconditions.checkNotNull(zzj);
            this.zza = zzj;
        }

        public final boolean zza(long j10, zzfi.zze zze2) {
            Preconditions.checkNotNull(zze2);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (!this.zzc.isEmpty() && zza(this.zzc.get(0)) != zza(zze2)) {
                return false;
            }
            long zzbw = this.zzd + ((long) zze2.zzbw());
            zzmp.this.zze();
            if (zzbw >= ((long) Math.max(0, zzbi.zzi.zza(null).intValue()))) {
                return false;
            }
            this.zzd = zzbw;
            this.zzc.add(zze2);
            this.zzb.add(Long.valueOf(j10));
            int size = this.zzc.size();
            zzmp.this.zze();
            if (size >= Math.max(1, zzbi.zzj.zza(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
    private class zzb {
        final String zza;
        long zzb;

        private zzb(zzmp zzmp) {
            this(zzmp, zzmp.zzq().zzp());
        }

        private zzb(zzmp zzmp, String str) {
            this.zza = str;
            this.zzb = zzmp.zzb().elapsedRealtime();
        }
    }

    private zzmp(zzna zzna) {
        this(zzna, (zzhf) null);
    }

    private final int zza(FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    zzj().zzu().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e10) {
            zzj().zzg().zza("Failed to read from channel", e10);
            return 0;
        }
    }

    private final void zzaa() {
        zzl().zzt();
        if (this.zzu || this.zzv || this.zzw) {
            zzj().zzp().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzj().zzp().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzab() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.zzgy r1 = r21.zzl()
            r1.zzt()
            r21.zzs()
            long r1 = r0.zzp
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.elapsedRealtime()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.zzp
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x004b:
            r0.zzp = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzhf r1 = r0.zzm
            boolean r1 = r1.zzaf()
            if (r1 == 0) goto L_0x024f
            boolean r1 = r21.zzac()
            if (r1 != 0) goto L_0x005d
            goto L_0x024f
        L_0x005d:
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzbi.zzaa
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()
            boolean r5 = r5.zzz()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()
            boolean r5 = r5.zzy()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.zzaf r10 = r21.zze()
            java.lang.String r10 = r10.zzn()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzv
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzu
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzbi.zzt
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.zzls r12 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r12 = r12.zzc
            long r12 = r12.zza()
            com.google.android.gms.measurement.internal.zzls r14 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r14 = r14.zzd
            long r14 = r14.zza()
            com.google.android.gms.measurement.internal.zzao r16 = r21.zzf()
            r17 = r10
            long r9 = r16.c_()
            com.google.android.gms.measurement.internal.zzao r11 = r21.zzf()
            r19 = r7
            long r6 = r11.d_()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x018e
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.zzmz r5 = r21.zzp()
            r12 = r17
            boolean r5 = r5.zza((long) r8, (long) r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x018e
            r5 = 0
        L_0x0150:
            r21.zze()
            r6 = 20
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzbi.zzac
            r8 = 0
            java.lang.Object r7 = r7.zza(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r12 = com.google.android.gms.measurement.internal.zzbi.zzab
            java.lang.Object r12 = r12.zza(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018b
            goto L_0x018e
        L_0x018b:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x018e:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x01ae:
            com.google.android.gms.measurement.internal.zzfy r1 = r21.zzh()
            boolean r1 = r1.zzu()
            if (r1 != 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zza()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        L_0x01d4:
            com.google.android.gms.measurement.internal.zzls r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r1 = r1.zzb
            long r1 = r1.zza()
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzbi.zzr
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzmz r7 = r21.zzp()
            boolean r7 = r7.zza((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01ff
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01ff:
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.common.util.Clock r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0236
            r21.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzbi.zzw
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzls r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzgi r1 = r1.zzc
            com.google.android.gms.common.util.Clock r2 = r21.zzb()
            long r2 = r2.currentTimeMillis()
            r1.zza(r2)
        L_0x0236:
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zza(r10)
            return
        L_0x024f:
            com.google.android.gms.measurement.internal.zzfr r1 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzgb r1 = r21.zzy()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzmj r1 = r21.zzz()
            r1.zzu()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzab():void");
    }

    private final boolean zzac() {
        zzl().zzt();
        zzs();
        return zzf().zzx() || !TextUtils.isEmpty(zzf().f_());
    }

    private final boolean zzad() {
        zzl().zzt();
        FileLock fileLock = this.zzx;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzm.zza().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzy = channel;
                FileLock tryLock = channel.tryLock();
                this.zzx = tryLock;
                if (tryLock != null) {
                    zzj().zzp().zza("Storage concurrent access okay");
                    return true;
                }
                zzj().zzg().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                zzj().zzg().zza("Failed to acquire storage lock", e10);
                return false;
            } catch (IOException e11) {
                zzj().zzg().zza("Failed to access storage lock file", e11);
                return false;
            } catch (OverlappingFileLockException e12) {
                zzj().zzu().zza("Storage lock already acquired", e12);
                return false;
            }
        } else {
            zzj().zzp().zza("Storage concurrent access okay");
            return true;
        }
    }

    private final zzo zzc(String str) {
        String str2;
        int i10;
        String str3 = str;
        zzh zzd2 = zzf().zzd(str3);
        if (zzd2 == null || TextUtils.isEmpty(zzd2.zzaa())) {
            zzj().zzc().zza("No app data available; dropping", str3);
            return null;
        }
        Boolean zza2 = zza(zzd2);
        if (zza2 == null || zza2.booleanValue()) {
            zzih zzb2 = zzb(str);
            if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
                str2 = "";
                i10 = 100;
            } else {
                str2 = zzd(str).zzf();
                i10 = zzb2.zza();
            }
            zzh zzh2 = zzd2;
            return new zzo(str, zzd2.zzac(), zzd2.zzaa(), zzd2.zzc(), zzd2.zzz(), zzd2.zzo(), zzd2.zzl(), (String) null, zzd2.zzak(), false, zzd2.zzab(), zzd2.zzb(), 0, 0, zzh2.zzaj(), false, zzh2.zzv(), zzh2.zzu(), zzh2.zzm(), zzh2.zzag(), (String) null, zzb2.zze(), "", (String) null, zzh2.zzam(), zzh2.zzt(), i10, str2, zzh2.zza(), zzh2.zzd());
        }
        zzj().zzg().zza("App version does not match; dropping. appId", zzfr.zza(str));
        return null;
    }

    private final long zzx() {
        long currentTimeMillis = zzb().currentTimeMillis();
        zzls zzls = this.zzj;
        zzls.zzak();
        zzls.zzt();
        long zza2 = zzls.zze.zza();
        if (zza2 == 0) {
            zza2 = 1 + ((long) zzls.zzq().zzv().nextInt(86400000));
            zzls.zze.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    private final zzgb zzy() {
        zzgb zzgb = this.zze;
        if (zzgb != null) {
            return zzgb;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzmj zzz() {
        return (zzmj) zza((zzmo) this.zzf);
    }

    public final Clock zzb() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzb();
    }

    public final zzae zzd() {
        return this.zzm.zzd();
    }

    public final zzaf zze() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzf();
    }

    public final zzao zzf() {
        return (zzao) zza((zzmo) this.zzd);
    }

    public final zzfq zzg() {
        return this.zzm.zzk();
    }

    public final zzfy zzh() {
        return (zzfy) zza((zzmo) this.zzc);
    }

    public final zzgp zzi() {
        return (zzgp) zza((zzmo) this.zzb);
    }

    public final zzfr zzj() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzj();
    }

    /* access modifiers changed from: package-private */
    public final zzhf zzk() {
        return this.zzm;
    }

    public final zzgy zzl() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzl();
    }

    public final zzkg zzm() {
        return (zzkg) zza((zzmo) this.zzi);
    }

    public final zzls zzn() {
        return this.zzj;
    }

    public final zzmn zzo() {
        return this.zzk;
    }

    public final zzmz zzp() {
        return (zzmz) zza((zzmo) this.zzh);
    }

    public final zznd zzq() {
        return ((zzhf) Preconditions.checkNotNull(this.zzm)).zzt();
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzl().zzt();
        zzs();
        if (!this.zzo) {
            this.zzo = true;
            if (zzad()) {
                int zza2 = zza(this.zzy);
                int zzab2 = this.zzm.zzh().zzab();
                zzl().zzt();
                if (zza2 > zzab2) {
                    zzj().zzg().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                } else if (zza2 >= zzab2) {
                } else {
                    if (zza(zzab2, this.zzy)) {
                        zzj().zzp().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                    } else {
                        zzj().zzg().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzab2));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs() {
        if (!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        this.zzt++;
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        this.zzs++;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        zzl().zzt();
        zzf().zzv();
        if (this.zzj.zzc.zza() == 0) {
            this.zzj.zzc.zza(zzb().currentTimeMillis());
        }
        zzab();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        zzj().zzg().zza("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzfr.zza(r6), r3.zza());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0406 */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x030d A[Catch:{ all -> 0x0448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x030e A[Catch:{ all -> 0x0448 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzw() {
        /*
            r21 = this;
            r7 = r21
            com.google.android.gms.measurement.internal.zzgy r0 = r21.zzl()
            r0.zzt()
            r21.zzs()
            r0 = 1
            r7.zzw = r0
            r8 = 0
            com.google.android.gms.measurement.internal.zzhf r1 = r7.zzm     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzkp r1 = r1.zzr()     // Catch:{ all -> 0x0448 }
            java.lang.Boolean r1 = r1.zzab()     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
            r0.zza(r1)     // Catch:{ all -> 0x0448 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x002f:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0048
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            r0.zza(r1)     // Catch:{ all -> 0x0448 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x0048:
            long r1 = r7.zzp     // Catch:{ all -> 0x0448 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0059
            r21.zzab()     // Catch:{ all -> 0x0448 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x0059:
            com.google.android.gms.measurement.internal.zzgy r1 = r21.zzl()     // Catch:{ all -> 0x0448 }
            r1.zzt()     // Catch:{ all -> 0x0448 }
            java.util.List<java.lang.Long> r1 = r7.zzz     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x007c
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Uploading requested multiple times"
            r0.zza(r1)     // Catch:{ all -> 0x0448 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x007c:
            com.google.android.gms.measurement.internal.zzfy r1 = r21.zzh()     // Catch:{ all -> 0x0448 }
            boolean r1 = r1.zzu()     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.zza(r1)     // Catch:{ all -> 0x0448 }
            r21.zzab()     // Catch:{ all -> 0x0448 }
            r7.zzw = r8
            r21.zzaa()
            return
        L_0x009c:
            com.google.android.gms.common.util.Clock r1 = r21.zzb()     // Catch:{ all -> 0x0448 }
            long r1 = r1.currentTimeMillis()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzaf r5 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.zzbi.zzar     // Catch:{ all -> 0x0448 }
            r9 = 0
            int r5 = r5.zzb(r9, r6)     // Catch:{ all -> 0x0448 }
            r21.zze()     // Catch:{ all -> 0x0448 }
            long r10 = com.google.android.gms.measurement.internal.zzaf.zzh()     // Catch:{ all -> 0x0448 }
            long r10 = r1 - r10
            r6 = 0
        L_0x00b9:
            if (r6 >= r5) goto L_0x00c4
            boolean r12 = r7.zza((java.lang.String) r9, (long) r10)     // Catch:{ all -> 0x0448 }
            if (r12 == 0) goto L_0x00c4
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00c4:
            boolean r5 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0448 }
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.measurement.internal.zzgy r5 = r21.zzl()     // Catch:{ all -> 0x0448 }
            r5.zzt()     // Catch:{ all -> 0x0448 }
            java.util.Set<java.lang.String> r5 = r7.zzr     // Catch:{ all -> 0x0448 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0448 }
        L_0x00d7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0448 }
            if (r6 == 0) goto L_0x0119
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0448 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0448 }
            boolean r10 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0448 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.zzaf r10 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.zze(r6, r11)     // Catch:{ all -> 0x0448 }
            if (r10 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.zzfr r10 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzc()     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = "Notifying app that trigger URIs are available. App ID"
            r10.zza(r11, r6)     // Catch:{ all -> 0x0448 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0448 }
            r10.<init>()     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r10.setAction(r11)     // Catch:{ all -> 0x0448 }
            r10.setPackage(r6)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzhf r6 = r7.zzm     // Catch:{ all -> 0x0448 }
            android.content.Context r6 = r6.zza()     // Catch:{ all -> 0x0448 }
            r6.sendBroadcast(r10)     // Catch:{ all -> 0x0448 }
            goto L_0x00d7
        L_0x0119:
            java.util.Set<java.lang.String> r5 = r7.zzr     // Catch:{ all -> 0x0448 }
            r5.clear()     // Catch:{ all -> 0x0448 }
        L_0x011e:
            com.google.android.gms.measurement.internal.zzls r5 = r7.zzj     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzgi r5 = r5.zzc     // Catch:{ all -> 0x0448 }
            long r5 = r5.zza()     // Catch:{ all -> 0x0448 }
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0141
            com.google.android.gms.measurement.internal.zzfr r3 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzc()     // Catch:{ all -> 0x0448 }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0448 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0448 }
            r3.zza(r4, r5)     // Catch:{ all -> 0x0448 }
        L_0x0141:
            com.google.android.gms.measurement.internal.zzao r3 = r21.zzf()     // Catch:{ all -> 0x0448 }
            java.lang.String r6 = r3.f_()     // Catch:{ all -> 0x0448 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0448 }
            r4 = -1
            if (r3 != 0) goto L_0x041c
            long r10 = r7.zzab     // Catch:{ all -> 0x0448 }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.zzao r3 = r21.zzf()     // Catch:{ all -> 0x0448 }
            long r3 = r3.b_()     // Catch:{ all -> 0x0448 }
            r7.zzab = r3     // Catch:{ all -> 0x0448 }
        L_0x0161:
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r4 = com.google.android.gms.measurement.internal.zzbi.zzg     // Catch:{ all -> 0x0448 }
            int r3 = r3.zzb(r6, r4)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzaf r4 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.zzbi.zzh     // Catch:{ all -> 0x0448 }
            int r4 = r4.zzb(r6, r5)     // Catch:{ all -> 0x0448 }
            int r4 = java.lang.Math.max(r8, r4)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzao r5 = r21.zzf()     // Catch:{ all -> 0x0448 }
            java.util.List r3 = r5.zza((java.lang.String) r6, (int) r3, (int) r4)     // Catch:{ all -> 0x0448 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r4 != 0) goto L_0x0441
            com.google.android.gms.measurement.internal.zzih r4 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            boolean r4 = r4.zzg()     // Catch:{ all -> 0x0448 }
            if (r4 == 0) goto L_0x01e4
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0448 }
        L_0x0195:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0448 }
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0448 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x0448 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = (com.google.android.gms.internal.measurement.zzfi.zzj) r5     // Catch:{ all -> 0x0448 }
            java.lang.String r10 = r5.zzal()     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r10 != 0) goto L_0x0195
            java.lang.String r4 = r5.zzal()     // Catch:{ all -> 0x0448 }
            goto L_0x01b5
        L_0x01b4:
            r4 = r9
        L_0x01b5:
            if (r4 == 0) goto L_0x01e4
            r5 = 0
        L_0x01b8:
            int r10 = r3.size()     // Catch:{ all -> 0x0448 }
            if (r5 >= r10) goto L_0x01e4
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x0448 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0448 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = (com.google.android.gms.internal.measurement.zzfi.zzj) r10     // Catch:{ all -> 0x0448 }
            java.lang.String r11 = r10.zzal()     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0448 }
            if (r11 != 0) goto L_0x01e1
            java.lang.String r10 = r10.zzal()     // Catch:{ all -> 0x0448 }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x0448 }
            if (r10 != 0) goto L_0x01e1
            java.util.List r3 = r3.subList(r8, r5)     // Catch:{ all -> 0x0448 }
            goto L_0x01e4
        L_0x01e1:
            int r5 = r5 + 1
            goto L_0x01b8
        L_0x01e4:
            com.google.android.gms.internal.measurement.zzfi$zzi$zza r4 = com.google.android.gms.internal.measurement.zzfi.zzi.zzb()     // Catch:{ all -> 0x0448 }
            int r5 = r3.size()     // Catch:{ all -> 0x0448 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0448 }
            int r11 = r3.size()     // Catch:{ all -> 0x0448 }
            r10.<init>(r11)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzaf r11 = r21.zze()     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.zzk(r6)     // Catch:{ all -> 0x0448 }
            if (r11 == 0) goto L_0x020b
            com.google.android.gms.measurement.internal.zzih r11 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            boolean r11 = r11.zzg()     // Catch:{ all -> 0x0448 }
            if (r11 == 0) goto L_0x020b
            r11 = 1
            goto L_0x020c
        L_0x020b:
            r11 = 0
        L_0x020c:
            com.google.android.gms.measurement.internal.zzih r12 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            boolean r12 = r12.zzg()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzih r13 = r7.zzb((java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            boolean r13 = r13.zzh()     // Catch:{ all -> 0x0448 }
            boolean r14 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0448 }
            if (r14 == 0) goto L_0x0230
            com.google.android.gms.measurement.internal.zzaf r14 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzbi.zzbt     // Catch:{ all -> 0x0448 }
            boolean r14 = r14.zze(r6, r15)     // Catch:{ all -> 0x0448 }
            if (r14 == 0) goto L_0x0230
            r14 = 1
            goto L_0x0231
        L_0x0230:
            r14 = 0
        L_0x0231:
            r15 = 0
        L_0x0232:
            if (r15 >= r5) goto L_0x0345
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0448 }
            r9 = r16
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0448 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = (com.google.android.gms.internal.measurement.zzfi.zzj) r9     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix$zzb r9 = r9.zzby()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ all -> 0x0448 }
            java.lang.Object r16 = r3.get(r15)     // Catch:{ all -> 0x0448 }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0448 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0448 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0448 }
            r10.add(r0)     // Catch:{ all -> 0x0448 }
            r21.zze()     // Catch:{ all -> 0x0448 }
            r0 = r3
            r16 = r4
            r3 = 82001(0x14051, double:4.0514E-319)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r9.zzl((long) r3)     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r3 = r3.zzk((long) r1)     // Catch:{ all -> 0x0448 }
            r3.zzd((boolean) r8)     // Catch:{ all -> 0x0448 }
            if (r11 != 0) goto L_0x026e
            r9.zzh()     // Catch:{ all -> 0x0448 }
        L_0x026e:
            if (r12 != 0) goto L_0x0276
            r9.zzo()     // Catch:{ all -> 0x0448 }
            r9.zzk()     // Catch:{ all -> 0x0448 }
        L_0x0276:
            if (r13 != 0) goto L_0x027b
            r9.zze()     // Catch:{ all -> 0x0448 }
        L_0x027b:
            r7.zza((java.lang.String) r6, (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9)     // Catch:{ all -> 0x0448 }
            if (r14 != 0) goto L_0x0283
            r9.zzp()     // Catch:{ all -> 0x0448 }
        L_0x0283:
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0311
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0448 }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0311
            java.lang.String r3 = r9.zzv()     // Catch:{ all -> 0x0448 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0448 }
            if (r4 != 0) goto L_0x02ab
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x02a8
            goto L_0x02ab
        L_0x02a8:
            r20 = r0
            goto L_0x0307
        L_0x02ab:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0448 }
            java.util.List r4 = r9.zzw()     // Catch:{ all -> 0x0448 }
            r3.<init>(r4)     // Catch:{ all -> 0x0448 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0448 }
            r17 = 0
            r18 = 0
        L_0x02bc:
            boolean r19 = r4.hasNext()     // Catch:{ all -> 0x0448 }
            if (r19 == 0) goto L_0x02f3
            java.lang.Object r19 = r4.next()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zze r19 = (com.google.android.gms.internal.measurement.zzfi.zze) r19     // Catch:{ all -> 0x0448 }
            java.lang.String r8 = "_fx"
            r20 = r0
            java.lang.String r0 = r19.zzg()     // Catch:{ all -> 0x0448 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x02e1
            r4.remove()     // Catch:{ all -> 0x0448 }
            r0 = r20
            r8 = 0
            r17 = 1
            r18 = 1
            goto L_0x02bc
        L_0x02e1:
            java.lang.String r0 = "_f"
            java.lang.String r8 = r19.zzg()     // Catch:{ all -> 0x0448 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x02ef
            r18 = 1
        L_0x02ef:
            r0 = r20
            r8 = 0
            goto L_0x02bc
        L_0x02f3:
            r20 = r0
            if (r17 == 0) goto L_0x02fd
            r9.zzi()     // Catch:{ all -> 0x0448 }
            r9.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r3)     // Catch:{ all -> 0x0448 }
        L_0x02fd:
            if (r18 == 0) goto L_0x0307
            java.lang.String r0 = r9.zzr()     // Catch:{ all -> 0x0448 }
            r3 = 1
            r7.zza((java.lang.String) r0, (boolean) r3)     // Catch:{ all -> 0x0448 }
        L_0x0307:
            int r0 = r9.zza()     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x030e
            goto L_0x0313
        L_0x030e:
            r0 = r16
            goto L_0x033b
        L_0x0311:
            r20 = r0
        L_0x0313:
            com.google.android.gms.measurement.internal.zzaf r0 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbd     // Catch:{ all -> 0x0448 }
            boolean r0 = r0.zze(r6, r3)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x0336
            com.google.android.gms.internal.measurement.zzkj r0 = r9.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r0 = (com.google.android.gms.internal.measurement.zzix) r0     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = (com.google.android.gms.internal.measurement.zzfi.zzj) r0     // Catch:{ all -> 0x0448 }
            byte[] r0 = r0.zzbv()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzmz r3 = r21.zzp()     // Catch:{ all -> 0x0448 }
            long r3 = r3.zza((byte[]) r0)     // Catch:{ all -> 0x0448 }
            r9.zza((long) r3)     // Catch:{ all -> 0x0448 }
        L_0x0336:
            r0 = r16
            r0.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9)     // Catch:{ all -> 0x0448 }
        L_0x033b:
            int r15 = r15 + 1
            r4 = r0
            r3 = r20
            r0 = 1
            r8 = 0
            r9 = 0
            goto L_0x0232
        L_0x0345:
            r0 = r4
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0372
            com.google.android.gms.measurement.internal.zzaf r3 = r21.zze()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0448 }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0372
            int r3 = r0.zza()     // Catch:{ all -> 0x0448 }
            if (r3 != 0) goto L_0x0372
            r7.zza((java.util.List<java.lang.Long>) r10)     // Catch:{ all -> 0x0448 }
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r1 = r21
            r1.zza((boolean) r2, (int) r3, (java.lang.Throwable) r4, (byte[]) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            r1 = 0
            r7.zzw = r1
            r21.zzaa()
            return
        L_0x0372:
            com.google.android.gms.measurement.internal.zzfr r3 = r21.zzj()     // Catch:{ all -> 0x0448 }
            r4 = 2
            boolean r3 = r3.zza((int) r4)     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x038e
            com.google.android.gms.measurement.internal.zzmz r3 = r21.zzp()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzkj r4 = r0.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzi r4 = (com.google.android.gms.internal.measurement.zzfi.zzi) r4     // Catch:{ all -> 0x0448 }
            java.lang.String r9 = r3.zza((com.google.android.gms.internal.measurement.zzfi.zzi) r4)     // Catch:{ all -> 0x0448 }
            goto L_0x038f
        L_0x038e:
            r9 = 0
        L_0x038f:
            r21.zzp()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzkj r3 = r0.zzab()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3     // Catch:{ all -> 0x0448 }
            com.google.android.gms.internal.measurement.zzfi$zzi r3 = (com.google.android.gms.internal.measurement.zzfi.zzi) r3     // Catch:{ all -> 0x0448 }
            byte[] r14 = r3.zzbv()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzmn r3 = r7.zzk     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzmq r3 = r3.zza(r6)     // Catch:{ all -> 0x0448 }
            r7.zza((java.util.List<java.lang.Long>) r10)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzls r4 = r7.zzj     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzgi r4 = r4.zzd     // Catch:{ MalformedURLException -> 0x0406 }
            r4.zza(r1)     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r1 = "?"
            if (r5 <= 0) goto L_0x03bb
            r2 = 0
            com.google.android.gms.internal.measurement.zzfi$zzj r0 = r0.zza((int) r2)     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r1 = r0.zzx()     // Catch:{ MalformedURLException -> 0x0406 }
        L_0x03bb:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r2 = "Uploading data. app, uncompressed size, data"
            int r4 = r14.length     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ MalformedURLException -> 0x0406 }
            r0.zza(r2, r1, r4, r9)     // Catch:{ MalformedURLException -> 0x0406 }
            r0 = 1
            r7.zzv = r0     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzfy r11 = r21.zzh()     // Catch:{ MalformedURLException -> 0x0406 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0406 }
            java.lang.String r0 = r3.zza()     // Catch:{ MalformedURLException -> 0x0406 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0406 }
            java.util.Map r15 = r3.zzb()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzmr r0 = new com.google.android.gms.measurement.internal.zzmr     // Catch:{ MalformedURLException -> 0x0406 }
            r0.<init>(r7, r6)     // Catch:{ MalformedURLException -> 0x0406 }
            r11.zzt()     // Catch:{ MalformedURLException -> 0x0406 }
            r11.zzak()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzgy r1 = r11.zzl()     // Catch:{ MalformedURLException -> 0x0406 }
            com.google.android.gms.measurement.internal.zzgc r2 = new com.google.android.gms.measurement.internal.zzgc     // Catch:{ MalformedURLException -> 0x0406 }
            r10 = r2
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0406 }
            r1.zza((java.lang.Runnable) r2)     // Catch:{ MalformedURLException -> 0x0406 }
            goto L_0x0441
        L_0x0406:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r6)     // Catch:{ all -> 0x0448 }
            java.lang.String r3 = r3.zza()     // Catch:{ all -> 0x0448 }
            r0.zza(r1, r2, r3)     // Catch:{ all -> 0x0448 }
            goto L_0x0441
        L_0x041c:
            r7.zzab = r4     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzao r0 = r21.zzf()     // Catch:{ all -> 0x0448 }
            r21.zze()     // Catch:{ all -> 0x0448 }
            long r3 = com.google.android.gms.measurement.internal.zzaf.zzh()     // Catch:{ all -> 0x0448 }
            long r1 = r1 - r3
            java.lang.String r0 = r0.zza((long) r1)     // Catch:{ all -> 0x0448 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0441
            com.google.android.gms.measurement.internal.zzao r1 = r21.zzf()     // Catch:{ all -> 0x0448 }
            com.google.android.gms.measurement.internal.zzh r0 = r1.zzd(r0)     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x0441
            r7.zzb((com.google.android.gms.measurement.internal.zzh) r0)     // Catch:{ all -> 0x0448 }
        L_0x0441:
            r1 = 0
            r7.zzw = r1
            r21.zzaa()
            return
        L_0x0448:
            r0 = move-exception
            r1 = 0
            r7.zzw = r1
            r21.zzaa()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzw():void");
    }

    private zzmp(zzna zzna, zzhf zzhf) {
        this.zzn = false;
        this.zzr = new HashSet();
        this.zzah = new zzmw(this);
        Preconditions.checkNotNull(zzna);
        this.zzm = zzhf.zza(zzna.zza, (zzdd) null, (Long) null);
        this.zzab = -1;
        this.zzk = new zzmn(this);
        zzmz zzmz = new zzmz(this);
        zzmz.zzal();
        this.zzh = zzmz;
        zzfy zzfy = new zzfy(this);
        zzfy.zzal();
        this.zzc = zzfy;
        zzgp zzgp = new zzgp(this);
        zzgp.zzal();
        this.zzb = zzgp;
        this.zzac = new HashMap();
        this.zzad = new HashMap();
        this.zzae = new HashMap();
        zzl().zzb((Runnable) new zzms(this, zzna));
    }

    private final zzay zzd(String str) {
        zzl().zzt();
        zzs();
        if (!zznp.zza()) {
            return zzay.zza;
        }
        zzay zzay = this.zzad.get(str);
        if (zzay != null) {
            return zzay;
        }
        zzay zzf2 = zzf().zzf(str);
        this.zzad.put(str, zzf2);
        return zzf2;
    }

    private static boolean zze(zzo zzo2) {
        return !TextUtils.isEmpty(zzo2.zzb) || !TextUtils.isEmpty(zzo2.zzp);
    }

    /* access modifiers changed from: package-private */
    public final zzih zzb(String str) {
        zzl().zzt();
        zzs();
        zzih zzih = this.zzac.get(str);
        if (zzih == null) {
            zzih = zzf().zzg(str);
            if (zzih == null) {
                zzih = zzih.zza;
            }
            zza(str, zzih);
        }
        return zzih;
    }

    /* access modifiers changed from: package-private */
    public final String zzb(zzo zzo2) {
        try {
            return (String) zzl().zza(new zzmt(this, zzo2)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzj().zzg().zza("Failed to get app instance id. appId", zzfr.zza(zzo2.zza), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzo zzo2) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzaa = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzao zzf2 = zzf();
        String str = (String) Preconditions.checkNotNull(zzo2.zza);
        Preconditions.checkNotEmpty(str);
        zzf2.zzt();
        zzf2.zzak();
        try {
            SQLiteDatabase e_ = zzf2.e_();
            String[] strArr = {str};
            int delete = e_.delete("apps", "app_id=?", strArr) + 0 + e_.delete("events", "app_id=?", strArr) + e_.delete("user_attributes", "app_id=?", strArr) + e_.delete("conditional_properties", "app_id=?", strArr) + e_.delete("raw_events", "app_id=?", strArr) + e_.delete("raw_events_metadata", "app_id=?", strArr) + e_.delete("queue", "app_id=?", strArr) + e_.delete("audience_filter_values", "app_id=?", strArr) + e_.delete("main_event_params", "app_id=?", strArr) + e_.delete("default_event_params", "app_id=?", strArr) + e_.delete("trigger_uris", "app_id=?", strArr);
            if (delete > 0) {
                zzf2.zzj().zzp().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            zzf2.zzj().zzg().zza("Error resetting analytics data. appId, error", zzfr.zza(str), e10);
        }
        if (zzo2.zzh) {
            zzc(zzo2);
        }
    }

    public final Context zza() {
        return this.zzm.zza();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r5.zzl()
            r0.zzt()
            r5.zzs()
            boolean r0 = com.google.android.gms.internal.measurement.zznp.zza()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.google.android.gms.measurement.internal.zzgp r0 = r5.zzi()
            com.google.android.gms.internal.measurement.zzfc$zza r0 = r0.zzb(r6)
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzih r1 = r5.zzb((java.lang.String) r6)
            android.os.Bundle r2 = r1.zzb()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.zzay r2 = r5.zzd((java.lang.String) r6)
            com.google.android.gms.measurement.internal.zzak r3 = new com.google.android.gms.measurement.internal.zzak
            r3.<init>()
            com.google.android.gms.measurement.internal.zzay r1 = r5.zza(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.zzb()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.zzmz r1 = r5.zzp()
            boolean r1 = r1.zzc((java.lang.String) r6)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.zzao r1 = r5.zzf()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.zzne r1 = r1.zze(r6, r3)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r6 = r1.zze
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L_0x0071
        L_0x0064:
            com.google.android.gms.measurement.internal.zzgp r1 = r5.zzb
            com.google.android.gms.measurement.internal.zzih$zza r3 = com.google.android.gms.measurement.internal.zzih.zza.AD_PERSONALIZATION
            boolean r6 = r1.zzb((java.lang.String) r6, (com.google.android.gms.measurement.internal.zzih.zza) r3)
            if (r6 == 0) goto L_0x0070
            r6 = 0
            goto L_0x0071
        L_0x0070:
            r6 = 1
        L_0x0071:
            if (r6 != r2) goto L_0x0076
            java.lang.String r6 = "denied"
            goto L_0x0078
        L_0x0076:
            java.lang.String r6 = "granted"
        L_0x0078:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String):android.os.Bundle");
    }

    private final void zzb(zzh zzh2) {
        zzl().zzt();
        if (!TextUtils.isEmpty(zzh2.zzac()) || !TextUtils.isEmpty(zzh2.zzv())) {
            Uri.Builder builder = new Uri.Builder();
            String zzac2 = zzh2.zzac();
            if (TextUtils.isEmpty(zzac2)) {
                zzac2 = zzh2.zzv();
            }
            a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme(zzbi.zze.zza(null)).encodedAuthority(zzbi.zzf.zza(null));
            encodedAuthority.path("config/app/" + zzac2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(zzh2.zzx());
                URL url = new URL(uri);
                zzj().zzp().zza("Fetching remote configuration", str);
                zzfc.zzd zzc2 = zzi().zzc(str);
                String zze2 = zzi().zze(str);
                if (zzc2 != null) {
                    if (!TextUtils.isEmpty(zze2)) {
                        aVar = new a();
                        aVar.put("If-Modified-Since", zze2);
                    }
                    String zzd2 = zzi().zzd(str);
                    if (!TextUtils.isEmpty(zzd2)) {
                        if (aVar == null) {
                            aVar = new a();
                        }
                        aVar.put("If-None-Match", zzd2);
                    }
                }
                this.zzu = true;
                zzfy zzh3 = zzh();
                zzmu zzmu = new zzmu(this);
                zzh3.zzt();
                zzh3.zzak();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzmu);
                zzh3.zzl().zza((Runnable) new zzgc(zzh3, str, url, (byte[]) null, aVar, zzmu));
            } catch (MalformedURLException unused) {
                zzj().zzg().zza("Failed to parse config URL. Not fetching. appId", zzfr.zza(zzh2.zzx()), uri);
            }
        } else {
            zza((String) Preconditions.checkNotNull(zzh2.zzx()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzh zza(zzo zzo2) {
        zzl().zzt();
        zzs();
        Preconditions.checkNotNull(zzo2);
        Preconditions.checkNotEmpty(zzo2.zza);
        if (!zzo2.zzu.isEmpty()) {
            this.zzae.put(zzo2.zza, new zzb(zzo2.zzu));
        }
        zzh zzd2 = zzf().zzd(zzo2.zza);
        zzih zza2 = zzb(zzo2.zza).zza(zzih.zza(zzo2.zzt));
        String zza3 = zza2.zzg() ? this.zzj.zza(zzo2.zza, zzo2.zzn) : "";
        if (zzd2 == null) {
            zzd2 = new zzh(this.zzm, zzo2.zza);
            if (zza2.zzh()) {
                zzd2.zzb(zza(zza2));
            }
            if (zza2.zzg()) {
                zzd2.zzh(zza3);
            }
        } else if (zza2.zzg() && zza3 != null && !zza3.equals(zzd2.zzae())) {
            zzd2.zzh(zza3);
            if (zzo2.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzj.zza(zzo2.zza, zza2).first)) {
                zzd2.zzb(zza(zza2));
                if (zzf().zze(zzo2.zza, "_id") != null && zzf().zze(zzo2.zza, "_lair") == null) {
                    zzf().zza(new zzne(zzo2.zza, "auto", "_lair", zzb().currentTimeMillis(), 1L));
                }
            }
        } else if (TextUtils.isEmpty(zzd2.zzy()) && zza2.zzh()) {
            zzd2.zzb(zza(zza2));
        }
        zzd2.zzf(zzo2.zzb);
        zzd2.zza(zzo2.zzp);
        if (!TextUtils.isEmpty(zzo2.zzk)) {
            zzd2.zze(zzo2.zzk);
        }
        long j10 = zzo2.zze;
        if (j10 != 0) {
            zzd2.zzm(j10);
        }
        if (!TextUtils.isEmpty(zzo2.zzc)) {
            zzd2.zzd(zzo2.zzc);
        }
        zzd2.zza(zzo2.zzj);
        String str = zzo2.zzd;
        if (str != null) {
            zzd2.zzc(str);
        }
        zzd2.zzj(zzo2.zzf);
        zzd2.zzb(zzo2.zzh);
        if (!TextUtils.isEmpty(zzo2.zzg)) {
            zzd2.zzg(zzo2.zzg);
        }
        zzd2.zza(zzo2.zzn);
        zzd2.zza(zzo2.zzq);
        zzd2.zzk(zzo2.zzr);
        if (zzps.zza() && (zze().zza(zzbi.zzbr) || zze().zze(zzo2.zza, zzbi.zzbt))) {
            zzd2.zzi(zzo2.zzv);
        }
        if (zznq.zza() && zze().zza(zzbi.zzbq)) {
            zzd2.zza(zzo2.zzs);
        } else if (zznq.zza() && zze().zza(zzbi.zzbp)) {
            zzd2.zza((List<String>) null);
        }
        if (zzqd.zza() && zze().zza(zzbi.zzbu)) {
            zzd2.zzc(zzo2.zzw);
        }
        if (zzpg.zza() && zze().zza(zzbi.zzcf)) {
            zzd2.zza(zzo2.zzaa);
        }
        zzd2.zzr(zzo2.zzx);
        if (zzd2.zzal()) {
            zzf().zza(zzd2);
        }
        return zzd2;
    }

    public final zzt zzc() {
        return (zzt) zza((zzmo) this.zzg);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03c3 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ee A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0405 A[SYNTHETIC, Splitter:B:131:0x0405] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04c1 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x052e A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0210 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0231 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0244 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0257 A[Catch:{ SQLiteException -> 0x01c4, all -> 0x055c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.measurement.internal.zzo r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.zzgy r9 = r23.zzl()
            r9.zzt()
            r23.zzs()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            java.lang.String r9 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            boolean r9 = zze(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.zzao r9 = r23.zzf()
            java.lang.String r10 = r2.zza
            com.google.android.gms.measurement.internal.zzh r9 = r9.zzd(r10)
            r10 = 0
            if (r9 == 0) goto L_0x005e
            java.lang.String r12 = r9.zzac()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x005e
            java.lang.String r12 = r2.zzb
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x005e
            r9.zzc((long) r10)
            com.google.android.gms.measurement.internal.zzao r12 = r23.zzf()
            r12.zza((com.google.android.gms.measurement.internal.zzh) r9)
            com.google.android.gms.measurement.internal.zzgp r9 = r23.zzi()
            java.lang.String r12 = r2.zza
            r9.zzj(r12)
        L_0x005e:
            boolean r9 = r2.zzh
            if (r9 != 0) goto L_0x0066
            r23.zza((com.google.android.gms.measurement.internal.zzo) r24)
            return
        L_0x0066:
            long r12 = r2.zzl
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r9 = r23.zzb()
            long r12 = r9.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzhf r9 = r1.zzm
            com.google.android.gms.measurement.internal.zzba r9 = r9.zzg()
            r9.zzm()
            int r9 = r2.zzm
            r15 = 1
            if (r9 == 0) goto L_0x009c
            if (r9 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzfr r16 = r23.zzj()
            com.google.android.gms.measurement.internal.zzft r14 = r16.zzu()
            java.lang.String r15 = r2.zza
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r14.zza(r10, r15, r9)
            r9 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzao r10 = r23.zzf()
            r10.zzp()
            com.google.android.gms.measurement.internal.zzao r10 = r23.zzf()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzne r10 = r10.zze(r11, r0)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x00c1
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.zzb     // Catch:{ all -> 0x055c }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0107
        L_0x00c1:
            java.lang.Boolean r11 = r2.zzq     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00fc
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_npa"
            java.lang.Boolean r11 = r2.zzq     // Catch:{ all -> 0x055c }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x055c }
            if (r11 == 0) goto L_0x00d4
            r20 = 1
            goto L_0x00d6
        L_0x00d4:
            r20 = 0
        L_0x00d6:
            java.lang.Long r11 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x055c }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 0
            r14 = r0
            r4 = 1
            r16 = r12
            r18 = r11
            r19 = r20
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x00f8
            java.lang.Object r10 = r10.zze     // Catch:{ all -> 0x055c }
            java.lang.Long r11 = r0.zzc     // Catch:{ all -> 0x055c }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x055c }
            if (r10 != 0) goto L_0x0107
        L_0x00f8:
            r1.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            goto L_0x0107
        L_0x00fc:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0107
            r1.zza((java.lang.String) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
        L_0x0107:
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()     // Catch:{ all -> 0x055c }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x055c }
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzd(r10)     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x01d7
            r23.zzq()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r2.zzb     // Catch:{ all -> 0x055c }
            java.lang.String r14 = r0.zzac()     // Catch:{ all -> 0x055c }
            java.lang.String r15 = r2.zzp     // Catch:{ all -> 0x055c }
            java.lang.String r10 = r0.zzv()     // Catch:{ all -> 0x055c }
            boolean r10 = com.google.android.gms.measurement.internal.zznd.zza((java.lang.String) r11, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r10)     // Catch:{ all -> 0x055c }
            if (r10 == 0) goto L_0x01d7
            com.google.android.gms.measurement.internal.zzfr r10 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzu()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r0.zzx()     // Catch:{ all -> 0x055c }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r14)     // Catch:{ all -> 0x055c }
            r10.zza(r11, r14)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzao r10 = r23.zzf()     // Catch:{ all -> 0x055c }
            java.lang.String r11 = r0.zzx()     // Catch:{ all -> 0x055c }
            r10.zzak()     // Catch:{ all -> 0x055c }
            r10.zzt()     // Catch:{ all -> 0x055c }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)     // Catch:{ all -> 0x055c }
            android.database.sqlite.SQLiteDatabase r0 = r10.e_()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String[] r14 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01c4 }
            r14[r3] = r11     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r15 = "events"
            int r15 = r0.delete(r15, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "user_attributes"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "conditional_properties"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "apps"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "raw_events_metadata"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "event_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "property_filters"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "audience_filter_values"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "consent_settings"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "default_event_params"
            int r3 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r3
            java.lang.String r3 = "trigger_uris"
            int r0 = r0.delete(r3, r8, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.zzfr r0 = r10.zzj()     // Catch:{ SQLiteException -> 0x01c4 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()     // Catch:{ SQLiteException -> 0x01c4 }
            java.lang.String r3 = "Deleted application data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01c4 }
            r0.zza(r3, r11, r8)     // Catch:{ SQLiteException -> 0x01c4 }
            goto L_0x01d6
        L_0x01c4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r10.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r11)     // Catch:{ all -> 0x055c }
            r3.zza(r8, r10, r0)     // Catch:{ all -> 0x055c }
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x0231
            long r10 = r0.zzc()     // Catch:{ all -> 0x055c }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x01f1
            long r10 = r0.zzc()     // Catch:{ all -> 0x055c }
            r3 = r5
            long r4 = r2.zzj     // Catch:{ all -> 0x055c }
            int r16 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x01f2
            r4 = 1
            goto L_0x01f3
        L_0x01f1:
            r3 = r5
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            java.lang.String r5 = r0.zzaa()     // Catch:{ all -> 0x055c }
            long r10 = r0.zzc()     // Catch:{ all -> 0x055c }
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            if (r5 == 0) goto L_0x020b
            java.lang.String r0 = r2.zzc     // Catch:{ all -> 0x055c }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x055c }
            if (r0 != 0) goto L_0x020b
            r15 = 1
            goto L_0x020c
        L_0x020b:
            r15 = 0
        L_0x020c:
            r0 = r4 | r15
            if (r0 == 0) goto L_0x0232
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r5)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzbg r4 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_au"
            com.google.android.gms.measurement.internal.zzbb r5 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x055c }
            r5.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r4
            r16 = r5
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.zza((com.google.android.gms.measurement.internal.zzbg) r4, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            goto L_0x0232
        L_0x0231:
            r3 = r5
        L_0x0232:
            r23.zza((com.google.android.gms.measurement.internal.zzo) r24)     // Catch:{ all -> 0x055c }
            if (r9 != 0) goto L_0x0244
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.zzbc r0 = r0.zzd(r4, r5)     // Catch:{ all -> 0x055c }
            goto L_0x0255
        L_0x0244:
            r4 = 1
            if (r9 != r4) goto L_0x0254
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()     // Catch:{ all -> 0x055c }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "_v"
            com.google.android.gms.measurement.internal.zzbc r0 = r0.zzd(r4, r5)     // Catch:{ all -> 0x055c }
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            if (r0 != 0) goto L_0x052e
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r12 / r4
            r14 = 1
            long r10 = r10 + r14
            long r10 = r10 * r4
            java.lang.String r4 = "_dac"
            java.lang.String r5 = "_et"
            java.lang.String r15 = "_r"
            java.lang.String r14 = "_c"
            if (r9 != 0) goto L_0x04de
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x055c }
            java.lang.String r9 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r10 = r14
            r14 = r0
            r11 = r15
            r15 = r9
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzgy r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.zzt()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzgm r0 = r1.zzl     // Catch:{ all -> 0x055c }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x055c }
            r9 = r0
            com.google.android.gms.measurement.internal.zzgm r9 = (com.google.android.gms.measurement.internal.zzgm) r9     // Catch:{ all -> 0x055c }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x0382
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x055c }
            if (r14 == 0) goto L_0x029d
            goto L_0x0382
        L_0x029d:
            com.google.android.gms.measurement.internal.zzhf r14 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzgy r14 = r14.zzl()     // Catch:{ all -> 0x055c }
            r14.zzt()     // Catch:{ all -> 0x055c }
            boolean r14 = r9.zza()     // Catch:{ all -> 0x055c }
            if (r14 != 0) goto L_0x02bd
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzn()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.zza(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x02bd:
            com.google.android.gms.measurement.internal.zzgl r14 = new com.google.android.gms.measurement.internal.zzgl     // Catch:{ all -> 0x055c }
            r14.<init>(r9, r0)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzgy r0 = r0.zzl()     // Catch:{ all -> 0x055c }
            r0.zzt()     // Catch:{ all -> 0x055c }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x055c }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x055c }
            r0.setComponent(r15)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzhf r8 = r9.zza     // Catch:{ all -> 0x055c }
            android.content.Context r8 = r8.zza()     // Catch:{ all -> 0x055c }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x055c }
            if (r8 != 0) goto L_0x02f9
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzw()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x02f9:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0372
            boolean r17 = r8.isEmpty()     // Catch:{ all -> 0x055c }
            if (r17 != 0) goto L_0x0372
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x055c }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x055c }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0391
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x055c }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x055c }
            if (r8 == 0) goto L_0x0362
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x055c }
            if (r6 == 0) goto L_0x0362
            boolean r6 = r9.zza()     // Catch:{ all -> 0x055c }
            if (r6 == 0) goto L_0x0362
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x055c }
            r6.<init>(r0)     // Catch:{ all -> 0x055c }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.zzhf r8 = r9.zza     // Catch:{ RuntimeException -> 0x034d }
            android.content.Context r8 = r8.zza()     // Catch:{ RuntimeException -> 0x034d }
            r15 = 1
            boolean r0 = r0.bindService(r8, r6, r14, r15)     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.zzhf r6 = r9.zza     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.zzfr r6 = r6.zzj()     // Catch:{ RuntimeException -> 0x034d }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ RuntimeException -> 0x034d }
            java.lang.String r14 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = "available"
            goto L_0x0349
        L_0x0347:
            java.lang.String r0 = "not available"
        L_0x0349:
            r6.zza(r14, r0)     // Catch:{ RuntimeException -> 0x034d }
            goto L_0x0391
        L_0x034d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhf r6 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r6 = r6.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzg()     // Catch:{ all -> 0x055c }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x055c }
            r6.zza(r9, r0)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0362:
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0372:
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzn()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r6)     // Catch:{ all -> 0x055c }
            goto L_0x0391
        L_0x0382:
            com.google.android.gms.measurement.internal.zzhf r0 = r9.zza     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzw()     // Catch:{ all -> 0x055c }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r6)     // Catch:{ all -> 0x055c }
        L_0x0391:
            com.google.android.gms.measurement.internal.zzgy r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.zzt()     // Catch:{ all -> 0x055c }
            r23.zzs()     // Catch:{ all -> 0x055c }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r6.<init>()     // Catch:{ all -> 0x055c }
            r14 = 1
            r6.putLong(r10, r14)     // Catch:{ all -> 0x055c }
            r6.putLong(r11, r14)     // Catch:{ all -> 0x055c }
            r9 = 0
            r6.putLong(r7, r9)     // Catch:{ all -> 0x055c }
            r6.putLong(r3, r9)     // Catch:{ all -> 0x055c }
            r11 = r22
            r6.putLong(r11, r9)     // Catch:{ all -> 0x055c }
            r15 = r21
            r6.putLong(r15, r9)     // Catch:{ all -> 0x055c }
            r9 = 1
            r6.putLong(r5, r9)     // Catch:{ all -> 0x055c }
            boolean r0 = r2.zzo     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x03c6
            r6.putLong(r4, r9)     // Catch:{ all -> 0x055c }
        L_0x03c6:
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x055c }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x055c }
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()     // Catch:{ all -> 0x055c }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x055c }
            r0.zzt()     // Catch:{ all -> 0x055c }
            r0.zzak()     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "first_open_count"
            long r9 = r0.zzb((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzhf r0 = r1.zzm     // Catch:{ all -> 0x055c }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x055c }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x055c }
            if (r0 != 0) goto L_0x0405
            com.google.android.gms.measurement.internal.zzfr r0 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x055c }
            java.lang.String r5 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r4)     // Catch:{ all -> 0x055c }
            r0.zza(r5, r4)     // Catch:{ all -> 0x055c }
            r22 = r3
        L_0x0401:
            r3 = 0
            goto L_0x04bd
        L_0x0405:
            com.google.android.gms.measurement.internal.zzhf r0 = r1.zzm     // Catch:{ NameNotFoundException -> 0x0415 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0415 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0415 }
            r5 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0415 }
            goto L_0x0428
        L_0x0415:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r5 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x055c }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r4)     // Catch:{ all -> 0x055c }
            r5.zza(r14, r8, r0)     // Catch:{ all -> 0x055c }
            r0 = 0
        L_0x0428:
            if (r0 == 0) goto L_0x047c
            r8 = r15
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x055c }
            r16 = 0
            int r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r22 = r3
            if (r5 == 0) goto L_0x0479
            r5 = r4
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x055c }
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x045b
            com.google.android.gms.measurement.internal.zzaf r0 = r23.zze()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzbi.zzbl     // Catch:{ all -> 0x055c }
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r3)     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x0454
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0459
            r3 = 1
            r6.putLong(r7, r3)     // Catch:{ all -> 0x055c }
            goto L_0x0459
        L_0x0454:
            r3 = 1
            r6.putLong(r7, r3)     // Catch:{ all -> 0x055c }
        L_0x0459:
            r15 = 0
            goto L_0x045c
        L_0x045b:
            r15 = 1
        L_0x045c:
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x055c }
            java.lang.String r3 = "_fi"
            if (r15 == 0) goto L_0x0465
            r14 = 1
            goto L_0x0467
        L_0x0465:
            r14 = 0
        L_0x0467:
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r8
            r15 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            goto L_0x0480
        L_0x0479:
            r5 = r4
            r4 = r8
            goto L_0x0480
        L_0x047c:
            r22 = r3
            r5 = r4
            r4 = r15
        L_0x0480:
            com.google.android.gms.measurement.internal.zzhf r0 = r1.zzm     // Catch:{ NameNotFoundException -> 0x0490 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0490 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0490 }
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0490 }
            goto L_0x04a3
        L_0x0490:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r3 = r23.zzj()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x055c }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x055c }
            r3.zza(r7, r5, r0)     // Catch:{ all -> 0x055c }
            r0 = 0
        L_0x04a3:
            if (r0 == 0) goto L_0x0401
            int r3 = r0.flags     // Catch:{ all -> 0x055c }
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x04b0
            r7 = 1
            r6.putLong(r11, r7)     // Catch:{ all -> 0x055c }
        L_0x04b0:
            int r0 = r0.flags     // Catch:{ all -> 0x055c }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0401
            r7 = 1
            r6.putLong(r4, r7)     // Catch:{ all -> 0x055c }
            goto L_0x0401
        L_0x04bd:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04c6
            r3 = r22
            r6.putLong(r3, r9)     // Catch:{ all -> 0x055c }
        L_0x04c6:
            com.google.android.gms.measurement.internal.zzbg r0 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_f"
            com.google.android.gms.measurement.internal.zzbb r3 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x055c }
            r3.<init>(r6)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.zzb((com.google.android.gms.measurement.internal.zzbg) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            goto L_0x054d
        L_0x04de:
            r6 = r14
            r3 = r15
            r7 = 1
            if (r9 != r7) goto L_0x054d
            com.google.android.gms.measurement.internal.zznc r0 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x055c }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x055c }
            r1.zza((com.google.android.gms.measurement.internal.zznc) r0, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzgy r0 = r23.zzl()     // Catch:{ all -> 0x055c }
            r0.zzt()     // Catch:{ all -> 0x055c }
            r23.zzs()     // Catch:{ all -> 0x055c }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x055c }
            r0.putLong(r3, r7)     // Catch:{ all -> 0x055c }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x055c }
            boolean r3 = r2.zzo     // Catch:{ all -> 0x055c }
            if (r3 == 0) goto L_0x0517
            r0.putLong(r4, r7)     // Catch:{ all -> 0x055c }
        L_0x0517:
            com.google.android.gms.measurement.internal.zzbg r3 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_v"
            com.google.android.gms.measurement.internal.zzbb r4 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x055c }
            r4.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.zzb((com.google.android.gms.measurement.internal.zzbg) r3, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
            goto L_0x054d
        L_0x052e:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x055c }
            if (r0 == 0) goto L_0x054d
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x055c }
            r0.<init>()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzbg r3 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x055c }
            java.lang.String r15 = "_cd"
            com.google.android.gms.measurement.internal.zzbb r4 = new com.google.android.gms.measurement.internal.zzbb     // Catch:{ all -> 0x055c }
            r4.<init>(r0)     // Catch:{ all -> 0x055c }
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x055c }
            r1.zzb((com.google.android.gms.measurement.internal.zzbg) r3, (com.google.android.gms.measurement.internal.zzo) r2)     // Catch:{ all -> 0x055c }
        L_0x054d:
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()     // Catch:{ all -> 0x055c }
            r0.zzw()     // Catch:{ all -> 0x055c }
            com.google.android.gms.measurement.internal.zzao r0 = r23.zzf()
            r0.zzu()
            return
        L_0x055c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzao r2 = r23.zzf()
            r2.zzu()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzc(com.google.android.gms.measurement.internal.zzo):void");
    }

    private final void zzb(zzbg zzbg, zzo zzo2) {
        Preconditions.checkNotEmpty(zzo2.zza);
        zzfv zza2 = zzfv.zza(zzbg);
        zzq().zza(zza2.zzb, zzf().zzc(zzo2.zza));
        zzq().zza(zza2, zze().zzd(zzo2.zza));
        zzbg zza3 = zza2.zza();
        if ("_cmp".equals(zza3.zza) && "referrer API v2".equals(zza3.zzb.zzd("_cis"))) {
            String zzd2 = zza3.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(zzd2)) {
                zza(new zznc("_lgclid", zza3.zzd, zzd2, "auto"), zzo2);
            }
        }
        if (zzoi.zza() && zzoi.zzc() && "_cmp".equals(zza3.zza) && "referrer API v2".equals(zza3.zzb.zzd("_cis"))) {
            String zzd3 = zza3.zzb.zzd("gbraid");
            if (!TextUtils.isEmpty(zzd3)) {
                zza(new zznc("_gbraid", zza3.zzd, zzd3, "auto"), zzo2);
            }
        }
        zza(zza3, zzo2);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzad zzad2) {
        zzo zzc2 = zzc((String) Preconditions.checkNotNull(zzad2.zza));
        if (zzc2 != null) {
            zzb(zzad2, zzc2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzad zzad2, zzo zzo2) {
        boolean z10;
        Preconditions.checkNotNull(zzad2);
        Preconditions.checkNotEmpty(zzad2.zza);
        Preconditions.checkNotNull(zzad2.zzb);
        Preconditions.checkNotNull(zzad2.zzc);
        Preconditions.checkNotEmpty(zzad2.zzc.zza);
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            zzad zzad3 = new zzad(zzad2);
            boolean z11 = false;
            zzad3.zze = false;
            zzf().zzp();
            try {
                zzad zzc2 = zzf().zzc((String) Preconditions.checkNotNull(zzad3.zza), zzad3.zzc.zza);
                if (zzc2 != null && !zzc2.zzb.equals(zzad3.zzb)) {
                    zzj().zzu().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzb, zzc2.zzb);
                }
                if (zzc2 != null && (z10 = zzc2.zze)) {
                    zzad3.zzb = zzc2.zzb;
                    zzad3.zzd = zzc2.zzd;
                    zzad3.zzh = zzc2.zzh;
                    zzad3.zzf = zzc2.zzf;
                    zzad3.zzi = zzc2.zzi;
                    zzad3.zze = z10;
                    zznc zznc = zzad3.zzc;
                    zzad3.zzc = new zznc(zznc.zza, zzc2.zzc.zzb, zznc.zza(), zzc2.zzc.zze);
                } else if (TextUtils.isEmpty(zzad3.zzf)) {
                    zznc zznc2 = zzad3.zzc;
                    zzad3.zzc = new zznc(zznc2.zza, zzad3.zzd, zznc2.zza(), zzad3.zzc.zze);
                    zzad3.zze = true;
                    z11 = true;
                }
                if (zzad3.zze) {
                    zznc zznc3 = zzad3.zzc;
                    zzne zzne = new zzne((String) Preconditions.checkNotNull(zzad3.zza), zzad3.zzb, zznc3.zza, zznc3.zzb, Preconditions.checkNotNull(zznc3.zza()));
                    if (zzf().zza(zzne)) {
                        zzj().zzc().zza("User property updated immediately", zzad3.zza, this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                    } else {
                        zzj().zzg().zza("(2)Too many active user properties, ignoring", zzfr.zza(zzad3.zza), this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                    }
                    if (z11 && zzad3.zzi != null) {
                        zzc(new zzbg(zzad3.zzi, zzad3.zzd), zzo2);
                    }
                }
                if (zzf().zza(zzad3)) {
                    zzj().zzc().zza("Conditional property added", zzad3.zza, this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzc.zza());
                } else {
                    zzj().zzg().zza("Too many conditional properties, ignoring", zzfr.zza(zzad3.zza), this.zzm.zzk().zzc(zzad3.zzc.zza), zzad3.zzc.zza());
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    private final zzay zza(String str, zzay zzay, zzih zzih, zzak zzak) {
        if (!zznp.zza()) {
            return zzay.zza;
        }
        int i10 = 90;
        if (zzi().zzb(str) == null) {
            Boolean zzc2 = zzay.zzc();
            Boolean bool = Boolean.FALSE;
            if (zzc2 == bool) {
                i10 = zzay.zza();
                zzak.zza(zzih.zza.AD_USER_DATA, i10);
            } else {
                zzak.zza(zzih.zza.AD_USER_DATA, zzaj.FAILSAFE);
            }
            return new zzay(bool, i10, Boolean.TRUE, "-");
        }
        Boolean zzc3 = zzay.zzc();
        if (zzc3 != null) {
            i10 = zzay.zza();
            zzak.zza(zzih.zza.AD_USER_DATA, i10);
        } else {
            zzgp zzgp = this.zzb;
            zzih.zza zza2 = zzih.zza.AD_USER_DATA;
            if (zzgp.zza(str, zza2) == zzih.zza.AD_STORAGE && zzih.zzc() != null) {
                zzc3 = zzih.zzc();
                zzak.zza(zza2, zzaj.REMOTE_DELEGATION);
            }
            if (zzc3 == null) {
                zzc3 = Boolean.valueOf(this.zzb.zzb(str, zza2));
                zzak.zza(zza2, zzaj.REMOTE_DEFAULT);
            }
        }
        Preconditions.checkNotNull(zzc3);
        boolean zzn2 = this.zzb.zzn(str);
        SortedSet<String> zzh2 = zzi().zzh(str);
        if (!zzc3.booleanValue() || zzh2.isEmpty()) {
            return new zzay(Boolean.FALSE, i10, Boolean.valueOf(zzn2), "-");
        }
        Boolean bool2 = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(zzn2);
        String str2 = "";
        if (zzn2) {
            str2 = TextUtils.join(str2, zzh2);
        }
        return new zzay(bool2, i10, valueOf, str2);
    }

    private static zzmo zza(zzmo zzmo) {
        if (zzmo == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzmo.zzam()) {
            return zzmo;
        } else {
            String valueOf = String.valueOf(zzmo.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static zzmp zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzmp.class) {
                if (zza == null) {
                    zza = new zzmp((zzna) Preconditions.checkNotNull(new zzna(context)));
                }
            }
        }
        return zza;
    }

    private final Boolean zza(zzh zzh2) {
        try {
            if (zzh2.zzc() != -2147483648L) {
                if (zzh2.zzc() == ((long) Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh2.zzx(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzm.zza()).getPackageInfo(zzh2.zzx(), 0).versionName;
                String zzaa2 = zzh2.zzaa();
                if (zzaa2 != null && zzaa2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String zza(zzih zzih) {
        if (!zzih.zzh()) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzq().zzv().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    static /* synthetic */ void zza(zzmp zzmp, zzna zzna) {
        zzmp.zzl().zzt();
        zzmp.zzl = new zzgm(zzmp);
        zzao zzao = new zzao(zzmp);
        zzao.zzal();
        zzmp.zzd = zzao;
        zzmp.zze().zza((zzah) Preconditions.checkNotNull(zzmp.zzb));
        zzls zzls = new zzls(zzmp);
        zzls.zzal();
        zzmp.zzj = zzls;
        zzt zzt2 = new zzt(zzmp);
        zzt2.zzal();
        zzmp.zzg = zzt2;
        zzkg zzkg = new zzkg(zzmp);
        zzkg.zzal();
        zzmp.zzi = zzkg;
        zzmj zzmj = new zzmj(zzmp);
        zzmj.zzal();
        zzmp.zzf = zzmj;
        zzmp.zze = new zzgb(zzmp);
        if (zzmp.zzs != zzmp.zzt) {
            zzmp.zzj().zzg().zza("Not all upload components initialized", Integer.valueOf(zzmp.zzs), Integer.valueOf(zzmp.zzt));
        }
        zzmp.zzn = true;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzl().zzt();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzfi.zzj.zza zza2) {
        int zza3;
        int indexOf;
        Set<String> zzg2 = zzi().zzg(str);
        if (zzg2 != null) {
            zza2.zzd((Iterable<String>) zzg2);
        }
        if (zzi().zzq(str)) {
            zza2.zzg();
        }
        if (zzi().zzt(str)) {
            if (zze().zze(str, zzbi.zzbv)) {
                String zzu2 = zza2.zzu();
                if (!TextUtils.isEmpty(zzu2) && (indexOf = zzu2.indexOf(".")) != -1) {
                    zza2.zzo(zzu2.substring(0, indexOf));
                }
            } else {
                zza2.zzl();
            }
        }
        if (zzi().zzu(str) && (zza3 = zzmz.zza(zza2, "_id")) != -1) {
            zza2.zzc(zza3);
        }
        if (zzi().zzs(str)) {
            zza2.zzh();
        }
        if (zzi().zzp(str)) {
            zza2.zze();
            zzb zzb2 = this.zzae.get(str);
            if (zzb2 == null || zzb2.zzb + zze().zzc(str, zzbi.zzat) < zzb().elapsedRealtime()) {
                zzb2 = new zzb();
                this.zzae.put(str, zzb2);
            }
            zza2.zzk(zzb2.zza);
        }
        if (zzi().zzr(str)) {
            zza2.zzp();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzh zzh2, zzfi.zzj.zza zza2) {
        zzl().zzt();
        zzs();
        if (zznp.zza()) {
            zzak zza3 = zzak.zza(zza2.zzs());
            String zzx2 = zzh2.zzx();
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                zzih zzb2 = zzb(zzx2);
                if (zznp.zza() && zze().zza(zzbi.zzco)) {
                    zza2.zzg(zzb2.zzf());
                }
                if (zzb2.zzc() != null) {
                    zza3.zza(zzih.zza.AD_STORAGE, zzb2.zza());
                } else {
                    zza3.zza(zzih.zza.AD_STORAGE, zzaj.FAILSAFE);
                }
                if (zzb2.zzd() != null) {
                    zza3.zza(zzih.zza.ANALYTICS_STORAGE, zzb2.zza());
                } else {
                    zza3.zza(zzih.zza.ANALYTICS_STORAGE, zzaj.FAILSAFE);
                }
            }
            String zzx3 = zzh2.zzx();
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                zzay zza4 = zza(zzx3, zzd(zzx3), zzb(zzx3), zza3);
                zza2.zzb(((Boolean) Preconditions.checkNotNull(zza4.zzd())).booleanValue());
                if (!TextUtils.isEmpty(zza4.zze())) {
                    zza2.zzh(zza4.zze());
                }
            }
            zzl().zzt();
            zzs();
            if (zznp.zza()) {
                zzfi.zzn zzn2 = null;
                Iterator<zzfi.zzn> it = zza2.zzx().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfi.zzn next = it.next();
                    if ("_npa".equals(next.zzg())) {
                        zzn2 = next;
                        break;
                    }
                }
                if (zzn2 != null) {
                    zzih.zza zza5 = zzih.zza.AD_PERSONALIZATION;
                    if (zza3.zza(zza5) == zzaj.UNSET) {
                        Boolean zzu2 = zzh2.zzu();
                        if (zzu2 == null || ((zzu2 == Boolean.TRUE && zzn2.zzc() != 1) || (zzu2 == Boolean.FALSE && zzn2.zzc() != 0))) {
                            zza3.zza(zza5, zzaj.API);
                        } else {
                            zza3.zza(zza5, zzaj.MANIFEST);
                        }
                    }
                } else if (zznp.zza() && zze().zza(zzbi.zzcp)) {
                    boolean z10 = true;
                    if (this.zzb.zzb(zzh2.zzx()) == null) {
                        zza3.zza(zzih.zza.AD_PERSONALIZATION, zzaj.FAILSAFE);
                    } else {
                        zzgp zzgp = this.zzb;
                        String zzx4 = zzh2.zzx();
                        zzih.zza zza6 = zzih.zza.AD_PERSONALIZATION;
                        z10 = true ^ zzgp.zzb(zzx4, zza6);
                        zza3.zza(zza6, zzaj.REMOTE_DEFAULT);
                    }
                    zza2.zza((zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(zzb().currentTimeMillis()).zza(z10 ? 1 : 0).zzab()));
                }
            }
            zza2.zzf(zza3.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x030c A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0342 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03ac A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x073d A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x074f A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0795 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x083a A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0853 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08da A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x08f8 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x096e A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c6 A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce A[Catch:{ SQLiteException -> 0x02d6, all -> 0x0a11 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(com.google.android.gms.measurement.internal.zzbg r29, com.google.android.gms.measurement.internal.zzo r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r30)
            java.lang.String r6 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzgy r8 = r28.zzl()
            r8.zzt()
            r28.zzs()
            java.lang.String r8 = r3.zza
            r28.zzp()
            boolean r9 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.measurement.internal.zzbg) r29, (com.google.android.gms.measurement.internal.zzo) r30)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.zzh
            if (r9 != 0) goto L_0x0034
            r1.zza((com.google.android.gms.measurement.internal.zzo) r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.zzgp r9 = r28.zzi()
            java.lang.String r10 = r2.zza
            boolean r9 = r9.zzd(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzfr r3 = r28.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)
            com.google.android.gms.measurement.internal.zzhf r5 = r1.zzm
            com.google.android.gms.measurement.internal.zzfq r5 = r5.zzk()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zza((java.lang.String) r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.zza(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzgp r3 = r28.zzi()
            boolean r3 = r3.zzm(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.zzgp r3 = r28.zzi()
            boolean r3 = r3.zzo(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.zza
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r28.zzq()
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah
            r11 = 11
            java.lang.String r13 = r2.zza
            r2 = 0
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzd(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.zzn()
            long r7 = r2.zze()
            long r5 = java.lang.Math.max(r5, r7)
            com.google.android.gms.common.util.Clock r3 = r28.zzb()
            long r7 = r3.currentTimeMillis()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r28.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Long> r3 = com.google.android.gms.measurement.internal.zzbi.zzz
            java.lang.Object r3 = r3.zza(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzfr r3 = r28.zzj()
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzc()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.zza(r4)
            r1.zzb((com.google.android.gms.measurement.internal.zzh) r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzfv r2 = com.google.android.gms.measurement.internal.zzfv.zza(r29)
            com.google.android.gms.measurement.internal.zznd r9 = r28.zzq()
            com.google.android.gms.measurement.internal.zzaf r10 = r28.zze()
            int r10 = r10.zzd(r8)
            r9.zza((com.google.android.gms.measurement.internal.zzfv) r2, (int) r10)
            boolean r9 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzaf r9 = r28.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzcd
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzaf r9 = r28.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzbi.zzaq
            r11 = 10
            r12 = 35
            int r9 = r9.zza(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.zzb
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.zznd r12 = r28.zzq()
            android.os.Bundle r13 = r2.zzb
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.zzot.zza()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.zzaf r13 = r28.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzbi.zzcd
            boolean r13 = r13.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.zza((android.os.Parcelable[]) r11, (int) r9, (boolean) r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.zzbg r2 = r2.zza()
            com.google.android.gms.measurement.internal.zzfr r9 = r28.zzj()
            r10 = 2
            boolean r9 = r9.zza((int) r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.zzfr r9 = r28.zzj()
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()
            com.google.android.gms.measurement.internal.zzhf r11 = r1.zzm
            com.google.android.gms.measurement.internal.zzfq r11 = r11.zzk()
            java.lang.String r11 = r11.zza((com.google.android.gms.measurement.internal.zzbg) r2)
            java.lang.String r12 = "Logging event"
            r9.zza(r12, r11)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.zzon.zza()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.zzaf r9 = r28.zze()
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzbi.zzca
            r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r11)
        L_0x0190:
            com.google.android.gms.measurement.internal.zzao r9 = r28.zzf()
            r9.zzp()
            r1.zza((com.google.android.gms.measurement.internal.zzo) r3)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "refund"
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = "purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r9 = 0
            goto L_0x01bc
        L_0x01bb:
            r9 = 1
        L_0x01bc:
            java.lang.String r12 = "_iap"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0a11 }
            if (r12 != 0) goto L_0x01cb
            if (r9 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r12 = 0
            goto L_0x01cc
        L_0x01cb:
            r12 = 1
        L_0x01cc:
            if (r12 == 0) goto L_0x0351
            com.google.android.gms.measurement.internal.zzbb r12 = r2.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "currency"
            java.lang.String r12 = r12.zzd(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.Double r9 = r9.zza((java.lang.String) r13)     // Catch:{ all -> 0x0a11 }
            double r19 = r9.doubleValue()     // Catch:{ all -> 0x0a11 }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r9 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.zzb(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            double r13 = (double) r13     // Catch:{ all -> 0x0a11 }
            double r19 = r13 * r21
        L_0x01fe:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0218
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x0218
            long r13 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x023f
            long r13 = -r13
            goto L_0x023f
        L_0x0218:
            com.google.android.gms.measurement.internal.zzfr r9 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzu()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Currency value is too big. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Double r12 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0a11 }
            r9.zza(r10, r11, r12)     // Catch:{ all -> 0x0a11 }
            r24 = r6
            r26 = r15
            r7 = 0
            r13 = 0
            goto L_0x0340
        L_0x0235:
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = r9.zzb(r13)     // Catch:{ all -> 0x0a11 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a11 }
        L_0x023f:
            boolean r9 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033a
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r12.toUpperCase(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x033a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_ltv_"
            r11.<init>(r12)     // Catch:{ all -> 0x0a11 }
            r11.append(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r9 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r9 = r9.zze(r8, r12)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x029d
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0a11 }
            boolean r11 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r11 != 0) goto L_0x0272
            goto L_0x029d
        L_0x0272:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0a11 }
            long r9 = r9.longValue()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r19 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.util.Clock r20 = r28.zzb()     // Catch:{ all -> 0x0a11 }
            long r20 = r20.currentTimeMillis()     // Catch:{ all -> 0x0a11 }
            long r9 = r9 + r13
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = 0
            r24 = r6
            r6 = 1
            r7 = 0
            r13 = r20
            r26 = r15
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
        L_0x029a:
            r6 = r19
            goto L_0x0302
        L_0x029d:
            r24 = r6
            r26 = r15
            r6 = 1
            r7 = 0
            com.google.android.gms.measurement.internal.zzao r9 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaf r11 = r28.zze()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzbi.zzae     // Catch:{ all -> 0x0a11 }
            int r11 = r11.zzb(r8, r15)     // Catch:{ all -> 0x0a11 }
            int r11 = r11 - r6
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0a11 }
            r9.zzt()     // Catch:{ all -> 0x0a11 }
            r9.zzak()     // Catch:{ all -> 0x0a11 }
            android.database.sqlite.SQLiteDatabase r15 = r9.e_()     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r10 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02d6 }
            r6[r7] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            r17 = 1
            r6[r17] = r8     // Catch:{ SQLiteException -> 0x02d6 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x02d6 }
            r16 = 2
            r6[r16] = r11     // Catch:{ SQLiteException -> 0x02d6 }
            r15.execSQL(r10, r6)     // Catch:{ SQLiteException -> 0x02d6 }
            goto L_0x02e9
        L_0x02d6:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzfr r9 = r9.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            r9.zza(r10, r11, r6)     // Catch:{ all -> 0x0a11 }
        L_0x02e9:
            com.google.android.gms.measurement.internal.zzne r19 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.util.Clock r6 = r28.zzb()     // Catch:{ all -> 0x0a11 }
            long r15 = r6.currentTimeMillis()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a11 }
            r9 = r19
            r10 = r8
            r13 = r15
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0a11 }
            goto L_0x029a
        L_0x0302:
            com.google.android.gms.measurement.internal.zzao r9 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzne) r6)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x033f
            com.google.android.gms.measurement.internal.zzfr r9 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r12 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfq r12 = r12.zzk()     // Catch:{ all -> 0x0a11 }
            java.lang.String r13 = r6.zzc     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = r12.zzc(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r6 = r6.zze     // Catch:{ all -> 0x0a11 }
            r9.zza(r10, r11, r12, r6)     // Catch:{ all -> 0x0a11 }
            r28.zzq()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a11 }
            r11 = 9
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a11 }
            goto L_0x033f
        L_0x033a:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x033f:
            r13 = 1
        L_0x0340:
            if (r13 != 0) goto L_0x0356
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zzw()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            return
        L_0x0351:
            r24 = r6
            r26 = r15
            r7 = 0
        L_0x0356:
            java.lang.String r6 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r6 = com.google.android.gms.measurement.internal.zznd.zzh(r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a11 }
            r10 = r26
            boolean r20 = r10.equals(r9)     // Catch:{ all -> 0x0a11 }
            r28.zzq()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzbb r9 = r2.zzb     // Catch:{ all -> 0x0a11 }
            long r9 = com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zzbb) r9)     // Catch:{ all -> 0x0a11 }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.zzao r9 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            long r10 = r28.zzx()     // Catch:{ all -> 0x0a11 }
            r17 = 1
            r18 = 0
            r19 = 0
            r12 = r8
            r21 = r8
            r7 = r13
            r13 = r15
            r15 = r17
            r16 = r6
            r17 = r18
            r18 = r20
            com.google.android.gms.measurement.internal.zzap r9 = r9.zza(r10, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0a11 }
            long r10 = r9.zzb     // Catch:{ all -> 0x0a11 }
            r28.zze()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzk     // Catch:{ all -> 0x0a11 }
            r13 = 0
            java.lang.Object r12 = r12.zza(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a11 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a11 }
            long r12 = (long) r12     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r12
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d7
            long r10 = r10 % r12
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x03c8
            com.google.android.gms.measurement.internal.zzfr r2 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.zza(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x03c8:
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zzw()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            return
        L_0x03d7:
            if (r6 == 0) goto L_0x042f
            long r10 = r9.zza     // Catch:{ all -> 0x0a11 }
            r28.zze()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzbi.zzm     // Catch:{ all -> 0x0a11 }
            r8 = 0
            java.lang.Object r7 = r7.zza(r8)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0a11 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0a11 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a11 }
            long r10 = r10 - r7
            int r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x042f
            long r10 = r10 % r12
            r3 = 1
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x040f
            com.google.android.gms.measurement.internal.zzfr r3 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r21)     // Catch:{ all -> 0x0a11 }
            long r6 = r9.zza     // Catch:{ all -> 0x0a11 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a11 }
            r3.zza(r4, r5, r6)     // Catch:{ all -> 0x0a11 }
        L_0x040f:
            r28.zzq()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a11 }
            r11 = 16
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0a11 }
            r14 = 0
            r10 = r21
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zzw()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            return
        L_0x042f:
            if (r20 == 0) goto L_0x047d
            long r7 = r9.zzd     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaf r10 = r28.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzl     // Catch:{ all -> 0x0a11 }
            int r10 = r10.zzb(r11, r12)     // Catch:{ all -> 0x0a11 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0a11 }
            r11 = 0
            int r10 = java.lang.Math.max(r11, r10)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            long r7 = r7 - r10
            int r10 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x047d
            r10 = 1
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x046e
            com.google.android.gms.measurement.internal.zzfr r2 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r21)     // Catch:{ all -> 0x0a11 }
            long r5 = r9.zzd     // Catch:{ all -> 0x0a11 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a11 }
            r2.zza(r3, r4, r5)     // Catch:{ all -> 0x0a11 }
        L_0x046e:
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zzw()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            return
        L_0x047d:
            com.google.android.gms.measurement.internal.zzbb r7 = r2.zzb     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r7 = r7.zzb()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznd r8 = r28.zzq()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.zzc     // Catch:{ all -> 0x0a11 }
            r8.zza((android.os.Bundle) r7, (java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznd r8 = r28.zzq()     // Catch:{ all -> 0x0a11 }
            r13 = r21
            boolean r8 = r8.zzf(r13)     // Catch:{ all -> 0x0a11 }
            java.lang.String r12 = "_r"
            if (r8 == 0) goto L_0x04b6
            com.google.android.gms.measurement.internal.zznd r8 = r28.zzq()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "_dbg"
            r10 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.zza((android.os.Bundle) r7, (java.lang.String) r9, (java.lang.Object) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznd r8 = r28.zzq()     // Catch:{ all -> 0x0a11 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a11 }
            r8.zza((android.os.Bundle) r7, (java.lang.String) r12, (java.lang.Object) r9)     // Catch:{ all -> 0x0a11 }
        L_0x04b6:
            java.lang.String r8 = "_s"
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.zzao r8 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r8 = r8.zze(r9, r5)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x04db
            java.lang.Object r9 = r8.zze     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x04db
            com.google.android.gms.measurement.internal.zznd r9 = r28.zzq()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r8 = r8.zze     // Catch:{ all -> 0x0a11 }
            r9.zza((android.os.Bundle) r7, (java.lang.String) r5, (java.lang.Object) r8)     // Catch:{ all -> 0x0a11 }
        L_0x04db:
            com.google.android.gms.measurement.internal.zzao r5 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            long r8 = r5.zza((java.lang.String) r13)     // Catch:{ all -> 0x0a11 }
            r14 = 0
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fe
            com.google.android.gms.measurement.internal.zzfr r5 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r13)     // Catch:{ all -> 0x0a11 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a11 }
            r5.zza(r10, r11, r8)     // Catch:{ all -> 0x0a11 }
        L_0x04fe:
            com.google.android.gms.measurement.internal.zzaz r5 = new com.google.android.gms.measurement.internal.zzaz     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r10 = r1.zzm     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0a11 }
            long r14 = r2.zzd     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r9 = r5
            r2 = r12
            r12 = r13
            r27 = r2
            r2 = r13
            r13 = r8
            r16 = r18
            r18 = r7
            r9.<init>((com.google.android.gms.measurement.internal.zzhf) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r7 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.zzb     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzbc r7 = r7.zzd(r2, r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0596
            com.google.android.gms.measurement.internal.zzao r7 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            long r7 = r7.zzb(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaf r9 = r28.zze()     // Catch:{ all -> 0x0a11 }
            int r9 = r9.zza((java.lang.String) r2)     // Catch:{ all -> 0x0a11 }
            long r9 = (long) r9     // Catch:{ all -> 0x0a11 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x057a
            if (r6 == 0) goto L_0x057a
            com.google.android.gms.measurement.internal.zzfr r3 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r7 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfq r7 = r7.zzk()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r5.zzb     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = r7.zza((java.lang.String) r5)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaf r7 = r28.zze()     // Catch:{ all -> 0x0a11 }
            int r7 = r7.zza((java.lang.String) r2)     // Catch:{ all -> 0x0a11 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0a11 }
            r3.zza(r4, r6, r5, r7)     // Catch:{ all -> 0x0a11 }
            r28.zzq()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznf r9 = r1.zzah     // Catch:{ all -> 0x0a11 }
            r11 = 8
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            return
        L_0x057a:
            com.google.android.gms.measurement.internal.zzbc r6 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.zzb     // Catch:{ all -> 0x0a11 }
            r12 = 0
            r14 = 0
            long r7 = r5.zzc     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r9 = r6
            r10 = r2
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0a11 }
            goto L_0x05a4
        L_0x0596:
            com.google.android.gms.measurement.internal.zzhf r2 = r1.zzm     // Catch:{ all -> 0x0a11 }
            long r8 = r7.zzf     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaz r5 = r5.zza(r2, r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r5.zzc     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzbc r6 = r7.zza(r8)     // Catch:{ all -> 0x0a11 }
        L_0x05a4:
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zza((com.google.android.gms.measurement.internal.zzbc) r6)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzgy r2 = r28.zzl()     // Catch:{ all -> 0x0a11 }
            r2.zzt()     // Catch:{ all -> 0x0a11 }
            r28.zzs()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r30)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0a11 }
            java.lang.String r2 = r5.zza     // Catch:{ all -> 0x0a11 }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x0a11 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ all -> 0x0a11 }
            r6 = 1
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r2.zzg((int) r6)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = "android"
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r2.zzp(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05e7
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0a11 }
            r2.zzb((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x05e7:
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x05f4
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x0a11 }
            r2.zzd((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x05f4:
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0601
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x0a11 }
            r2.zze((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0601:
            boolean r7 = com.google.android.gms.internal.measurement.zzps.zza()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x062e
            com.google.android.gms.measurement.internal.zzaf r7 = r28.zze()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzbi.zzbr     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r8)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x0629
            com.google.android.gms.measurement.internal.zzaf r7 = r28.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzbi.zzbt     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.zze(r8, r9)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x062e
        L_0x0629:
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0a11 }
            r2.zzr(r7)     // Catch:{ all -> 0x0a11 }
        L_0x062e:
            long r7 = r3.zzj     // Catch:{ all -> 0x0a11 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x063b
            int r8 = (int) r7     // Catch:{ all -> 0x0a11 }
            r2.zze((int) r8)     // Catch:{ all -> 0x0a11 }
        L_0x063b:
            long r7 = r3.zze     // Catch:{ all -> 0x0a11 }
            r2.zzf((long) r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x064d
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x0a11 }
            r2.zzm(r7)     // Catch:{ all -> 0x0a11 }
        L_0x064d:
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r7 = r1.zzb((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzt     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r8 = com.google.android.gms.measurement.internal.zzih.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r7 = r7.zza((com.google.android.gms.measurement.internal.zzih) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r7.zze()     // Catch:{ all -> 0x0a11 }
            r2.zzg((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r2.zzt()     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0681
            java.lang.String r8 = r3.zzp     // Catch:{ all -> 0x0a11 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0681
            java.lang.String r8 = r3.zzp     // Catch:{ all -> 0x0a11 }
            r2.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
        L_0x0681:
            boolean r8 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            com.google.android.gms.measurement.internal.zzaf r8 = r28.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0a11 }
            boolean r8 = r8.zze(r9, r10)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            r28.zzq()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a11 }
            boolean r8 = com.google.android.gms.measurement.internal.zznd.zzd(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0735
            int r8 = r3.zzaa     // Catch:{ all -> 0x0a11 }
            r2.zzd((int) r8)     // Catch:{ all -> 0x0a11 }
            long r8 = r3.zzab     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.zzg()     // Catch:{ all -> 0x0a11 }
            r10 = 32
            r12 = 0
            if (r7 != 0) goto L_0x06bb
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x06bb
            r14 = -2
            long r7 = r8 & r14
            long r8 = r7 | r10
        L_0x06bb:
            r14 = 1
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x06c3
            r7 = 1
            goto L_0x06c4
        L_0x06c3:
            r7 = 0
        L_0x06c4:
            r2.zza((boolean) r7)     // Catch:{ all -> 0x0a11 }
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x0737
            com.google.android.gms.internal.measurement.zzfi$zzb$zza r7 = com.google.android.gms.internal.measurement.zzfi.zzb.zza()     // Catch:{ all -> 0x0a11 }
            r14 = 1
            long r16 = r8 & r14
            int r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x06d9
            r14 = 1
            goto L_0x06da
        L_0x06d9:
            r14 = 0
        L_0x06da:
            r7.zzc(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 2
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06e6
            r14 = 1
            goto L_0x06e7
        L_0x06e6:
            r14 = 0
        L_0x06e7:
            r7.zze(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 4
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x06f3
            r14 = 1
            goto L_0x06f4
        L_0x06f3:
            r14 = 0
        L_0x06f4:
            r7.zzf(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 8
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x0700
            r14 = 1
            goto L_0x0701
        L_0x0700:
            r14 = 0
        L_0x0701:
            r7.zzg(r14)     // Catch:{ all -> 0x0a11 }
            r14 = 16
            long r14 = r14 & r8
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x070d
            r14 = 1
            goto L_0x070e
        L_0x070d:
            r14 = 0
        L_0x070e:
            r7.zzb(r14)     // Catch:{ all -> 0x0a11 }
            long r10 = r10 & r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0718
            r10 = 1
            goto L_0x0719
        L_0x0718:
            r10 = 0
        L_0x0719:
            r7.zza(r10)     // Catch:{ all -> 0x0a11 }
            r10 = 64
            long r8 = r8 & r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0725
            r8 = 1
            goto L_0x0726
        L_0x0725:
            r8 = 0
        L_0x0726:
            r7.zzd(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzkj r7 = r7.zzab()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzix r7 = (com.google.android.gms.internal.measurement.zzix) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzb r7 = (com.google.android.gms.internal.measurement.zzfi.zzb) r7     // Catch:{ all -> 0x0a11 }
            r2.zza((com.google.android.gms.internal.measurement.zzfi.zzb) r7)     // Catch:{ all -> 0x0a11 }
            goto L_0x0737
        L_0x0735:
            r12 = 0
        L_0x0737:
            long r7 = r3.zzf     // Catch:{ all -> 0x0a11 }
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0740
            r2.zzc((long) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0740:
            long r7 = r3.zzr     // Catch:{ all -> 0x0a11 }
            r2.zzd((long) r7)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzmz r7 = r28.zzp()     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.zzu()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x0752
            r2.zzc((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x0a11 }
        L_0x0752:
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r7 = r1.zzb((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzt     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r8 = com.google.android.gms.measurement.internal.zzih.zza((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzih r7 = r7.zza((com.google.android.gms.measurement.internal.zzih) r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.zzg()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r3.zzn     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.zzls r8 = r1.zzj     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a11 }
            android.util.Pair r8 = r8.zza((java.lang.String) r9, (com.google.android.gms.measurement.internal.zzih) r7)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            boolean r9 = r3.zzn     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a11 }
            r2.zzq(r9)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x079e
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0a11 }
            r2.zzc((boolean) r9)     // Catch:{ all -> 0x0a11 }
        L_0x079e:
            boolean r9 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.zzaf r9 = r28.zze()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r10)     // Catch:{ all -> 0x0a11 }
            if (r9 == 0) goto L_0x07f0
            java.lang.String r9 = r5.zzb     // Catch:{ all -> 0x0a11 }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x0a11 }
            if (r9 != 0) goto L_0x07f0
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.zzao r8 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzh r8 = r8.zzd(r9)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            boolean r8 = r8.zzan()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x07f0
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a11 }
            r9 = 0
            r1.zza((java.lang.String) r8, (boolean) r9)     // Catch:{ all -> 0x0a11 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x0a11 }
            r8.<init>()     // Catch:{ all -> 0x0a11 }
            r10 = r27
            r14 = 1
            r8.putLong(r10, r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zznf r11 = r1.zzah     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.zza     // Catch:{ all -> 0x0a11 }
            r11.zza(r14, r4, r8)     // Catch:{ all -> 0x0a11 }
            goto L_0x07f3
        L_0x07f0:
            r10 = r27
            r9 = 0
        L_0x07f3:
            com.google.android.gms.measurement.internal.zzhf r4 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzba r4 = r4.zzg()     // Catch:{ all -> 0x0a11 }
            r4.zzab()     // Catch:{ all -> 0x0a11 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r2.zzi((java.lang.String) r4)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r8 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzba r8 = r8.zzg()     // Catch:{ all -> 0x0a11 }
            r8.zzab()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzo(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r8 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzba r8 = r8.zzg()     // Catch:{ all -> 0x0a11 }
            long r14 = r8.zzg()     // Catch:{ all -> 0x0a11 }
            int r8 = (int) r14     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzi((int) r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r8 = r1.zzm     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzba r8 = r8.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.zzh()     // Catch:{ all -> 0x0a11 }
            r4.zzs(r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.zzx     // Catch:{ all -> 0x0a11 }
            r2.zzj((long) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r4 = r1.zzm     // Catch:{ all -> 0x0a11 }
            boolean r4 = r4.zzac()     // Catch:{ all -> 0x0a11 }
            if (r4 == 0) goto L_0x0847
            r2.zzr()     // Catch:{ all -> 0x0a11 }
            r4 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a11 }
            if (r8 != 0) goto L_0x0847
            r2.zzj((java.lang.String) r4)     // Catch:{ all -> 0x0a11 }
        L_0x0847:
            com.google.android.gms.measurement.internal.zzao r4 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzd(r8)     // Catch:{ all -> 0x0a11 }
            if (r4 != 0) goto L_0x08b3
            com.google.android.gms.measurement.internal.zzh r4 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzhf r8 = r1.zzm     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a11 }
            r4.<init>(r8, r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r1.zza((com.google.android.gms.measurement.internal.zzih) r7)     // Catch:{ all -> 0x0a11 }
            r4.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzk     // Catch:{ all -> 0x0a11 }
            r4.zze((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0a11 }
            r4.zzf((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r7.zzg()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0880
            com.google.android.gms.measurement.internal.zzls r8 = r1.zzj     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a11 }
            boolean r14 = r3.zzn     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r8.zza((java.lang.String) r11, (boolean) r14)     // Catch:{ all -> 0x0a11 }
            r4.zzh((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
        L_0x0880:
            r4.zzo(r12)     // Catch:{ all -> 0x0a11 }
            r4.zzp(r12)     // Catch:{ all -> 0x0a11 }
            r4.zzn(r12)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0a11 }
            r4.zzd((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.zzj     // Catch:{ all -> 0x0a11 }
            r4.zza((long) r14)     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0a11 }
            r4.zzc((java.lang.String) r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.zze     // Catch:{ all -> 0x0a11 }
            r4.zzm(r14)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.zzf     // Catch:{ all -> 0x0a11 }
            r4.zzj(r14)     // Catch:{ all -> 0x0a11 }
            boolean r8 = r3.zzh     // Catch:{ all -> 0x0a11 }
            r4.zzb((boolean) r8)     // Catch:{ all -> 0x0a11 }
            long r14 = r3.zzr     // Catch:{ all -> 0x0a11 }
            r4.zzk(r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r8 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r8.zza((com.google.android.gms.measurement.internal.zzh) r4)     // Catch:{ all -> 0x0a11 }
        L_0x08b3:
            boolean r7 = r7.zzh()     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x08d0
            java.lang.String r7 = r4.zzy()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08d0
            java.lang.String r7 = r4.zzy()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.zzc((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x08d0:
            java.lang.String r7 = r4.zzab()     // Catch:{ all -> 0x0a11 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a11 }
            if (r7 != 0) goto L_0x08e7
            java.lang.String r7 = r4.zzab()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0a11 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a11 }
            r2.zzl((java.lang.String) r7)     // Catch:{ all -> 0x0a11 }
        L_0x08e7:
            com.google.android.gms.measurement.internal.zzao r7 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0a11 }
            java.util.List r7 = r7.zzi(r8)     // Catch:{ all -> 0x0a11 }
            r8 = 0
        L_0x08f2:
            int r11 = r7.size()     // Catch:{ all -> 0x0a11 }
            if (r8 >= r11) goto L_0x0956
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = com.google.android.gms.internal.measurement.zzfi.zzn.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r14 = (com.google.android.gms.measurement.internal.zzne) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.zzc     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = r11.zza((java.lang.String) r14)     // Catch:{ all -> 0x0a11 }
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r14 = (com.google.android.gms.measurement.internal.zzne) r14     // Catch:{ all -> 0x0a11 }
            long r14 = r14.zzd     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.internal.measurement.zzfi$zzn$zza r11 = r11.zzb((long) r14)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzmz r14 = r28.zzp()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r15 = (com.google.android.gms.measurement.internal.zzne) r15     // Catch:{ all -> 0x0a11 }
            java.lang.Object r15 = r15.zze     // Catch:{ all -> 0x0a11 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzn.zza) r11, (java.lang.Object) r15)     // Catch:{ all -> 0x0a11 }
            r2.zza((com.google.android.gms.internal.measurement.zzfi.zzn.zza) r11)     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = "_sid"
            java.lang.Object r14 = r7.get(r8)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzne r14 = (com.google.android.gms.measurement.internal.zzne) r14     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r14.zzc     // Catch:{ all -> 0x0a11 }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x0a11 }
            if (r11 == 0) goto L_0x0953
            long r14 = r4.zzs()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            com.google.android.gms.measurement.internal.zzmz r11 = r28.zzp()     // Catch:{ all -> 0x0a11 }
            java.lang.String r14 = r3.zzv     // Catch:{ all -> 0x0a11 }
            long r14 = r11.zza((java.lang.String) r14)     // Catch:{ all -> 0x0a11 }
            long r16 = r4.zzs()     // Catch:{ all -> 0x0a11 }
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0953
            r2.zzp()     // Catch:{ all -> 0x0a11 }
        L_0x0953:
            int r8 = r8 + 1
            goto L_0x08f2
        L_0x0956:
            com.google.android.gms.measurement.internal.zzao r3 = r28.zzf()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzkj r4 = r2.zzab()     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = (com.google.android.gms.internal.measurement.zzfi.zzj) r4     // Catch:{ IOException -> 0x09c9 }
            long r2 = r3.zza((com.google.android.gms.internal.measurement.zzfi.zzj) r4)     // Catch:{ IOException -> 0x09c9 }
            com.google.android.gms.measurement.internal.zzao r4 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzbb r7 = r5.zze     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a11 }
        L_0x0972:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0985
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a11 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0a11 }
            if (r8 == 0) goto L_0x0972
            goto L_0x09c0
        L_0x0985:
            com.google.android.gms.measurement.internal.zzgp r7 = r28.zzi()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0a11 }
            java.lang.String r10 = r5.zzb     // Catch:{ all -> 0x0a11 }
            boolean r7 = r7.zzc(r8, r10)     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r14 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            long r15 = r28.zzx()     // Catch:{ all -> 0x0a11 }
            java.lang.String r8 = r5.zza     // Catch:{ all -> 0x0a11 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r8
            com.google.android.gms.measurement.internal.zzap r8 = r14.zza(r15, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0a11 }
            if (r7 == 0) goto L_0x09bf
            long r7 = r8.zze     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzaf r10 = r28.zze()     // Catch:{ all -> 0x0a11 }
            java.lang.String r11 = r5.zza     // Catch:{ all -> 0x0a11 }
            int r10 = r10.zze(r11)     // Catch:{ all -> 0x0a11 }
            long r10 = (long) r10     // Catch:{ all -> 0x0a11 }
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x09bf
            goto L_0x09c0
        L_0x09bf:
            r6 = 0
        L_0x09c0:
            boolean r2 = r4.zza((com.google.android.gms.measurement.internal.zzaz) r5, (long) r2, (boolean) r6)     // Catch:{ all -> 0x0a11 }
            if (r2 == 0) goto L_0x09e0
            r1.zzp = r12     // Catch:{ all -> 0x0a11 }
            goto L_0x09e0
        L_0x09c9:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfr r4 = r28.zzj()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x0a11 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzr()     // Catch:{ all -> 0x0a11 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x0a11 }
            r4.zza(r5, r2, r3)     // Catch:{ all -> 0x0a11 }
        L_0x09e0:
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()     // Catch:{ all -> 0x0a11 }
            r2.zzw()     // Catch:{ all -> 0x0a11 }
            com.google.android.gms.measurement.internal.zzao r2 = r28.zzf()
            r2.zzu()
            r28.zzab()
            com.google.android.gms.measurement.internal.zzfr r2 = r28.zzj()
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzp()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zza(r4, r3)
            return
        L_0x0a11:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzao r3 = r28.zzf()
            r3.zzu()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zzc(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzo):void");
    }

    private static void zza(zzfi.zze.zza zza2, int i10, String str) {
        List<zzfi.zzg> zzf2 = zza2.zzf();
        int i11 = 0;
        while (i11 < zzf2.size()) {
            if (!"_err".equals(zzf2.get(i11).zzg())) {
                i11++;
            } else {
                return;
            }
        }
        zza2.zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_err").zza(Long.valueOf((long) i10).longValue()).zzab())).zza((zzfi.zzg) ((zzix) zzfi.zzg.zze().zza("_ev").zzb(str).zzab()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002b, code lost:
        r4 = r1.zzag;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.measurement.internal.zzbg r20, com.google.android.gms.measurement.internal.zzo r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r21)
            java.lang.String r2 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            com.google.android.gms.measurement.internal.zzgy r2 = r19.zzl()
            r2.zzt()
            r19.zzs()
            java.lang.String r2 = r0.zza
            r3 = r20
            long r10 = r3.zzd
            com.google.android.gms.measurement.internal.zzfv r3 = com.google.android.gms.measurement.internal.zzfv.zza(r20)
            com.google.android.gms.measurement.internal.zzgy r4 = r19.zzl()
            r4.zzt()
            com.google.android.gms.measurement.internal.zzki r4 = r1.zzaf
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r1.zzag
            if (r4 == 0) goto L_0x0039
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.gms.measurement.internal.zzki r4 = r1.zzaf
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            android.os.Bundle r5 = r3.zzb
            r12 = 0
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zzki) r4, (android.os.Bundle) r5, (boolean) r12)
            com.google.android.gms.measurement.internal.zzbg r3 = r3.zza()
            r19.zzp()
            boolean r4 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.measurement.internal.zzbg) r3, (com.google.android.gms.measurement.internal.zzo) r0)
            if (r4 != 0) goto L_0x004e
            return
        L_0x004e:
            boolean r4 = r0.zzh
            if (r4 != 0) goto L_0x0056
            r1.zza((com.google.android.gms.measurement.internal.zzo) r0)
            return
        L_0x0056:
            java.util.List<java.lang.String> r4 = r0.zzs
            if (r4 == 0) goto L_0x0097
            java.lang.String r5 = r3.zza
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0085
            com.google.android.gms.measurement.internal.zzbb r4 = r3.zzb
            android.os.Bundle r4 = r4.zzb()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            com.google.android.gms.measurement.internal.zzbg r5 = new com.google.android.gms.measurement.internal.zzbg
            java.lang.String r14 = r3.zza
            com.google.android.gms.measurement.internal.zzbb r15 = new com.google.android.gms.measurement.internal.zzbb
            r15.<init>(r4)
            java.lang.String r4 = r3.zzc
            long r6 = r3.zzd
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            goto L_0x0098
        L_0x0085:
            com.google.android.gms.measurement.internal.zzfr r0 = r19.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzc()
            java.lang.String r4 = r3.zza
            java.lang.String r3 = r3.zzc
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r0.zza(r5, r2, r4, r3)
            return
        L_0x0097:
            r13 = r3
        L_0x0098:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()
            r3.zzp()
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02f2 }
            r3.zzt()     // Catch:{ all -> 0x02f2 }
            r3.zzak()     // Catch:{ all -> 0x02f2 }
            r4 = 0
            r6 = 2
            r14 = 1
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Invalid time querying timed out conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r3.zza(r4, r5, r8)     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x00de
        L_0x00ce:
            java.lang.String r4 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r5[r12] = r2     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r5[r14] = r8     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = r3.zza((java.lang.String) r4, (java.lang.String[]) r5)     // Catch:{ all -> 0x02f2 }
        L_0x00de:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x00e2:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r4 == 0) goto L_0x012e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzad r4 = (com.google.android.gms.measurement.internal.zzad) r4     // Catch:{ all -> 0x02f2 }
            if (r4 == 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.zzfr r5 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzp()     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = "User property timed out"
            java.lang.String r9 = r4.zza     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzhf r15 = r1.zzm     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzfq r15 = r15.zzk()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r14 = r4.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r14 = r14.zza     // Catch:{ all -> 0x02f2 }
            java.lang.String r14 = r15.zzc(r14)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r15 = r4.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.Object r15 = r15.zza()     // Catch:{ all -> 0x02f2 }
            r5.zza(r8, r9, r14, r15)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzbg r5 = r4.zzg     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.zzbg r5 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzbg r8 = r4.zzg     // Catch:{ all -> 0x02f2 }
            r5.<init>(r8, r10)     // Catch:{ all -> 0x02f2 }
            r1.zzc(r5, r0)     // Catch:{ all -> 0x02f2 }
        L_0x0121:
            com.google.android.gms.measurement.internal.zzao r5 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r4 = r4.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x02f2 }
            r5.zza((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x02f2 }
            r14 = 1
            goto L_0x00e2
        L_0x012e:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02f2 }
            r3.zzt()     // Catch:{ all -> 0x02f2 }
            r3.zzak()     // Catch:{ all -> 0x02f2 }
            if (r7 >= 0) goto L_0x0157
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Invalid time querying expired conditional properties"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r3.zza(r4, r5, r8)     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x0168
        L_0x0157:
            java.lang.String r4 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r5[r12] = r2     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r9 = 1
            r5[r9] = r8     // Catch:{ all -> 0x02f2 }
            java.util.List r3 = r3.zza((java.lang.String) r4, (java.lang.String[]) r5)     // Catch:{ all -> 0x02f2 }
        L_0x0168:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02f2 }
            int r5 = r3.size()     // Catch:{ all -> 0x02f2 }
            r4.<init>(r5)     // Catch:{ all -> 0x02f2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x0175:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x01c5
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzad r5 = (com.google.android.gms.measurement.internal.zzad) r5     // Catch:{ all -> 0x02f2 }
            if (r5 == 0) goto L_0x0175
            com.google.android.gms.measurement.internal.zzfr r8 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ all -> 0x02f2 }
            java.lang.String r9 = "User property expired"
            java.lang.String r14 = r5.zza     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzhf r15 = r1.zzm     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzfq r15 = r15.zzk()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r6 = r5.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.zza     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r15.zzc(r6)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r15 = r5.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.Object r15 = r15.zza()     // Catch:{ all -> 0x02f2 }
            r8.zza(r9, r14, r6, r15)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzao r6 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r8 = r5.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r8 = r8.zza     // Catch:{ all -> 0x02f2 }
            r6.zzh(r2, r8)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzbg r6 = r5.zzk     // Catch:{ all -> 0x02f2 }
            if (r6 == 0) goto L_0x01b8
            r4.add(r6)     // Catch:{ all -> 0x02f2 }
        L_0x01b8:
            com.google.android.gms.measurement.internal.zzao r6 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zznc r5 = r5.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = r5.zza     // Catch:{ all -> 0x02f2 }
            r6.zza((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ all -> 0x02f2 }
            r6 = 2
            goto L_0x0175
        L_0x01c5:
            int r3 = r4.size()     // Catch:{ all -> 0x02f2 }
            r5 = 0
        L_0x01ca:
            if (r5 >= r3) goto L_0x01dd
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x02f2 }
            int r5 = r5 + 1
            com.google.android.gms.measurement.internal.zzbg r6 = (com.google.android.gms.measurement.internal.zzbg) r6     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzbg r8 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02f2 }
            r8.<init>(r6, r10)     // Catch:{ all -> 0x02f2 }
            r1.zzc(r8, r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x01ca
        L_0x01dd:
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r13.zza     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x02f2 }
            r3.zzt()     // Catch:{ all -> 0x02f2 }
            r3.zzak()     // Catch:{ all -> 0x02f2 }
            if (r7 >= 0) goto L_0x0213
            com.google.android.gms.measurement.internal.zzfr r5 = r3.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = "Invalid time querying triggered conditional properties"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzfq r3 = r3.zzi()     // Catch:{ all -> 0x02f2 }
            java.lang.String r3 = r3.zza((java.lang.String) r4)     // Catch:{ all -> 0x02f2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r5.zza(r6, r2, r3, r4)     // Catch:{ all -> 0x02f2 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f2 }
            goto L_0x0228
        L_0x0213:
            java.lang.String r5 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x02f2 }
            r6[r12] = r2     // Catch:{ all -> 0x02f2 }
            r2 = 1
            r6[r2] = r4     // Catch:{ all -> 0x02f2 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f2 }
            r4 = 2
            r6[r4] = r2     // Catch:{ all -> 0x02f2 }
            java.util.List r2 = r3.zza((java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x02f2 }
        L_0x0228:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x02f2 }
            int r3 = r2.size()     // Catch:{ all -> 0x02f2 }
            r14.<init>(r3)     // Catch:{ all -> 0x02f2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02f2 }
        L_0x0235:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x02c8
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02f2 }
            r15 = r3
            com.google.android.gms.measurement.internal.zzad r15 = (com.google.android.gms.measurement.internal.zzad) r15     // Catch:{ all -> 0x02f2 }
            if (r15 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.zznc r3 = r15.zzc     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzne r9 = new com.google.android.gms.measurement.internal.zzne     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = r15.zza     // Catch:{ all -> 0x02f2 }
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x02f2 }
            java.lang.String r5 = r15.zzb     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x02f2 }
            java.lang.Object r3 = r3.zza()     // Catch:{ all -> 0x02f2 }
            java.lang.Object r16 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x02f2 }
            r3 = r9
            r7 = r10
            r12 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzao r3 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzne) r12)     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x028c
            com.google.android.gms.measurement.internal.zzfr r3 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzp()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "User property triggered"
            java.lang.String r5 = r15.zza     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzhf r6 = r1.zzm     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzfq r6 = r6.zzk()     // Catch:{ all -> 0x02f2 }
            java.lang.String r7 = r12.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.zzc(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.Object r7 = r12.zze     // Catch:{ all -> 0x02f2 }
            r3.zza(r4, r5, r6, r7)     // Catch:{ all -> 0x02f2 }
            goto L_0x02ad
        L_0x028c:
            com.google.android.gms.measurement.internal.zzfr r3 = r19.zzj()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x02f2 }
            java.lang.String r4 = "Too many active user properties, ignoring"
            java.lang.String r5 = r15.zza     // Catch:{ all -> 0x02f2 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzhf r6 = r1.zzm     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzfq r6 = r6.zzk()     // Catch:{ all -> 0x02f2 }
            java.lang.String r7 = r12.zzc     // Catch:{ all -> 0x02f2 }
            java.lang.String r6 = r6.zzc(r7)     // Catch:{ all -> 0x02f2 }
            java.lang.Object r7 = r12.zze     // Catch:{ all -> 0x02f2 }
            r3.zza(r4, r5, r6, r7)     // Catch:{ all -> 0x02f2 }
        L_0x02ad:
            com.google.android.gms.measurement.internal.zzbg r3 = r15.zzi     // Catch:{ all -> 0x02f2 }
            if (r3 == 0) goto L_0x02b4
            r14.add(r3)     // Catch:{ all -> 0x02f2 }
        L_0x02b4:
            com.google.android.gms.measurement.internal.zznc r3 = new com.google.android.gms.measurement.internal.zznc     // Catch:{ all -> 0x02f2 }
            r3.<init>(r12)     // Catch:{ all -> 0x02f2 }
            r15.zzc = r3     // Catch:{ all -> 0x02f2 }
            r3 = 1
            r15.zze = r3     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzao r4 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            r4.zza((com.google.android.gms.measurement.internal.zzad) r15)     // Catch:{ all -> 0x02f2 }
            r12 = 0
            goto L_0x0235
        L_0x02c8:
            r1.zzc(r13, r0)     // Catch:{ all -> 0x02f2 }
            int r2 = r14.size()     // Catch:{ all -> 0x02f2 }
            r12 = 0
        L_0x02d0:
            if (r12 >= r2) goto L_0x02e3
            java.lang.Object r3 = r14.get(r12)     // Catch:{ all -> 0x02f2 }
            int r12 = r12 + 1
            com.google.android.gms.measurement.internal.zzbg r3 = (com.google.android.gms.measurement.internal.zzbg) r3     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzbg r4 = new com.google.android.gms.measurement.internal.zzbg     // Catch:{ all -> 0x02f2 }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x02f2 }
            r1.zzc(r4, r0)     // Catch:{ all -> 0x02f2 }
            goto L_0x02d0
        L_0x02e3:
            com.google.android.gms.measurement.internal.zzao r0 = r19.zzf()     // Catch:{ all -> 0x02f2 }
            r0.zzw()     // Catch:{ all -> 0x02f2 }
            com.google.android.gms.measurement.internal.zzao r0 = r19.zzf()
            r0.zzu()
            return
        L_0x02f2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzao r2 = r19.zzf()
            r2.zzu()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzo):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbg zzbg, String str) {
        String str2;
        int i10;
        zzbg zzbg2 = zzbg;
        String str3 = str;
        zzh zzd2 = zzf().zzd(str3);
        if (zzd2 == null || TextUtils.isEmpty(zzd2.zzaa())) {
            zzj().zzc().zza("No app data available; dropping event", str3);
            return;
        }
        Boolean zza2 = zza(zzd2);
        if (zza2 == null) {
            if (!"_ui".equals(zzbg2.zza)) {
                zzj().zzu().zza("Could not find package. appId", zzfr.zza(str));
            }
        } else if (!zza2.booleanValue()) {
            zzj().zzg().zza("App version does not match; dropping event. appId", zzfr.zza(str));
            return;
        }
        zzih zzb2 = zzb(str3);
        if (!zznp.zza() || !zze().zza(zzbi.zzcm)) {
            str2 = "";
            i10 = 100;
        } else {
            str2 = zzd(str3).zzf();
            i10 = zzb2.zza();
        }
        zzo zzo2 = r2;
        zzh zzh2 = zzd2;
        zzo zzo3 = new zzo(str, zzd2.zzac(), zzd2.zzaa(), zzd2.zzc(), zzd2.zzz(), zzd2.zzo(), zzd2.zzl(), (String) null, zzd2.zzak(), false, zzh2.zzab(), zzh2.zzb(), 0, 0, zzh2.zzaj(), false, zzh2.zzv(), zzh2.zzu(), zzh2.zzm(), zzh2.zzag(), (String) null, zzb2.zze(), "", (String) null, zzh2.zzam(), zzh2.zzt(), i10, str2, zzh2.zza(), zzh2.zzd());
        zzb(zzbg2, zzo2);
    }

    private final void zza(zzfi.zzj.zza zza2, long j10, boolean z10) {
        zzne zzne;
        String str = z10 ? "_se" : "_lte";
        zzne zze2 = zzf().zze(zza2.zzr(), str);
        if (zze2 == null || zze2.zze == null) {
            zzne = new zzne(zza2.zzr(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(j10));
        } else {
            zzne = new zzne(zza2.zzr(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(((Long) zze2.zze).longValue() + j10));
        }
        zzfi.zzn zzn2 = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza(str).zzb(zzb().currentTimeMillis()).zza(((Long) zzne.zze).longValue()).zzab());
        boolean z11 = false;
        int zza3 = zzmz.zza(zza2, str);
        if (zza3 >= 0) {
            zza2.zza(zza3, zzn2);
            z11 = true;
        }
        if (!z11) {
            zza2.zza(zzn2);
        }
        if (j10 > 0) {
            zzf().zza(zzne);
            zzj().zzp().zza("Updated engagement user property. scope, value", z10 ? "session-scoped" : "lifetime", zzne.zze);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0144 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0178 A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[Catch:{ all -> 0x0193, all -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzgy r0 = r6.zzl()
            r0.zzt()
            r6.zzs()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x019c }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzfr r1 = r6.zzj()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzp()     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x019c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019c }
            r1.zza(r2, r3)     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzao r1 = r6.zzf()     // Catch:{ all -> 0x019c }
            r1.zzp()     // Catch:{ all -> 0x019c }
            com.google.android.gms.measurement.internal.zzao r1 = r6.zzf()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzh r1 = r1.zzd(r7)     // Catch:{ all -> 0x0193 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r3) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzu()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0193 }
            r8.zza(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x0061
            goto L_0x00ba
        L_0x0061:
            com.google.android.gms.common.util.Clock r10 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r1.zzl(r10)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r10 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r10.zza((com.google.android.gms.measurement.internal.zzh) r1)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzfr r10 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzp()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            r10.zza(r11, r1, r9)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgp r9 = r6.zzi()     // Catch:{ all -> 0x0193 }
            r9.zzi(r7)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzls r7 = r6.zzj     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzd     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.Clock r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r7.zza(r9)     // Catch:{ all -> 0x0193 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a4
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.zzls r7 = r6.zzj     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzb     // Catch:{ all -> 0x0193 }
            com.google.android.gms.common.util.Clock r8 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r7.zza(r8)     // Catch:{ all -> 0x0193 }
        L_0x00b5:
            r6.zzab()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x0193 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r9
        L_0x00c7:
            if (r2 == 0) goto L_0x00d6
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00d6
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0193 }
            goto L_0x00d7
        L_0x00d6:
            r2 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e2
            java.lang.String r4 = "ETag"
            java.lang.Object r11 = r11.get(r4)     // Catch:{ all -> 0x0193 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 == 0) goto L_0x00f2
            boolean r4 = r11.isEmpty()     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x00f2
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0193 }
            goto L_0x00f3
        L_0x00f2:
            r11 = r9
        L_0x00f3:
            if (r8 == r5) goto L_0x010f
            if (r8 != r3) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            com.google.android.gms.measurement.internal.zzgp r9 = r6.zzi()     // Catch:{ all -> 0x0193 }
            boolean r9 = r9.zza(r7, r10, r2, r11)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x010f:
            com.google.android.gms.measurement.internal.zzgp r11 = r6.zzi()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.measurement.zzfc$zzd r11 = r11.zzc(r7)     // Catch:{ all -> 0x0193 }
            if (r11 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzgp r11 = r6.zzi()     // Catch:{ all -> 0x0193 }
            boolean r9 = r11.zza(r7, r9, r9, r9)     // Catch:{ all -> 0x0193 }
            if (r9 != 0) goto L_0x0130
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x0130:
            com.google.android.gms.common.util.Clock r9 = r6.zzb()     // Catch:{ all -> 0x0193 }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            r1.zzc((long) r2)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r9 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r9.zza((com.google.android.gms.measurement.internal.zzh) r1)     // Catch:{ all -> 0x0193 }
            if (r8 != r5) goto L_0x0152
            com.google.android.gms.measurement.internal.zzfr r8 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzv()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zza(r9, r7)     // Catch:{ all -> 0x0193 }
            goto L_0x0168
        L_0x0152:
            com.google.android.gms.measurement.internal.zzfr r7 = r6.zzj()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzp()     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0193 }
            int r10 = r10.length     // Catch:{ all -> 0x0193 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0193 }
            r7.zza(r9, r8, r10)     // Catch:{ all -> 0x0193 }
        L_0x0168:
            com.google.android.gms.measurement.internal.zzfy r7 = r6.zzh()     // Catch:{ all -> 0x0193 }
            boolean r7 = r7.zzu()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            boolean r7 = r6.zzac()     // Catch:{ all -> 0x0193 }
            if (r7 == 0) goto L_0x017c
            r6.zzw()     // Catch:{ all -> 0x0193 }
            goto L_0x017f
        L_0x017c:
            r6.zzab()     // Catch:{ all -> 0x0193 }
        L_0x017f:
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x0193 }
            r7.zzw()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.measurement.internal.zzao r7 = r6.zzf()     // Catch:{ all -> 0x019c }
            r7.zzu()     // Catch:{ all -> 0x019c }
            r6.zzu = r0
            r6.zzaa()
            return
        L_0x0193:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzao r8 = r6.zzf()     // Catch:{ all -> 0x019c }
            r8.zzu()     // Catch:{ all -> 0x019c }
            throw r7     // Catch:{ all -> 0x019c }
        L_0x019c:
            r7 = move-exception
            r6.zzu = r0
            r6.zzaa()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z10) {
        zzab();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135 A[Catch:{ SQLiteException -> 0x0149 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzgy r13 = r8.zzl()
            r13.zzt()
            r8.zzs()
            r13 = 0
            if (r12 != 0) goto L_0x000f
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x01c0 }
        L_0x000f:
            java.util.List<java.lang.Long> r0 = r8.zzz     // Catch:{ all -> 0x01c0 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x01c0 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01c0 }
            r1 = 0
            r8.zzz = r1     // Catch:{ all -> 0x01c0 }
            boolean r2 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x01c0 }
            r3 = 1
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.zzaf r2 = r8.zze()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ all -> 0x01c0 }
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x01c0 }
            if (r2 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x0039
        L_0x002f:
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 == r2) goto L_0x0037
            r2 = 204(0xcc, float:2.86E-43)
            if (r10 != r2) goto L_0x0175
        L_0x0037:
            if (r11 != 0) goto L_0x0175
        L_0x0039:
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzaf r11 = r8.zze()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x004d
            if (r9 == 0) goto L_0x005c
        L_0x004d:
            com.google.android.gms.measurement.internal.zzls r11 = r8.zzj     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzgi r11 = r11.zzc     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.common.util.Clock r2 = r8.zzb()     // Catch:{ SQLiteException -> 0x0149 }
            long r4 = r2.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0149 }
            r11.zza(r4)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x005c:
            com.google.android.gms.measurement.internal.zzls r11 = r8.zzj     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzgi r11 = r11.zzd     // Catch:{ SQLiteException -> 0x0149 }
            r4 = 0
            r11.zza(r4)     // Catch:{ SQLiteException -> 0x0149 }
            r8.zzab()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            com.google.android.gms.measurement.internal.zzaf r11 = r8.zze()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzbi.zzcr     // Catch:{ SQLiteException -> 0x0149 }
            boolean r11 = r11.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r11 == 0) goto L_0x009b
            if (r9 == 0) goto L_0x007d
            goto L_0x009b
        L_0x007d:
            boolean r9 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.zzaf r9 = r8.zze()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r2)     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r10 = "Purged empty bundles"
            r9.zza(r10)     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x00b1
        L_0x009b:
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.String r11 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x0149 }
            int r12 = r12.length     // Catch:{ SQLiteException -> 0x0149 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0149 }
            r9.zza(r11, r10, r12)     // Catch:{ SQLiteException -> 0x0149 }
        L_0x00b1:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ SQLiteException -> 0x0149 }
            r9.zzp()     // Catch:{ SQLiteException -> 0x0149 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0140 }
        L_0x00bc:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0111
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0140 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.zzao r11 = r8.zzf()     // Catch:{ SQLiteException -> 0x0104 }
            long r6 = r10.longValue()     // Catch:{ SQLiteException -> 0x0104 }
            r11.zzt()     // Catch:{ SQLiteException -> 0x0104 }
            r11.zzak()     // Catch:{ SQLiteException -> 0x0104 }
            android.database.sqlite.SQLiteDatabase r12 = r11.e_()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0104 }
            r0[r13] = r2     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r2 = "queue"
            java.lang.String r6 = "rowid=?"
            int r12 = r12.delete(r2, r6, r0)     // Catch:{ SQLiteException -> 0x00f5 }
            if (r12 != r3) goto L_0x00ed
            goto L_0x00bc
        L_0x00ed:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00f5 }
            java.lang.String r0 = "Deleted fewer rows from queue than expected"
            r12.<init>(r0)     // Catch:{ SQLiteException -> 0x00f5 }
            throw r12     // Catch:{ SQLiteException -> 0x00f5 }
        L_0x00f5:
            r12 = move-exception
            com.google.android.gms.measurement.internal.zzfr r11 = r11.zzj()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.zzft r11 = r11.zzg()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r0 = "Failed to delete a bundle in a queue table"
            r11.zza(r0, r12)     // Catch:{ SQLiteException -> 0x0104 }
            throw r12     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0104:
            r11 = move-exception
            java.util.List<java.lang.Long> r12 = r8.zzaa     // Catch:{ all -> 0x0140 }
            if (r12 == 0) goto L_0x0110
            boolean r10 = r12.contains(r10)     // Catch:{ all -> 0x0140 }
            if (r10 == 0) goto L_0x0110
            goto L_0x00bc
        L_0x0110:
            throw r11     // Catch:{ all -> 0x0140 }
        L_0x0111:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ all -> 0x0140 }
            r9.zzw()     // Catch:{ all -> 0x0140 }
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ SQLiteException -> 0x0149 }
            r9.zzu()     // Catch:{ SQLiteException -> 0x0149 }
            r8.zzaa = r1     // Catch:{ SQLiteException -> 0x0149 }
            com.google.android.gms.measurement.internal.zzfy r9 = r8.zzh()     // Catch:{ SQLiteException -> 0x0149 }
            boolean r9 = r9.zzu()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            boolean r9 = r8.zzac()     // Catch:{ SQLiteException -> 0x0149 }
            if (r9 == 0) goto L_0x0135
            r8.zzw()     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x013c
        L_0x0135:
            r9 = -1
            r8.zzab = r9     // Catch:{ SQLiteException -> 0x0149 }
            r8.zzab()     // Catch:{ SQLiteException -> 0x0149 }
        L_0x013c:
            r8.zzp = r4     // Catch:{ SQLiteException -> 0x0149 }
            goto L_0x01ba
        L_0x0140:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzao r10 = r8.zzf()     // Catch:{ SQLiteException -> 0x0149 }
            r10.zzu()     // Catch:{ SQLiteException -> 0x0149 }
            throw r9     // Catch:{ SQLiteException -> 0x0149 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzfr r10 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzft r10 = r10.zzg()     // Catch:{ all -> 0x01c0 }
            java.lang.String r11 = "Database error while trying to delete uploaded bundles"
            r10.zza(r11, r9)     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.common.util.Clock r9 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r9 = r9.elapsedRealtime()     // Catch:{ all -> 0x01c0 }
            r8.zzp = r9     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ all -> 0x01c0 }
            java.lang.String r10 = "Disable upload, time"
            long r11 = r8.zzp     // Catch:{ all -> 0x01c0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01c0 }
            r9.zza(r10, r11)     // Catch:{ all -> 0x01c0 }
            goto L_0x01ba
        L_0x0175:
            com.google.android.gms.measurement.internal.zzfr r9 = r8.zzj()     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzp()     // Catch:{ all -> 0x01c0 }
            java.lang.String r12 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c0 }
            r9.zza(r12, r1, r11)     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzls r9 = r8.zzj     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzd     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.common.util.Clock r11 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r11 = r11.currentTimeMillis()     // Catch:{ all -> 0x01c0 }
            r9.zza(r11)     // Catch:{ all -> 0x01c0 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x019f
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            if (r3 == 0) goto L_0x01b0
            com.google.android.gms.measurement.internal.zzls r9 = r8.zzj     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.measurement.internal.zzgi r9 = r9.zzb     // Catch:{ all -> 0x01c0 }
            com.google.android.gms.common.util.Clock r10 = r8.zzb()     // Catch:{ all -> 0x01c0 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x01c0 }
            r9.zza(r10)     // Catch:{ all -> 0x01c0 }
        L_0x01b0:
            com.google.android.gms.measurement.internal.zzao r9 = r8.zzf()     // Catch:{ all -> 0x01c0 }
            r9.zza((java.util.List<java.lang.Long>) r0)     // Catch:{ all -> 0x01c0 }
            r8.zzab()     // Catch:{ all -> 0x01c0 }
        L_0x01ba:
            r8.zzv = r13
            r8.zzaa()
            return
        L_0x01c0:
            r9 = move-exception
            r8.zzv = r13
            r8.zzaa()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzad zzad2) {
        zzo zzc2 = zzc((String) Preconditions.checkNotNull(zzad2.zza));
        if (zzc2 != null) {
            zza(zzad2, zzc2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzad zzad2, zzo zzo2) {
        Preconditions.checkNotNull(zzad2);
        Preconditions.checkNotEmpty(zzad2.zza);
        Preconditions.checkNotNull(zzad2.zzc);
        Preconditions.checkNotEmpty(zzad2.zzc.zza);
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            zzf().zzp();
            try {
                zza(zzo2);
                String str = (String) Preconditions.checkNotNull(zzad2.zza);
                zzad zzc2 = zzf().zzc(str, zzad2.zzc.zza);
                if (zzc2 != null) {
                    zzj().zzc().zza("Removing conditional user property", zzad2.zza, this.zzm.zzk().zzc(zzad2.zzc.zza));
                    zzf().zza(str, zzad2.zzc.zza);
                    if (zzc2.zze) {
                        zzf().zzh(str, zzad2.zzc.zza);
                    }
                    zzbg zzbg = zzad2.zzk;
                    if (zzbg != null) {
                        zzbb zzbb = zzbg.zzb;
                        zzc((zzbg) Preconditions.checkNotNull(zzq().zza(str, ((zzbg) Preconditions.checkNotNull(zzad2.zzk)).zza, zzbb != null ? zzbb.zzb() : null, zzc2.zzb, zzad2.zzk.zzd, true, true)), zzo2);
                    }
                } else {
                    zzj().zzu().zza("Conditional user property doesn't exist", zzfr.zza(zzad2.zza), this.zzm.zzk().zzc(zzad2.zzc.zza));
                }
                zzf().zzw();
            } finally {
                zzf().zzu();
            }
        }
    }

    private static void zza(zzfi.zze.zza zza2, String str) {
        List<zzfi.zzg> zzf2 = zza2.zzf();
        for (int i10 = 0; i10 < zzf2.size(); i10++) {
            if (str.equals(zzf2.get(i10).zzg())) {
                zza2.zza(i10);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzo zzo2) {
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
            } else if (!"_npa".equals(str) || zzo2.zzq == null) {
                zzj().zzc().zza("Removing user property", this.zzm.zzk().zzc(str));
                zzf().zzp();
                try {
                    zza(zzo2);
                    if ("_id".equals(str)) {
                        zzf().zzh((String) Preconditions.checkNotNull(zzo2.zza), "_lair");
                    }
                    zzf().zzh((String) Preconditions.checkNotNull(zzo2.zza), str);
                    zzf().zzw();
                    zzj().zzc().zza("User property removed", this.zzm.zzk().zzc(str));
                } finally {
                    zzf().zzu();
                }
            } else {
                zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zznc("_npa", zzb().currentTimeMillis(), Long.valueOf(zzo2.zzq.booleanValue() ? 1 : 0), "auto"), zzo2);
            }
        }
    }

    public final void zza(String str, zzki zzki) {
        zzl().zzt();
        String str2 = this.zzag;
        if (str2 == null || str2.equals(str) || zzki != null) {
            this.zzag = str;
            this.zzaf = zzki;
        }
    }

    private final void zza(List<Long> list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzj().zzg().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzih zzih) {
        zzl().zzt();
        zzs();
        this.zzac.put(str, zzih);
        zzf().zza(str, zzih);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzay zzay) {
        zzl().zzt();
        zzs();
        if (zznp.zza()) {
            this.zzad.put(str, zzay);
            zzf().zza(str, zzay);
        }
    }

    private final void zza(String str, boolean z10) {
        zzh zzd2 = zzf().zzd(str);
        if (zzd2 != null) {
            zzd2.zzd(z10);
            if (zzd2.zzal()) {
                zzf().zza(zzd2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zznc zznc, zzo zzo2) {
        zzne zze2;
        zzl().zzt();
        zzs();
        if (zze(zzo2)) {
            if (!zzo2.zzh) {
                zza(zzo2);
                return;
            }
            int zzb2 = zzq().zzb(zznc.zza);
            if (zzb2 != 0) {
                zzq();
                String str = zznc.zza;
                zze();
                String zza2 = zznd.zza(str, 24, true);
                String str2 = zznc.zza;
                int length = str2 != null ? str2.length() : 0;
                zzq();
                zznd.zza(this.zzah, zzo2.zza, zzb2, "_ev", zza2, length);
                return;
            }
            int zza3 = zzq().zza(zznc.zza, zznc.zza());
            if (zza3 != 0) {
                zzq();
                String str3 = zznc.zza;
                zze();
                String zza4 = zznd.zza(str3, 24, true);
                Object zza5 = zznc.zza();
                int length2 = (zza5 == null || (!(zza5 instanceof String) && !(zza5 instanceof CharSequence))) ? 0 : String.valueOf(zza5).length();
                zzq();
                zznd.zza(this.zzah, zzo2.zza, zza3, "_ev", zza4, length2);
                return;
            }
            Object zzc2 = zzq().zzc(zznc.zza, zznc.zza());
            if (zzc2 != null) {
                if ("_sid".equals(zznc.zza)) {
                    long j10 = zznc.zzb;
                    String str4 = zznc.zze;
                    String str5 = (String) Preconditions.checkNotNull(zzo2.zza);
                    long j11 = 0;
                    zzne zze3 = zzf().zze(str5, "_sno");
                    if (zze3 != null) {
                        Object obj = zze3.zze;
                        if (obj instanceof Long) {
                            j11 = ((Long) obj).longValue();
                            zza(new zznc("_sno", j10, Long.valueOf(j11 + 1), str4), zzo2);
                        }
                    }
                    if (zze3 != null) {
                        zzj().zzu().zza("Retrieved last session number from database does not contain a valid (long) value", zze3.zze);
                    }
                    zzbc zzd2 = zzf().zzd(str5, "_s");
                    if (zzd2 != null) {
                        j11 = zzd2.zzc;
                        zzj().zzp().zza("Backfill the session number. Last used session number", Long.valueOf(j11));
                    }
                    zza(new zznc("_sno", j10, Long.valueOf(j11 + 1), str4), zzo2);
                }
                zzne zzne = new zzne((String) Preconditions.checkNotNull(zzo2.zza), (String) Preconditions.checkNotNull(zznc.zze), zznc.zza, zznc.zzb, zzc2);
                zzj().zzp().zza("Setting user property", this.zzm.zzk().zzc(zzne.zzc), zzc2);
                zzf().zzp();
                try {
                    if ("_id".equals(zzne.zzc) && (zze2 = zzf().zze(zzo2.zza, "_id")) != null && !zzne.zze.equals(zze2.zze)) {
                        zzf().zzh(zzo2.zza, "_lair");
                    }
                    zza(zzo2);
                    boolean zza6 = zzf().zza(zzne);
                    if ("_sid".equals(zznc.zza)) {
                        long zza7 = zzp().zza(zzo2.zzv);
                        zzh zzd3 = zzf().zzd(zzo2.zza);
                        if (zzd3 != null) {
                            zzd3.zzq(zza7);
                            if (zzd3.zzal()) {
                                zzf().zza(zzd3);
                            }
                        }
                    }
                    zzf().zzw();
                    if (!zza6) {
                        zzj().zzg().zza("Too many unique user properties are set. Ignoring user property", this.zzm.zzk().zzc(zzne.zzc), zzne.zze);
                        zzq();
                        zznd.zza(this.zzah, zzo2.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzf().zzu();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x022e A[SYNTHETIC, Splitter:B:107:0x022e] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0235 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0241 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ba A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03bc A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03bf A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03c0 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0598 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0663 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06b5 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0b2f A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0b42 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0b45 A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0b6a A[Catch:{ IOException -> 0x01f5, all -> 0x0ec4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0eac A[SYNTHETIC, Splitter:B:533:0x0eac] */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0ec0 A[SYNTHETIC, Splitter:B:540:0x0ec0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.lang.String r41, long r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r2 = "_ai"
            com.google.android.gms.measurement.internal.zzao r3 = r40.zzf()
            r3.zzp()
            com.google.android.gms.measurement.internal.zzmp$zza r3 = new com.google.android.gms.measurement.internal.zzmp$zza     // Catch:{ all -> 0x0ec4 }
            r4 = 0
            r3.<init>()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r5 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            long r6 = r1.zzab     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0ec4 }
            r5.zzt()     // Catch:{ all -> 0x0ec4 }
            r5.zzak()     // Catch:{ all -> 0x0ec4 }
            r9 = -1
            r11 = 2
            r12 = 1
            r13 = 0
            android.database.sqlite.SQLiteDatabase r15 = r5.e_()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x0085
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x0049
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0044 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0044 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0044 }
            goto L_0x0051
        L_0x0044:
            r0 = move-exception
            r6 = r0
            r8 = r4
            goto L_0x021b
        L_0x0049:
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r17 = java.lang.String.valueOf(r42)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8[r13] = r17     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
        L_0x0051:
            if (r14 == 0) goto L_0x0055
            java.lang.String r16 = "rowid <= ? and "
        L_0x0055:
            r14 = r16
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r11 = "select app_id, metadata_fingerprint from raw_events where "
            r4.<init>(r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r4.append(r14)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r11 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            android.database.Cursor r4 = r15.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020f }
            if (r8 != 0) goto L_0x0079
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x0079:
            java.lang.String r8 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x020f }
            java.lang.String r11 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ SQLiteException -> 0x020c }
            goto L_0x00cb
        L_0x0085:
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            r8 = 2
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8 = 0
            r11[r13] = r8     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            goto L_0x009b
        L_0x0096:
            r8 = 0
            java.lang.String[] r11 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
        L_0x009b:
            if (r4 == 0) goto L_0x009f
            java.lang.String r16 = " and rowid <= ?"
        L_0x009f:
            r4 = r16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r14 = "select metadata_fingerprint from raw_events where app_id = ?"
            r8.<init>(r14)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = " order by rowid limit 1;"
            r8.append(r4)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            java.lang.String r4 = r8.toString()     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            android.database.Cursor r4 = r15.rawQuery(r4, r11)     // Catch:{ SQLiteException -> 0x0217, all -> 0x0212 }
            boolean r8 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020f }
            if (r8 != 0) goto L_0x00c3
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x00c3:
            java.lang.String r11 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x020f }
            r4.close()     // Catch:{ SQLiteException -> 0x020f }
            r8 = 0
        L_0x00cb:
            java.lang.String r16 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r17 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r18 = "app_id = ? and metadata_fingerprint = ?"
            r14 = 2
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x020c }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r9[r12] = r11     // Catch:{ SQLiteException -> 0x020c }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r14 = r15
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r9
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x020c }
            boolean r9 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020c }
            if (r9 != 0) goto L_0x010e
            com.google.android.gms.measurement.internal.zzfr r6 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzg()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x020c }
            r6.zza(r7, r9)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x010e:
            byte[] r9 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r14 = com.google.android.gms.internal.measurement.zzfi.zzj.zzu()     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.zzmz.zza(r14, (byte[]) r9)     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r9     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzkj r9 = r9.zzab()     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ IOException -> 0x01f5 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = (com.google.android.gms.internal.measurement.zzfi.zzj) r9     // Catch:{ IOException -> 0x01f5 }
            boolean r14 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x020c }
            if (r14 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.zzfr r14 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.zzft r14 = r14.zzu()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x020c }
            r14.zza(r15, r12)     // Catch:{ SQLiteException -> 0x020c }
        L_0x013b:
            r4.close()     // Catch:{ SQLiteException -> 0x020c }
            r3.zza(r9)     // Catch:{ SQLiteException -> 0x020c }
            r14 = -1
            int r9 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x015d
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x020c }
            r14[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r12 = 1
            r14[r12] = r11     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x020c }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x020c }
            r17 = r9
            r18 = r14
            goto L_0x016b
        L_0x015d:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x020c }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x020c }
            r7 = 1
            r9[r7] = r11     // Catch:{ SQLiteException -> 0x020c }
            r17 = r6
            r18 = r9
        L_0x016b:
            java.lang.String r15 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r6, r7, r9, r11}     // Catch:{ SQLiteException -> 0x020c }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r22 = 0
            r14 = r10
            android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x020c }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01a2
            com.google.android.gms.measurement.internal.zzfr r6 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzu()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x020c }
            r6.zza(r7, r9)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01a2:
            long r6 = r4.getLong(r13)     // Catch:{ SQLiteException -> 0x020c }
            r9 = 3
            byte[] r10 = r4.getBlob(r9)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r9 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.measurement.internal.zzmz.zza(r9, (byte[]) r10)     // Catch:{ IOException -> 0x01d8 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r9 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r9     // Catch:{ IOException -> 0x01d8 }
            r10 = 1
            java.lang.String r11 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r10 = r9.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x020c }
            r11 = 2
            long r14 = r4.getLong(r11)     // Catch:{ SQLiteException -> 0x020c }
            r10.zzb((long) r14)     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzkj r9 = r9.zzab()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ SQLiteException -> 0x020c }
            boolean r6 = r3.zza(r6, r9)     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01eb
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01d8:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzfr r7 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x020c }
            r7.zza(r9, r10, r6)     // Catch:{ SQLiteException -> 0x020c }
        L_0x01eb:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x020c }
            if (r6 != 0) goto L_0x01a2
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x01f5:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzfr r7 = r5.zzj()     // Catch:{ SQLiteException -> 0x020c }
            com.google.android.gms.measurement.internal.zzft r7 = r7.zzg()     // Catch:{ SQLiteException -> 0x020c }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x020c }
            r7.zza(r9, r10, r6)     // Catch:{ SQLiteException -> 0x020c }
            r4.close()     // Catch:{ all -> 0x0ec4 }
            goto L_0x0231
        L_0x020c:
            r0 = move-exception
            r6 = r0
            goto L_0x021b
        L_0x020f:
            r0 = move-exception
            r6 = r0
            goto L_0x021a
        L_0x0212:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0ebe
        L_0x0217:
            r0 = move-exception
            r6 = r0
            r4 = 0
        L_0x021a:
            r8 = 0
        L_0x021b:
            com.google.android.gms.measurement.internal.zzfr r5 = r5.zzj()     // Catch:{ all -> 0x0ebc }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x0ebc }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ebc }
            r5.zza(r7, r8, r6)     // Catch:{ all -> 0x0ebc }
            if (r4 == 0) goto L_0x0231
            r4.close()     // Catch:{ all -> 0x0ec4 }
        L_0x0231:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x023e
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            r4 = 0
            goto L_0x023f
        L_0x023e:
            r4 = 1
        L_0x023f:
            if (r4 != 0) goto L_0x0eac
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.zza     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r4 = r4.zzi()     // Catch:{ all -> 0x0ec4 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x0254:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            int r14 = r14.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = "_fr"
            java.lang.String r13 = "_et"
            java.lang.String r5 = "_e"
            r17 = r9
            java.lang.String r9 = "_c"
            r43 = r10
            r18 = r11
            if (r8 >= r14) goto L_0x0730
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r14 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r14 = r14.get(r8)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r14 = (com.google.android.gms.internal.measurement.zzfi.zze) r14     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r14 = r14.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r14 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r14     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzgp r10 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            r21 = r8
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r8 = r10.zzd(r11, r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_err"
            if (r8 == 0) goto L_0x030f
            com.google.android.gms.measurement.internal.zzfr r5 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzu()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzhf r11 = r1.zzm     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfq r11 = r11.zzk()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zza((java.lang.String) r13)     // Catch:{ all -> 0x0ec4 }
            r5.zza(r8, r9, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzgp r5 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.zzm(r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 != 0) goto L_0x02d8
            com.google.android.gms.measurement.internal.zzgp r5 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.zzo(r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r5 = 0
            goto L_0x02d9
        L_0x02d8:
            r5 = 1
        L_0x02d9:
            if (r5 != 0) goto L_0x02ff
            java.lang.String r5 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x0ec4 }
            if (r5 != 0) goto L_0x02ff
            r40.zzq()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zznf r5 = r1.zzah     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r24 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            r25 = 11
            java.lang.String r26 = "_ev"
            java.lang.String r27 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            r28 = 0
            r23 = r5
            com.google.android.gms.measurement.internal.zznd.zza((com.google.android.gms.measurement.internal.zznf) r23, (java.lang.String) r24, (int) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28)     // Catch:{ all -> 0x0ec4 }
        L_0x02ff:
            r23 = r2
            r8 = r7
            r9 = r17
            r11 = r18
            r13 = r21
            r10 = 3
            r2 = r43
            r7 = r4
            r4 = -1
            goto L_0x0725
        L_0x030f:
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = com.google.android.gms.measurement.internal.zzii.zza(r2)     // Catch:{ all -> 0x0ec4 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0ec4 }
            if (r8 == 0) goto L_0x0381
            r14.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfr r8 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "Renaming ad_impression to _ai"
            r8.zza(r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfr r8 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            r11 = 5
            boolean r8 = r8.zza((int) r11)     // Catch:{ all -> 0x0ec4 }
            if (r8 == 0) goto L_0x0381
            r8 = 0
        L_0x0339:
            int r11 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            if (r8 >= r11) goto L_0x0381
            java.lang.String r11 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfi$zzg r22 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            java.lang.String r2 = r22.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x037c
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x037c
            java.lang.String r2 = "admob"
            com.google.android.gms.internal.measurement.zzfi$zzg r11 = r14.zzb((int) r8)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.equalsIgnoreCase(r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x037c
            com.google.android.gms.measurement.internal.zzfr r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzv()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.zza(r11)     // Catch:{ all -> 0x0ec4 }
        L_0x037c:
            int r8 = r8 + 1
            r2 = r23
            goto L_0x0339
        L_0x0381:
            r23 = r2
            com.google.android.gms.measurement.internal.zzgp r2 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zzc(r8, r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x03c9
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x0ec4 }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x0ec4 }
            r22 = r6
            r6 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r6) goto L_0x03ad
            goto L_0x03b7
        L_0x03ad:
            java.lang.String r6 = "_ui"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x03b7
            r6 = 0
            goto L_0x03b8
        L_0x03b7:
            r6 = -1
        L_0x03b8:
            if (r6 == 0) goto L_0x03bc
            r6 = 0
            goto L_0x03bd
        L_0x03bc:
            r6 = 1
        L_0x03bd:
            if (r6 == 0) goto L_0x03c0
            goto L_0x03cb
        L_0x03c0:
            r25 = r4
            r8 = r7
            r26 = r12
            r24 = r13
            goto L_0x0596
        L_0x03c9:
            r22 = r6
        L_0x03cb:
            r24 = r13
            r6 = 0
            r8 = 0
            r11 = 0
        L_0x03d0:
            int r13 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            r25 = r4
            java.lang.String r4 = "_r"
            if (r6 >= r13) goto L_0x043a
            com.google.android.gms.internal.measurement.zzfi$zzg r13 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ec4 }
            if (r13 == 0) goto L_0x0407
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r26 = r12
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = r4.zza((long) r12)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zzg) r4)     // Catch:{ all -> 0x0ec4 }
            r8 = 1
            goto L_0x0433
        L_0x0407:
            r26 = r12
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0433
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r11 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = r4.zza((long) r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zzg) r4)     // Catch:{ all -> 0x0ec4 }
            r11 = 1
        L_0x0433:
            int r6 = r6 + 1
            r4 = r25
            r12 = r26
            goto L_0x03d0
        L_0x043a:
            r26 = r12
            if (r8 != 0) goto L_0x046c
            if (r2 == 0) goto L_0x046c
            com.google.android.gms.measurement.internal.zzfr r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzhf r12 = r1.zzm     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfq r12 = r12.zzk()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zza((java.lang.String) r13)     // Catch:{ all -> 0x0ec4 }
            r6.zza(r8, r12)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r9)     // Catch:{ all -> 0x0ec4 }
            r12 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r12)     // Catch:{ all -> 0x0ec4 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6)     // Catch:{ all -> 0x0ec4 }
        L_0x046c:
            if (r11 != 0) goto L_0x049a
            com.google.android.gms.measurement.internal.zzfr r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzhf r11 = r1.zzm     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfq r11 = r11.zzk()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zza((java.lang.String) r12)     // Catch:{ all -> 0x0ec4 }
            r6.zza(r8, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r4)     // Catch:{ all -> 0x0ec4 }
            r11 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r11)     // Catch:{ all -> 0x0ec4 }
            r14.zza((com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6)     // Catch:{ all -> 0x0ec4 }
        L_0x049a:
            com.google.android.gms.measurement.internal.zzao r27 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            long r28 = r40.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r30 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 1
            com.google.android.gms.measurement.internal.zzap r6 = r27.zza(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ec4 }
            long r11 = r6.zze     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzaf r6 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            int r6 = r6.zze(r8)     // Catch:{ all -> 0x0ec4 }
            r8 = r7
            long r6 = (long) r6     // Catch:{ all -> 0x0ec4 }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x04d0
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x04d2
        L_0x04d0:
            r17 = 1
        L_0x04d2:
            java.lang.String r4 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = com.google.android.gms.measurement.internal.zznd.zzh(r4)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0596
            if (r2 == 0) goto L_0x0596
            com.google.android.gms.measurement.internal.zzao r27 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            long r28 = r40.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r30 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            r31 = 0
            r32 = 0
            r33 = 1
            r34 = 0
            r35 = 0
            com.google.android.gms.measurement.internal.zzap r4 = r27.zza(r28, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0ec4 }
            long r6 = r4.zzc     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzaf r4 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.zzbi.zzn     // Catch:{ all -> 0x0ec4 }
            int r4 = r4.zzb(r11, r12)     // Catch:{ all -> 0x0ec4 }
            long r11 = (long) r4     // Catch:{ all -> 0x0ec4 }
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0596
            com.google.android.gms.measurement.internal.zzfr r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzu()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0ec4 }
            r4.zza(r6, r7)     // Catch:{ all -> 0x0ec4 }
            r4 = -1
            r6 = 0
            r7 = 0
            r11 = 0
        L_0x052c:
            int r12 = r14.zza()     // Catch:{ all -> 0x0ec4 }
            if (r6 >= r12) goto L_0x0557
            com.google.android.gms.internal.measurement.zzfi$zzg r12 = r14.zzb((int) r6)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0ec4 }
            if (r13 == 0) goto L_0x0549
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r12.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r4     // Catch:{ all -> 0x0ec4 }
            r7 = r4
            r4 = r6
            goto L_0x0554
        L_0x0549:
            java.lang.String r12 = r12.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r12 = r10.equals(r12)     // Catch:{ all -> 0x0ec4 }
            if (r12 == 0) goto L_0x0554
            r11 = 1
        L_0x0554:
            int r6 = r6 + 1
            goto L_0x052c
        L_0x0557:
            if (r11 == 0) goto L_0x055f
            if (r7 == 0) goto L_0x055f
            r14.zza((int) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0596
        L_0x055f:
            if (r7 == 0) goto L_0x057f
            java.lang.Object r6 = r7.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r6 = (com.google.android.gms.internal.measurement.zzix.zzb) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = (com.google.android.gms.internal.measurement.zzfi.zzg.zza) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r10)     // Catch:{ all -> 0x0ec4 }
            r10 = 10
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r4, (com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0596
        L_0x057f:
            com.google.android.gms.measurement.internal.zzfr r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r7 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0ec4 }
            r4.zza(r6, r7)     // Catch:{ all -> 0x0ec4 }
        L_0x0596:
            if (r2 == 0) goto L_0x0655
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0ec4 }
            java.util.List r4 = r14.zzf()     // Catch:{ all -> 0x0ec4 }
            r2.<init>(r4)     // Catch:{ all -> 0x0ec4 }
            r4 = 0
            r6 = -1
            r7 = -1
        L_0x05a4:
            int r10 = r2.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "currency"
            java.lang.String r12 = "value"
            if (r4 >= r10) goto L_0x05d4
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0ec4 }
            if (r10 == 0) goto L_0x05c0
            r6 = r4
            goto L_0x05d1
        L_0x05c0:
            java.lang.Object r10 = r2.get(r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r10 = (com.google.android.gms.internal.measurement.zzfi.zzg) r10     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0ec4 }
            if (r10 == 0) goto L_0x05d1
            r7 = r4
        L_0x05d1:
            int r4 = r4 + 1
            goto L_0x05a4
        L_0x05d4:
            r4 = -1
            if (r6 == r4) goto L_0x0656
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.zzl()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0608
            java.lang.Object r4 = r2.get(r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = (com.google.android.gms.internal.measurement.zzfi.zzg) r4     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r4.zzj()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0608
            com.google.android.gms.measurement.internal.zzfr r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzv()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Value must be specified with a numeric type."
            r2.zza(r4)     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r9)     // Catch:{ all -> 0x0ec4 }
            r2 = 18
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (int) r2, (java.lang.String) r12)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0655
        L_0x0608:
            r4 = -1
            if (r7 != r4) goto L_0x060e
            r2 = 1
            r10 = 3
            goto L_0x063a
        L_0x060e:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = (com.google.android.gms.internal.measurement.zzfi.zzg) r2     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0ec4 }
            int r7 = r2.length()     // Catch:{ all -> 0x0ec4 }
            r10 = 3
            if (r7 == r10) goto L_0x0621
        L_0x061f:
            r2 = 1
            goto L_0x063a
        L_0x0621:
            r7 = 0
        L_0x0622:
            int r12 = r2.length()     // Catch:{ all -> 0x0ec4 }
            if (r7 >= r12) goto L_0x0639
            int r12 = r2.codePointAt(r7)     // Catch:{ all -> 0x0ec4 }
            boolean r13 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0ec4 }
            if (r13 != 0) goto L_0x0633
            goto L_0x061f
        L_0x0633:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0ec4 }
            int r7 = r7 + r12
            goto L_0x0622
        L_0x0639:
            r2 = 0
        L_0x063a:
            if (r2 == 0) goto L_0x0657
            com.google.android.gms.measurement.internal.zzfr r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzv()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r7)     // Catch:{ all -> 0x0ec4 }
            r14.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (java.lang.String) r9)     // Catch:{ all -> 0x0ec4 }
            r2 = 19
            zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (int) r2, (java.lang.String) r11)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0657
        L_0x0655:
            r4 = -1
        L_0x0656:
            r10 = 3
        L_0x0657:
            java.lang.String r2 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0ec4 }
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x06b5
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r2, (java.lang.String) r15)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x06b0
            if (r8 == 0) goto L_0x06a5
            long r11 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            long r19 = r14.zzc()     // Catch:{ all -> 0x0ec4 }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ec4 }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x06a5
            java.lang.Object r2 = r8.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r1.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x06a5
            r7 = r25
            r9 = r26
            r7.zza((int) r9, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ec4 }
            r12 = r9
            r11 = r18
        L_0x06a0:
            r8 = 0
            r22 = 0
            goto L_0x070d
        L_0x06a5:
            r7 = r25
            r9 = r26
            r11 = r43
            r12 = r9
            r22 = r14
            goto L_0x070d
        L_0x06b0:
            r7 = r25
            r9 = r26
            goto L_0x0709
        L_0x06b5:
            r7 = r25
            r9 = r26
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r14.zze()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0709
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r2 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch:{ all -> 0x0ec4 }
            r11 = r24
            com.google.android.gms.internal.measurement.zzfi$zzg r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r2, (java.lang.String) r11)     // Catch:{ all -> 0x0ec4 }
            if (r2 != 0) goto L_0x0709
            if (r22 == 0) goto L_0x0702
            long r11 = r22.zzc()     // Catch:{ all -> 0x0ec4 }
            long r19 = r14.zzc()     // Catch:{ all -> 0x0ec4 }
            long r11 = r11 - r19
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0ec4 }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0702
            java.lang.Object r2 = r22.clone()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r2 = (com.google.android.gms.internal.measurement.zzix.zzb) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r1.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r2, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r14)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0702
            r5 = r18
            r7.zza((int) r5, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2)     // Catch:{ all -> 0x0ec4 }
            r11 = r5
            r12 = r9
            goto L_0x06a0
        L_0x0702:
            r5 = r18
            r12 = r43
            r11 = r5
            r8 = r14
            goto L_0x070d
        L_0x0709:
            r5 = r18
            r11 = r5
            r12 = r9
        L_0x070d:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r2 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r5 = r14.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r5 = (com.google.android.gms.internal.measurement.zzix) r5     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r5 = (com.google.android.gms.internal.measurement.zzfi.zze) r5     // Catch:{ all -> 0x0ec4 }
            r13 = r21
            r2.set(r13, r5)     // Catch:{ all -> 0x0ec4 }
            int r2 = r43 + 1
            r7.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r14)     // Catch:{ all -> 0x0ec4 }
            r9 = r17
            r6 = r22
        L_0x0725:
            int r5 = r13 + 1
            r10 = r2
            r4 = r7
            r7 = r8
            r2 = r23
            r13 = 0
            r8 = r5
            goto L_0x0254
        L_0x0730:
            r7 = r4
            r11 = r13
            r12 = 0
            r10 = r43
            r36 = r12
            r2 = 0
        L_0x0739:
            if (r2 >= r10) goto L_0x078f
            com.google.android.gms.internal.measurement.zzfi$zze r4 = r7.zza((int) r2)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x075a
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r4, (java.lang.String) r15)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x075a
            r7.zzb((int) r2)     // Catch:{ all -> 0x0ec4 }
            int r10 = r10 + -1
            int r2 = r2 + -1
            goto L_0x078a
        L_0x075a:
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r4 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze) r4, (java.lang.String) r11)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0786
            boolean r6 = r4.zzl()     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x0772
            long r21 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0773
        L_0x0772:
            r4 = 0
        L_0x0773:
            if (r4 == 0) goto L_0x0786
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ec4 }
            int r6 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0786
            long r21 = r4.longValue()     // Catch:{ all -> 0x0ec4 }
            r12 = r36
            long r36 = r12 + r21
            goto L_0x078a
        L_0x0786:
            r12 = r36
            r36 = r12
        L_0x078a:
            r4 = 1
            int r2 = r2 + r4
            r12 = 0
            goto L_0x0739
        L_0x078f:
            r12 = r36
            r2 = 0
            r1.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7, (long) r12, (boolean) r2)     // Catch:{ all -> 0x0ec4 }
            java.util.List r2 = r7.zzw()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x079d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x07b7
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "_s"
            java.lang.String r4 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x079d
            r2 = 1
            goto L_0x07b8
        L_0x07b7:
            r2 = 0
        L_0x07b8:
            java.lang.String r4 = "_se"
            if (r2 == 0) goto L_0x07c7
            com.google.android.gms.measurement.internal.zzao r2 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r7.zzr()     // Catch:{ all -> 0x0ec4 }
            r2.zzh(r5, r4)     // Catch:{ all -> 0x0ec4 }
        L_0x07c7:
            java.lang.String r2 = "_sid"
            int r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 < 0) goto L_0x07d1
            r2 = 1
            goto L_0x07d2
        L_0x07d1:
            r2 = 0
        L_0x07d2:
            if (r2 == 0) goto L_0x07d9
            r2 = 1
            r1.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7, (long) r12, (boolean) r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x07f9
        L_0x07d9:
            int r2 = com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7, (java.lang.String) r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 < 0) goto L_0x07f9
            r7.zzc((int) r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfr r2 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ec4 }
            r2.zza(r4, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x07f9:
            com.google.android.gms.measurement.internal.zzmz r2 = r40.zzp()     // Catch:{ all -> 0x0ec4 }
            r2.zza((com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7)     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0847
            com.google.android.gms.measurement.internal.zzaf r2 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzbi.zzcm     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean>) r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0847
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzgy r4 = r40.zzl()     // Catch:{ all -> 0x0ec4 }
            r4.zzt()     // Catch:{ all -> 0x0ec4 }
            r40.zzs()     // Catch:{ all -> 0x0ec4 }
            boolean r4 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0847
            com.google.android.gms.measurement.internal.zzao r4 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzh r4 = r4.zzd(r2)     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0844
            com.google.android.gms.measurement.internal.zzfr r4 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            r4.zza(r5, r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0847
        L_0x0844:
            r1.zza((com.google.android.gms.measurement.internal.zzh) r4, (com.google.android.gms.internal.measurement.zzfi.zzj.zza) r7)     // Catch:{ all -> 0x0ec4 }
        L_0x0847:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r7.zzi((long) r4)     // Catch:{ all -> 0x0ec4 }
            r4 = -9223372036854775808
            r2.zze((long) r4)     // Catch:{ all -> 0x0ec4 }
            r2 = 0
        L_0x0856:
            int r4 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 >= r4) goto L_0x0889
            com.google.android.gms.internal.measurement.zzfi$zze r4 = r7.zza((int) r2)     // Catch:{ all -> 0x0ec4 }
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            long r10 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0873
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            r7.zzi((long) r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0873:
            long r5 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            long r10 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0886
            long r4 = r4.zzd()     // Catch:{ all -> 0x0ec4 }
            r7.zze((long) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x0886:
            int r2 = r2 + 1
            goto L_0x0856
        L_0x0889:
            r7.zzq()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.measurement.internal.zzaf r2 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzbi.zzcf     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zze(r4, r5)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            r40.zzq()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = com.google.android.gms.measurement.internal.zznd.zzd(r2)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzih r2 = r1.zzb((java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zzg()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r3.zza     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zzar()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x09bb
            r2 = 0
        L_0x08cc:
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            int r4 = r4.size()     // Catch:{ all -> 0x0ec4 }
            if (r2 >= r4) goto L_0x09bb
            java.util.List<com.google.android.gms.internal.measurement.zzfi$zze> r4 = r3.zzc     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r4 = r4.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r4     // Catch:{ all -> 0x0ec4 }
            java.util.List r5 = r4.zzf()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x08ea:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x0902
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0ec4 }
            if (r6 == 0) goto L_0x08ea
            r5 = 1
            goto L_0x0903
        L_0x0902:
            r5 = 0
        L_0x0903:
            if (r5 == 0) goto L_0x09b7
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r3.zza     // Catch:{ all -> 0x0ec4 }
            int r5 = r5.zza()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzaf r6 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzbi.zzau     // Catch:{ all -> 0x0ec4 }
            int r6 = r6.zzb(r8, r10)     // Catch:{ all -> 0x0ec4 }
            if (r5 < r6) goto L_0x09ac
            com.google.android.gms.measurement.internal.zzaf r5 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzfi<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzbi.zzch     // Catch:{ all -> 0x0ec4 }
            boolean r5 = r5.zze(r6, r8)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0951
            com.google.android.gms.measurement.internal.zznd r5 = r40.zzq()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "_tu"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zzb(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r4.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0952
        L_0x0951:
            r5 = 0
        L_0x0952:
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = com.google.android.gms.internal.measurement.zzfi.zzg.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "_tr"
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((java.lang.String) r8)     // Catch:{ all -> 0x0ec4 }
            r10 = 1
            com.google.android.gms.internal.measurement.zzfi$zzg$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r6 = r6.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r6 = (com.google.android.gms.internal.measurement.zzix) r6     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r6 = (com.google.android.gms.internal.measurement.zzfi.zzg) r6     // Catch:{ all -> 0x0ec4 }
            r4.zza((com.google.android.gms.internal.measurement.zzfi.zzg) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz r6 = r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r3.zza     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmh r5 = r6.zza((java.lang.String) r8, (com.google.android.gms.internal.measurement.zzfi.zzj) r10, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x09ac
            com.google.android.gms.measurement.internal.zzfr r6 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r6 = r6.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.zzfi$zzj r10 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r5.zza     // Catch:{ all -> 0x0ec4 }
            r6.zza(r8, r10, r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r6 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r8 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0ec4 }
            r6.zza((java.lang.String) r8, (com.google.android.gms.measurement.internal.zzmh) r5)     // Catch:{ all -> 0x0ec4 }
            java.util.Set<java.lang.String> r5 = r1.zzr     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r6 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0ec4 }
            r5.add(r6)     // Catch:{ all -> 0x0ec4 }
        L_0x09ac:
            com.google.android.gms.internal.measurement.zzkj r4 = r4.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r4 = (com.google.android.gms.internal.measurement.zzfi.zze) r4     // Catch:{ all -> 0x0ec4 }
            r7.zza((int) r2, (com.google.android.gms.internal.measurement.zzfi.zze) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x09b7:
            int r2 = r2 + 1
            goto L_0x08cc
        L_0x09bb:
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r2 = r7.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzt r8 = r40.zzc()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r7.zzr()     // Catch:{ all -> 0x0ec4 }
            java.util.List r10 = r7.zzw()     // Catch:{ all -> 0x0ec4 }
            java.util.List r11 = r7.zzx()     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r12 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            java.util.List r4 = r8.zza(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0ec4 }
            r2.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zzc>) r4)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzaf r2 = r40.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            boolean r2 = r2.zzl(r4)     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0d28
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0ec4 }
            r2.<init>()     // Catch:{ all -> 0x0ec4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0ec4 }
            r4.<init>()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zznd r5 = r40.zzq()     // Catch:{ all -> 0x0ec4 }
            java.security.SecureRandom r5 = r5.zzv()     // Catch:{ all -> 0x0ec4 }
            r6 = 0
        L_0x0a09:
            int r8 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r6 >= r8) goto L_0x0cef
            com.google.android.gms.internal.measurement.zzfi$zze r8 = r7.zza((int) r6)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix$zzb r8 = r8.zzby()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze$zza r8 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0aa7
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzmz.zzb(r9, r11)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r11 = (com.google.android.gms.measurement.internal.zzbc) r11     // Catch:{ all -> 0x0ec4 }
            if (r11 != 0) goto L_0x0a5b
            com.google.android.gms.measurement.internal.zzao r11 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r11 = r11.zzd(r12, r13)     // Catch:{ all -> 0x0ec4 }
            if (r11 == 0) goto L_0x0a5b
            r2.put(r9, r11)     // Catch:{ all -> 0x0ec4 }
        L_0x0a5b:
            if (r11 == 0) goto L_0x0a9a
            java.lang.Long r9 = r11.zzi     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0a9a
            java.lang.Long r9 = r11.zzj     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a77
            long r12 = r9.longValue()     // Catch:{ all -> 0x0ec4 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0a77
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r9 = r11.zzj     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r10, (java.lang.Object) r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0a77:
            java.lang.Boolean r9 = r11.zzk     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a8f
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0a8f
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ all -> 0x0ec4 }
        L_0x0a8f:
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            r4.add(r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0a9a:
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
        L_0x0a9d:
            r18 = r3
            r43 = r5
            r1 = r6
            r5 = 1
            r3 = r2
            goto L_0x0ce3
        L_0x0aa7:
            com.google.android.gms.measurement.internal.zzgp r9 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            long r11 = r9.zza((java.lang.String) r11)     // Catch:{ all -> 0x0ec4 }
            r40.zzq()     // Catch:{ all -> 0x0ec4 }
            long r13 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            long r13 = com.google.android.gms.measurement.internal.zznd.zza((long) r13, (long) r11)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r9 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r9 = (com.google.android.gms.internal.measurement.zzix) r9     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r9 = (com.google.android.gms.internal.measurement.zzfi.zze) r9     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = "_dbg"
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0ec4 }
            boolean r18 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0ec4 }
            if (r18 != 0) goto L_0x0b2c
            if (r1 != 0) goto L_0x0ad9
            goto L_0x0b2c
        L_0x0ad9:
            java.util.List r9 = r9.zzh()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x0ae1:
            boolean r18 = r9.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r18 == 0) goto L_0x0b2c
            java.lang.Object r18 = r9.next()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzg r18 = (com.google.android.gms.internal.measurement.zzfi.zzg) r18     // Catch:{ all -> 0x0ec4 }
            r43 = r9
            java.lang.String r9 = r18.zzg()     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b29
            long r21 = r18.zzd()     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0b27
            boolean r9 = r1 instanceof java.lang.String     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b15
            java.lang.String r9 = r18.zzh()     // Catch:{ all -> 0x0ec4 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0b27
        L_0x0b15:
            boolean r9 = r1 instanceof java.lang.Double     // Catch:{ all -> 0x0ec4 }
            if (r9 == 0) goto L_0x0b2c
            double r21 = r18.zza()     // Catch:{ all -> 0x0ec4 }
            java.lang.Double r9 = java.lang.Double.valueOf(r21)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0b2c
        L_0x0b27:
            r1 = 1
            goto L_0x0b2d
        L_0x0b29:
            r9 = r43
            goto L_0x0ae1
        L_0x0b2c:
            r1 = 0
        L_0x0b2d:
            if (r1 != 0) goto L_0x0b42
            com.google.android.gms.measurement.internal.zzgp r1 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r9 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r9 = r9.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            int r1 = r1.zzb((java.lang.String) r9, (java.lang.String) r15)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0b43
        L_0x0b42:
            r1 = 1
        L_0x0b43:
            if (r1 > 0) goto L_0x0b6a
            com.google.android.gms.measurement.internal.zzfr r9 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzu()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            r9.zza(r10, r11, r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0a9d
        L_0x0b6a:
            java.lang.String r9 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r9 = (com.google.android.gms.measurement.internal.zzbc) r9     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0bc9
            com.google.android.gms.measurement.internal.zzao r9 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r15 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r15.zzx()     // Catch:{ all -> 0x0ec4 }
            r21 = r11
            java.lang.String r11 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zzd(r15, r11)     // Catch:{ all -> 0x0ec4 }
            if (r9 != 0) goto L_0x0bcb
            com.google.android.gms.measurement.internal.zzfr r9 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r9 = r9.zzu()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzfi$zzj r12 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r15 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r9.zza(r11, r12, r15)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r9 = new com.google.android.gms.measurement.internal.zzbc     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r11 = r3.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r24 = r11.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r25 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r26 = 1
            r28 = 1
            r30 = 1
            long r32 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r23 = r9
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0bcb
        L_0x0bc9:
            r21 = r11
        L_0x0bcb:
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r11 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r11 = (com.google.android.gms.internal.measurement.zzix) r11     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r11 = (com.google.android.gms.internal.measurement.zzfi.zze) r11     // Catch:{ all -> 0x0ec4 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzmz.zzb(r11, r12)     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0ec4 }
            if (r11 == 0) goto L_0x0be2
            r12 = 1
            goto L_0x0be3
        L_0x0be2:
            r12 = 0
        L_0x0be3:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0ec4 }
            r15 = 1
            if (r1 != r15) goto L_0x0c18
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c13
            java.lang.Long r1 = r9.zzi     // Catch:{ all -> 0x0ec4 }
            if (r1 != 0) goto L_0x0c07
            java.lang.Long r1 = r9.zzj     // Catch:{ all -> 0x0ec4 }
            if (r1 != 0) goto L_0x0c07
            java.lang.Boolean r1 = r9.zzk     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c13
        L_0x0c07:
            r1 = 0
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zza(r1, r1, r1)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0c13:
            r7.zza((int) r6, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0a9d
        L_0x0c18:
            int r15 = r5.nextInt(r1)     // Catch:{ all -> 0x0ec4 }
            if (r15 != 0) goto L_0x0c5d
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            r43 = r5
            r15 = r6
            long r5 = (long) r1     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r10, (java.lang.Object) r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r1 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r1 = (com.google.android.gms.internal.measurement.zzix) r1     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r1 = (com.google.android.gms.internal.measurement.zzfi.zze) r1     // Catch:{ all -> 0x0ec4 }
            r4.add(r1)     // Catch:{ all -> 0x0ec4 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0c46
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            r5 = 0
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zza(r5, r1, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0c46:
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            long r5 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r5 = r9.zza(r5, r13)     // Catch:{ all -> 0x0ec4 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0ec4 }
            r18 = r3
            r1 = r15
            r5 = 1
            r3 = r2
            goto L_0x0ce0
        L_0x0c5d:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r9.zzh     // Catch:{ all -> 0x0ec4 }
            if (r5 == 0) goto L_0x0c6d
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            r18 = r3
            goto L_0x0c7e
        L_0x0c6d:
            r40.zzq()     // Catch:{ all -> 0x0ec4 }
            long r5 = r8.zzb()     // Catch:{ all -> 0x0ec4 }
            r23 = r2
            r18 = r3
            r2 = r21
            long r5 = com.google.android.gms.measurement.internal.zznd.zza((long) r5, (long) r2)     // Catch:{ all -> 0x0ec4 }
        L_0x0c7e:
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0cc9
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = "_efs"
            r5 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0ec4 }
            r40.zzp()     // Catch:{ all -> 0x0ec4 }
            long r1 = (long) r1     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzmz.zza((com.google.android.gms.internal.measurement.zzfi.zze.zza) r8, (java.lang.String) r10, (java.lang.Object) r3)     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r3 = r8.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r3 = (com.google.android.gms.internal.measurement.zzix) r3     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zze r3 = (com.google.android.gms.internal.measurement.zzfi.zze) r3     // Catch:{ all -> 0x0ec4 }
            r4.add(r3)     // Catch:{ all -> 0x0ec4 }
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0cb7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0ec4 }
            r3 = 0
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zza(r3, r1, r2)     // Catch:{ all -> 0x0ec4 }
        L_0x0cb7:
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            long r2 = r8.zzc()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r2 = r9.zza(r2, r13)     // Catch:{ all -> 0x0ec4 }
            r3 = r23
            r3.put(r1, r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0cdf
        L_0x0cc9:
            r3 = r23
            r5 = 1
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0ec4 }
            if (r1 == 0) goto L_0x0cdf
            java.lang.String r1 = r8.zze()     // Catch:{ all -> 0x0ec4 }
            r2 = 0
            com.google.android.gms.measurement.internal.zzbc r9 = r9.zza(r11, r2, r2)     // Catch:{ all -> 0x0ec4 }
            r3.put(r1, r9)     // Catch:{ all -> 0x0ec4 }
        L_0x0cdf:
            r1 = r15
        L_0x0ce0:
            r7.zza((int) r1, (com.google.android.gms.internal.measurement.zzfi.zze.zza) r8)     // Catch:{ all -> 0x0ec4 }
        L_0x0ce3:
            int r1 = r1 + 1
            r5 = r43
            r6 = r1
            r2 = r3
            r3 = r18
            r1 = r40
            goto L_0x0a09
        L_0x0cef:
            r18 = r3
            r3 = r2
            int r1 = r4.size()     // Catch:{ all -> 0x0ec4 }
            int r2 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r1 >= r2) goto L_0x0d03
            com.google.android.gms.internal.measurement.zzfi$zzj$zza r1 = r7.zzi()     // Catch:{ all -> 0x0ec4 }
            r1.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfi.zze>) r4)     // Catch:{ all -> 0x0ec4 }
        L_0x0d03:
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0ec4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0ec4 }
        L_0x0d0b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0ec4 }
            if (r2 == 0) goto L_0x0d25
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0ec4 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r3 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzbc r2 = (com.google.android.gms.measurement.internal.zzbc) r2     // Catch:{ all -> 0x0ec4 }
            r3.zza((com.google.android.gms.measurement.internal.zzbc) r2)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d0b
        L_0x0d25:
            r1 = r18
            goto L_0x0d29
        L_0x0d28:
            r1 = r3
        L_0x0d29:
            com.google.android.gms.internal.measurement.zzfi$zzj r2 = r1.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r2 = r2.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r3 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzh r3 = r3.zzd(r2)     // Catch:{ all -> 0x0ec4 }
            if (r3 != 0) goto L_0x0d51
            com.google.android.gms.measurement.internal.zzfr r3 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r1.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ec4 }
            r3.zza(r4, r5)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dac
        L_0x0d51:
            int r4 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r4 <= 0) goto L_0x0dac
            long r4 = r3.zzp()     // Catch:{ all -> 0x0ec4 }
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0d65
            r7.zzg((long) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d68
        L_0x0d65:
            r7.zzm()     // Catch:{ all -> 0x0ec4 }
        L_0x0d68:
            long r8 = r3.zzr()     // Catch:{ all -> 0x0ec4 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0d73
            goto L_0x0d74
        L_0x0d73:
            r4 = r8
        L_0x0d74:
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0d7c
            r7.zzh((long) r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0d7f
        L_0x0d7c:
            r7.zzn()     // Catch:{ all -> 0x0ec4 }
        L_0x0d7f:
            r3.zzai()     // Catch:{ all -> 0x0ec4 }
            long r4 = r3.zzq()     // Catch:{ all -> 0x0ec4 }
            int r5 = (int) r4     // Catch:{ all -> 0x0ec4 }
            r7.zzf((int) r5)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzd()     // Catch:{ all -> 0x0ec4 }
            r3.zzp(r4)     // Catch:{ all -> 0x0ec4 }
            long r4 = r7.zzc()     // Catch:{ all -> 0x0ec4 }
            r3.zzn(r4)     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r3.zzw()     // Catch:{ all -> 0x0ec4 }
            if (r4 == 0) goto L_0x0da2
            r7.zzn(r4)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0da5
        L_0x0da2:
            r7.zzj()     // Catch:{ all -> 0x0ec4 }
        L_0x0da5:
            com.google.android.gms.measurement.internal.zzao r4 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            r4.zza((com.google.android.gms.measurement.internal.zzh) r3)     // Catch:{ all -> 0x0ec4 }
        L_0x0dac:
            int r3 = r7.zza()     // Catch:{ all -> 0x0ec4 }
            if (r3 <= 0) goto L_0x0e0b
            com.google.android.gms.measurement.internal.zzgp r3 = r40.zzi()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = r1.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfc$zzd r3 = r3.zzc(r4)     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0dd1
            boolean r4 = r3.zzs()     // Catch:{ all -> 0x0ec4 }
            if (r4 != 0) goto L_0x0dc9
            goto L_0x0dd1
        L_0x0dc9:
            long r3 = r3.zzc()     // Catch:{ all -> 0x0ec4 }
            r7.zzb((long) r3)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dfa
        L_0x0dd1:
            com.google.android.gms.internal.measurement.zzfi$zzj r3 = r1.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r3 = r3.zzah()     // Catch:{ all -> 0x0ec4 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0ec4 }
            if (r3 == 0) goto L_0x0de3
            r3 = -1
            r7.zzb((long) r3)     // Catch:{ all -> 0x0ec4 }
            goto L_0x0dfa
        L_0x0de3:
            com.google.android.gms.measurement.internal.zzfr r3 = r40.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzu()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzfi$zzj r5 = r1.zza     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0ec4 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r5)     // Catch:{ all -> 0x0ec4 }
            r3.zza(r4, r5)     // Catch:{ all -> 0x0ec4 }
        L_0x0dfa:
            com.google.android.gms.measurement.internal.zzao r3 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzkj r4 = r7.zzab()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.internal.measurement.zzfi$zzj r4 = (com.google.android.gms.internal.measurement.zzfi.zzj) r4     // Catch:{ all -> 0x0ec4 }
            r13 = r17
            r3.zza((com.google.android.gms.internal.measurement.zzfi.zzj) r4, (boolean) r13)     // Catch:{ all -> 0x0ec4 }
        L_0x0e0b:
            com.google.android.gms.measurement.internal.zzao r3 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            java.util.List<java.lang.Long> r1 = r1.zzb     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ all -> 0x0ec4 }
            r3.zzt()     // Catch:{ all -> 0x0ec4 }
            r3.zzak()     // Catch:{ all -> 0x0ec4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0ec4 }
            r5 = 0
        L_0x0e22:
            int r6 = r1.size()     // Catch:{ all -> 0x0ec4 }
            if (r5 >= r6) goto L_0x0e3f
            if (r5 == 0) goto L_0x0e2f
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0ec4 }
        L_0x0e2f:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0ec4 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ec4 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ec4 }
            r4.append(r6)     // Catch:{ all -> 0x0ec4 }
            int r5 = r5 + 1
            goto L_0x0e22
        L_0x0e3f:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0ec4 }
            android.database.sqlite.SQLiteDatabase r5 = r3.e_()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ec4 }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0ec4 }
            int r5 = r1.size()     // Catch:{ all -> 0x0ec4 }
            if (r4 == r5) goto L_0x0e72
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r3 = r3.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ec4 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ec4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ec4 }
            r3.zza(r5, r4, r1)     // Catch:{ all -> 0x0ec4 }
        L_0x0e72:
            com.google.android.gms.measurement.internal.zzao r1 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            android.database.sqlite.SQLiteDatabase r3 = r1.e_()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0e89 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e89 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e89 }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0e89 }
            goto L_0x0e9c
        L_0x0e89:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzj()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzft r1 = r1.zzg()     // Catch:{ all -> 0x0ec4 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfr.zza((java.lang.String) r2)     // Catch:{ all -> 0x0ec4 }
            r1.zza(r4, r2, r3)     // Catch:{ all -> 0x0ec4 }
        L_0x0e9c:
            com.google.android.gms.measurement.internal.zzao r1 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            r1.zzw()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r1 = r40.zzf()
            r1.zzu()
            r1 = 1
            return r1
        L_0x0eac:
            com.google.android.gms.measurement.internal.zzao r1 = r40.zzf()     // Catch:{ all -> 0x0ec4 }
            r1.zzw()     // Catch:{ all -> 0x0ec4 }
            com.google.android.gms.measurement.internal.zzao r1 = r40.zzf()
            r1.zzu()
            r1 = 0
            return r1
        L_0x0ebc:
            r0 = move-exception
            r1 = r0
        L_0x0ebe:
            if (r4 == 0) goto L_0x0ec3
            r4.close()     // Catch:{ all -> 0x0ec4 }
        L_0x0ec3:
            throw r1     // Catch:{ all -> 0x0ec4 }
        L_0x0ec4:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.measurement.internal.zzao r2 = r40.zzf()
            r2.zzu()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmp.zza(java.lang.String, long):boolean");
    }

    private final boolean zza(zzfi.zze.zza zza2, zzfi.zze.zza zza3) {
        String str;
        Preconditions.checkArgument("_e".equals(zza2.zze()));
        zzp();
        zzfi.zzg zza4 = zzmz.zza((zzfi.zze) ((zzix) zza2.zzab()), "_sc");
        String str2 = null;
        if (zza4 == null) {
            str = null;
        } else {
            str = zza4.zzh();
        }
        zzp();
        zzfi.zzg zza5 = zzmz.zza((zzfi.zze) ((zzix) zza3.zzab()), "_pc");
        if (zza5 != null) {
            str2 = zza5.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zza2.zze()));
        zzp();
        zzfi.zzg zza6 = zzmz.zza((zzfi.zze) ((zzix) zza2.zzab()), "_et");
        if (zza6 == null || !zza6.zzl() || zza6.zzd() <= 0) {
            return true;
        }
        long zzd2 = zza6.zzd();
        zzp();
        zzfi.zzg zza7 = zzmz.zza((zzfi.zze) ((zzix) zza3.zzab()), "_et");
        if (zza7 != null && zza7.zzd() > 0) {
            zzd2 += zza7.zzd();
        }
        zzp();
        zzmz.zza(zza3, "_et", (Object) Long.valueOf(zzd2));
        zzp();
        zzmz.zza(zza2, "_fr", (Object) 1L);
        return true;
    }

    private final boolean zza(int i10, FileChannel fileChannel) {
        zzl().zzt();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().zzg().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().zzg().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            zzj().zzg().zza("Failed to write to channel", e10);
            return false;
        }
    }
}
