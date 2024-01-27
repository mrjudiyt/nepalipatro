package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @KeepForSdk
    public static final int REMOTE = 1;
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
    public interface VersionPolicy {

        @KeepForSdk
        /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z10);
        }

        @KeepForSdk
        /* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019b, code lost:
        r2 = r2.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(r20), r3, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a3, code lost:
        r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a7, code lost:
        if (r2 == null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a9, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b4, code lost:
        if (r10 != 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b6, code lost:
        r9.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ba, code lost:
        r9.set(java.lang.Long.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c1, code lost:
        r1 = r8.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c3, code lost:
        if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c5, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c8, code lost:
        r0.set(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01cb, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d4, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01dd, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01de, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e8, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r17 == null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r17.booleanValue() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append("Selected remote version of ");
        r12.append(r3);
        r12.append(", version >= ");
        r12.append(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6 = zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r6 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r12 = (com.google.android.gms.dynamite.zzn) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r12 == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        if (r12.zza == null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r13 = r20.getApplicationContext();
        r12 = r12.zza;
        com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e8, code lost:
        if (zze < 2) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        r2 = java.lang.Boolean.valueOf(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f8, code lost:
        if (r2.booleanValue() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fa, code lost:
        r2 = r6.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(r13), r3, r15, com.google.android.gms.dynamic.ObjectWrapper.wrap(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0107, code lost:
        r2 = r6.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(r13), r3, r15, com.google.android.gms.dynamic.ObjectWrapper.wrap(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0113, code lost:
        r2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        if (r2 == null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r4 = new com.google.android.gms.dynamite.DynamiteModule(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012a, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0138, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0139, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0143, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0144, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0145, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0149, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014b, code lost:
        r19 = r5;
        r2 = new java.lang.StringBuilder();
        r2.append("Selected remote version of ");
        r2.append(r3);
        r2.append(", version >= ");
        r2.append(r15);
        r2 = zzg(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0166, code lost:
        if (r2 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0168, code lost:
        r4 = r2.zze();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016d, code lost:
        if (r4 < 3) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016f, code lost:
        r4 = (com.google.android.gms.dynamite.zzn) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0175, code lost:
        if (r4 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0177, code lost:
        r2 = r2.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(r20), r3, r15, com.google.android.gms.dynamic.ObjectWrapper.wrap(r4.zza));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018e, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", (com.google.android.gms.dynamite.zzp) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0190, code lost:
        if (r4 != 2) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0192, code lost:
        r2 = r2.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(r20), r3, r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x023a A[Catch:{ all -> 0x02c5 }] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r20, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r21, java.lang.String r22) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            android.content.Context r5 = r20.getApplicationContext()
            r6 = 0
            if (r5 == 0) goto L_0x02e8
            java.lang.ThreadLocal r0 = zzg
            java.lang.Object r7 = r0.get()
            com.google.android.gms.dynamite.zzn r7 = (com.google.android.gms.dynamite.zzn) r7
            com.google.android.gms.dynamite.zzn r8 = new com.google.android.gms.dynamite.zzn
            r8.<init>(r6)
            r0.set(r8)
            java.lang.ThreadLocal r9 = zzh
            java.lang.Object r10 = r9.get()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02c5 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x02c5 }
            r9.set(r14)     // Catch:{ all -> 0x02c5 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r14 = zzi     // Catch:{ all -> 0x02c5 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r14 = r2.selectModule(r1, r3, r14)     // Catch:{ all -> 0x02c5 }
            int r15 = r14.localVersion     // Catch:{ all -> 0x02c5 }
            int r6 = r14.remoteVersion     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r12.<init>()     // Catch:{ all -> 0x02c5 }
            java.lang.String r13 = "Considering local module "
            r12.append(r13)     // Catch:{ all -> 0x02c5 }
            r12.append(r3)     // Catch:{ all -> 0x02c5 }
            java.lang.String r13 = ":"
            r12.append(r13)     // Catch:{ all -> 0x02c5 }
            r12.append(r15)     // Catch:{ all -> 0x02c5 }
            java.lang.String r13 = " and remote module "
            r12.append(r13)     // Catch:{ all -> 0x02c5 }
            r12.append(r3)     // Catch:{ all -> 0x02c5 }
            java.lang.String r13 = ":"
            r12.append(r13)     // Catch:{ all -> 0x02c5 }
            r12.append(r6)     // Catch:{ all -> 0x02c5 }
            int r6 = r14.selection     // Catch:{ all -> 0x02c5 }
            if (r6 == 0) goto L_0x0294
            r12 = -1
            if (r6 != r12) goto L_0x0071
            int r6 = r14.localVersion     // Catch:{ all -> 0x02c5 }
            if (r6 == 0) goto L_0x0294
            r6 = -1
        L_0x0071:
            r13 = 1
            if (r6 != r13) goto L_0x0078
            int r15 = r14.remoteVersion     // Catch:{ all -> 0x02c5 }
            if (r15 == 0) goto L_0x0294
        L_0x0078:
            if (r6 != r12) goto L_0x009a
            com.google.android.gms.dynamite.DynamiteModule r1 = zzc(r5, r3)     // Catch:{ all -> 0x02c5 }
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0088
            r9.remove()
            goto L_0x008f
        L_0x0088:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r9.set(r2)
        L_0x008f:
            android.database.Cursor r2 = r8.zza
            if (r2 == 0) goto L_0x0096
            r2.close()
        L_0x0096:
            r0.set(r7)
            return r1
        L_0x009a:
            if (r6 != r13) goto L_0x027c
            int r15 = r14.remoteVersion     // Catch:{ LoadingException -> 0x0222 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            boolean r17 = zzf(r20)     // Catch:{ all -> 0x01f6 }
            if (r17 == 0) goto L_0x01e9
            java.lang.Boolean r17 = zzb     // Catch:{ all -> 0x01f6 }
            monitor-exit(r4)     // Catch:{ all -> 0x01f6 }
            if (r17 == 0) goto L_0x01de
            boolean r17 = r17.booleanValue()     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            if (r17 == 0) goto L_0x014b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            r12.<init>()     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            java.lang.String r6 = "Selected remote version of "
            r12.append(r6)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            r12.append(r3)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            java.lang.String r6 = ", version >= "
            r12.append(r6)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            r12.append(r15)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            com.google.android.gms.dynamite.zzr r6 = zzl     // Catch:{ all -> 0x0144 }
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            if (r6 == 0) goto L_0x0139
            java.lang.Object r12 = r0.get()     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            com.google.android.gms.dynamite.zzn r12 = (com.google.android.gms.dynamite.zzn) r12     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            if (r12 == 0) goto L_0x012e
            android.database.Cursor r13 = r12.zza     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            if (r13 == 0) goto L_0x012e
            android.content.Context r13 = r20.getApplicationContext()     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            android.database.Cursor r12 = r12.zza     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            r16 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0214, LoadingException -> 0x0210, all -> 0x0201 }
            r19 = r5
            int r5 = zze     // Catch:{ all -> 0x012b }
            r2 = 2
            if (r5 < r2) goto L_0x00ed
            r18 = 1
            goto L_0x00ef
        L_0x00ed:
            r18 = 0
        L_0x00ef:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x012b }
            monitor-exit(r4)     // Catch:{ all -> 0x012b }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            if (r2 == 0) goto L_0x0107
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r13)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r6.zzf(r2, r3, r15, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            goto L_0x0113
        L_0x0107:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r13)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r6.zze(r2, r3, r15, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x0113:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            if (r2 == 0) goto L_0x0122
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            goto L_0x01b0
        L_0x0122:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "Failed to get module context"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x012b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x012b }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x012e:
            r19 = r5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "No result cursor"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x0139:
            r19 = r5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x0144:
            r0 = move-exception
            r19 = r5
        L_0x0147:
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x0149:
            r0 = move-exception
            goto L_0x0147
        L_0x014b:
            r19 = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r2.<init>()     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r4 = "Selected remote version of "
            r2.append(r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r2.append(r3)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r4 = ", version >= "
            r2.append(r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r2.append(r15)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamite.zzq r2 = zzg(r20)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            if (r2 == 0) goto L_0x01d5
            int r4 = r2.zze()     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r5 = 3
            if (r4 < r5) goto L_0x018f
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamite.zzn r4 = (com.google.android.gms.dynamite.zzn) r4     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            if (r4 == 0) goto L_0x0186
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            android.database.Cursor r4 = r4.zza     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzi(r5, r3, r15, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            goto L_0x01a3
        L_0x0186:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "No cached result cursor holder"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x018f:
            r5 = 2
            if (r4 != r5) goto L_0x019b
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj(r4, r3, r15)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            goto L_0x01a3
        L_0x019b:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzh(r4, r3, r15)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01a3:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            if (r2 == 0) goto L_0x01cc
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01b0:
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01ba
            r9.remove()
            goto L_0x01c1
        L_0x01ba:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r9.set(r1)
        L_0x01c1:
            android.database.Cursor r1 = r8.zza
            if (r1 == 0) goto L_0x01c8
            r1.close()
        L_0x01c8:
            r0.set(r7)
            return r4
        L_0x01cc:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "Failed to load remote module."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01d5:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01de:
            r19 = r5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01e9:
            r19 = r5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = "Remote loading disabled"
            r5 = 0
            r0.<init>(r2, r5)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f6:
            r0 = move-exception
            r19 = r5
        L_0x01f9:
            monitor-exit(r4)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ RemoteException -> 0x01ff, LoadingException -> 0x01fd, all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            goto L_0x0204
        L_0x01fd:
            r0 = move-exception
            goto L_0x0213
        L_0x01ff:
            r0 = move-exception
            goto L_0x0217
        L_0x0201:
            r0 = move-exception
            r19 = r5
        L_0x0204:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ LoadingException -> 0x0220 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ LoadingException -> 0x0220 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r2.<init>(r4, r0, r5)     // Catch:{ LoadingException -> 0x0220 }
            throw r2     // Catch:{ LoadingException -> 0x0220 }
        L_0x0210:
            r0 = move-exception
            r19 = r5
        L_0x0213:
            throw r0     // Catch:{ LoadingException -> 0x0220 }
        L_0x0214:
            r0 = move-exception
            r19 = r5
        L_0x0217:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ LoadingException -> 0x0220 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r2.<init>(r4, r0, r5)     // Catch:{ LoadingException -> 0x0220 }
            throw r2     // Catch:{ LoadingException -> 0x0220 }
        L_0x0220:
            r0 = move-exception
            goto L_0x0225
        L_0x0222:
            r0 = move-exception
            r19 = r5
        L_0x0225:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r4.<init>()     // Catch:{ all -> 0x02c5 }
            java.lang.String r5 = "Failed to load remote module: "
            r4.append(r5)     // Catch:{ all -> 0x02c5 }
            r4.append(r2)     // Catch:{ all -> 0x02c5 }
            int r2 = r14.localVersion     // Catch:{ all -> 0x02c5 }
            if (r2 == 0) goto L_0x0273
            com.google.android.gms.dynamite.zzo r4 = new com.google.android.gms.dynamite.zzo     // Catch:{ all -> 0x02c5 }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ all -> 0x02c5 }
            r2 = r21
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = r2.selectModule(r1, r3, r4)     // Catch:{ all -> 0x02c5 }
            int r1 = r1.selection     // Catch:{ all -> 0x02c5 }
            r2 = -1
            if (r1 != r2) goto L_0x0273
            r1 = r19
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{ all -> 0x02c5 }
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x025d
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x0266
        L_0x025d:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L_0x0266:
            android.database.Cursor r1 = r8.zza
            if (r1 == 0) goto L_0x026d
            r1.close()
        L_0x026d:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r7)
            return r0
        L_0x0273:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02c5 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x02c5 }
            throw r1     // Catch:{ all -> 0x02c5 }
        L_0x027c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r1.<init>()     // Catch:{ all -> 0x02c5 }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x02c5 }
            r1.append(r6)     // Catch:{ all -> 0x02c5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02c5 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x02c5 }
            throw r0     // Catch:{ all -> 0x02c5 }
        L_0x0294:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02c5 }
            int r1 = r14.localVersion     // Catch:{ all -> 0x02c5 }
            int r2 = r14.remoteVersion     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r4.<init>()     // Catch:{ all -> 0x02c5 }
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch:{ all -> 0x02c5 }
            r4.append(r3)     // Catch:{ all -> 0x02c5 }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x02c5 }
            r4.append(r1)     // Catch:{ all -> 0x02c5 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x02c5 }
            r4.append(r2)     // Catch:{ all -> 0x02c5 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x02c5 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02c5 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x02c5 }
            throw r0     // Catch:{ all -> 0x02c5 }
        L_0x02c5:
            r0 = move-exception
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x02d2
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x02db
        L_0x02d2:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.set(r2)
        L_0x02db:
            android.database.Cursor r1 = r8.zza
            if (r1 == 0) goto L_0x02e2
            r1.close()
        L_0x02e2:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r7)
            throw r0
        L_0x02e8:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0192 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x018f }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00cf
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            zzd(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = zzf(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r3
        L_0x0048:
            boolean r5 = zzd     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = zzb(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = zzc     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = zzc     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            zzd(r7)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009d }
            zzb = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00cd
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r4.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x018f }
            r4.append(r1)     // Catch:{ all -> 0x018f }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x018f }
        L_0x00cd:
            zzb = r1     // Catch:{ all -> 0x018f }
        L_0x00cf:
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00ee
            int r10 = zzb(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00db }
            return r10
        L_0x00db:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0192 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r12.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0192 }
            r12.append(r11)     // Catch:{ all -> 0x0192 }
            return r3
        L_0x00ee:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch:{ all -> 0x0192 }
            if (r4 != 0) goto L_0x00f6
            goto L_0x0186
        L_0x00f6:
            int r0 = r4.zze()     // Catch:{ RemoteException -> 0x016e }
            r1 = 3
            if (r0 < r1) goto L_0x0157
            java.lang.ThreadLocal r0 = zzg     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016e }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x016e }
            if (r0 == 0) goto L_0x0111
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x016e }
            if (r0 == 0) goto L_0x0111
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x0111:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x016e }
            java.lang.ThreadLocal r0 = zzh     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x016e }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x016e }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x016e }
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch:{ RemoteException -> 0x016e }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x016e }
            if (r11 == 0) goto L_0x0151
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r12 != 0) goto L_0x0136
            goto L_0x0151
        L_0x0136:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r12 <= 0) goto L_0x0143
            boolean r0 = zze(r11)     // Catch:{ RemoteException -> 0x014e, all -> 0x014b }
            if (r0 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r2 = r11
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x0149:
            r3 = r12
            goto L_0x0186
        L_0x014b:
            r12 = move-exception
            r2 = r11
            goto L_0x0189
        L_0x014e:
            r12 = move-exception
            r2 = r11
            goto L_0x0170
        L_0x0151:
            if (r11 == 0) goto L_0x0186
            r11.close()     // Catch:{ all -> 0x0192 }
            goto L_0x0186
        L_0x0157:
            r1 = 2
            if (r0 != r1) goto L_0x0163
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x016e }
            int r3 = r4.zzg(r0, r11, r12)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x0163:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x016e }
            int r3 = r4.zzf(r0, r11, r12)     // Catch:{ RemoteException -> 0x016e }
            goto L_0x0186
        L_0x016c:
            r12 = r11
            goto L_0x0189
        L_0x016e:
            r11 = move-exception
            r12 = r11
        L_0x0170:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r12.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0187 }
            r12.append(r11)     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0186
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x0186:
            return r3
        L_0x0187:
            r11 = move-exception
            goto L_0x016c
        L_0x0189:
            if (r2 == 0) goto L_0x018e
            r2.close()     // Catch:{ all -> 0x0192 }
        L_0x018e:
            throw r12     // Catch:{ all -> 0x0192 }
        L_0x018f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            throw r11     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = zzh     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            zzc = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            zze = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = zze(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00d3
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00d1 }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00d1 }
            java.lang.String r13 = r11.getMessage()     // Catch:{ all -> 0x00d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d1 }
            r1.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "V2 version check failed: "
            r1.append(r2)     // Catch:{ all -> 0x00d1 }
            r1.append(r13)     // Catch:{ all -> 0x00d1 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00d1 }
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00d1 }
            throw r12     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r11 = move-exception
            r0 = r10
        L_0x00d3:
            if (r0 == 0) goto L_0x00d8
            r0.close()
        L_0x00d8:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzl = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = (zzn) zzg.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(zzf)) {
            return true;
        }
        boolean z10 = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            zzf = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z10;
    }

    private static zzq zzg(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzk;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    zzk = zzq;
                    return zzq;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
        }
        return null;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (zzp) null);
        }
    }
}
