package loger;

import java.util.ArrayList;
import java.util.List;

public class TestLogger implements MyLogger {
    List<String> list = new ArrayList<>();

    @Override
    public void info(String message) {
        list.add(message);
    }

    public List<String> getList() {
        return list;
    }
}

