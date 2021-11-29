/*
 * File: App.java
 * Created Date: 2021-11-29
 * Author: Steili Roland
 * Github: https://github.com/SteiliRoland
 * kaloria szükségled számláló
 */
public class KaloriWoman {
    public double calcKalori(double weight, double height, double age){
        return 9.247 * weight + 3.098 * height * 4.330 * age + 447.593;
    }
    
}
