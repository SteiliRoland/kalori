/*
 * File: App.java
 * Created Date: 2021-11-29
 * Author: Steili Roland
 * Github: https://github.com/SteiliRoland
 * kaloria szükségled számláló
 */
public class KaloriMan {
    public double calcKalori(double weight, double height, double age){
        return 13.397 * weight + 4.799 * height * 5.667 * age + 88.362;
    }
}
