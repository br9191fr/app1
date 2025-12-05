package com.cecurity.app1.core.event;

import java.time.OffsetDateTime;

public record NewPhotoEvent(String name, OffsetDateTime dateTime) {}

