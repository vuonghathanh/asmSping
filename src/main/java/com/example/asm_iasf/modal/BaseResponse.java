package com.example.hello_spring_db.modal;

public class BaseResponse<T> {
    public int status = 200;
    public String message = "ok";
    public T data;
}
