package ga.backend.question.dto;

import ga.backend.employee.dto.EmployeeResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class QuestionResponseDto {
    @AllArgsConstructor
    @Setter
    @Getter
    public static class Response {
        private Long pk;
        private String content;
        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;
        private EmployeeResponseDto.Response employee;
    }
}
