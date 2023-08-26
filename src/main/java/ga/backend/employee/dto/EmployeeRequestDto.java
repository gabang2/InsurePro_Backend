package ga.backend.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;

public class EmployeeRequestDto {
    @AllArgsConstructor
    @Setter
    @Getter
    public static class Post {
        private Long pk;
        private String id;
        private String email;
        private String password;
        private boolean regiYn;
        private boolean delYn;
    }

    @AllArgsConstructor
    @Setter
    @Getter
    public static class Patch {
        private Long pk;
        private String id;
        private String email;
        private String password;
        private boolean regiYn;
        private boolean delYn;
    }

    @AllArgsConstructor
    @Setter
    @Getter
    public static class Signin {
        @Email
        private String email;

        private String id; // 사번

        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=?<>:])[A-Za-z\\d~!@#$%^&*()+|=]{4,16}$",
                message = "특수문자는 1개 이상 들어가야 합니다, 비밀번호 '최소 4자에서 최대 16자'까지 허용")
        private String password;

        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=?<>:])[A-Za-z\\d~!@#$%^&*()+|=]{4,16}$",
                message = "특수문자는 1개 이상 들어가야 합니다, 비밀번호 '최소 4자에서 최대 16자'까지 허용")
        private String rePassword; // 비밀번호 재확인

        private long companyPk; // 회사 식별자

    }
}
