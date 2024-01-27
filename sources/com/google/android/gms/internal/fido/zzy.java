package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferClient;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzy extends GoogleApi implements SourceDirectTransferClient {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO_SOURCE_DIRECT_TRANSFER_API", new zzz(), clientKey);
    }

    public zzy(Activity activity) {
        super(activity, zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final SourceDirectTransferResult getSourceDirectTransferResultFromIntent(Intent intent) {
        if (intent != null) {
            SourceDirectTransferResult sourceDirectTransferResult = (SourceDirectTransferResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, SourceDirectTransferClient.KEY_SOURCE_DIRECT_TRANSFER_RESULT, SourceDirectTransferResult.CREATOR);
            if (sourceDirectTransferResult != null) {
                return sourceDirectTransferResult;
            }
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    public final Task<PendingIntent> startDirectTransfer(SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        return doRead(TaskApiCall.builder().run(new zzw(this, sourceStartDirectTransferOptions, parcelFileDescriptor, parcelFileDescriptor2)).setMethodKey(5421).build());
    }

    public zzy(Context context) {
        super(context, zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
