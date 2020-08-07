package elevator;

import java.util.Objects;

public class Call {
    public int id;
    public int timestamp;
    public int start;
    public int end;
    public boolean isTakeOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Call)) return false;
        Call call = (Call) o;
        return id == call.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", timestamp:" + timestamp +
                ", start:" + start +
                ", end:" + end +
                '}';
    }
}
