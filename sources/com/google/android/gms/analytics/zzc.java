package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzc implements Runnable {
    final /* synthetic */ BroadcastReceiver.PendingResult zza;

    zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.zza;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
