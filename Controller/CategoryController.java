package com.example.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final TodoService todoService;
    public TodoResponseDto createTodo(TodoCreateRequestDto requestDto)


}
