package com.example.loganalysis.service;

import com.example.loganalysis.model.LogResponse;

import java.text.SimpleDateFormat;
import java.util.*;

public class LogAnalyzerImpl implements LogAnalyzer {
    private final List<LogResponse> logs;

    public LogAnalyzerImpl(List<LogResponse> logs) {
        this.logs = logs;
    }

    @Override
    public int countSuccessByMonth(String monthYear) {
        return (int) logs.stream()
                .filter(log -> log.getStatus().equalsIgnoreCase("Success"))
                .filter(log -> formatMonth(log.getDate()).equals(monthYear))
                .count();
    }

    @Override
    public int countFailureByMonth(String monthYear) {
        return (int) logs.stream()
                .filter(log -> log.getStatus().equalsIgnoreCase("Failed"))
                .filter(log -> formatMonth(log.getDate()).equals(monthYear))
                .count();
    }

    @Override
    public int countRequestType(String requestType) {
        return (int) logs.stream()
                .filter(log -> log.getRequestType().equalsIgnoreCase(requestType))
                .count();
    }

    @Override
    public int countUniqueMonths() {
        return (int) logs.stream()
                .map(log -> formatMonth(log.getDate()))
                .distinct()
                .count();
    }

    private String formatMonth(Date date) {
        return new SimpleDateFormat("MMMyyyy", Locale.ENGLISH).format(date);
    }
}
