// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$12 {

    static final FunctionDescriptor unlinkat$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle unlinkat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "unlinkat",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$12.unlinkat$FUNC, false
    );
    static final FunctionDescriptor rmdir$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle rmdir$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "rmdir",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$12.rmdir$FUNC, false
    );
    static final FunctionDescriptor tcgetpgrp$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle tcgetpgrp$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "tcgetpgrp",
        "(I)I",
        constants$12.tcgetpgrp$FUNC, false
    );
    static final FunctionDescriptor tcsetpgrp$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle tcsetpgrp$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "tcsetpgrp",
        "(II)I",
        constants$12.tcsetpgrp$FUNC, false
    );
    static final FunctionDescriptor getlogin$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle getlogin$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "getlogin",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$12.getlogin$FUNC, false
    );
    static final FunctionDescriptor getlogin_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle getlogin_r$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "getlogin_r",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$12.getlogin_r$FUNC, false
    );
}

