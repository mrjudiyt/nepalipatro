package com.google.firebase.messaging;

import com.google.firebase.Firebase;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: Messaging.kt */
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseMessaging instance = FirebaseMessaging.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final RemoteMessage remoteMessage(String str, l<? super RemoteMessage.Builder, q> lVar) {
        m.f(str, "to");
        m.f(lVar, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        lVar.invoke(builder);
        RemoteMessage build = builder.build();
        m.e(build, "builder.build()");
        return build;
    }
}
