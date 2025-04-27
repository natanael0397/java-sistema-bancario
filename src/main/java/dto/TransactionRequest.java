package dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.OffsetDateTime;

//Dto para as mostrar as informações da transferência bancária para o usuário
@AllArgsConstructor
@Getter
public class TransactionRequest {
    @NotNull
    private Double valor;
    @NotNull
    private OffsetDateTime dataHora;
}
