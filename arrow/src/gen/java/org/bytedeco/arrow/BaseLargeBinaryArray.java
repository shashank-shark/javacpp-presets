// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;

@Name("arrow::BaseBinaryArray<arrow::LargeBinaryType>") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BaseLargeBinaryArray extends FlatArray {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseLargeBinaryArray(Pointer p) { super(p); }


  /** Return the pointer to the given elements bytes */
  // XXX should GetValue(int64_t i) return a string_view?
  
  ///
  public native @Cast("const uint8_t*") BytePointer GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type*") LongPointer out_length);
  public native @Cast("const uint8_t*") ByteBuffer GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type*") LongBuffer out_length);
  public native @Cast("const uint8_t*") byte[] GetValue(@Cast("int64_t") long i, @Cast("arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type*") long[] out_length);

  /** \brief Get binary value as a string_view
   * 
   *  @param i the value index
   *  @return the view over the selected value */

  /** \brief Get binary value as a std::string
   * 
   *  @param i the value index
   *  @return the value copied into a std::string */
  public native @StdString String GetString(@Cast("int64_t") long i);

  /** Note that this buffer does not account for any slice offset */
  public native @SharedPtr @ByVal ArrowBuffer value_offsets();

  /** Note that this buffer does not account for any slice offset */
  public native @SharedPtr @ByVal ArrowBuffer value_data();

  public native @Cast("const arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type*") LongPointer raw_value_offsets();

  // Neither of these functions will perform boundschecking
  public native @Cast("arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type") long value_offset(@Cast("int64_t") long i);
  public native @Cast("arrow::BaseBinaryArray<arrow::LargeBinaryType>::offset_type") long value_length(@Cast("int64_t") long i);
}
