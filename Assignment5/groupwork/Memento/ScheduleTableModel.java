package groupwork.Memento;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class ScheduleTableModel extends DefaultTableModel {

    public ScheduleTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    public TableMemento createMemento() {
        return new TableMemento((Vector) getDataVector().clone());
    }

    public void setMemento(TableMemento memento) {
        setDataVector(memento.getDataVector(), memento.getColumnIdentifiers());
    }

    // Inner Memento class
    public static class TableMemento implements java.io.Serializable {
        private Vector columnIdentifiers;
        private Vector dataVector;

        TableMemento(Vector columnIdentifiers, Vector dataVector) {
            this.columnIdentifiers = columnIdentifiers;
            this.dataVector = dataVector;
        }

        Vector getColumnIdentifiers() {
            return columnIdentifiers;
        }

        Vector getDataVector() {
            return dataVector;
        }
    }
}
