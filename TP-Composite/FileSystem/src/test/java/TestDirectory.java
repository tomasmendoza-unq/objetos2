import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestDirectory {

    Directory directory;
    Directory directory2;
    FileSystem fileSystem;
    FileSystem fileSystem1;
    FileSystem fileSystem2;

    @BeforeEach
    public void setUp(){
        fileSystem = mock(FileSystem.class);
        fileSystem2 = mock(FileSystem.class);
        fileSystem1 = mock(FileSystem.class);
        directory = new Directory("document", LocalDate.of(2004, 12, 13));
        directory2 = new Directory("unq", LocalDate.of(2004, 12, 13));
        directory.addFile(fileSystem);
        directory2.addFile(fileSystem1);
        directory2.addFile(fileSystem2);

        directory.addFile(directory2);
        when(fileSystem.lastModified()).thenReturn(fileSystem);
        when(fileSystem1.lastModified()).thenReturn(fileSystem1);
        when(fileSystem2.lastModified()).thenReturn(fileSystem2);
        when(fileSystem.oldestElement()).thenReturn(fileSystem);
        when(fileSystem1.oldestElement()).thenReturn(fileSystem1);
        when(fileSystem2.oldestElement()).thenReturn(fileSystem2);
        when(fileSystem.totalSize()).thenReturn(12);
        when(fileSystem1.totalSize()).thenReturn(12);
        when(fileSystem2.totalSize()).thenReturn(12);
        when(fileSystem.getFecha()).thenReturn(LocalDate.of(2004, 12, 13));
        when(fileSystem1.getFecha()).thenReturn(LocalDate.of(2012, 12, 13));
        when(fileSystem2.getFecha()).thenReturn(LocalDate.of(2003, 12, 13));

    }

    @Test
    public void testDirectoryLastModified(){
        directory.lastModified();

        verify(fileSystem).lastModified();
        verify(fileSystem2).lastModified();
        verify(fileSystem1).lastModified();
    }

    @Test
    public void testDirectoryLastModifiedEsElFile2(){
        assertEquals(fileSystem2, directory.oldestElement());

    }
}
