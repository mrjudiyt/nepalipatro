package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public NativeOnCompleteListener(long j10) {
        this.zza = j10;
    }

    @KeepForSdk
    public static void createAndAddCallback(Task<Object> task, long j10) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j10));
    }

    @KeepForSdk
    public native void nativeOnComplete(long j10, Object obj, boolean z10, boolean z11, String str);

    @KeepForSdk
    public void onComplete(Task<Object> task) {
        String str;
        Object obj;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
