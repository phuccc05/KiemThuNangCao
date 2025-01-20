package org.example;
import java.util.List;


public class ArrayElementRetriever {
    public static <T> T getElementAtIndex(List<T> list, int index) {
        if (list == null) {
            throw new IllegalArgumentException("Danh sách không được trống");
        }
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " khong hop le");
        }
        return list.get(index);
    }
}
