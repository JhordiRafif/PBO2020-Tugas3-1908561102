import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TampilkanMahasiswa {
    public static CalonMahasiswa tampilkanMahasiswa() {
        CalonMahasiswa calonMahasiswa = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("daftar_mahasiswa.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            calonMahasiswa = (CalonMahasiswa) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return calonMahasiswa;
    }
}
