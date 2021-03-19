package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {
	private int statusCode;
	private T data;
}
