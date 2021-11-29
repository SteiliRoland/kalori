/*
 * File: App.java
 * Created Date: 2021-11-29
 * Author: Steili Roland
 * Github: https://github.com/SteiliRoland
 * kaloria szükségled számláló
 */
public class App {
    public static void main(String[] args) throws Exception {
        KaloriWoman kaloriwoman= new KaloriWoman();
        System.out.print("Nöi kaloria szükséglet:");
        System.out.println(kaloriwoman.calcKalori(160, 51.3, 17));
        KaloriMan kaloriman= new KaloriMan();
        System.out.print("Nöi kaloria szükséglet:");
        System.out.println(kaloriman.calcKalori(175, 65.3, 18));
    }
}

