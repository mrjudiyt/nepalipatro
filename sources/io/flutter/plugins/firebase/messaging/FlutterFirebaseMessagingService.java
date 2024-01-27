package io.flutter.plugins.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onNewToken(String str) {
        FlutterFirebaseTokenLiveData.getInstance().postToken(str);
    }
}
