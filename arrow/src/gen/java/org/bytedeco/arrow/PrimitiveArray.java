// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Base class for arrays of fixed-size logical types */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class PrimitiveArray extends FlatArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrimitiveArray(Pointer p) { super(p); }

  public PrimitiveArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                   @Const @SharedPtr @ByRef ArrowBuffer data,
                   @Const @SharedPtr @ByRef(nullValue = "std::shared_ptr<arrow::Buffer>(nullptr)") ArrowBuffer null_bitmap,
                   @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/) { super((Pointer)null); allocate(type, length, data, null_bitmap, null_count, offset); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                   @Const @SharedPtr @ByRef ArrowBuffer data,
                   @Const @SharedPtr @ByRef(nullValue = "std::shared_ptr<arrow::Buffer>(nullptr)") ArrowBuffer null_bitmap,
                   @Cast("int64_t") long null_count/*=arrow::kUnknownNullCount*/, @Cast("int64_t") long offset/*=0*/);
  public PrimitiveArray(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                   @Const @SharedPtr @ByRef ArrowBuffer data) { super((Pointer)null); allocate(type, length, data); }
  private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, @Cast("int64_t") long length,
                   @Const @SharedPtr @ByRef ArrowBuffer data);

  /** Does not account for any slice offset */
  public native @SharedPtr @ByVal ArrowBuffer values();
}