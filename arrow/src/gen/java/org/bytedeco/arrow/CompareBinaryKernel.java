// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief BinaryKernel bound to a select function */
@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class CompareBinaryKernel extends BinaryKernel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompareBinaryKernel(Pointer p) { super(p); }

  public CompareBinaryKernel(@SharedPtr CompareFunction select) { super((Pointer)null); allocate(select); }
  private native void allocate(@SharedPtr CompareFunction select);

  public native @ByVal Status Call(FunctionContext ctx, @Const @ByRef Datum left, @Const @ByRef Datum right,
                Datum out);

  public static native @Cast("int64_t") long out_length(@Const @ByRef Datum left, @Const @ByRef Datum right);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType out_type();
}
