package br.com.wasistemas.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceDuplicateException extends Exception {

  private static final long serialVersionUID = 1L;

  public ResourceDuplicateException(String message) {
    super(message);
  }

  public ResourceDuplicateException(String message, Throwable cause) {
    super(message, cause);
  }
}
