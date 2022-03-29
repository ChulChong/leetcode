import java.util.HashMap;

public class Problem1603 {
    public static void main(String[] args) {

        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }

}

class ParkingSystem {

    HashMap<String,Integer> hm = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        hm.put("big",big);
        hm.put("medium",medium);
        hm.put("small",small);
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            if(hm.get("big")!=0){
                hm.put("big",hm.get("big")-1);
                return true;
            }else{
                return false;
            }
        }
        if(carType == 2){
            if(hm.get("medium")!=0){
                hm.put("medium",hm.get("medium")-1);
                return true;
            }else{
                return false;
            }
        }
        if(carType == 3){
            if(hm.get("small")!=0){
                hm.put("small",hm.get("small")-1);
                return true;
            }else{
                return false;
            }
        }
        return false;

    }
}

//class ParkingSystem {
//    static int[] parking;
//    public ParkingSystem(int big, int medium, int small) {
//        parking = new int[] {big, medium, small};
//    }
//
//    public boolean addCar(int carType) {
//        if(parking[carType - 1] > 0) {
//            parking[carType - 1]--;
//            return true;
//        }
//        return false;
//    }
//}

