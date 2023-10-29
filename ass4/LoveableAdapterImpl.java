import java.util.ArrayList;
import java.util.List;

public class LoveableAdapterImpl implements LoveableAdapter {
    private Loveable programmer;

    LoveableAdapterImpl(Loveable programmer) {
        this.programmer = programmer;
    }

    @Override
    public int getLovePower() {
        return binStrToInt(programmer.getLovePower().binStr);
    }

    private int binStrToInt(String binStr) {
        return Integer.parseInt(binStr, 2);
    }
}