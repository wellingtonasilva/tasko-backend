package br.com.wassistemas.tasko.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GeneralApiResponse<T> {
  @JsonInclude(JsonInclude.Include.ALWAYS)
  private int status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private T data;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object errors;
}
