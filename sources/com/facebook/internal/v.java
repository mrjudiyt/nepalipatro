package com.facebook.internal;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.WebDialog;
import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String[] f6093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WebDialog.UploadStagingResourcesTask f6095c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f6096d;

    public /* synthetic */ v(String[] strArr, int i10, WebDialog.UploadStagingResourcesTask uploadStagingResourcesTask, CountDownLatch countDownLatch) {
        this.f6093a = strArr;
        this.f6094b = i10;
        this.f6095c = uploadStagingResourcesTask;
        this.f6096d = countDownLatch;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        WebDialog.UploadStagingResourcesTask.m110doInBackground$lambda0(this.f6093a, this.f6094b, this.f6095c, this.f6096d, graphResponse);
    }
}
