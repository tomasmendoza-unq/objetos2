import java.time.LocalDate;
import java.time.LocalDateTime;

public interface FileSystem {
    int totalSize();
    void printStructure();
    FileSystem lastModified();
    FileSystem oldestElement();
    LocalDate getFecha();
}
