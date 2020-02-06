package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagingInfo {

    @JsonProperty(value = "RowIndex")
    String rowIndex;

    @JsonProperty(value = "MaxRows")
    int maxRows;

    @JsonProperty(value = "CountRows")
    Boolean countRows;

    @JsonProperty(value = "TotalRowsCount")
    int totalRowsCount;

    @Override
    public String toString() {
        return "PagingInfo{" +
                "rowIndex='" + rowIndex + '\'' +
                ", maxRows=" + maxRows +
                ", countRows=" + countRows +
                ", totalRowsCount=" + totalRowsCount +
                ", nextPagePositioningKey='" + nextPagePositioningKey + '\'' +
                '}';
    }

    public String getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(String rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public Boolean getCountRows() {
        return countRows;
    }

    public void setCountRows(Boolean countRows) {
        this.countRows = countRows;
    }

    public int getTotalRowsCount() {
        return totalRowsCount;
    }

    public void setTotalRowsCount(int totalRowsCount) {
        this.totalRowsCount = totalRowsCount;
    }

    public String getNextPagePositioningKey() {
        return nextPagePositioningKey;
    }

    public void setNextPagePositioningKey(String nextPagePositioningKey) {
        this.nextPagePositioningKey = nextPagePositioningKey;
    }

    @JsonProperty(value = "NextPagePositioningKey")
    String nextPagePositioningKey;
}

