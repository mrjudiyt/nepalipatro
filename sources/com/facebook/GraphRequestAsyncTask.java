package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: GraphRequestAsyncTask.kt */
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = GraphRequestAsyncTask.class.getCanonicalName();
    private final HttpURLConnection connection;
    private Exception exception;
    private final GraphRequestBatch requests;

    /* compiled from: GraphRequestAsyncTask.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        m.f(graphRequestBatch, "requests");
        this.connection = httpURLConnection;
        this.requests = graphRequestBatch;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return doInBackground((Void[]) objArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Exception getException() {
        return this.exception;
    }

    public final GraphRequestBatch getRequests() {
        return this.requests;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                onPostExecute((List<GraphResponse>) (List) obj);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void onPreExecute() {
        Handler handler;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                super.onPreExecute();
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FacebookSdk.isDebugEnabled()) {
                    Utility utility = Utility.INSTANCE;
                    String str = TAG;
                    b0 b0Var = b0.f15559a;
                    String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    m.e(format, "java.lang.String.format(format, *args)");
                    Utility.logd(str, format);
                }
                if (this.requests.getCallbackHandler() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.requests.setCallbackHandler(handler);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask: " + " connection: " + this.connection + ", requests: " + this.requests + "}";
        m.e(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public List<GraphResponse> doInBackground(Void... voidArr) {
        List<GraphResponse> executeConnectionAndWait;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(voidArr, NativeProtocol.WEB_DIALOG_PARAMS);
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection == null) {
                executeConnectionAndWait = this.requests.executeAndWait();
            } else {
                executeConnectionAndWait = GraphRequest.Companion.executeConnectionAndWait(httpURLConnection, this.requests);
            }
            return executeConnectionAndWait;
        } catch (Exception e10) {
            this.exception = e10;
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(List<GraphResponse> list) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(list, "result");
                super.onPostExecute(list);
                Exception exc = this.exception;
                if (exc != null) {
                    Utility utility = Utility.INSTANCE;
                    String str = TAG;
                    b0 b0Var = b0.f15559a;
                    String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    m.e(format, "java.lang.String.format(format, *args)");
                    Utility.logd(str, format);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequest... graphRequestArr) {
        this((HttpURLConnection) null, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        m.f(graphRequestArr, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(Collection<GraphRequest> collection) {
        this((HttpURLConnection) null, new GraphRequestBatch(collection));
        m.f(collection, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch) {
        this((HttpURLConnection) null, graphRequestBatch);
        m.f(graphRequestBatch, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequest... graphRequestArr) {
        this(httpURLConnection, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        m.f(graphRequestArr, "requests");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        this(httpURLConnection, new GraphRequestBatch(collection));
        m.f(collection, "requests");
    }
}
