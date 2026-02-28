package Praktikum03.Task;


public class dataDosen22 {
    
    public static void dataAllDosen (Dosen22[] arrayOfDosen22){
        System.out.println("\n======= LECTURER LIST =======");
        int no = 1;
        for (Dosen22 dosen : arrayOfDosen22) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Code          : " + dosen.code);
            System.out.println("Name          : " + dosen.name);
            System.out.println("Gender        : " + (dosen.gender ? "Men" : "Women"));
            System.out.println("Age          : " + dosen.age);
            System.out.println("------------------------------");
        }
    }
    public static void  numberOfLecturerPerGender (Dosen22[] arrayOfDosen22){
        int countMen = 0;
        int countWomen = 0;

        for (Dosen22 lecturer : arrayOfDosen22) {
            if (lecturer.gender) {
                countMen++;
            } else {
                countWomen++;
            }
        }

        System.out.println("\n======= NUMBER OF LECTURER PER GENDER =======");
        System.out.println("Men    : " + countMen);
        System.out.println("Women  : " + countWomen);
    }
    public static void AverageAgeOfLecturerPerGender (Dosen22[] arrayOfDosen22){
        int totalAgeMen = 0;
        int totalAgeWomen = 0;
        int countMen = 0;
        int countWomen = 0;

        for (Dosen22 lecturer : arrayOfDosen22) {
            if (lecturer.gender) {
                totalAgeMen += lecturer.age;
                countMen++;
            } else {
                totalAgeWomen += lecturer.age;
                countWomen++;
            }
        }
        System.out.println("\n======= AVERAGE AGE OF LECTURER PER GENDER =======");
        System.out.println("Average Age of Men    : " + (countMen > 0 ? (double) totalAgeMen / countMen : 0));
        System.out.println("Average Age of Women  : " + (countWomen > 0 ? (double) totalAgeWomen / countWomen : 0));
    }
    public static void infoDosenPalingTua (Dosen22[] arrayOfDosen22){
        Dosen22 oldestLecturer = null;

        for (Dosen22 lecturer : arrayOfDosen22) {
            if (oldestLecturer == null || lecturer.age > oldestLecturer.age) {
                oldestLecturer = lecturer;
            }
        }

        System.out.println("\n======= OLDEST LECTURER INFO =======");
        if (oldestLecturer != null) {
            System.out.println("Code          : " + oldestLecturer.code);
            System.out.println("Name          : " + oldestLecturer.name);
            System.out.println("Gender        : " + (oldestLecturer.gender ? "Men" : "Women"));
            System.out.println("Age          : " + oldestLecturer.age);
        } else {
            System.out.println("No lecturers found.");
        }
    }
    public static void infoDosenPalingMuda (Dosen22[] arrayOfDosen22){
        Dosen22 youngestLecturer = null;

        for (Dosen22 lecturer : arrayOfDosen22) {
            if (youngestLecturer == null || lecturer.age < youngestLecturer.age) {
                youngestLecturer = lecturer;
            }
        }

        System.out.println("\n======= YOUNGEST LECTURER INFO =======");
        if (youngestLecturer != null) {
            System.out.println("Code          : " + youngestLecturer.code);
            System.out.println("Name          : " + youngestLecturer.name);
            System.out.println("Gender        : " + (youngestLecturer.gender ? "Men" : "Women"));            
            System.out.println("Age          : " + youngestLecturer.age);
        } else {
            System.out.println("No lecturers found.");
        }
    }
}
