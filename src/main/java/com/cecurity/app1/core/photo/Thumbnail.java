package com.cecurity.app1.core.photo;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

public interface Thumbnail {

  @Async
  Future<byte[]> thumbnail( byte[] imageBytes );
}
