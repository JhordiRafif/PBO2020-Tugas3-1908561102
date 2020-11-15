import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveMahasiswa implements Serializable {
    private CalonMahasiswa calonMahasiswa;
    public SaveMahasiswa(String mahasiswaBaru) {
        if (mahasiswaBaru == null) {
            calonMahasiswa = null;
        } else {
            calonMahasiswa = new CalonMahasiswa(mahasiswaBaru);
        }
    }

    public void doitnow() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("daftar_mahasiswa.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.calonMahasiswa);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
