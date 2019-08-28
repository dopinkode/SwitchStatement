package dopinkode.id.dev;

public class MainProgramLalulintas {

    public static void main(String[] args) {
        int expression = 1;

        switch (expression) {
            case 1:
                System.out.println("Lampu Merah Menyala");
                break;
            case 2:
                System.out.println("Lampu Kuning Menyala");
                break;
            case 3:
                System.out.println("Lampu Hijau Menyala");
                break;
            default:
                System.out.println("Pilihan anda tidak make sense");
                break;
        }
    }
}
