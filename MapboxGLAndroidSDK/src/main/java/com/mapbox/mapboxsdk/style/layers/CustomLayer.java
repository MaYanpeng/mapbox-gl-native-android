package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

/**
 * Custom layer.
 * <p>
 * Experimental feature. Do not use.
 * </p>
 */
public class CustomLayer extends Layer {

  public CustomLayer(String id,
                     long host) {
    initialize(id, host);
  }

  @Keep
  CustomLayer(long nativePtr) {
    super(nativePtr);
  }

  @Keep
  protected native void initialize(String id, long host);

  @Override
  @Keep
  protected native void finalize() throws Throwable;

}
