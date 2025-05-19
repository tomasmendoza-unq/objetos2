import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directory implements FileSystem{
    private String nombre;
    private LocalDate createdAt;
    private List<FileSystem> fileSystems;


    public Directory(String document, LocalDate createdAt) {
        this.nombre = document;
        this.createdAt = createdAt;
        fileSystems = new ArrayList<>();
    }

    @Override
    public int totalSize() {
        return fileSystems.stream().mapToInt(FileSystem::totalSize).sum();
    }

    @Override
    public void printStructure() {

    }

    @Override
    public FileSystem lastModified() {
        return fileSystems.stream().map(FileSystem::lastModified).max(Comparator.comparing(FileSystem::getFecha)).orElse(null);
    }

    @Override
    public FileSystem oldestElement() {
        return fileSystems.stream().map(FileSystem::oldestElement).min(Comparator.comparing(FileSystem::getFecha)).orElse(null);
    }

    @Override
    public LocalDate getFecha() {
        return createdAt;
    }

    public void addFile(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
}
