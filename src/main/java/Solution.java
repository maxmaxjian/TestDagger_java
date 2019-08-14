public class Solution {

    public static void main(String[] args) {
        HouseComponent component = DaggerHouseComponent.create();
        House house = component.getHouse();
        house.print();
    }
}
