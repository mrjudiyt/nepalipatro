package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0098, code lost:
        if (r1 == null) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader zza() {
        /*
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = zza     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x00bf
            java.lang.Thread r1 = zzb     // Catch:{ all -> 0x00c3 }
            r2 = 0
            if (r1 != 0) goto L_0x009d
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00c3 }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x00c3 }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x0096
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x00c3 }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0080 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0080 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0080 }
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r7 >= r4) goto L_0x003f
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0080 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0080 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0080 }
            if (r9 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r8 = r2
        L_0x0040:
            if (r8 != 0) goto L_0x0049
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0080 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0080 }
        L_0x0049:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0080 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0080 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0080 }
        L_0x0052:
            if (r6 >= r1) goto L_0x0066
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0080 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0080 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0080 }
            if (r7 == 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x0052
        L_0x0066:
            r5 = r2
        L_0x0067:
            if (r5 != 0) goto L_0x0094
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch:{ SecurityException -> 0x007b }
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch:{ SecurityException -> 0x007b }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x0078 }
            r1.start()     // Catch:{ SecurityException -> 0x0078 }
            r5 = r1
            goto L_0x0094
        L_0x0078:
            r4 = move-exception
            r5 = r1
            goto L_0x0083
        L_0x007b:
            r1 = move-exception
            r4 = r1
            goto L_0x0083
        L_0x007e:
            r1 = move-exception
            goto L_0x009b
        L_0x0080:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L_0x0083:
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r4.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "Failed to enumerate thread/threadgroup "
            r4.append(r6)     // Catch:{ all -> 0x007e }
            r4.append(r1)     // Catch:{ all -> 0x007e }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            r1 = r5
        L_0x0096:
            zzb = r1     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x009d
            goto L_0x00ba
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x007e }
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x009d:
            monitor-enter(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.Thread r3 = zzb     // Catch:{ SecurityException -> 0x00a7 }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x00a7 }
            goto L_0x00b9
        L_0x00a5:
            r2 = move-exception
            goto L_0x00bd
        L_0x00a7:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r4.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = "Failed to get thread context classloader "
            r4.append(r5)     // Catch:{ all -> 0x00a5 }
            r4.append(r3)     // Catch:{ all -> 0x00a5 }
        L_0x00b9:
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
        L_0x00ba:
            zza = r2     // Catch:{ all -> 0x00c3 }
            goto L_0x00bf
        L_0x00bd:
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r2     // Catch:{ all -> 0x00c3 }
        L_0x00bf:
            java.lang.ClassLoader r1 = zza     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)
            return r1
        L_0x00c3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.zzb.zza():java.lang.ClassLoader");
    }
}
