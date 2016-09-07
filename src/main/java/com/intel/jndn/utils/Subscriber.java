/*
 * jndn-utils
 * Copyright (c) 2016, Intel Corporation.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms and conditions of the GNU Lesser General Public License,
 * version 3, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 */

package com.intel.jndn.utils;

import com.intel.jndn.utils.pubsub.Cancellation;
import com.intel.jndn.utils.pubsub.On;
import net.named_data.jndn.util.Blob;

/**
 * @author Andrew Brown, andrew.brown@intel.com
 */
public interface Subscriber extends AutoCloseable {
  /**
   * @param onMessage called every time a new message is received
   * @param onError called every time an error occurs
   * @return a cancellation token for stopping the subscription
   */
  Cancellation subscribe(On<Blob> onMessage, On<Exception> onError);
}
