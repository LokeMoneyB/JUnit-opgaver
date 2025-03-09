package opgave03;

import java.util.Arrays;

public class RecentlyUsed implements RecentlyUsedList {
    private static final int MAX_STØRRELSE = 5;
    private String[] list;
    private int størrelse;

    public RecentlyUsed() {
        list = new String[MAX_STØRRELSE];
        størrelse = 0;
    }

    @Override
    public void add(String element) {
        int index = indexAf(element);
        if (index != -1) {
            skubIndex(index);
        } else {
            if (størrelse < MAX_STØRRELSE) {
                størrelse++;
            }
            skubIndex(MAX_STØRRELSE - 1);
        }
        list[0] = element;
    }

    @Override
    public String remove(int index) {
        String fjernetElement = list[index];

        for (int i = index; i < størrelse - 1; i++) {
            list[i] = list[i + 1];
        }
        list[--størrelse] = "";
        return fjernetElement;
    }

    @Override
    public String[] getRecentlyUsed() {
        return Arrays.copyOf(list, MAX_STØRRELSE);
    }

    private int indexAf(String element) {
        for (int i = 0; i < størrelse; i++) {
            if (list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void skubIndex(int fromIndex) {
        for (int i = fromIndex; i > 0; i--) {
            list[i] = list[i - 1];
        }
    }
}
