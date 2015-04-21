/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author manuel
 */
public class DCLTableModel extends AbstractTableModel {
    public List<DatabaseChangeLog> dclList;
    
    @Override
    public int getRowCount() {
        return dclList.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DatabaseChangeLog dcl = dclList.get(rowIndex);
        Object value = null;
        
        switch (columnIndex) {
            case 0:
                value = dcl.getId();
                break;
            case 1:
                value = dcl.getAuthor();
                break;
            case 2:
                value = dcl.getFilename();
                break;
            case 3:
                value = dcl.getDateExecuted();
                break;
            case 4:
                value = dcl.getOrderExecuted();
                break;
            case 5:
                value = dcl.getExecType();
                break;
            case 6:
                value = dcl.getMd5Sum();
                break;
            case 7:
                value = dcl.getDescription();
                break;
            case 8:
                value = dcl.getComments();
                break;
            case 9:
                value = dcl.getTag();
                break;
            case 10:
                value = dcl.getLiquibase();
                break;
        }
        
        return value;
    }

    @Override
    public String getColumnName(int column) {
        String name = "??";
        
        switch (column) {
            case 0:
                name = "ID";
                break;
            case 1:
                name= "AUTHOR";
                break;
            case 2:
                name = "FILENAME";
                break;
            case 3:
                name = "DATEEXECUTED";
                break;
            case 4:
                name = "ORDEREXECUTED";
                break;
            case 5:
                name = "EXECTYPE";
                break;
            case 6:
                name = "MD5SUM";
                break;
            case 7:
                name = "DESCRIPTION";
                break;
            case 8:
                name = "COMMENTS";
                break;
            case 9:
                name = "TAG";
                break;
            case 10:
                name = "LIQUIBASE";
                break;
        }
        
        return name;
    }

    public DCLTableModel(List<DatabaseChangeLog> dclList) {
        this.dclList = new ArrayList<>(dclList);
    }
    
}
