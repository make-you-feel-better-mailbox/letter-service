package com.onetwo.letterservice.application.port;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.data.domain.Pageable;

@Getter
public abstract class SliceRequest<T> extends SelfValidating<T> {

    @NotNull
    private final Pageable pageable;

    protected SliceRequest(Pageable pageable) {
        this.pageable = pageable;
    }
}
