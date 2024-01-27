package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
public interface SignInClient extends HasApiKey<zbo> {
    Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest);

    String getPhoneNumberFromIntent(Intent intent);

    Task<PendingIntent> getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    SignInCredential getSignInCredentialFromIntent(Intent intent);

    Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest);

    Task<Void> signOut();
}
