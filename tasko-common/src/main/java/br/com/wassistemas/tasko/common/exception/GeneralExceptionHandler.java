package br.com.wassistemas.tasko.common.exception;

import br.com.wassistemas.tasko.common.response.GeneralApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class GeneralExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(
      GeneralExceptionHandler.class.getName());

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<GeneralApiResponse<Object>> resourceNotFoundException(
      ResourceNotFoundException ex,
      WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse
        .builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.NOT_FOUND.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler({ParameterNotFoundException.class})
  public ResponseEntity<GeneralApiResponse<Object>> parameterNotFoundExceptionHandler(
      ParameterNotFoundException ex,
      WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse
        .builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({ResourceDuplicateException.class})
  public ResponseEntity<GeneralApiResponse<Object>> duplicateExceptionHandler(
      ResourceDuplicateException ex, WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse
        .builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({MethodArgumentNotValidException.class})
  public ResponseEntity<GeneralApiResponse<Object>> handleValidationErrors(
      MethodArgumentNotValidException ex) {
    List<String> errors = ex.getBindingResult()
        .getFieldErrors()
        .stream()
        .map(FieldError::getDefaultMessage)
        .collect(Collectors.toList());

    return new ResponseEntity<>(GeneralApiResponse
        .builder().errors(errors)
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({GeneralException.class})
  public ResponseEntity<GeneralApiResponse<Object>> globalExceptionHandler(GeneralException ex,
      WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse.builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler({DataIntegrityViolationException.class})
  public ResponseEntity<GeneralApiResponse<Object>> handleDataIntegrityViolationExceptionHandler(
      DataIntegrityViolationException ex) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse.builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({IllegalArgumentException.class})
  public ResponseEntity<GeneralApiResponse<Object>> handleIllegalArgumentExceptionHandler(
      IllegalArgumentException ex) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse.builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  //
  @ExceptionHandler({MissingRequestHeaderException.class})
  public ResponseEntity<GeneralApiResponse<Object>> missingRequestHeaderHandler(
      MissingRequestHeaderException ex, WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse
        .builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.BAD_REQUEST.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({UserUnauthorizedException.class})
  public ResponseEntity<GeneralApiResponse<Object>> userUnauthorizedHandler(
      UserUnauthorizedException ex, WebRequest request) {
    logger.error(ex.getMessage());

    return new ResponseEntity<>(GeneralApiResponse
        .builder()
        .errors(List.of(ex.getMessage()))
        .status(HttpStatus.UNAUTHORIZED.value())
        .build(),
        new HttpHeaders(),
        HttpStatus.UNAUTHORIZED);
  }
}