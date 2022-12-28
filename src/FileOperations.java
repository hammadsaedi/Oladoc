import java.io.*;

public class FileOperations<T> {

    String path;

    public FileOperations(String path) {
        this.path = path + ".ser";
    }

    public void push(T object) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(path)));
        stream.writeObject(object);
        stream.close();
    }

    public T seek() throws ClassNotFoundException, IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File(path)));
        @SuppressWarnings("unchecked")
        T obj = (T) stream.readObject();
        stream.close();
        return obj;
    }
}