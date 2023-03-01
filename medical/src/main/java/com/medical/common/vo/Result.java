package com.medical.common.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private T data;

    public static <T> Result<T> success() {
        return new Result<>("200", "success", null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>("200", "success", data);
    }

    public static <T> Result<T> success(T data, String message) {
        return new Result<>("200", message, data);
    }

    public static <T> Result<T> success(String message) {
        return new Result<>("200", message, null);
    }

    public static <T> Result<T> fail() {
        return new Result<>("201", "fail", null);
    }

    public static <T> Result<T> fail(String code, String message) {
        return new Result<>(code, message, null);
    }

    public static <T> Result<T> fail(String message) {
        return new Result<>("201", message, null);
    }

    public static <T> Result <T> error(String code, String msg) {
        return new Result<>("-1", msg, null );
    }

}
