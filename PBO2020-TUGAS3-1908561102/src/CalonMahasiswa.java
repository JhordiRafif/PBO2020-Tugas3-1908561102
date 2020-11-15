import java.io.Serializable;

public class CalonMahasiswa implements Serializable {
    private String namaMahasiswa;

    public CalonMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
}
