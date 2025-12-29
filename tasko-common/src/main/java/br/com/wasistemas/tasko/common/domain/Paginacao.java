package br.com.wasistemas.tasko.common.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Paginacao {
    int page;
    int size;
    String sortBy;
    String sortDirection;
}
