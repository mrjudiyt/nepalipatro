package m9;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import l9.e;

/* compiled from: FlowExceptions.common.kt */
public final class f {
    public static final void a(AbortFlowException abortFlowException, e<?> eVar) {
        if (abortFlowException.f15580h != eVar) {
            throw abortFlowException;
        }
    }
}
