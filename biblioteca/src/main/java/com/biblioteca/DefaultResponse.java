package br.com.forrota.http.domain.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        title = "Resposta padrão",
        description = "Utilizada como herança para todas as respostas do WS."
)
public class DefaultResponse {

    @Schema(title = "Status da resposta", description = "Status da resposta para a requisição", example = "SUCESS")
    protected String status = "SUCCESS";

    @Schema(title = "Mensagens", description = "Mensagens da resposta para a execução, podem ser de erro ou não com base no status")
    private List<String> messages = new ArrayList<>();

    public DefaultResponse(String status, String message) {
        this.status = status;
        this.messages = Collections.singletonList(message);
    }

    public void setMessage(String message) {
        messages = Collections.singletonList(message);
    }

    public void add(String message) {
        messages.add(message);
    }

    public static DefaultResponse empty() {
        return new DefaultResponse();
    }
}
