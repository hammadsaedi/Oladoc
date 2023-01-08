import java.io.*;

public class FileOperations<T> {

    String path;
    File file;

    public FileOperations(String path) {
        this.path = path + ".ser";
        file = new File(this.path);
    }

    public void push(T object) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
        stream.writeObject(object);
        stream.close();
    }

    public T seek() throws ClassNotFoundException, IOException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
        @SuppressWarnings("unchecked")
        T obj = (T) stream.readObject();
        stream.close();
        return obj;
    }
}
