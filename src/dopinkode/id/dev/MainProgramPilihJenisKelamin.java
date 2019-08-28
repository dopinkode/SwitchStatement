package dopinkode.id.dev;

public class MainProgramPilihJenisKelamin {

    public static void main(String[] args) {
        String jenis_kelamin = "L";

        switch (jenis_kelamin) {
            case "L":
                System.out.println("Jenis kelamin Laki-laki");
                break;
            case "P":
                System.out.println("Jenis kelamin Perempuan");
                break;
            default:
                System.out.println("Jenis kelamin tidak tersedia");
                break;
        }
    }
}
