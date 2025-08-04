package com.example.loganalysis.service;

public interface LogAnalyzer {
    int countSuccessByMonth(String monthYear);
    int countFailureByMonth(String monthYear);
    int countRequestType(String requestType);
    int countUniqueMonths();
}
