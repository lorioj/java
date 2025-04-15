package main.design.pattern.structural.facade;

import java.sql.Connection;

public interface ExcelReport {
	void generateExcelReport(Connection con, String tableName);
}
