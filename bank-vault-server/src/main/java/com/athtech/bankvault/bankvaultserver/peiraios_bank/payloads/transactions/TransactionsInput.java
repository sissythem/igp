package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions;

public class TransactionsInput {

    private String fromDate;

    private String toDate;

    private String fromRow;

    private int pageSize;

    private float lastBalance;


    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromRow() {
        return fromRow;
    }

    public void setFromRow(String fromRow) {
        this.fromRow = fromRow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public float getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(float lastBalance) {
        this.lastBalance = lastBalance;
    }

    @Override
    public String toString() {
        return "TransactionsInput{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", fromRow='" + fromRow + '\'' +
                ", pageSize=" + pageSize +
                ", lastBalance=" + lastBalance +
                '}';
    }
}




//{
//        "type": "object",
//        "properties": {
//        "fromDate": {
//        "type": "string",
//        "description": "all records returned, will be newer than DateFrom.  ISO formatted",
//        "example": "2017-07-01"
//        },
//        "toDate": {
//        "type": "string",
//        "description": "all records returned, will be older than DateTo.  ISO formatted",
//        "example": "2017-09-31"
//        },
//        "fromRow": {
//        "type": "string",
//        "description": "all records returned, will have row number smaller that fromRow.  it's used for pagignation",
//        "example": "12345"
//        },
//        "pageSize": {
//        "type": "number",
//        "description": "number of records per page to return",
//        "example": 10
//        },
//        "lastBalance": {
//        "type": "number",
//        "description": "all balances are calculated starting with lastBalance if it is supplied"
//        }
//        },
//        "example": "{
//        "fromDate": "2015-1-9",
//        "toDate": "2015-4-9",
//        "fromRow": "",
//        "pageSize": 20,
//        "lastBalance": 0.0
//        }",
//        "required": [
//        "fromDate",
//        "toDate"
//        ]
//        }
