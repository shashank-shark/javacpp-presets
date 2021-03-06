// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class ArrowWriterProperties extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrowWriterProperties(Pointer p) { super(p); }

  @NoOffset public static class Builder extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Builder(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Builder(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Builder position(long position) {
          return (Builder)super.position(position);
      }
  
    public Builder() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native Builder disable_deprecated_int96_timestamps();

    public native Builder enable_deprecated_int96_timestamps();

    public native Builder coerce_timestamps(TimeUnit.type unit);
    public native Builder coerce_timestamps(@Cast("arrow::TimeUnit::type") int unit);

    public native Builder allow_truncated_timestamps();

    public native Builder disallow_truncated_timestamps();

    /** \brief EXPERIMENTAL: Write binary serialized Arrow schema to the file,
     *  to enable certain read options (like "read_dictionary") to be set
     *  automatically */
    public native Builder store_schema();

    public native @SharedPtr ArrowWriterProperties build();
  }

  public native @Cast("bool") boolean support_deprecated_int96_timestamps();

  public native @Cast("bool") boolean coerce_timestamps_enabled();
  public native TimeUnit.type coerce_timestamps_unit();

  public native @Cast("bool") boolean truncated_timestamps_allowed();

  public native @Cast("bool") boolean store_schema();
}
