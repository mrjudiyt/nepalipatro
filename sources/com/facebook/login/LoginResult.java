package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: LoginResult.kt */
public final class LoginResult {
    private final AccessToken accessToken;
    private final AuthenticationToken authenticationToken;
    private final Set<String> recentlyDeniedPermissions;
    private final Set<String> recentlyGrantedPermissions;

    public LoginResult(AccessToken accessToken2, AuthenticationToken authenticationToken2, Set<String> set, Set<String> set2) {
        m.f(accessToken2, "accessToken");
        m.f(set, "recentlyGrantedPermissions");
        m.f(set2, "recentlyDeniedPermissions");
        this.accessToken = accessToken2;
        this.authenticationToken = authenticationToken2;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoginResult(AccessToken accessToken2, Set<String> set, Set<String> set2) {
        this(accessToken2, (AuthenticationToken) null, set, set2, 2, (g) null);
        m.f(accessToken2, "accessToken");
        m.f(set, "recentlyGrantedPermissions");
        m.f(set2, "recentlyDeniedPermissions");
    }

    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, AccessToken accessToken2, AuthenticationToken authenticationToken2, Set<String> set, Set<String> set2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            accessToken2 = loginResult.accessToken;
        }
        if ((i10 & 2) != 0) {
            authenticationToken2 = loginResult.authenticationToken;
        }
        if ((i10 & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i10 & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken2, authenticationToken2, set, set2);
    }

    public final AccessToken component1() {
        return this.accessToken;
    }

    public final AuthenticationToken component2() {
        return this.authenticationToken;
    }

    public final Set<String> component3() {
        return this.recentlyGrantedPermissions;
    }

    public final Set<String> component4() {
        return this.recentlyDeniedPermissions;
    }

    public final LoginResult copy(AccessToken accessToken2, AuthenticationToken authenticationToken2, Set<String> set, Set<String> set2) {
        m.f(accessToken2, "accessToken");
        m.f(set, "recentlyGrantedPermissions");
        m.f(set2, "recentlyDeniedPermissions");
        return new LoginResult(accessToken2, authenticationToken2, set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return m.a(this.accessToken, loginResult.accessToken) && m.a(this.authenticationToken, loginResult.authenticationToken) && m.a(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && m.a(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    public final Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken2 = this.authenticationToken;
        return ((((hashCode + (authenticationToken2 == null ? 0 : authenticationToken2.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginResult(AccessToken accessToken2, AuthenticationToken authenticationToken2, Set set, Set set2, int i10, g gVar) {
        this(accessToken2, (i10 & 2) != 0 ? null : authenticationToken2, set, set2);
    }
}
