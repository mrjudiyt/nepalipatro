package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l6.i;
import l6.t;

public class GoogleSignInPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    private static final String CHANNEL_NAME = "plugins.flutter.io/google_sign_in_android";
    private static final String METHOD_CLEAR_AUTH_CACHE = "clearAuthCache";
    private static final String METHOD_DISCONNECT = "disconnect";
    private static final String METHOD_GET_TOKENS = "getTokens";
    private static final String METHOD_INIT = "init";
    private static final String METHOD_IS_SIGNED_IN = "isSignedIn";
    private static final String METHOD_REQUEST_SCOPES = "requestScopes";
    private static final String METHOD_SIGN_IN = "signIn";
    private static final String METHOD_SIGN_IN_SILENTLY = "signInSilently";
    private static final String METHOD_SIGN_OUT = "signOut";
    private ActivityPluginBinding activityPluginBinding;
    private MethodChannel channel;
    private Delegate delegate;

    public static class Delegate implements IDelegate, PluginRegistry.ActivityResultListener {
        private static final String DEFAULT_GAMES_SIGN_IN = "SignInOption.games";
        private static final String DEFAULT_SIGN_IN = "SignInOption.standard";
        private static final String ERROR_FAILURE_TO_RECOVER_AUTH = "failed_to_recover_auth";
        private static final String ERROR_REASON_EXCEPTION = "exception";
        private static final String ERROR_REASON_NETWORK_ERROR = "network_error";
        private static final String ERROR_REASON_SIGN_IN_CANCELED = "sign_in_canceled";
        private static final String ERROR_REASON_SIGN_IN_FAILED = "sign_in_failed";
        private static final String ERROR_REASON_SIGN_IN_REQUIRED = "sign_in_required";
        private static final String ERROR_REASON_STATUS = "status";
        private static final String ERROR_USER_RECOVERABLE_AUTH = "user_recoverable_auth";
        private static final int REQUEST_CODE_RECOVER_AUTH = 53294;
        static final int REQUEST_CODE_REQUEST_SCOPE = 53295;
        private static final int REQUEST_CODE_SIGNIN = 53293;
        private Activity activity;
        private final BackgroundTaskRunner backgroundTaskRunner = new BackgroundTaskRunner(1);
        /* access modifiers changed from: private */
        public final Context context;
        private final GoogleSignInWrapper googleSignInWrapper;
        /* access modifiers changed from: private */
        public PendingOperation pendingOperation;
        private PluginRegistry.Registrar registrar;
        /* access modifiers changed from: private */
        public List<String> requestedScopes;
        private GoogleSignInClient signInClient;

        private static class PendingOperation {
            final Object data;
            final String method;
            final MethodChannel.Result result;

            PendingOperation(String str, MethodChannel.Result result2, Object obj) {
                this.method = str;
                this.result = result2;
                this.data = obj;
            }
        }

        public Delegate(Context context2, GoogleSignInWrapper googleSignInWrapper2) {
            this.context = context2;
            this.googleSignInWrapper = googleSignInWrapper2;
        }

        private void checkAndSetPendingOperation(String str, MethodChannel.Result result) {
            checkAndSetPendingOperation(str, result, (Object) null);
        }

        private String errorCodeForStatus(int i10) {
            return i10 != 4 ? i10 != 7 ? i10 != 12501 ? ERROR_REASON_SIGN_IN_FAILED : ERROR_REASON_SIGN_IN_CANCELED : ERROR_REASON_NETWORK_ERROR : ERROR_REASON_SIGN_IN_REQUIRED;
        }

        /* access modifiers changed from: private */
        public void finishWithError(String str, String str2) {
            this.pendingOperation.result.error(str, str2, (Object) null);
            this.pendingOperation = null;
        }

        /* access modifiers changed from: private */
        public void finishWithSuccess(Object obj) {
            this.pendingOperation.result.success(obj);
            this.pendingOperation = null;
        }

        private void onSignInAccount(GoogleSignInAccount googleSignInAccount) {
            HashMap hashMap = new HashMap();
            hashMap.put("email", googleSignInAccount.getEmail());
            hashMap.put("id", googleSignInAccount.getId());
            hashMap.put("idToken", googleSignInAccount.getIdToken());
            hashMap.put("serverAuthCode", googleSignInAccount.getServerAuthCode());
            hashMap.put("displayName", googleSignInAccount.getDisplayName());
            if (googleSignInAccount.getPhotoUrl() != null) {
                hashMap.put("photoUrl", googleSignInAccount.getPhotoUrl().toString());
            }
            finishWithSuccess(hashMap);
        }

        /* access modifiers changed from: private */
        public void onSignInResult(Task<GoogleSignInAccount> task) {
            try {
                onSignInAccount(task.getResult(ApiException.class));
            } catch (ApiException e10) {
                finishWithError(errorCodeForStatus(e10.getStatusCode()), e10.toString());
            } catch (RuntimeExecutionException e11) {
                finishWithError("exception", e11.toString());
            }
        }

        public void clearAuthCache(final MethodChannel.Result result, final String str) {
            this.backgroundTaskRunner.runInBackground(new Callable<Void>() {
                public Void call() {
                    GoogleAuthUtil.clearToken(Delegate.this.context, str);
                    return null;
                }
            }, new BackgroundTaskRunner.Callback<Void>() {
                public void run(Future<Void> future) {
                    try {
                        result.success(future.get());
                    } catch (ExecutionException e10) {
                        result.error("exception", e10.getCause().getMessage(), (Object) null);
                    } catch (InterruptedException e11) {
                        result.error("exception", e11.getMessage(), (Object) null);
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        public void disconnect(MethodChannel.Result result) {
            checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_DISCONNECT, result);
            this.signInClient.revokeAccess().addOnCompleteListener(new OnCompleteListener<Void>() {
                public void onComplete(Task<Void> task) {
                    if (task.isSuccessful()) {
                        Delegate.this.finishWithSuccess((Object) null);
                    } else {
                        Delegate.this.finishWithError("status", "Failed to disconnect.");
                    }
                }
            });
        }

        public Activity getActivity() {
            PluginRegistry.Registrar registrar2 = this.registrar;
            return registrar2 != null ? registrar2.activity() : this.activity;
        }

        public void getTokens(final MethodChannel.Result result, final String str, final boolean z10) {
            if (str == null) {
                result.error("exception", "Email is null", (Object) null);
                return;
            }
            this.backgroundTaskRunner.runInBackground(new Callable<String>() {
                public String call() {
                    Account account = new Account(str, "com.google");
                    return GoogleAuthUtil.getToken(Delegate.this.context, account, "oauth2:" + i.e(' ').c(Delegate.this.requestedScopes));
                }
            }, new BackgroundTaskRunner.Callback<String>() {
                public void run(Future<String> future) {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("accessToken", future.get());
                        result.success(hashMap);
                    } catch (ExecutionException e10) {
                        if (!(e10.getCause() instanceof UserRecoverableAuthException)) {
                            result.error("exception", e10.getCause().getMessage(), (Object) null);
                        } else if (!z10 || Delegate.this.pendingOperation != null) {
                            result.error(Delegate.ERROR_USER_RECOVERABLE_AUTH, e10.getLocalizedMessage(), (Object) null);
                        } else {
                            Activity activity = Delegate.this.getActivity();
                            if (activity == null) {
                                MethodChannel.Result result = result;
                                result.error(Delegate.ERROR_USER_RECOVERABLE_AUTH, "Cannot recover auth because app is not in foreground. " + e10.getLocalizedMessage(), (Object) null);
                                return;
                            }
                            Delegate.this.checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_GET_TOKENS, result, str);
                            activity.startActivityForResult(((UserRecoverableAuthException) e10.getCause()).getIntent(), Delegate.REQUEST_CODE_RECOVER_AUTH);
                        }
                    } catch (InterruptedException e11) {
                        result.error("exception", e11.getMessage(), (Object) null);
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        public void init(MethodChannel.Result result, String str, List<String> list, String str2, String str3, String str4, boolean z10) {
            GoogleSignInOptions.Builder builder;
            int identifier;
            char c10 = 65535;
            try {
                int hashCode = str.hashCode();
                if (hashCode != 849126666) {
                    if (hashCode == 2056100820) {
                        if (str.equals(DEFAULT_SIGN_IN)) {
                            c10 = 1;
                        }
                    }
                } else if (str.equals(DEFAULT_GAMES_SIGN_IN)) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
                } else if (c10 == 1) {
                    builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail();
                } else {
                    throw new IllegalStateException("Unknown signInOption");
                }
                if (t.b(str3) || !t.b(str4)) {
                    str3 = str4;
                }
                if (t.b(str3) && (identifier = this.context.getResources().getIdentifier("default_web_client_id", "string", this.context.getPackageName())) != 0) {
                    str3 = this.context.getString(identifier);
                }
                if (!t.b(str3)) {
                    builder.requestIdToken(str3);
                    builder.requestServerAuthCode(str3, z10);
                }
                for (String scope : list) {
                    builder.requestScopes(new Scope(scope), new Scope[0]);
                }
                if (!t.b(str2)) {
                    builder.setHostedDomain(str2);
                }
                this.requestedScopes = list;
                this.signInClient = this.googleSignInWrapper.getClient(this.context, builder.build());
                result.success((Object) null);
            } catch (Exception e10) {
                result.error("exception", e10.getMessage(), (Object) null);
            }
        }

        public void isSignedIn(MethodChannel.Result result) {
            result.success(Boolean.valueOf(GoogleSignIn.getLastSignedInAccount(this.context) != null));
        }

        public boolean onActivityResult(int i10, int i11, Intent intent) {
            PendingOperation pendingOperation2 = this.pendingOperation;
            boolean z10 = false;
            if (pendingOperation2 == null) {
                return false;
            }
            switch (i10) {
                case REQUEST_CODE_SIGNIN /*53293*/:
                    if (intent != null) {
                        onSignInResult(GoogleSignIn.getSignedInAccountFromIntent(intent));
                    } else {
                        finishWithError(ERROR_REASON_SIGN_IN_FAILED, "Signin failed");
                    }
                    return true;
                case REQUEST_CODE_RECOVER_AUTH /*53294*/:
                    if (i11 == -1) {
                        this.pendingOperation = null;
                        getTokens(pendingOperation2.result, (String) pendingOperation2.data, false);
                    } else {
                        finishWithError(ERROR_FAILURE_TO_RECOVER_AUTH, "Failed attempt to recover authentication");
                    }
                    return true;
                case REQUEST_CODE_REQUEST_SCOPE /*53295*/:
                    if (i11 == -1) {
                        z10 = true;
                    }
                    finishWithSuccess(Boolean.valueOf(z10));
                    return true;
                default:
                    return false;
            }
        }

        public void requestScopes(MethodChannel.Result result, List<String> list) {
            checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_REQUEST_SCOPES, result);
            GoogleSignInAccount lastSignedInAccount = this.googleSignInWrapper.getLastSignedInAccount(this.context);
            if (lastSignedInAccount == null) {
                finishWithError(ERROR_REASON_SIGN_IN_REQUIRED, "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String scope : list) {
                Scope scope2 = new Scope(scope);
                if (!this.googleSignInWrapper.hasPermissions(lastSignedInAccount, scope2)) {
                    arrayList.add(scope2);
                }
            }
            if (arrayList.isEmpty()) {
                finishWithSuccess(Boolean.TRUE);
            } else {
                this.googleSignInWrapper.requestPermissions(getActivity(), REQUEST_CODE_REQUEST_SCOPE, lastSignedInAccount, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        public void setActivity(Activity activity2) {
            this.activity = activity2;
        }

        public void setUpRegistrar(PluginRegistry.Registrar registrar2) {
            this.registrar = registrar2;
            registrar2.addActivityResultListener(this);
        }

        public void signIn(MethodChannel.Result result) {
            if (getActivity() != null) {
                checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_SIGN_IN, result);
                getActivity().startActivityForResult(this.signInClient.getSignInIntent(), REQUEST_CODE_SIGNIN);
                return;
            }
            throw new IllegalStateException("signIn needs a foreground activity");
        }

        public void signInSilently(MethodChannel.Result result) {
            checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_SIGN_IN_SILENTLY, result);
            Task<GoogleSignInAccount> silentSignIn = this.signInClient.silentSignIn();
            if (silentSignIn.isComplete()) {
                onSignInResult(silentSignIn);
            } else {
                silentSignIn.addOnCompleteListener(new OnCompleteListener<GoogleSignInAccount>() {
                    public void onComplete(Task<GoogleSignInAccount> task) {
                        Delegate.this.onSignInResult(task);
                    }
                });
            }
        }

        public void signOut(MethodChannel.Result result) {
            checkAndSetPendingOperation(GoogleSignInPlugin.METHOD_SIGN_OUT, result);
            this.signInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                public void onComplete(Task<Void> task) {
                    if (task.isSuccessful()) {
                        Delegate.this.finishWithSuccess((Object) null);
                    } else {
                        Delegate.this.finishWithError("status", "Failed to signout.");
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        public void checkAndSetPendingOperation(String str, MethodChannel.Result result, Object obj) {
            if (this.pendingOperation == null) {
                this.pendingOperation = new PendingOperation(str, result, obj);
                return;
            }
            throw new IllegalStateException("Concurrent operations detected: " + this.pendingOperation.method + ", " + str);
        }
    }

    public interface IDelegate {
        void clearAuthCache(MethodChannel.Result result, String str);

        void disconnect(MethodChannel.Result result);

        void getTokens(MethodChannel.Result result, String str, boolean z10);

        void init(MethodChannel.Result result, String str, List<String> list, String str2, String str3, String str4, boolean z10);

        void isSignedIn(MethodChannel.Result result);

        void requestScopes(MethodChannel.Result result, List<String> list);

        void signIn(MethodChannel.Result result);

        void signInSilently(MethodChannel.Result result);

        void signOut(MethodChannel.Result result);
    }

    private void attachToActivity(ActivityPluginBinding activityPluginBinding2) {
        this.activityPluginBinding = activityPluginBinding2;
        activityPluginBinding2.addActivityResultListener(this.delegate);
        this.delegate.setActivity(activityPluginBinding2.getActivity());
    }

    private void dispose() {
        this.delegate = null;
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    private void disposeActivity() {
        this.activityPluginBinding.removeActivityResultListener(this.delegate);
        this.delegate.setActivity((Activity) null);
        this.activityPluginBinding = null;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        GoogleSignInPlugin googleSignInPlugin = new GoogleSignInPlugin();
        googleSignInPlugin.initInstance(registrar.messenger(), registrar.context(), new GoogleSignInWrapper());
        googleSignInPlugin.setUpRegistrar(registrar);
    }

    public void initInstance(BinaryMessenger binaryMessenger, Context context, GoogleSignInWrapper googleSignInWrapper) {
        this.channel = new MethodChannel(binaryMessenger, CHANNEL_NAME);
        this.delegate = new Delegate(context, googleSignInWrapper);
        this.channel.setMethodCallHandler(this);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding2) {
        attachToActivity(activityPluginBinding2);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new GoogleSignInWrapper());
    }

    public void onDetachedFromActivity() {
        disposeActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        disposeActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        dispose();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -902468670:
                if (str.equals(METHOD_SIGN_IN)) {
                    c10 = 0;
                    break;
                }
                break;
            case -638267772:
                if (str.equals(METHOD_SIGN_IN_SILENTLY)) {
                    c10 = 1;
                    break;
                }
                break;
            case -481441621:
                if (str.equals(METHOD_IS_SIGNED_IN)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3237136:
                if (str.equals(METHOD_INIT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 24140525:
                if (str.equals(METHOD_CLEAR_AUTH_CACHE)) {
                    c10 = 4;
                    break;
                }
                break;
            case 530405532:
                if (str.equals(METHOD_DISCONNECT)) {
                    c10 = 5;
                    break;
                }
                break;
            case 827828368:
                if (str.equals(METHOD_GET_TOKENS)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1387660302:
                if (str.equals(METHOD_REQUEST_SCOPES)) {
                    c10 = 7;
                    break;
                }
                break;
            case 2088248401:
                if (str.equals(METHOD_SIGN_OUT)) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.delegate.signIn(result);
                return;
            case 1:
                this.delegate.signInSilently(result);
                return;
            case 2:
                this.delegate.isSignedIn(result);
                return;
            case 3:
                boolean booleanValue = ((Boolean) methodCall.argument("forceCodeForRefreshToken")).booleanValue();
                this.delegate.init(result, (String) methodCall.argument("signInOption"), (List) methodCall.argument("scopes"), (String) methodCall.argument("hostedDomain"), (String) methodCall.argument("clientId"), (String) methodCall.argument("serverClientId"), booleanValue);
                return;
            case 4:
                this.delegate.clearAuthCache(result, (String) methodCall.argument("token"));
                return;
            case 5:
                this.delegate.disconnect(result);
                return;
            case 6:
                boolean booleanValue2 = ((Boolean) methodCall.argument("shouldRecoverAuth")).booleanValue();
                this.delegate.getTokens(result, (String) methodCall.argument("email"), booleanValue2);
                return;
            case 7:
                this.delegate.requestScopes(result, (List) methodCall.argument("scopes"));
                return;
            case 8:
                this.delegate.signOut(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding2) {
        attachToActivity(activityPluginBinding2);
    }

    public void setUpRegistrar(PluginRegistry.Registrar registrar) {
        this.delegate.setUpRegistrar(registrar);
    }
}
