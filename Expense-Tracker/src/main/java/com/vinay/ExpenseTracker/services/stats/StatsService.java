package com.vinay.ExpenseTracker.services.stats;

import com.vinay.ExpenseTracker.dto.GraphDTO;
import com.vinay.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();

}
