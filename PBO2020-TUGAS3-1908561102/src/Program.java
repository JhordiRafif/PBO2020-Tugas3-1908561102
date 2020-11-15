import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int userMenu;
        do {
            userMenu = this.getIntegerInput("\n\nNama: Rafif Jhordi\nNIM: 1908561102\nMENU\n1. Cek Data Mahasiswa\n2. Ganti Data Mahasiswa\n3. Reset Data Mahasiswa\n4. Quit\nPilihan: ");
            this.processMenu(userMenu);
        } while(userMenu != 4);
    }

    private void processMenu(int menu) {
        switch (menu) {
            case 1:
                CalonMahasiswa calonMahasiswa = TampilkanMahasiswa.tampilkanMahasiswa();
                if (calonMahasiswa != null) {
                    System.out.println("Nama: " + calonMahasiswa.getNamaMahasiswa());
                } else {
                    System.out.println("Isi terlebih dahulu!");
                }
                break;
            case 2:
                SaveMahasiswa saveMahasiswa = new SaveMahasiswa(getInputMahasiswa("Masukkan nama mahasiswa: "));
                saveMahasiswa.doitnow();
                break;
            case 3:
                SaveMahasiswa saveMahasiswa1 = new SaveMahasiswa(null);
                saveMahasiswa1.doitnow();
                break;
            case 4:
                break;
            default:
                System.out.println("Mohon maaf anda tertipu saudara");
                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getInputMahasiswa(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
