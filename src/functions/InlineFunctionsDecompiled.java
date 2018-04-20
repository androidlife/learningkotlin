package functions;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

//@Metadata(
//        mv = {1, 1, 9},
//        bv = {1, 0, 2},
//        k = 2,
//        d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u001a\"\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u001a\u0019\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000e¨\u0006\u000f"},
//        d2 = {"doingWithAnotherFunction", "", "someInt", "", "fn", "Lkotlin/Function2;", "doingWithOtherFunctions", "op", "Lkotlin/Function1;", "doingWithOtherFunctionsInline", "main", "args", "", "", "([Ljava/lang/String;)V", "production sources for module learningkotlin"}
//)

public final class InlineFunctionsDecompiled {

    public static final void doingWithOtherFunctions(int someInt, @NotNull Function1 op) {
        Intrinsics.checkParameterIsNotNull(op, "op");
        op.invoke(someInt);
    }

    public static final void doingWithOtherFunctionsInline(int someInt, @NotNull Function1 fn) {
        Intrinsics.checkParameterIsNotNull(fn, "fn");
        fn.invoke(someInt);
    }

    public static final void doingWithAnotherFunction(int someInt, @NotNull Function2 fn) {
        Intrinsics.checkParameterIsNotNull(fn, "fn");
        fn.invoke(Integer.valueOf(20), Integer.valueOf(30));
    }

    public static final void main(@NotNull String[] args) {
        Intrinsics.checkParameterIsNotNull(args, "args");
        //without inline maybe there is an object of the function
        doingWithOtherFunctions(10, (Function1) null.INSTANCE);
        //with inline we are simply copying the function and writing
        // it as  statments
        // maybe object instantiation is not done
        // so does this mean that in lambda function, we are creating
        // anonymous inner class
        // what is anonymous inner class: a class extending the required or other class
        // and it's object is created, it won't have a name
        int someInt$iv = 20;
        int var10000 = someInt$iv * someInt$iv;
    }

}
