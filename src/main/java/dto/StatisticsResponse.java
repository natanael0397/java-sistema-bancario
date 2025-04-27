package dto;

import lombok.Getter;

import java.util.DoubleSummaryStatistics;

@Getter

public class StatisticsResponse {
    private Long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public StatisticsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.avg = stats.getAverage();
        this.sum = stats.getSum();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }
}
