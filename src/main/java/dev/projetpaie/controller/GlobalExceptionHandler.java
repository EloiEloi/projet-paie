// package dev.projetpaie.controller;

// import java.time.format.DateTimeFormatter;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;

// import dev.projetpaie.exception.CollegueNonValideException;

// @ControllerAdvice
// public class GlobalExceptionHandler {

// // private static final DateTimeFormatter formatter =
// // DateTimeFormatter.ISO_LOCAL_DATE_TIME;

// // @ExceptionHandler(NullPointerException.class)
// // public ResponseEntity<ExceptionMessage>
// // nullPointerExceptionHandler(HttpServletRequest request,
// // NullPointerException exception) {
// // ExceptionMessage message =
// // ExceptionMessage.builder().date(LocalDateTime.now().format(formatter))
// // .path(request.getRequestURI().toString() + "?" + request.getQueryString())
// // .className(exception.getClass().getName())
// // .message("Tu veux éviter les null ? N'hésite pas à lire cet article:
// //
// https://www.developpez.net/forums/blogs/473169-gugelhupf/b2944/java-astuces-eviter-nullpointerexception/")
// // .build();
// // return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
// // }

// // @ExceptionHandler(CollegueNonValideException.class)
// // public ResponseEntity<String>
// // handleNotFoundException(CollegueNonValideException e) {
// // return error(NOT_FOUND, e);
// // }

// }