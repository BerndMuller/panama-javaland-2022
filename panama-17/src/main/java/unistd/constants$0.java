// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$0 {

    static final FunctionDescriptor access$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle access$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "access",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$0.access$FUNC, false
    );
    static final FunctionDescriptor faccessat$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle faccessat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "faccessat",
        "(ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$0.faccessat$FUNC, false
    );
    static final FunctionDescriptor lseek$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle lseek$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "lseek",
        "(IJI)J",
        constants$0.lseek$FUNC, false
    );
    static final FunctionDescriptor close$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle close$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "close",
        "(I)I",
        constants$0.close$FUNC, false
    );
    static final FunctionDescriptor closefrom$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle closefrom$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "closefrom",
        "(I)V",
        constants$0.closefrom$FUNC, false
    );
    static final FunctionDescriptor read$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle read$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "read",
        "(ILjdk/incubator/foreign/MemoryAddress;J)J",
        constants$0.read$FUNC, false
    );
}


