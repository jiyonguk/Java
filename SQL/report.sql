-- report

create table report(
    idx number(4) PRIMARY KEY,
    sname VARCHAR2(20) not NULL,
    sno VARCHAR2(10) not NULL,
    reportfile VARCHAR2(100) not NULL
);