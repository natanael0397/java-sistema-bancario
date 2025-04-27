package controler;

import dto.StatisticsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TransactionService;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
@AllArgsConstructor
public class StatisticsController {

    private final TransactionService transactionService;

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics(){
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(stats));
    }

}
